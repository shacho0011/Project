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
        <!--
        <script type="text/javascript" src="calendar1.js"></script>
        <script src="moment.js"></script>
        <script src="pikaday.js"></script>
        -->
    </head>
    <body style="background-image: none">
        <div id="wrapper"">
            <div id="titleDiv">
                <ul id="titleOptionUl">
                    <li class="titleOptionLi" id="hotelBtn"><a href="viewpage.php" style="text-decoration: none">View Database</a></li>
                    <li class="titleOptionLi" id="hotelBtn"><a href="../index.php" style="text-decoration: none">Logout</a></li>
                    
                    
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
                    <h1 id="insrtDB_formTitle" >Insert a new hotel in the database</h1>
                    <form id="insertDBform" method="POST" action="insertNewHotel.php">
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
                                <input id="insrtDB_ClassNameInput1" class="insrtDBInput" type="text" name="hotelClass1Name" placeholder="Name of the class" >
                                <br />
                                <lable for="insrtDB_ClassCapInput1">Total number rooms:</lable>
                                <input id="insrtDB_ClassCapInput1" class="insrtDBInput" name="hotelClass1capa" type="text" placeholder="Number of rooms">
                            </div>
                            
                            <br />
                            
                            <div class="rightDivOfThetwo" id="right1" style="margin-top: -32.5%" >
                                <lable for="insrtDB_ClassRateInput1">Rent rate per room::</lable>
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
                                <input id="insrtDB_ClassNameInput2" class="insrtDBInput" type="text" name="hotelClass2Name" placeholder="Name of the class" ">
                                <br />
                                <lable for="insrtDB_ClassCapInput2">Total number rooms:</lable>
                                <input id="insrtDB_ClassCapInput2" class="insrtDBInput" name="hotelClass2capa" type="text" placeholder="Number of rooms">
                            </div>
                                <br />
                            <div class="rightDivOfThetwo" id="right2"style="margin-top: -32.5%">
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
                                <input id="insrtDB_ClassNameInput3" class="insrtDBInput" type="text" name="hotelClass3Name" placeholder="Name of the class" ">
                                <br />
                                <lable for="insrtDB_ClassCapInput3">Total number rooms:</lable>
                                <input id="insrtDB_ClassCapInput3" class="insrtDBInput" name="hotelClass3capa" type="text" placeholder="Number of rooms">
                            </div>
                            
                            <div class="rightDivOfThetwo" id="right3" style="margin-top: -32.5%">
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
                            <input type="submit" value="Submit" id="insertSubmitButton"> 
                            </div>
                            
                            
                        </fieldset>
                        
                    </form>
                    
                </div>
                    
               

            </section>
            
            <footer id="pagrFooter">
              
            </footer>
            
        </div>
    </body>
</html>
