<!--
Venue update menu
the "edit profile" of being a venue
-->
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
<form id="update-venue" action="/venues/${venue.venueId}/update" method="post">

    <label for="name">Venue name: </label><input type="text" id="name" name="name" value="${venue.name}"><br>
    <label for="address">Address: </label><input type="text" id="address" name="address" value="${venue.address}"><br>
    <label for="email">Email: </label><input type="text" id="email" name="email" value="${venue.email}"><br>
    <label for="Open">Open time:</label><select name="open" id="open" name="open" value="${venue.openTime}">
            <option value="00">00</option>
            <option value="01">01</option>
            <option value="02">02</option>
            <option value="03">03</option>
            <option value="04">04</option>
            <option value="05">05</option>
            <option value="06">06</option>
            <option value="07">07</option>
            <option value="08">08</option>
            <option value="09">09</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            <option value="13">13</option>
            <option value="14">14</option>
            <option value="15">15</option>
            <option value="16">16</option>
            <option value="17">17</option>
            <option value="18">18</option>
            <option value="19">19</option>
            <option value="20">20</option>
            <option value="21">21</option>
            <option value="22">22</option>
            <option value="23">23</option>
        </select><br/>
    <label for="close">Close time:</label><select name="close" id="close" name="close" value="${venue.closeTime}">
            <option value="01">01</option>
            <option value="02">02</option>
            <option value="03">03</option>
            <option value="04">04</option>
            <option value="05">05</option>
            <option value="06">06</option>
            <option value="07">07</option>
            <option value="08">08</option>
            <option value="09">09</option>
            <option value="10">10</option>
            <option value="11">11</option>
            <option value="12">12</option>
            <option value="13">13</option>
            <option value="14">14</option>
            <option value="15">15</option>
            <option value="16">16</option>
            <option value="17">17</option>
            <option value="18">18</option>
            <option value="19">19</option>
            <option value="20">20</option>
            <option value="21">21</option>
            <option value="22">22</option>
            <option value="23">23</option>
            <option value="24">24</option>
        </select><br/>
    <label for="bio">Venue bio: </label><textarea type="text" id="bio" name="bio" placeholder="${venue.venueBio}"></textarea><br>
    <input type="reset"><br><!--for some reason, these buttons are not appearing in the page -->
    <input type="submit">

</form>
</main>
</body>
</html>