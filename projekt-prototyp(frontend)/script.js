// --- Tab Switching Logic ---
const tabs = document.querySelectorAll('[data-tab-target]');
const tabContents = document.querySelectorAll('[data-tab-content]');

tabs.forEach(tab => {
    tab.addEventListener('click', () => {
        const target = document.querySelector(tab.dataset.tabTarget);
        tabContents.forEach(tabContent => {
            tabContent.classList.remove('active');
        });
        tabs.forEach(tab => {
            tab.classList.remove('active');
        });
        tab.classList.add('active');
        target.classList.add('active');
    });
});

// --- Review Form Submission ---
const reviewForm = document.getElementById("review-form");

if (reviewForm) {
    reviewForm.addEventListener("submit", async (e) => {
        e.preventDefault();

        const reviewData = {
            playerId: 1,
            venueId: getVenueIdFromSelection(),
            reviewText: document.getElementById("review-text").value,
            rating: parseInt(document.getElementById("rating").value)
        };

        try {
            const response = await fetch("http://localhost:8080/reviews/new", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(reviewData)
            });

            if (response.ok) {
                alert("Review submitted successfully!");
                reviewForm.reset();
            } else {
                alert("Something went wrong.");
            }
        } catch (error) {
            console.error("Error:", error);
        }
    });
}

function getVenueIdFromSelection() {
    const selectedValue = document.getElementById("review-for").value;
    if (selectedValue === "dragons-den") return 1;
    if (selectedValue === "wizards-corner") return 2;
    return null;
}

// --- Profile Form Submission ---
const profileForm = document.getElementById("profile-form");

if (profileForm) {
    profileForm.addEventListener("submit", async (e) => {
        e.preventDefault();

        const playerData = {
            username: document.getElementById("username").value,
            email: document.getElementById("email").value,
            password: "placeholder123",
            location: document.getElementById("location").value,
            preferredGameStyle: document.getElementById("gaming-interests").value,
            status: "active",
            availableTimes: [],
            activeGamesIds: [],
            reviewsWritten: [],
            recentEventsAttended: []
        };

        try {
            const response = await fetch("http://localhost:8080/players/new", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(playerData)
            });

            if (response.ok) {
                alert("Profile created/updated successfully!");
                profileForm.reset();
            } else {
                alert("Error saving profile.");
            }
        } catch (error) {
            console.error("Network error:", error);
            alert("Network error. Could not save profile.");
        }
    });
}
