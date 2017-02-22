<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>Blood Bank</title>
		<link rel="stylesheet" href="css/index.css" />
    </head>
    <body>
        <header>
            <div><h1>Blood Bank</h1></div>
        </header>
        <div id="main_div">
            <h1>View</h1>
            <p><a href="donat.php">Donat Blood</a></p>
            <p><a href="postrequest.php">Request for Blood</a></p>
            <p><a href="donar.php">View Donar</a></p>
            <p><a href="bank.php">View Blood Bank</a></p>
            <p><a href="patientregistration.php">Patient Registration</a></p>
            <p><a href="donarregistration.php">Donar Registration</a></p>
            <h2>Search here</h2>
            <form method="POST" action="groupdonar.php">
                <p>Blood Group:<input id="national_id_input" class="input" type="text" name="sbloodgroup" value=""></p>
                <p>City:<input id="national_id_input" class="input" type="text" name="scity" value=""></p>
                <input class="button" type="submit" value="Search Blood">
            </form>
        </div>
        <footer>
        </footer>
    </body>
</html>