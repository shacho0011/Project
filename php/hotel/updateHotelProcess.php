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

//Get from previous php page:
session_start();
$holtelID = $_SESSION['HotelId'];
$DeleteClicked = $_SESSION['DeleteClicked'];
$UpdateClicked = $_SESSION['UpDateCicked'];

echo '<input type="hidden" id="UpdateClickFlag" value=\''.$UpdateClicked.'\'>';
echo '<input type="hidden" id="DeleteClickFlag" value=\''.$DeleteClicked.'\'>';

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

    //UPDATE `hotel` SET `HotelName`= 'UpdatedName',`Address`= 'UpdatedAddress',`City`= 'UpdatedCity',`AreaCode`={$areaCode},`PhoneNumber`=01648784,`Star`=5,`LocationId`=8 WHERE `HotelId`= 18 
    $query_hotel = "UPDATE `hotel` SET `HotelName`= '{$name}',`Address`= '{$address}',`City`= '{$city}',`AreaCode`={$areaCode},`PhoneNumber`={$phoneNo},`Star`=5,`LocationId`={$locId} WHERE `HotelId`= {$holtelID} ";
    $result_hotel = mysqli_query($conn, $query_hotel);
    if(!$result_hotel){
        die("Database query failed!");
    }else{
        //echo 'Hotel updated successfully!';
    }

    //PK of hotelcas:
    //SELECT ClassId FROM hotelclass WHERE HotelId = 49
    $query_classId = "SELECT ClassId FROM hotelclass WHERE HotelId = {$holtelID}";
    $result_classId = mysqli_query($conn, $query_classId);
    if(!$result_classId){
        die("Database query failed!");
    }  else {
        $j = 1;
        while($row_classId = mysqli_fetch_assoc($result_classId)){
            if($j == 1){
                $classId_PK1 =  $row_classId['ClassId'];
            }elseif ($j == 2) {
                $classId_PK2 =  $row_classId['ClassId'];
            }elseif ($j == 3) {
                $classId_PK3 =  $row_classId['ClassId'];   
            }
            $j++;
        }
    }
    
    //echo 'ClassId: 01: '.$classId_PK1.' 02: '.$classId_PK2.' 03: '.$classId_PK3;
    
    //RoomTypeId PK:
    //SELECT roomtype.RoomTypeId FROM roomtype, hotelclass WHERE hotelclass.RoomTypeId = roomtype.RoomTypeId AND hotelclass.ClassId = 5 
    $query_roomtypeId_PK1 = "SELECT roomtype.RoomTypeId FROM roomtype, hotelclass WHERE hotelclass.RoomTypeId = roomtype.RoomTypeId AND hotelclass.ClassId = {$classId_PK1} ";
    $result_roomtypeId_PK1 = mysqli_query($conn, $query_roomtypeId_PK1); 
    if(!$result_roomtypeId_PK1){
        die("Database query failed!");
    }else{
        while($row_classId = mysqli_fetch_assoc($result_roomtypeId_PK1)){
            $roomTypeId_PK1 = $row_classId['RoomTypeId'];
        }
    }
    
    $query_roomtypeId_PK2 = "SELECT roomtype.RoomTypeId FROM roomtype, hotelclass WHERE hotelclass.RoomTypeId = roomtype.RoomTypeId AND hotelclass.ClassId = {$classId_PK2} ";
    $result_roomtypeId_PK2 = mysqli_query($conn, $query_roomtypeId_PK2); 
    if(!$result_roomtypeId_PK2){
        die("Database query failed!");
    }else{
        while($row_classId = mysqli_fetch_assoc($result_roomtypeId_PK2)){
            $roomTypeId_PK2 = $row_classId['RoomTypeId'];
        }
    }
    
    $query_roomtypeId_PK3 = "SELECT roomtype.RoomTypeId FROM roomtype, hotelclass WHERE hotelclass.RoomTypeId = roomtype.RoomTypeId AND hotelclass.ClassId = {$classId_PK3} ";
    $result_roomtypeId_PK3 = mysqli_query($conn, $query_roomtypeId_PK3); 
    if(!$result_roomtypeId_PK3){
        die("Database query failed!");
    }else{
        while($row_classId = mysqli_fetch_assoc($result_roomtypeId_PK3)){
            $roomTypeId_PK3 = $row_classId['RoomTypeId'];
        }
    }
    
    //echo 'RoomTypeId: 01: '.$roomTypeId_PK1.' 02: '.$roomTypeId_PK2.' 03. '.$roomTypeId_PK3;
    
    //Update hotelClass:
    //For $classId_PK1:
    //UPDATE `hotelclass` SET `RoomRent`= 1000,`TotalRoom`= 300 WHERE HotelId = 49 AND ClassId = 4 
    $qurey_updateHotelClass_1 = "UPDATE `hotelclass` SET `RoomRent`= {$class1Rate},`TotalRoom`= {$class1Capacity} WHERE HotelId = {$holtelID} AND ClassId = {$classId_PK1}";
    //echo '<br />';
    //echo $qurey_updateHotelClass_1;echo '<br />';
    $result_update_1 = mysqli_query($conn, $qurey_updateHotelClass_1);
    if(!$result_update_1){
        die("Database query failed!".mysqli_error($conn));
    }else{
        //echo 'hotelclass updated successfully!';
    }
    
    //For $classId_PK2:
    //UPDATE `hotelclass` SET `RoomRent`= 1000,`TotalRoom`= 300 WHERE HotelId = 49 AND ClassId = 4 
    $quey_updateHotelClass_2 = "UPDATE `hotelclass` SET `RoomRent`= {$class2Rate},`TotalRoom`= {$class2Capacity} WHERE HotelId = {$holtelID} AND ClassId = {$classId_PK2}";
    $result_update_2 = mysqli_query($conn, $quey_updateHotelClass_2);
    if(!$result_update_2){
        die("Database query failed!".mysqli_error($conn));
    }else{
        //echo 'hotelclass updated successfully!';
    }
    
    //For $classId_PK3:
    //UPDATE `hotelclass` SET `RoomRent`= 1000,`TotalRoom`= 300 WHERE HotelId = 49 AND ClassId = 4 
    $quey_updateHotelClass_3 = "UPDATE `hotelclass` SET `RoomRent`= {$class3Rate},`TotalRoom`= {$class3Capacity} WHERE HotelId = {$holtelID} AND ClassId = {$classId_PK3}";
    $result_update_3 = mysqli_query($conn, $quey_updateHotelClass_3);
    if(!$result_update_3){
        die("Database query failed!".mysqli_error($conn));
    }else{
        //echo 'hotelclass updated successfully!';
    }
    
    
    //Update roomType
    //UPDATE `roomtype` SET `RoomTypeName`='Updated',`RoomFeature`='Updated' WHERE RoomTypeId = 1 
    $query_UpdateRoomType1 = "UPDATE `roomtype` SET `RoomTypeName`='{$class1Name}',`RoomFeature`='{$class1Fet}' WHERE RoomTypeId = {$roomTypeId_PK1}";
    $result_UpdateRoomType1 = mysqli_query($conn, $query_UpdateRoomType1);
    if(!$result_UpdateRoomType1){
        die("Database query failed!".mysqli_error($conn));
    }else{
        //echo 'RoomType updated successfully!';
    }
    
    $query_UpdateRoomType2 = "UPDATE `roomtype` SET `RoomTypeName`='{$class2Name}',`RoomFeature`='{$class2Fet}' WHERE RoomTypeId = {$roomTypeId_PK2}";
    $result_UpdateRoomType2 = mysqli_query($conn, $query_UpdateRoomType2);
    if(!$result_UpdateRoomType2){
        die("Database query failed!".mysqli_error($conn));
    }else{
        //echo 'RoomType updated successfully!';
    }
    
    $query_UpdateRoomType3 = "UPDATE `roomtype` SET `RoomTypeName`='{$class3Name}',`RoomFeature`='{$class3Fet}' WHERE RoomTypeId = {$roomTypeId_PK3}";
    $result_UpdateRoomType3 = mysqli_query($conn, $query_UpdateRoomType3);
    if(!$result_UpdateRoomType3){
        die("Database query failed!".mysqli_error($conn));
    }else{
        //echo 'RoomType updated successfully!';
    }
    ?>

    <script>
        alert("Updated successfully!");
        var deleteFlag = document.getElementById('DeleteClickFlag').value;
        var  updateFlag = document.getElementById('UpdateClickFlag').value;
        
        console.log(deleteFlag);
        
        if(updateFlag)
                window.location = 'getHotelforUpdate.php';    
        else if(deleteFlag)
                window.location = 'getHotelforDelete.php';
        
    </script>
    <?php
        mysqli_close($conn);
    ?>
