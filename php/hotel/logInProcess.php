<?php 
	$username = $_POST["username"];
	$password = $_POST["password"];
        //echo $password;
	if(preg_match('/(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}/', $password)){
		echo "Hello {$username}! <br /> You have successfully logged in.";
		
                

	}
        else{
		//echo "Uesrname or password is incorrect.";
		echo 'WRONG!';
		
	}
 ?>

