<?php

if($_SERVER['REQUEST_METHOD']=='POST'){
   
    $cname = $_POST['customername'];
    $cmobile = $_POST['cmobilenumber'];
    $cemail = $_POST['cemail'];
    $busid = $_POST['cbusnumber'];
    $tseat = $_POST['ctotalseat'];
    $tfare = $_POST['cfare'];
    $bank = $_POST['cbank'];
    $card = $_POST['ccardtype'];
    $cardnumber = $_POST['ccardnumber'];
    $cardholdername = $_POST['ccardholdername'];
    $date = date('Y-m-d H:i:s');
    
    if(!empty($cname) && !empty($cmobile) && !empty($cemail) && !empty($busid) && !empty($tseat) && !empty($tfare) && !empty($bank) && !empty($card) && !empty($cardnumber) && !empty($cardholdername)){
        include('connection.php');
        $sql = "INSERT INTO busreservation (CustomerName, MobileNumber, Email, BusId, TotalSeat, Fare, Bank, Card, CardNumber, CardHolderName, Date) VALUES ('$cname', '$cmobile', '$cemail', '$busid', '$tseat', '$tfare', '$bank', '$card', '$cardnumber', '$cardholdername', '$date')";
        if ($conn->query($sql) === TRUE) {
            
            //$res=mysql_query("SELECT TotalSeat FROM BUS WHERE BusId='$busid'");
            //$num = mysql_fetch_array($res);
            //$sum = $num['TotalSeat'] - $tseat;
            mysql_query("UPDATE BUS SET TotalSeat='$sum' WHERE BusId='$busid'");
            
            echo "An email and sms is sent to you :)";
            
        } else {
            echo "Error: " .$sql."<br>".$conn->error;
        }
        
    }else{
        echo "You left some value that must be filled up! :/";
    }
}else{
    echo "Please fill the form first! :(";    
}

$conn->close();

?>