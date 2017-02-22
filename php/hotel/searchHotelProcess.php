<?php
    $city = $_POST["destinationInput"];
    //$checkInDate = $_GET["CheckIndate"];
    $checkOutDate = $_POST["fakeInputCheckOut"];
    //$daySelector = $_POST["checkInDaySelector"];
    //$monthSelector = $_POST["checkInMonthSelector"];
    //$nights = $_POST["nightSelector"];
    $checkInDate = $_POST["fakeInputCheckIn"];
    $guestNo = $_POST["fakeGuestNo"];
    $nightNo = $_POST["fakeNightNo"];
    $childNo = $_POST["fakeChildNo"];
    $roomNo = $_POST["fakeRoomdNo"];
    
    $checkOutDate = str_replace('/', '-', $checkOutDate);
    $checkInDate = str_replace('/', '-', $checkInDate);
    
    echo "City: ".$city;
    echo "<br />";
    echo "Check in: ".$checkInDate;
    echo "<br />";
    echo "Check out: ".$checkOutDate;
    echo "<br />";
    echo "Number of Guest: ".$guestNo;
    echo "<br />Number of nights: ".$nightNo;
    echo "<br />Number of children: ".$childNo;
    echo "<br />Number of rooms: ".$roomNo;
?>

<?php
$servername = "localhost";
$serverusername = "root";
$serverpassword = "";
$dbname = "travelmaker";

$conn = new mysqli($servername, $serverusername, $serverpassword, $dbname);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
?>


<?php
  /*SELECT HOTEL.HotelName, ROOMTYPE.RoomTypeName, ROOMTYPE.RoomFeature, HOTELCLASS.RoomRent, HOTELCLASS.TotalRoom - RESERVEINFORMATION.BookedRoom As AvailableRoom, CONCAT(HOTEL.Address,', ',HOTEL.City) AS ADDRESS, HOTEL.PhoneNumber
    From HOTELCLASS, RESERVEINFORMATION, HOTEL, ROOMTYPE
    WHERE
    ROOMTYPE.RoomTypeId=RESERVEINFORMATION.RoomTypeId
    AND
    HOTEL.HotelId=RESERVEINFORMATION.HotelId
    AND
    HOTELCLASS.HotelId=RESERVEINFORMATION.HotelId
    AND
    RESERVEINFORMATION.CheckOutDate IN('2015-08-29')
    AND 
    LocationId IN (SELECT LocationId FROM LOCATION WHERE LocationName='Dhaka')
   */
   
    $fQuery = 
            "SELECT hotel.HotelName, roomtype.RoomTypeName, roomtype.RoomFeature, hotelclass.RoomRent, hotelclass.TotalRoom - reserveinformation.BookedRoom As AvailableRoom, CONCAT(hotel.Address,', ',hotel.City) AS ADDRESS, hotel.PhoneNumber
            From hotelclass, reserveinformation, hotel, roomtype
            WHERE
            roomtype.RoomTypeId=reserveinformation.RoomTypeId
            AND
            hotel.HotelId=reserveinformation.HotelId
            AND
            hotelclass.HotelId=reserveinformation.HotelId
            AND
            reserveinformation.CheckOutDate IN('$checkOutDate')
            AND 
            LocationId IN (SELECT LocationId FROM location WHERE LocationName='{$city}')";
    

//echo $fQuery;
    $fresult = mysqli_query($conn, $fQuery);
    if($fresult){
        echo "I'm here!";
        while($fRow = mysqli_fetch_assoc($fresult)){
                                
                                var_dump($fRow);
                                //$hotelID =  $fRow['HotelId'];
                                echo "<hr />";
                                //echo "hotelId: ".$hotelID;
                                
                            }
    }else {
        die("Query failed! ".mysqli_error($conn));
    }

?>




<!--Closing connwction:-->
<?php
    mysqli_close($conn);
?>