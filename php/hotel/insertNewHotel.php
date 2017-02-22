<!--Connection:-->
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
$name = $_POST['hotelName'];
$address = $_POST['hotelAddress'];
$city = $_POST['hotelCity'];
$areaCode = $_POST['hotelAreaCode'];
$phoneNo = $_POST['hotelPhoneNo'];
$class1Name = $_POST['hotelClass1Name'];
$class2Name = $_POST['hotelClass2Name'];
$class3Name = $_POST['hotelClass3Name'];
$class1Capacity= $_POST['hotelClass1capa'];
$class2Capacity= $_POST['hotelClass2capa'];
$class3Capacity= $_POST['hotelClass3capa'];
$class1Rate = $_POST['hotelClass1Rate'];
$class2Rate = $_POST['hotelClass2Rate'];
$class3Rate = $_POST['hotelClass3Rate'];
$class1Fet = $_POST['hotelClass1Fet'];
$class2Fet = $_POST['hotelClass2Fet'];
$class3Fet = $_POST['hotelClass3Fet'];


?>

<?php
    
    //SELECT LocationId FROM `location` WHERE LocationName = "Coxs Bazar" 
    $q = "SELECT LocationId FROM `location` WHERE LocationName = '{$city}'"; 
    $result = mysqli_query($conn, $q);
    if(!$result){
        die("Database query failed!");
    }
    while($row = mysqli_fetch_assoc($result)){
        //var_dump($row);
        $locId = $row['LocationId'];
        //echo "<hr />";
    }
        
    
        //$HOTEL = "hotel";
        $query = "INSERT INTO hotel (`HotelName`, `Address`, `City`, `AreaCode`, `PhoneNumber`, `Star`, `LocationId`) VALUES('{$name}', '{$address}', '{$city}', {$areaCode}, {$phoneNo}, 3, {$locId})";
        //INSERT INTO hotel (`HotelName`, `Address`, `City`, `AreaCode`, `PhoneNumber`, `Star`, `LocationId`) VALUES('nam', 'add', 'dhaka', 1215, 0565612, 3, 2);
        //echo serialize($locId);;
        $result1 = mysqli_query($conn, $query);
        
        
        
        if($result1){    
            //echo 'Succeded!';
            //$result = mysqli_query($conn, "SELECT * FROM hotel");
                        /*    $result2 = mysqli_query($conn, "SELECT `HotelId` FROM hotel WHERE `PhoneNumber` = '{$phoneNo}'");
                            if(!$result2){
                                die("Database query failed!");
                            }
                            while($r = mysqli_fetch_assoc($result2)){
                                var_dump($r);
                                $hotelID =  $row['HotelId'];
                                echo "<hr />";
                                //echo "hotelId: ".$hotelID;
                                
                            }
                            */
            $tempQ0 = mysqli_query($conn, "SELECT LAST_INSERT_ID();");
            $hotelLastPK0 = mysqli_fetch_assoc($tempQ0);
            //var_dump($hotelLastPK0);
            $hotelLastPK = $hotelLastPK0['LAST_INSERT_ID()'];
            //echo "Last PK of hotel: ".$hotelLastPK;
            
            //INSERT INTO ROOMTYPE(RoomTypeName) VALUES('Economy Class')

            $insertInRoonTytpe_ForCls1 = "INSERT INTO ROOMTYPE(`RoomTypeName`, `RoomFeature`) VALUES('{$class1Name}', '{$class1Fet}')";
            $InsrtRmTypResult_ForCls1 = mysqli_query($conn, $insertInRoonTytpe_ForCls1);
            if($InsrtRmTypResult_ForCls1){
                //echo "Room Type inserted!";
                $tempQ1 = mysqli_query($conn, "SELECT LAST_INSERT_ID();");
                $RmTypLastPk_forCls10 = mysqli_fetch_assoc($tempQ1);
                //var_dump($RmTypLastPk_forCls10);
                $RmTypLastPk_forCls1 = $RmTypLastPk_forCls10['LAST_INSERT_ID()'];
                //echo "<hr />";
                //echo "Last pk of roomType_ForCls1:".$RmTypLastPk_forCls1;
            }else {
                die("Room Type class 1 insertion failed! ".  mysqli_error($conn));
            }
            
            $insertInRoonTytpe_ForCls2 = "INSERT INTO ROOMTYPE(`RoomTypeName`, `RoomFeature`) VALUES('{$class2Name}', '{$class2Fet}')";
            $InsrtRmTypResult_ForCls2 = mysqli_query($conn, $insertInRoonTytpe_ForCls2);
            if($InsrtRmTypResult_ForCls2){
                //echo "Room Type inserted!";
                $tempQ2 = mysqli_query($conn, "SELECT LAST_INSERT_ID();");
                $RmTypLastPk_forCls20 = mysqli_fetch_assoc($tempQ2);
                //var_dump($RmTypLastPk_forCls20);
                $RmTypLastPk_forCls2 = $RmTypLastPk_forCls20['LAST_INSERT_ID()'];
                //echo "<hr />";
               // echo "Last pk of roomType _ForCls2:".$RmTypLastPk_forCls2;
            }else {
                die("Room Type class 2 insertion failed! ".  mysqli_error($conn));
            }
            
            $insertInRoonTytpe_ForCls3 = "INSERT INTO ROOMTYPE(`RoomTypeName`, `RoomFeature`) VALUES('{$class3Name}', '{$class3Fet}')";
            $InsrtRmTypResult_ForCls3 = mysqli_query($conn, $insertInRoonTytpe_ForCls3);
            if($InsrtRmTypResult_ForCls3){
                //echo "Room Type inserted!";
                $tempQ3 = mysqli_query($conn, "SELECT LAST_INSERT_ID();");
                $RmTypLastPk_forCls30 = mysqli_fetch_assoc($tempQ3);
                //var_dump($RmTypLastPk_forCls30);
                $RmTypLastPk_forCls3 = $RmTypLastPk_forCls30['LAST_INSERT_ID()'];
                //echo "<hr />";
                //echo "Last pk of roomType _ForCls3:".$RmTypLastPk_forCls3;
            }else {
                die("Room Type class 3 insertion failed! ".mysqli_error($conn));
            }
            
            
            
            //INSERT INTO HOTELCLASS(HotelId, RoomTypeId, RoomRent, TotalRoom) VALUES(14, 1, 800, 40)
            //For Class: 01
            $insertInHotelClass_1 = "INSERT INTO HOTELCLASS(`HotelId`, `RoomTypeId`, `RoomRent`, `TotalRoom`) VALUES({$hotelLastPK}, {$RmTypLastPk_forCls1}, {$class1Rate}, {$class1Capacity})";
            $insertInHotelClass_Result_1 = mysqli_query($conn, $insertInHotelClass_1);
            if ($insertInHotelClass_Result_1) {
           // echo "HotelClas for class01 successfully inserted!";
            } else {
                die("HotelClas for class01 insertion failed! " . mysqli_error($conn));
            }
            
            //For Class: 02
            $insertInHotelClass_2 = "INSERT INTO HOTELCLASS(`HotelId`, `RoomTypeId`, `RoomRent`, `TotalRoom`) VALUES({$hotelLastPK}, {$RmTypLastPk_forCls2}, {$class2Rate}, {$class2Capacity})";
            $insertInHotelClass_Result_2 = mysqli_query($conn, $insertInHotelClass_2);
            if ($insertInHotelClass_Result_2) {
           // echo "HotelClas for class02 successfully inserted!";
            } else {
                die("HotelClas for class02 insertion failed! " . mysqli_error($conn));
            }
            
            //For Class: 03
            $insertInHotelClass_3 = "INSERT INTO HOTELCLASS(`HotelId`, `RoomTypeId`, `RoomRent`, `TotalRoom`) VALUES({$hotelLastPK}, {$RmTypLastPk_forCls3}, {$class3Rate}, {$class3Capacity})";
            $insertInHotelClass_Result_3 = mysqli_query($conn, $insertInHotelClass_3);
            if ($insertInHotelClass_Result_3) {
            //echo "HotelClas for class03 successfully inserted!";
            } else {
                die("HotelClas for class03 insertion failed! " . mysqli_error($conn));
            }
}
        else{
            die("Database query failed! ".  mysqli_error($conn));
        }
  
    

?>


<script>
    alert("Insertion successfull!");
    window.location = 'InsertDataForAdmin.php';
</script>




<!--Closing connwction:-->
<?php
    mysqli_close($conn);
?>