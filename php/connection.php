<?php

$servername = "localhost";
$serverusername = "root";
$serverpassword = "";
$dbname = "travelmaker";

// Create connection
$conn = new mysqli($servername, $serverusername, $serverpassword, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
?>