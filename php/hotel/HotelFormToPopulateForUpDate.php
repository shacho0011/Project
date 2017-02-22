<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>ভ্রমণ.কম</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="hotel.css">
        <link rel="stylesheet" type="text/css" href="upDB.css"> 
        <script type="text/javascript" src="upDB.js"></script>
        <script type="text/javascript" src="populateForm.js"></script>
        
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
            $hName = $_POST['hotelName'];
            $hAreaCode = $_POST['hotelAreaCode'];
            $hotelId = "";
            $hCity = "";
            $hAddress = "";
            $phoneNo = "";
            $RoomRent1="";
            $RoomRent2="";
            $RoomRent3="";
            $totalRoomNoClass1 ="";
            $totalRoomNoClass2 ="";
            $totalRoomNoClass3 ="";
            $RoomTypeNameClass1 = "";
            $RoomTypeNameClass2 = "";
            $RoomTypeNameClass3 = "";
            $RoomFeatureClass1 = "";
            $RoomFeatureClass2 = "";
            $RoomFeatureClass3 = "";
            
            
            //SELECT HotelId FROM Hotel WHERE HotelName = 'tesho' AND AreaCode = 1100
            $query_hotelId = "SELECT `HotelId` FROM Hotel WHERE `HotelName` = '{$hName}' AND `AreaCode` = {$hAreaCode}";
            $result_hotelId = mysqli_query($conn, $query_hotelId);
            if(!$result_hotelId){
            die("Database query failed!");
                 header('Location: '.$_SERVER['REQUEST_URI']);
            }else{
                while($row_hotelId = mysqli_fetch_assoc($result_hotelId)){
                    //var_dump($row_hotelId);
                    $hotelId = $row_hotelId['HotelId'];
                    //echo "<hr />";
                    //echo $hotelId;
                }
            }
            
            echo '<input type="hidden" id="FFhotelId" value=\''.$hotelId.'\'>';
        ?>
            
        <script>
            var htlId = document.getElementById('FFhotelId').value;
            //console.log(htlId);
            if(!htlId){
                alert("No hotel found");
                window.location = 'getHotelforUpdate.php';
            }
                
        </script>
            
        
        
        <?php    
            
            //City::
            //SELECT City FROM `hotel` WHERE HotelId = 21 
            $query_City = "SELECT `City` FROM `hotel` WHERE `HotelId` = {$hotelId}";
            $result_city = mysqli_query($conn, $query_City);
            if(!$result_city){
            die("Database query failed!");
            }  else {
                while($row_city = mysqli_fetch_assoc($result_city)){
                    //var_dump($row_city);
                    $hCity = $row_city['City'];
                    //echo "<hr />";
                }
            }
            
            //Address::
            //SELECT Address FROM `hotel` WHERE HotelId = 21 
            $query_Address = "SELECT `Address` FROM `hotel` WHERE `HotelId` = {$hotelId}";
            $result_Address = mysqli_query($conn, $query_Address);
            if(!$result_Address){
            die("Database query failed!");
            }  else {
                while($row_Address = mysqli_fetch_assoc($result_Address)){
                    //var_dump($row_Address);
                    $hAddress = $row_Address['Address'];
                    //echo "<hr />";
                }
            }
            
            //Phone no::
            //SELECT PhoneNumber FROM `hotel` WHERE HotelId = 21
            $query_phoneNo = "SELECT `PhoneNumber` FROM `hotel` WHERE `HotelId` = {$hotelId}";
            $result_PhoneNo = mysqli_query($conn, $query_phoneNo);
            if(!$result_PhoneNo){
            die("Database query failed!");
            }  else {
                while($row_PhoneNo = mysqli_fetch_assoc($result_PhoneNo)){
                    //var_dump($row_PhoneNo);
                    $phoneNo = $row_PhoneNo['PhoneNumber'];
                    //echo "<hr />";
                }
            }
            
            //RentID:: <--- ClassId
            //SELECT ClassId FROM `hotelclass` WHERE HotelId = 47 
            $query_classId = "SELECT ClassId FROM `hotelclass` WHERE `HotelId` = {$hotelId}";
            $result_classId = mysqli_query($conn, $query_classId);
            if(!$result_classId){
            die("Database query failed!");
            }  else {
                $i = 1;
                while($row_ClassId = mysqli_fetch_assoc($result_classId)){
                    //var_dump($row_ClassId);
                    if($i == 1){
                        $ClassId_1 = $row_ClassId['ClassId'];
                       // echo "<hr />";
                        //Room Rent::
                        //SELECT RoomRent FROM `hotelclass` WHERE ClassId = 1 AND HotelId =47
                        $query_RentRoom1 = "SELECT `RoomRent` FROM `hotelclass` WHERE `ClassId` = {$ClassId_1} AND `HotelId` ={$hotelId}";
                        $result_RentRoom1 = mysqli_query($conn, $query_RentRoom1);
                        if(!$result_RentRoom1){
                        die("Database query failed!");
                        }  else {
                            while($row_RoomRent1 = mysqli_fetch_assoc($result_RentRoom1)){
                                //var_dump($row_RoomRent1);
                                $RoomRent1 = $row_RoomRent1['RoomRent'];
                                //echo "<hr />";
                            }
                        }
                        
                        //Total Room number::
                        
                        //SELECT TotalRoom FROM `hotelclass` WHERE ClassId = 1 AND HotelId =47
                        $query_totalRoomNoClass1 = "SELECT `TotalRoom` FROM `hotelclass` WHERE `ClassId` = {$ClassId_1} AND `HotelId` ={$hotelId}";
                        $result_totalRoomNoClass1 = mysqli_query($conn, $query_totalRoomNoClass1);
                        if(!$result_totalRoomNoClass1){
                        die("Database query failed!");
                        }  else {
                            while($row_totalRoomNoClass1 = mysqli_fetch_assoc($result_totalRoomNoClass1)){
                                //var_dump($row_totalRoomNoClass1);
                                $totalRoomNoClass1 = $row_totalRoomNoClass1['TotalRoom'];
                                //echo "<hr />";
                            }
                        }
                        
                        //RoomType Id::
                        //SELECT RoomTypeId FROM `hotelclass` WHERE ClassId = 1 AND HotelId =47
                        $query_RoomTypeIdClass1 = "SELECT `RoomTypeId` FROM `hotelclass` WHERE `ClassId` = {$ClassId_1} AND `HotelId` ={$hotelId}";
                        $result_RoomTypeIdClass1 = mysqli_query($conn, $query_RoomTypeIdClass1);
                        if(!$result_RoomTypeIdClass1){
                        die("Database query failed!");
                        }  else {
                            while($row_RoomTypeIdClass1 = mysqli_fetch_assoc($result_RoomTypeIdClass1)){
                                //var_dump($row_RoomTypeIdClass1);
                                $RoomTypeIdClass1 = $row_RoomTypeIdClass1['RoomTypeId'];
                                //echo "<hr />";
                            }
                        }
                        
                        
                        
                    }else if($i == 2){
                        $ClassId_2 = $row_ClassId['ClassId'];
                        //echo "<hr />";
                        //Room Rent::
                        //SELECT RoomRent FROM `hotelclass` WHERE ClassId = 1 AND HotelId =47
                        $query_RentRoom2 = "SELECT `RoomRent` FROM `hotelclass` WHERE `ClassId` = {$ClassId_2} AND `HotelId` ={$hotelId}";
                        $result_RentRoom2 = mysqli_query($conn, $query_RentRoom2);
                        if(!$result_RentRoom2){
                        die("Database query failed!");
                        }  else {
                            while($row_RoomRent2 = mysqli_fetch_assoc($result_RentRoom2)){
                                //var_dump($row_RoomRent2);
                                $RoomRent2 = $row_RoomRent2['RoomRent'];
                                //echo "<hr />";
                            }
                        }
                        //Total Room number::
                        
                        //SELECT TotalRoom FROM `hotelclass` WHERE ClassId = 1 AND HotelId =47
                        $query_totalRoomNoClass2 = "SELECT `TotalRoom` FROM `hotelclass` WHERE `ClassId` = {$ClassId_2} AND `HotelId` ={$hotelId}";
                        $result_totalRoomNoClass2 = mysqli_query($conn, $query_totalRoomNoClass2);
                        if(!$result_totalRoomNoClass2){
                        die("Database query failed!");
                        }  else {
                            while($row_totalRoomNoClass2 = mysqli_fetch_assoc($result_totalRoomNoClass2)){
                                //var_dump($row_totalRoomNoClass2);
                                $totalRoomNoClass2 = $row_totalRoomNoClass2['TotalRoom'];
                                //echo "<hr />";
                            }
                        }
                        
                        //RoomType Id::
                        //SELECT RoomTypeId FROM `hotelclass` WHERE ClassId = 1 AND HotelId =47
                        $query_RoomTypeIdClass2 = "SELECT `RoomTypeId` FROM `hotelclass` WHERE `ClassId` = {$ClassId_2} AND `HotelId` ={$hotelId}";
                        $result_RoomTypeIdClass2 = mysqli_query($conn, $query_RoomTypeIdClass2);
                        if(!$result_RoomTypeIdClass2){
                        die("Database query failed!");
                        }  else {
                            while($row_RoomTypeIdClass2 = mysqli_fetch_assoc($result_RoomTypeIdClass2)){
                                //var_dump($row_RoomTypeIdClass2);
                                $RoomTypeIdClass2 = $row_RoomTypeIdClass2['RoomTypeId'];
                                //echo "<hr />";
                            }
                        }
                        
                        
                    }else if($i == 3){
                        $ClassId_3 = $row_ClassId['ClassId'];
                        //echo "<hr />";
                        //Room Rent::
                        //SELECT RoomRent FROM `hotelclass` WHERE ClassId = 1 AND HotelId =47
                        $query_RentRoom3 = "SELECT `RoomRent` FROM `hotelclass` WHERE `ClassId` = {$ClassId_3} AND `HotelId` ={$hotelId}";
                        $result_RentRoom3 = mysqli_query($conn, $query_RentRoom3);
                        if(!$result_RentRoom3){
                        die("Database query failed!");
                        }  else {
                            while($row_RoomRent3 = mysqli_fetch_assoc($result_RentRoom3)){
                                //var_dump($row_RoomRent3);
                                $RoomRent3 = $row_RoomRent3['RoomRent'];
                                //echo "<hr />";
                            }
                        }
                        
                        //Total Room number::
                        
                        //SELECT TotalRoom FROM `hotelclass` WHERE ClassId = 1 AND HotelId =47
                        $query_totalRoomNoClass3 = "SELECT `TotalRoom` FROM `hotelclass` WHERE `ClassId` = {$ClassId_3} AND `HotelId` ={$hotelId}";
                        $result_totalRoomNoClass3 = mysqli_query($conn, $query_totalRoomNoClass3);
                        if(!$result_totalRoomNoClass3){
                        die("Database query failed!");
                        }  else {
                            while($row_totalRoomNoClass3 = mysqli_fetch_assoc($result_totalRoomNoClass3)){
                                //var_dump($row_totalRoomNoClass3);
                                $totalRoomNoClass3 = $row_totalRoomNoClass3['TotalRoom'];
                                //echo "<hr />";
                            }
                        }
                        
                        //RoomType Id::
                        //SELECT RoomTypeId FROM `hotelclass` WHERE ClassId = 1 AND HotelId =47
                        $query_RoomTypeIdClass3 = "SELECT `RoomTypeId` FROM `hotelclass` WHERE `ClassId` = {$ClassId_3} AND `HotelId` ={$hotelId}";
                        $result_RoomTypeIdClass3 = mysqli_query($conn, $query_RoomTypeIdClass3);
                        if(!$result_RoomTypeIdClass3){
                        die("Database query failed!");
                        }  else {
                            while($row_RoomTypeIdClass3 = mysqli_fetch_assoc($result_RoomTypeIdClass3)){
                                //var_dump($row_RoomTypeIdClass3);
                                $RoomTypeIdClass3 = $row_RoomTypeIdClass3['RoomTypeId'];
                                //echo "<hr />";
                            }
                        }
                        
                        
                    }
                    
                    
                        
                    $i++;
                }
                
            }
            
            //RoomTypeName::
            //SELECT RoomTypeName FROM `roomtype` WHERE RoomTypeId = 1
            $query_RoomTypeName1 = "SELECT RoomTypeName FROM `roomtype` WHERE RoomTypeId = {$RoomTypeIdClass1}";
            $result_RoomtypName1 = mysqli_query($conn, $query_RoomTypeName1);
            if(!$result_RoomtypName1){
                die("Database query failed!");
            }else{

                while($row_RoomTypeName1 = mysqli_fetch_assoc($result_RoomtypName1)){
                    //var_dump($row_RoomTypeName1);
                    $RoomTypeNameClass1 = $row_RoomTypeName1['RoomTypeName'];
                    //echo "<hr />";
            }   
            }
            
            
            $query_RoomTypeName2 = "SELECT RoomTypeName FROM `roomtype` WHERE RoomTypeId = {$RoomTypeIdClass2}";
            $result_RoomtypName2 = mysqli_query($conn, $query_RoomTypeName2);
            if(!$result_RoomtypName2){
                die("Database query failed!");
            }else{

                while($row_RoomTypeName2 = mysqli_fetch_assoc($result_RoomtypName2)){
                    //var_dump($row_RoomTypeName2);
                    $RoomTypeNameClass2 = $row_RoomTypeName2['RoomTypeName'];
                    //echo "<hr />";
            }   
            }
            
            $query_RoomTypeName3 = "SELECT RoomTypeName FROM `roomtype` WHERE RoomTypeId = {$RoomTypeIdClass3}";
            $result_RoomtypName3 = mysqli_query($conn, $query_RoomTypeName3);
            if(!$result_RoomtypName3){
                die("Database query failed!");
            }else{

                while($row_RoomTypeName3 = mysqli_fetch_assoc($result_RoomtypName3)){
                    //var_dump($row_RoomTypeName3);
                    $RoomTypeNameClass3 = $row_RoomTypeName3['RoomTypeName'];
                    //echo "<hr />";
            }   
            }
            
            //RoomReatures::
            $query_RoomFeature1 = "SELECT RoomFeature FROM `roomtype` WHERE RoomTypeId = {$RoomTypeIdClass1}";
            $result_RoomFeature1 = mysqli_query($conn, $query_RoomFeature1);
            if(!$result_RoomFeature1){
                die("Database query failed!");
            }else{

                while($row_RoomFeature1 = mysqli_fetch_assoc($result_RoomFeature1)){
                    //var_dump($row_RoomFeature1);
                    $RoomFeatureClass1 = $row_RoomFeature1['RoomFeature'];
                    //echo "<hr />";
            }   
            }
            
            $query_RoomFeature2 = "SELECT RoomFeature FROM `roomtype` WHERE RoomTypeId = {$RoomTypeIdClass2}";
            $result_RoomFeature2 = mysqli_query($conn, $query_RoomFeature2);
            if(!$result_RoomFeature2){
                die("Database query failed!");
            }else{

                while($row_RoomFeature2 = mysqli_fetch_assoc($result_RoomFeature2)){
                    //var_dump($row_RoomFeature2);
                    $RoomFeatureClass2 = $row_RoomFeature2['RoomFeature'];
                    //echo "<hr />";
            }   
            }
            
            $query_RoomFeature3 = "SELECT RoomFeature FROM `roomtype` WHERE RoomTypeId = {$RoomTypeIdClass3}";
            $result_RoomFeature3 = mysqli_query($conn, $query_RoomFeature3);
            if(!$result_RoomFeature3){
                die("Database query failed!");
            }else{

                while($row_RoomFeature3 = mysqli_fetch_assoc($result_RoomFeature3)){
                    //var_dump($row_RoomFeature3);
                    $RoomFeatureClass3 = $row_RoomFeature3['RoomFeature'];
                    //echo "<hr />";
            }   
            }
           /* 
            echo 'room rent 01:'.$RoomRent1." 02: ".$RoomRent2." 03: ".$RoomRent3;
            echo "<hr />";
            echo 'total room class 01: '.$totalRoomNoClass1."class 02:".$totalRoomNoClass2.'class 03: '.$totalRoomNoClass3;
            echo "<hr />";
            echo 'RoomTypeID: class1:'.$RoomTypeIdClass1."02 ".$RoomTypeIdClass2." 03".$RoomTypeIdClass3;
            echo "Room type: class 01: ".$RoomTypeNameClass1."class 02".$RoomTypeNameClass2."class 03".$RoomTypeNameClass3;
            echo "Room features: class 01: ".$RoomFeatureClass1."class 02".$RoomFeatureClass2."class 03".$RoomFeatureClass1;
           */ 
         /* $hName = $_POST['hotelName'];
            $hAreaCode = $_POST['hotelAreaCode'];
            $hotelId = "";
            $hCity = "";
            $phoneNo = "";
            $RoomRent1="";
            $RoomRent2="";
            $RoomRent3="";
            $totalRoomNoClass1 ="";
            $totalRoomNoClass2 ="";
            $totalRoomNoClass3 ="";
            $RoomTypeNameClass1 = "";
            $RoomTypeNameClass2 = "";
            $RoomTypeNameClass3 = "";
            $RoomFeatureClass1 = "";
            $RoomFeatureClass2 = "";
            $RoomFeatureClass3 = "";*/
            
            echo '<input type="hidden" id="fAddress" value=\''.$hAddress.'\'>';
            echo '<input type="hidden" id="fAreaCode" value=\''.$hAreaCode.'\'>';
            echo '<input type="hidden" id="fName" value=\''.$hName.'\'>';
            echo '<input type="hidden" id="fCity" value=\''.$hCity.'\'>';
            echo '<input type="hidden" id="fphoneNo" value=\''.$phoneNo.'\'>';
            echo '<input type="hidden" id="fRoomRent1" value=\''.$RoomRent1.'\'>';
            echo '<input type="hidden" id="fRoomRent2" value=\''.$RoomRent2.'\'>';
            echo '<input type="hidden" id="fRoomRent3" value=\''.$RoomRent3.'\'>';
            echo '<input type="hidden" id="ftotalRoomNoClass1" value=\''.$totalRoomNoClass1.'\'>';
            echo '<input type="hidden" id="ftotalRoomNoClass2" value=\''.$totalRoomNoClass2.'\'>';
            echo '<input type="hidden" id="ftotalRoomNoClass3" value=\''.$totalRoomNoClass3.'\'>';
            echo '<input type="hidden" id="fRoomTypeNameClass1" value=\''.$RoomTypeNameClass1.'\'>';
            echo '<input type="hidden" id="fRoomTypeNameClass2" value=\''.$RoomTypeNameClass2.'\'>';
            echo '<input type="hidden" id="fRoomTypeNameClass3" value=\''.$RoomTypeNameClass3.'\'>';
            echo '<input type="hidden" id="fRoomFeatureClass1" value=\''.$RoomFeatureClass1.'\'>';
            echo '<input type="hidden" id="fRoomFeatureClass2" value=\''.$RoomFeatureClass2.'\'>';
            echo '<input type="hidden" id="fRoomFeatureClass3" value=\''.$RoomFeatureClass3.'\'>';
            
            //passing to the next php page:
            session_start();
            $_SESSION['HotelId'] = $hotelId;
            $_SESSION['UpDateCicked'] = TRUE;
            $_SESSION['DeleteClicked'] = FALSE;
        ?>
    
    </head>
    
    <body style="background-image: none">
       <div id="wrapper" >
            <div id="titleDiv">
                <ul id="titleOptionUl">
                    <li class="titleOptionLi" id="hotelBtn"><a href="viewpage.php" style="text-decoration: none">View Database</a></li>
                    <li class="titleOptionLi" id="hotelBtn"><a href="../index.php" style="text-decoration: none">Logout</a></li>
                    <li class="titleOptionLi">About</li>
                </ul>
            </div>
            <section>
                <h1 id="motto">
                    <span id="mottoPart1"></span> 
                    <span id="mottoPart2">Enjoy the tour</span></h1>
                
                <div id="menu">
                    <ul id="optionUl">
                    
                        <li class="optionLi" onclick="loadInsert()">Insert</li>
                        <li class="optionLi" onclick="loadUpdate()">Update</li>
                        <li class="optionLi" onclick="loadDelete()">Delete</li>
                    </ul>
                </div> 
                
                
                <div id="insertDBFormContainer" class="dbInterfaceFormContainer" style="margin-left: 400px; width: 50%">
                    <h1 id="insrtDB_formTitle" >Modify data in the database</h1>
                    <form id="insertDBform" method="POST" action="updateHotelProcess.php">
                        <fieldset id="insrtDBFieldSet" style="/*background-color: gray*/; margin: 0 auto; width: 80%">
                            
                            
                           <!-- <br />
                            <lable >Stars:</lable>
                            <input id="insrtDB_stars" class="insrtDBInput" name="noOfStars" type="text" placeholder="Bwtween 1 and 5">
                            -->
                            <div style="/*background-color: olive*/; width: 75%; margin: 0 auto">
                                <div id="htlName">
                                    <label for="insrtDB_hotelNameInput">Name of the hotel:</label>
                                    <input id="insrtDB_hotelNameInput" class="insrtDBInput" name="hotelName" type="text" style="width: 450px;">
                                </div>
                                
                                <div id="hotelDetailDiv">
                                    <div id="div1" class="leftDivOfThetwo">
                                
                                    <div id="div1Left" >
                                       <label for="insrtDB_hotelAddressInput">Address:</label>
                                        <input id="insrtDB_hotelAddressInput" class="insrtDBInput" name="hotelAddress" type="text"> 
                                    </div>
                                    
                                    <div id="div1Right">
                                        <label for="insrtDB_hotelAreaCodeInput">Area Code:</label>
                                        <input id="insrtDB_hotelAreaCodeInput" class="insrtDBInput" name="hotelAreaCode" type="text">
                                    </div>
                                
                                </div>
                            
                            
                                <div id="div2" class="rightDivOfThetwo" style="margin-top: -33.5%;">
                                    <div class="">
                                        <label for="insrtDB_hotelCityInput" style="padding-left: 70%">City:</label>
                                        <input id="insrtDB_hotelCityInput" class="insrtDBInput" name="hotelCity" type="text" style="margin-left: 10%">
                                    </div>
                                    
                                    <div class="">
                                        <label for="insrtDB_hotelPhoneNoInput" style="width: 50%;padding-left: 17%;">Phone No:</label>
                                        <input id="insrtDB_hotelPhoneNoInput" class="insrtDBInput" name="hotelPhoneNo" type="text" style="margin-left: 10%">
                                    </div>

                                </div>
                            </div>
                            
                            
                            

                          
                         <!--   <label>No of Class:</label>
                            <select id="insrtDB_hotelNoofClassSelector" onchange="modifyCapacityDic()">
                                               <option value="1">&nbsp 01</option>
                                               <option value="2">&nbsp 02</option>
                                               <option value="3">&nbsp 03</option>
                                               <option value="4">&nbsp 04</option>
                                               <option value="5">&nbsp 05</option>

                            </select>
                         -->
                         
                        <div class="classDetailDiv">
                             <br />
                            <div class="leftDivOfThetwo">
                                <label for="insrtDB_ClassNameInput1">Name:</label>
                                <input id="insrtDB_ClassNameInput1" class="insrtDBInput" type="text" name="hotelClass1Name" placeholder="Name of the class" onchange="loadGetCapacityDiv()">
                                <br />
                                <lable for="insrtDB_ClassCapInput1">Total number rooms:</lable>
                                <input id="insrtDB_ClassCapInput1" class="insrtDBInput" name="hotelClass1capa" type="text" placeholder="Number of rooms">
                            </div>
                            
                            <br />
                            
                            <div class="rightDivOfThetwo" id="right1" style="margin-top: -31%" >
                                <lable for="insrtDB_ClassRateInput1">Rent rate per room:</lable>
                                <input id="insrtDB_ClassRateInput1" class="insrtDBInput" name="hotelClass1Rate" type="text" placeholder="Rent per room">

                                <br />
                                <lable for="insrtDB_ClassFetInput1">Features:</lable>
                                <input id="insrtDB_ClassFetInput1" class="insrtDBInput" name="hotelClass1Fet" type="text" placeholder="Features of rooms">
                            </div>
                            
                        </div>
                        
                         
                        
                        <div class="classDetailDiv">
                             <br />
                             
                            <div class="leftDivOfThetwo">
                                <label for="insrtDB_ClassNameInput2">Name:</label>
                                <input id="insrtDB_ClassNameInput2" class="insrtDBInput" type="text" name="hotelClass2Name" placeholder="Name of the class" onchange="loadGetCapacityDiv()">
                                <br />
                                <lable for="insrtDB_ClassCapInput2">Total number rooms:</lable>
                                <input id="insrtDB_ClassCapInput2" class="insrtDBInput" name="hotelClass2capa" type="text" placeholder="Number of rooms">
                            </div>
                                <br />
                            <div class="rightDivOfThetwo" id="right2"style="margin-top: -31%">
                                <lable for="insrtDB_ClassRateInput2">Rent rate per room:</lable>
                                <input id="insrtDB_ClassRateInput2" class="insrtDBInput" name="hotelClass2Rate" type="text" placeholder="Rent per room">
                                <br />
                                <lable for="insrtDB_ClassFetInput2">Features:</lable>
                                <input id="insrtDB_ClassFetInput2" class="insrtDBInput" name="hotelClass2Fet" type="text" placeholder="Features of rooms">
                             
                            </div>
                                
                         </div>
                            
                            
                            
                         <div class="classDetailDiv">
                            <br />
                            <div class="leftDivOfThetwo">
                                <label for="insrtDB_ClassNameInput3">Name:</label>
                                <input id="insrtDB_ClassNameInput3" class="insrtDBInput" type="text" name="hotelClass3Name" placeholder="Name of the class" onchange="loadGetCapacityDiv()">
                                <br />
                                <lable for="insrtDB_ClassCapInput3">Total number rooms:</lable>
                                <input id="insrtDB_ClassCapInput3" class="insrtDBInput" name="hotelClass3capa" type="text" placeholder="Number of rooms">
                            </div>
                            
                            <div class="rightDivOfThetwo" id="right3" style="margin-top: -31%">
                                <lable for="insrtDB_ClassRateInput3">Rent rate per room:</lable>
                                <input id="insrtDB_ClassRateInput3" class="insrtDBInput" name="hotelClass3Rate" type="text" placeholder="Rent per room">
                                <br />
                                <lable for="insrtDB_ClassFetInput3">Features:</lable>
                                <input id="insrtDB_ClassFetInput3" class="insrtDBInput" name="hotelClass3Fet" type="text" placeholder="Features of rooms">
                            </div>
                         </div>   
                            
                            
                            
                            
                            <br />
                            
                          <!--  <br />
                            <label for="insrtDB_hotelPhoneNoInput">Room capacity:</label>
                            <div id="capacityDiv">

                            </div> 
                          -->  
                            <input type="submit" value="Update" id="insertSubmitButton"> 
                            </div>
                            
                            
                        </fieldset>
                        
                    </form>
                    
                </div>
                    
               

            </section>
            
            <footer id="pagrFooter">

            </footer>
            
        </div>
    </body>
    

    <?php
        mysqli_close($conn);
    ?>
</html>
