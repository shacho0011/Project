<?php

if($_SERVER['REQUEST_METHOD']=='POST'){
   
    $username = $_POST['username'];
    $password = $_POST['password'];
    $confirmpassword = $_POST['confirm_password'];
    $email = $_POST['email'];
    $fname = $_POST['first_name'];
    $lname = $_POST['last_name'];
    $dateofbirth = $_POST['date_of_birth'];
    $sex = $_POST['sex'];
    $profession = $_POST['profession'];
    $nationality = $_POST['nationality'];
    $nationalid = $_POST['national_id'];
    $mobileno = $_POST['mobile_no'];
    
    if(!empty($username) && !empty($password) && !empty($confirmpassword) && !empty($email) && !empty($fname) && !empty($lname) && !empty($sex) && !empty($nationalid) && !empty($mobileno)){
        if($password==$confirmpassword){
            include('connection.php');
        $sql = "INSERT INTO registration (UserName, Password, Email, FirstName, LastName, DateOfBirth, Sex, Profession, Nationality, NationalId, MobileNumber) VALUES ('$username', '$password', '$email', '$fname', '$lname', '$dateofbirth', '$sex', '$profession', '$nationality', '$nationalid', '$mobileno')";
        
        if ($conn->query($sql) === TRUE) {
            echo "Registration Successful";
            $conn->close();
        } else {
            echo "Error: Already registered with theis Email or User Name or Mobile Number";
        }
        }else{
            echo "Password dose not match";
        }
        
        
    }else{
        echo "You left some value that must be filled up! :/";
    }
}else{
    echo "Please fill the form first! :(";    
}



?>