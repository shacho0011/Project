<?php

include('connection.php');

$output = mysqli_query($conn, "SELECT * FROM registration");

while( $row = mysqli_fetch_array($output)){
    echo "User Name: ".$row['user_name']." Email: ".$row['email']."<br/>";
}

$conn->close();
?>