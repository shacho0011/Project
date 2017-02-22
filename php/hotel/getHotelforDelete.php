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
                    <!--<li><a href="home.html">Home</a></li>-->
                    <li class="titleOptionLi" id="hotelBtn"><a href="hotel.php" style="text-decoration: none">Home</a></li>

                    <li class="titleOptionLi">Spots</li>
                    <li class="titleOptionLi">Transports</li>
                    <li class="titleOptionLi">Hotels</li>
                    <li class="titleOptionLi" id="logInbutton" onclick="logInClicked()">Log in</li>
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
                
                
                <div id="deleteDataFormContainer" class="dbInterfaceFormContainer" style="width: 31%;">
                    <h1 id="insrtDB_formTitle" style="margin-left: 30%" >Choose a hotel</h1>
                    <form id="dltDataForm" method="POST" action="HotelFormToPopulateForDelete.php"
>                        <fieldset>
                            <label for="dltData_hotelNameInput">Name of the hotel:</label>
                            <input id="dltData_hotelNameInput" class="upDBInput" type="text" name="hotelName" required="">
                            <br />
                            <label for="dltData_hotelAddressInput">Area Code of the hotel:</label>
                            <input id="dltData_hotelAddressInput" class="upDBInput" type="text" name="hotelAreaCode" required="">
                            
                            <input type="submit" value="Next" id="dltDataButton"/>
                        </fieldset>
                        
                    </form>
                </div> 
                    
                    
                    
                    
                    
                    
                 

            </section>
            
            <footer id="pagrFooter">
               
            </footer>
            
        </div>
    </body>
</html>
