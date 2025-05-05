<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/css/style.css" />
    <title>Venue Home</title>
</head>
<h1>${venue.name}</h1>
<body>
<nav class="navbar">
    <ul>
        <li><a href="/venues/${venue.venueId}">Home</a></li>
        <li><a href="/venues/${venue.venueId}/reviews">Reviews</a></li>
        <li><a href="/venues/${venue.venueId}/schedule">Schedule</a></li>
        <!--<li><a href="/birds/details">Details</a></li>-->
        <!--<li><a href="/birds/new">New Bird</a></li>-->
        <!-- <li><a href="/birds/update">Update Bird</a> </li>-->
    </ul>
</nav>
<main>
<div class="container">
    <div class="card">
        <h3 class="card-header">${venue.name}</h3>
        <div class="card-body">
            <span><a style="float:right" href="/venues/${venue.venueId}/update" class="btn btn-secondary">Update Venue</a></span>
            <h5 class="card-title">ID: ${venue.venueId}</h5>
            <!--    <p class="card-text">Name: ${bird.name}</p>     -->
            <p class="card-text">Address: ${venue.address}</p>
            <p class="card-text">Contact: ${venue.email}}</p>
            <p class="card-text">Opening Time: ${venue.openTime}</p>
            <p class="card-text">Closing Time: ${venue.closeTime}</p>
            <p class="card-text">Description: ${venue.venueBio}</p>
        </div>
    </div>
</div>
</main>
</body>
</html>