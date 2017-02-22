<?php
if($_SERVER['REQUEST_METHOD']=='POST'){
   
    $username = $_POST['bdusername'];
    $password = $_POST['bdpassword'];
    $confirmpassword = $_POST['bdconfirmpassword'];
    $email = $_POST['bdemail'];
    $firstname= $_POST['bdfirstname'];
    $lastname = $_POST['bdlastname'];
    $bloodgroup = $_POST['bdbloodgroup'];
    $address = $_POST['bdaddress'];
    $city = $_POST['bdcity'];
    $mobilenumber = $_POST['bdmobilenumber'];

    if(!empty($date) && !empty($bloodg) && !empty($dieases) && !empty($mobilenumber)){
        
                $server = ".\SQLEXPRESS";
                $options = array(  "UID" => "sa",  "PWD" => "p@ssword13",  "Database" => "BloodBankMS");
                $conn = sqlsrv_connect($server, $options);
                if ($conn === false) 
                die("<pre>".print_r(sqlsrv_errors(), true));
                $sql = "INSERT INTO DONAR(DonarUserName,DonarPassword,DonarEmai,DonarFirstName,DonarLastName,DonarBloodGroup,DonarAddress,DonarCity,DonarMobileNumber) VALUES ('$date', '$name', '$bloodg', '$dieases', '$hospital', '$address', '$mobilenumber', 'No')";
                $query = sqlsrv_query($conn, $sql);
                if ($query === false){  
                    echo "Request Post Unsuccessful";
                exit("<pre>".print_r(sqlsrv_errors(), true));
                }
        echo "Request Post Successful";
    }
}
sqlsrv_free_stmt($query);
sqlsrv_close($conn);
?>

<div>
    <h2>Blood Donar Registration</h2>
    <form method="POST" action="postrequest.php">
        <p>User Name:<input id="username_input" class="input" type="text" name="bdusername" value="" required=1></p>
        <p>Password:<input id="password_input" class="input" type="password" name="bdpassword" value="" required=1></p>
        <p>Confirm Password:<input id="confirm_password_input" class="input" type="password" name="bdconfirmpassword" value="" required=1></p>
        <p>Email:<input id="email" class="input" type="text" name="bdemail" value="" required=1></p>
        <p>First Name:<input id="first_name_input" class="input" type="text" name="bdfirstname" value="" required=1></p>
        <p>Last Name:<input id="last_name_input" class="input" type="text" name="bdlastname" value="" required=1></p>
        <p>Blood Group:<input id="national_id_input" class="input" type="text" name="bdbloodgroup" value="" required=1></p>
        <p>Address:<input id="national_id_input" class="input" type="text" name="bdadddress" value=""></p>                   <p>City:<input id="national_id_input" class="input" type="text" name="bdcity" value="" required=1></p>
        <p>Mobile No:<input id="mobile_no_input" class="input" type="text" name="bdmobilenumber" value="" required=1></p>
        <input class="button" type="submit" value="Create Account">
    </form>
</div>
