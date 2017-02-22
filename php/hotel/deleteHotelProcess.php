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
    
    //Delete hotelClass:
    //For $classId_PK1:
    //DELETE FROM `hotelclass` WHERE ClassId = 1
    $qurey_deleteHotelClass_1 = "DELETE FROM `hotelclass` WHERE ClassId = {$classId_PK1}";
    //echo '<br />';
    //echo $qurey_deleteHotelClass_1;//echo '<br />';
    $result_delete_1 = mysqli_query($conn, $qurey_deleteHotelClass_1);
    if(!$result_delete_1){
        die("Database query failed!".mysqli_error($conn));
    }else{
        //echo 'data from hotelclass has deleted successfully!';
    }
    $qurey_deleteHotelClass_2 = "DELETE FROM `hotelclass` WHERE ClassId = {$classId_PK2}";
    //echo '<br />';
    //echo $qurey_deleteHotelClass_1;//echo '<br />';
    $result_delete_2 = mysqli_query($conn, $qurey_deleteHotelClass_2);
    if(!$result_delete_2){
        die("Database query failed!".mysqli_error($conn));
    }else{
       //echo 'data from hotelclass has deleted successfully!';
    }
    
    $qurey_deleteHotelClass_3 = "DELETE FROM `hotelclass` WHERE ClassId = {$classId_PK3}";
    //echo '<br />';
    //echo $qurey_deleteHotelClass_1;//echo '<br />';
    $result_delete_3 = mysqli_query($conn, $qurey_deleteHotelClass_3);
    if(!$result_delete_3){
        die("Database query failed!".mysqli_error($conn));
    }else{
        //echo 'data from hotelclass has deleted successfully!';
    }
    
    
    //Delete Hotel:
    //DELETE FROM `hotel` WHERE HotelId = 1
    $query_deleteHotel = "DELETE FROM `hotel` WHERE HotelId = {$holtelID}";
    $result_deleteHotel = mysqli_query($conn, $query_deleteHotel);
    if(!$result_deleteHotel){
        die("Database query failed!".mysqli_error($conn));
    }  else {
        //echo 'data from hotel has deleted successfully!';
    }
    
    //Delete from RoomType
    //DELETE FROM `roomtype` WHERE RoomTypeId = 1 
    $query_deleteRoomType_1 = "DELETE FROM `roomtype` WHERE RoomTypeId = {$roomTypeId_PK1}";
    $result_deleteRoomType_1 = mysqli_query($conn, $query_deleteRoomType_1);
    if(!$result_deleteRoomType_1){
        die("Database query failed!".mysqli_error($conn));
    }  else {
        //echo 'data from roomType has deleted successfully!';
    }
    
    $query_deleteRoomType_2 = "DELETE FROM `roomtype` WHERE RoomTypeId = {$roomTypeId_PK2}";
    $result_deleteRoomType_2 = mysqli_query($conn, $query_deleteRoomType_2);
    if(!$result_deleteRoomType_2){
        die("Database query failed!".mysqli_error($conn));
    }  else {
        //echo 'data from roomType has deleted successfully!';
    }
    
    $query_deleteRoomType_3 = "DELETE FROM `roomtype` WHERE RoomTypeId = {$roomTypeId_PK3}";
    $result_deleteRoomType_3 = mysqli_query($conn, $query_deleteRoomType_3);
    if(!$result_deleteRoomType_3){
        die("Database query failed!".mysqli_error($conn));
    }  else {
        //echo 'data from roomType has deleted successfully!';
    }
    
    
    ?>
     
    <script>
        alert("Deleted successfully!");
        var deleteFlag = document.getElementById('DeleteClickFlag').value;
        var  updateFlag = document.getElementById('UpdateClickFlag').value;
        
        console.log(deleteFlag);
        
        if(deleteFlag)
            window.location = 'getHotelforDelete.php';
        else if(updateFlag)
            window.location = 'getHotelforUpdate.php';
    </script>
    
    
    <?php
        mysqli_close($conn);
    ?>
