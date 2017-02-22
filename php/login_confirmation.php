<?php
session_start();
    $login_username=$_POST['username'];
    $login_password=$_POST['password'];
    $db_username;
    $db_password;
    
    include('connection.php');

    $output = mysqli_query($conn, "SELECT * FROM registration WHERE UserName='$login_username'");
    
    $row_number = mysqli_num_rows($output);

    if($row_number!=0){
        
        while($row = mysqli_fetch_array($output)){
            $db_username=$row['UserName'];
            $db_password=$row['Password'];
        }
        
        if($login_username==$db_username){
            
            if($login_password==$db_password){
                $_SESSION["suser_name"] = $login_username;
                header('Location: index2.php');
            }else{
                echo "Please check password :)";
            }
        }else{
        echo "Please register first! :)";
        }
    }else{
        echo "Please register first! :)";
    }
    
    $conn->close();

?>