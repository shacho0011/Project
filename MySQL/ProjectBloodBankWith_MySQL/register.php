<?php

if($_SERVER['REQUEST_METHOD']=='POST'){
   
    $username = $_POST['username'];
    $password = $_POST['password'];
    $confirmpassword = $_POST['confirmpassword'];
    $email = $_POST['email'];
    $fname = $_POST['firstname'];
    $lname = $_POST['lastname'];
    $bloodg = $_POST['bloodgroup'];
    $mobileno = $_POST['mobilenumber'];
    
    if(!empty($username) && !empty($password) && !empty($confirmpassword) && !empty($email) && !empty($fname) && !empty($lname) && !empty($bloodg) && !empty($mobileno)){
        if($password ==$confirmpassword){
            include('connection.php');
            $sql = "INSERT INTO admin (UserName, Password, Email, FirstName, LastName, MobileNumber) VALUES ('$username', '$password', '$email', '$fname', '$lname', '$mobileno')";
            if ($conn->query($sql) === TRUE) {
                echo "Registration Successful";
                Location: ("index.php");
                $conn->close();
            } else {
            echo "Error: Already registered with theis Email or User Name or Mobile Number";
            }
        }else{
            echo "Password Dose Not Match";
        }	
    }else{
        echo "You left some value that must be filled up! :/";
    }


?>