<?php
if($_SERVER['REQUEST_METHOD']=='POST'){
   
    $username = $_POST['dusername'];
    $donarid;
    $password = $_POST['dpassword'];
    $bloodgroup = $_POST['dbloodgroup'];
    $ddate = $_POST['donationdate'];

    if(!empty($username) && !empty($password) && !empty($bloodgroup) && !empty($ddate)){
            $server = ".\SQLEXPRESS";
            $options = array(  "UID" => "sa",  "PWD" => "p@ssword13",  "Database" => "BloodBankMS");
            $conn = sqlsrv_connect($server, $options);
            if ($conn === false) 
                die("<pre>".print_r(sqlsrv_errors(), true));
            $fatch = "SELECT * FROM DONAR WHERE DonarUserName='$username'";
            $query = sqlsrv_query($conn, $fatch);
            $row = sqlsrv_fetch_array($query);
            if($password == $row[DonarPassword]){
                $donarid = $row[DonarId];
                $sql = "INSERT INTO DONATION(
DonationDate,
DonarId,
DonarBloodGroup,
AvailableStatus
)
VALUES
('$ddate', '$donarid', '$bloodgroup','Yes')";
                $query = sqlsrv_query($conn, $sql);
                if ($query === false){  
                    echo "Donation Unsuccessful. Try again";
                exit("<pre>".print_r(sqlsrv_errors(), true));
                }else{
                    echo "Donation Successful";
                }
            }else{
                echo "Check Password or User Name";
            }
    }else{
        echo "Please fill the required field";
    }
sqlsrv_free_stmt($query);
sqlsrv_close($conn);
?>



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
        <div id="login_div">
            <h3>Donation</h3>
            <form method="POST" action="donat.php">
                <p>User Name:<input id="username_input" class="input" type="text" name="dusername" value="" required=1></p>
                <p>Password:<input id="password_input" class="input" type="password" name="dpassword" value="" required=1></p>
                <p>Blood Group:<input id="national_id_input" class="input" type="text" name="dbloodgroup" value="" required=1></p>
                <p>Date:<input id="mobile_no_input" class="input" type="date" name="donationdate" value="" required=1></p>
                <input class="button" type="submit" value="Confirm">
            </form>
        </div>
        <footer>
        </footer>
    </body>
</html>