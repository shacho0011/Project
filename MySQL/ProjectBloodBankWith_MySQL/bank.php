<?php

if($_SERVER['REQUEST_METHOD']=='POST'){
   
    $sblood = $_POST['sbloodgroup'];
    
    if(!empty($sblood)){
        include('connection.php');
        $sql = "SELECT * FROM BLOODBANK";
        if ($conn->query($sql) === TRUE) {
            echo "write Row fetch code";
            Location: ("index.php");
            $conn->close();
        } else {
            echo "Error: No match found";
        }
    }else{
        echo "Error: fill the field";    
    }


?>