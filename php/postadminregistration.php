<?php

if($_SERVER['REQUEST_METHOD']=='POST'){
   
    $username = $_POST['username'];
    $password = $_POST['password'];
    $confirmpassword = $_POST['confirm_password'];
	$adminpassword = $_POST['admin_password'];
    $email = $_POST['email'];
    $fname = $_POST['first_name'];
    $lname = $_POST['last_name'];
    $mobileno = $_POST['mobile_no'];
    
    if(!empty($username) && !empty($password) && !empty($confirmpassword) && !empty($adminpassword) && !empty($email) && !empty($fname) && !empty($lname) && !empty($mobileno)){
		if($adminpassword=='admin'){
            if($password ==$confirmpassword){
                include('connection.php');
        $sql = "INSERT INTO admin (UserName, Password, Email, FirstName, LastName, MobileNumber) VALUES ('$username', '$password', '$email', '$fname', '$lname', '$mobileno')";
        
        if ($conn->query($sql) === TRUE) {
            echo "Registration Successful";
            $conn->close();
        } else {
            echo "Error: Already registered with theis Email or User Name or Mobile Number";
        }
            }else{
                echo "Password Dose Not Match";
            }
			
		}
		else{
			echo "Tell Your Admin";
		}
    }else{
        echo "You left some value that must be filled up! :/";
    }
}else{
    echo "Please fill the form first! :(";    
}

?>