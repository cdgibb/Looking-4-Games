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
        <li><a href="/venues/home/${venue.venueId}">Home</a></li>
        <li><a href="/venues/about">About</a></li>
        <!--<li><a href="/birds/details">Details</a></li>-->
        <li><a href="/birds/new">New Bird</a></li>
        <!-- <li><a href="/birds/update">Update Bird</a> </li>-->
    </ul>
</nav>

</body>
</html>