<?php
if($_SERVER['REQUEST_METHOD']=='POST'){
   
    $username = $_POST['username'];
    $password = $_POST['password'];
    $confirmpassword = $_POST['confirmpassword'];
    $email = $_POST['email'];
    $firstname= $_POST['firstname'];
    $lastname = $_POST['lastname'];
    $bloodgroup = $_POST['bloodgroup'];
    $address = $_POST['address'];
    $city = $_POST['city'];
    $mobilenumber = $_POST['mobilenumber'];

    if(!empty($username) && !empty($password) && !empty($confirmpassword) && !empty($email) && !empty($firstname) && !empty($lastname) && !empty($bloodgroup) && !empty($address) && !empty($city) && !empty($mobilenumber)){
        if($password==$confirmpassword){
            $server = ".\SQLEXPRESS";
                $options = array(  "UID" => "sa",  "PWD" => "p@ssword13",  "Database" => "BloodBankMS");
                $conn = sqlsrv_connect($server, $options);
                if ($conn === false) 
                    die("<pre>".print_r(sqlsrv_errors(), true));
            echo "Connection Ok!";
                $sql = "INSERT INTO PATIENT(PatientUserName,
PatientPassword,
PatientEmai,
PatientFirstName,
PatientLastName,
PatientBloodGroup,
PatientAddress,
PatientCity,
PatientMobileNumber) VALUES ('$username', '$password', '$email', '$firstname', '$lastname', '$bloodgroup', '$address', '$city', '$mobilenumber')";
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