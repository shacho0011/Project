<?php

if($_SERVER['REQUEST_METHOD']=='POST'){
   
    $username = $_POST['dusername'];
    $password = $_POST['dpassword'];
    $bloodg = $_POST['dbloodgroup'];
    $date = $_POST['donationdate'];
    
    if(!empty($username) && !empty($password) && !empty($bloodg) && !empty($date)){
        include('connection.php');

        $output = mysqli_query($conn, "SELECT * FROM registration WHERE UserName='$login_username'");
        $row_number = mysqli_num_rows($output);

        if($row_number!=0){
            while($row = mysqli_fetch_array($output)){
                $db_username=$row['UserName'];
                $db_password=$row['Password'];
            }
            if($username==$db_username){
                if($password==$db_password){
                    $_SESSION["suser_name"] = $username;
                    $sql = "INSERT INTO DONATION (UserName, Password, Email, FirstName, LastName, MobileNumber) VALUES ('$username', '$password', '$email', '$fname', '$lname', '$mobileno')";
                    if ($conn->query($sql) === TRUE) {
                        echo "Donation Successful";
                        header('Location: index.php');
                        $conn->close();
                    } else {
                    echo "Error: Donation Unsuccessful";
                    } 
                }else{
                    echo "Please check password :)";
                }
            }
        }else{
            echo "Please register first! :)";
        }   
    }
}
$conn->close();

?>