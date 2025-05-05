<!--
venue creation dynamic html
-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/css/style.css" />
    <title>Register a Venue</title>
</head>
<body>
<h1>Register a Venue</h1>
<nav class="navbar">
    <ul>
        <li><a href="/venues/${venue.venueId}">Home</a></li>
        <li><a href="/venues/${venue.venueId}/reviews">Reviews</a></li>
        <li><a href="/venues/${venue.venueId}/schedule">Schedule</a></li>
    </ul>
</nav>
<main>
<form id="Register Venue" action="/venues/createVenue" method="post">
    <label for="name">Venue Name: </label><input type="text" id="name" name="name"><br/>
    <label for="address">Venue Address: </label><input type="text" id="address" name="address"><br/>
    <label for="email">Venue Email: </label><input type="text" id="email" name="email"><br/>
    <label for="openTime">Opening Time: </label><input type="number" id="openTime" name="openTime"><br/>
    <label for="closeTime">Closing Time: </label><input type="number" id="closeTime" name="closeTime"><br/>
    <label for="venueBio">About: </label><textarea type="text" id="venueBio" name="venueBio"></textarea><br/>
    <input type="reset">
    <input type="submit">
</form>
</main>
</body>
</html>