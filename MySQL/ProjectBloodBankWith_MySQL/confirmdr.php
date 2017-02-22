<?php
echo "Entered!";
if($_SERVER['REQUEST_METHOD']=='POST'){
   echo "Request method Ok!";
    $username = $_POST['dusername'];
    $password = $_POST['dpassword'];
    $confirmpassword = $_POST['dconfirmpassword'];
    $email = $_POST['demail'];
    $firstname= $_POST['dfirstname'];
    $lastname = $_POST['dlastname'];
    $bloodgroup = $_POST['dbloodgroup'];
    $address = $_POST['daddress'];
    $city = $_POST['city'];
    $mobilenumber = $_POST['dmobilenumber'];

    if(!empty($username) && !empty($password) && !empty($confirmpassword) && !empty($email) && !empty($firstname) && !empty($lastname) && !empty($bloodgroup) && !empty($address) && !empty($city) && !empty($mobilenumber)){
        echo "All values r  Ok!";
        if($password==$confirmpassword){
            echo "Password match Ok!";
            $server = ".\SQLEXPRESS";
            $options = array(  "UID" => "sa",  "PWD" => "p@ssword13",  "Database" => "BloodBankMS");
            $conn = sqlsrv_connect($server, $options);
            if ($conn === false) {
                echo "die connection!";
                die("<pre>".print_r(sqlsrv_errors(), true));
            }
            echo "Server Connection Ok!";
            $sql = "INSERT INTO DONAR(DonarUserName,DonarPassword,DonarEmai,DonarFirstName,DonarLastName,DonarBloodGroup,DonarAddress,DonarCity,DonarMobileNumber VALUES ('$username', '$password', '$email', '$firstname', '$lastname', '$bloodgroup', '$address', '$city', '$mobilenumber')";
            $query = sqlsrv_query($conn, $sql);
            if ($query === false){  
                echo "Registration Unsuccessful. Try again";
                exit("<pre>".print_r(sqlsrv_errors(), true));
            }else{
                echo "Registration Successful";
            }
        }else{
            echo "Check Password";
        }
    }else{
        echo "Please fill the required field";
    }
sqlsrv_free_stmt($query);
sqlsrv_close($conn);
?>