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
        <link rel="stylesheet" type="text/css" href="logInStyle.css">
        <script type="text/javascript" src="hotel.js"></script>
        <script type="text/javascript" src="logIn.js"></script>
        <!--
        <script type="text/javascript" src="calendar1.js"></script>
        <script src="moment.js"></script>
        <script src="pikaday.js"></script>
        -->
    </head>
    <body>
        <div id="wrapper"">
            <div id="titleDiv">
                <ul id="titleOptionUl">
                    <li class="titleOptionLi" id="hotelBtn"><a href="../index.php">Home</a></li>
                    <li class="titleOptionLi"><a href="../places.php">Place</a></li>
                    <li class="titleOptionLi"><a href="../bus/index11.php">Ticket</a></li>
                    <li class="titleOptionLi"><a href="../hotel/hotel.php">Hotel</a></li>
                    <li class="titleOptionLi" ><a href="../adminlogin.php">Admin</a></li>
                    <li class="titleOptionLi" id="logInbutton" onclick="logInClicked()"><a href="../contact.php">Contact</a></li>
                   
                </ul>
            </div>
            <section>
                <h1 id="motto">
                    <span id="mottoPart1"></span> 
                    <span id="mottoPart2">Enjoy the tour</span></h1>
                    
                
                    
                    
                <div id="logInFormContainer">
                    <form id="logInForm" action = "logInProcess.php" method = "POST">
                        <fieldset>
                            <p style="font-size: 20px; font-weight: bold; color: #494949">Sign in to your account</p>
                            <p style="color: #7a7a7a">Access your account information and manage your bookings.</p>
                            <br /> 
                            <div id="uNmaePwordInputContainer">
                                 <div id="userNameInputDiv">
                                <p >User name:</p>
                                <input type="text" id="userNameInput" name = "username"
                                       required oninvalid="this.setCustomValidity('Enter user name')">   
                                </div>

                                <div id="passwordInputDiv">
                                        <p id="guestP">Password:</p>
                                        <input type="password" id="passwordInput" name = "password"
                                               required oninvalid="this.setCustomValidity('Enter a valid password')"> 
                                </div>
                            </div>
                            
                            <div id="signUpDiv">
                               <a href="signUp.html" id="signUpHref" >Create new account</a> 
                            </div>
                            
                            
                           <br />
                           <input type="submit" value="Log in" id="logInButton">
                           
                        </fieldset>
                    </form>


                    </div>   
                    
                    
                    
                    
                    
                    
                    
                <div id="searchHotelFormContainer">
                    <form id="searchForm" action="searchHotelProcess.php" method="POST">
                        <fieldset>
                            <p >Search a city, hotel, landmark or destination</p>
                            <input type="text" id="destinationInput" name="destinationInput"> 
                            
                            <div id="checkInOutDiv">
                                <div id="checkInDiv">
                                    <div id="checkInSelectorsDiv">
                                        <p >Check-in:</p>
                                        <select id="checkInDaySelector" name="checkInDaySelector" onchange="modifyCheckOutDate()">
                                           <!-- <option value="23">&nbsp 23</option>
                                            <option value="24">&nbsp 24</option>
                                            <option value="25">&nbsp 25</option>
                                           -->
                                        </select>
                                    
                                        <select id="checkInMonthSelector" name="checkInMonthSelector" onchange="modifycheckInDaySelector()">
                                        <!--    <option value="Today">&nbsp Jul, 2015</option>
                                            <option value="Tomorrow">&nbsp Apr, 2015</option>
                                            <option value="Day-after-tomorrow">&nbsp May, 2015</option>
                                        -->
                                        </select>
                                    </div>
                                     
                                    
                                    <div id="calendarDiv">
                                        
                                        <img src="image/calendar.png" alt="calendar" class="calendarPng" id="calendar1"
                                             onmouseover="this.src='image/calendar.gif'"
                                             onmouseout="this.src='image/calendar.png'" >
                                        <!--<img src="calendar.gif" alt="calendar" class="calendarGif" >-->
                                    </div>
                                    
                                </div>
                                
                                <div id="night_checkOutDiv">
                                    <div id="nightDiv">
                                        <p >Nights:</p>
                                        <select id="nightSelector" name="nightSelector" onchange="showCheckOut()">
                                          <!--  <option value="1">&nbsp 01</option>
                                            <option value="2">&nbsp 02</option>
                                            <option value="3">&nbsp 03</option>
                                            <option value="4">&nbsp 04</option>
                                            <option value="5">&nbsp 05</option>
                                          -->
                                        </select>
                                    </div>
                                    <div id="checkOutDiv">
                                        <div id="checkOutLabelPDiv">
                                            <p id="checkOutP">Check-out:</p>
                                            <label id="checkOutDateLabel" >26 Jul 2015</label>
                                           <input type="hidden" name="fakeInputCheckOut" id="fakeCheckOut" >
                                           <input type="hidden" name="fakeInputCheckIn" id="fakeCheckIn" >
                                           <input type="hidden" name="fakeGuestNo" id="fakeGuestNo" >
                                           <input type="hidden" name="fakeNightNo" id="fakeNightNo" >
                                           <input type="hidden" name="fakeChildNo" id="fakeChildNo" >
                                           <input type="hidden" name="fakeRoomdNo" id="fakeRoomNo" >
                                           <!-- <input type="text" id="fakeCheckOut" name="fakeInputCheckOut" style="visibility: hidden; size: 0"> -->
                                        </div>
                                        
                                        <div id="calendarDiv">
                                            <img src="image/calendar.png" alt="calendar" class="calendarPng" id="calendar2" style="margin-left: 10px"
                                             onmouseover="this.src='image/calendar.gif'"
                                             onmouseout="this.src='image/calendar.png'">
                                        <!--<img src="calendar.png" alt="calendar" class="calendarPng" style="margin-left: 10px">-->
                                    </div>
                                        
                                        
                                    </div>
                                    
                                    
                                </div>  
                            </div>
                           
                           <div id="gerstAddOpDiv">
                                <div id="guestDiv">
                                    <p id="guestP">Guests:</p>
                                    <select id="guestSelector" style="margin-bottom: 0px"
                                            onchange="getAdditionalSelectors(this.form)">
                                        <option value="1">&nbsp 1 Adult</option>
                                        <option value="2">&nbsp 2 Adults (01 Room)</option>
                                        <option value="3">&nbsp More options...</option>
                                     </select>
                                </div>
                              
                                <div id="addOpDiv">
                                    <div id="roomAdultDiv">
                                       <div id="roomSelectorPDiv">
                                       <p>Rooms:</p>
                                       <select class="additionalSelector" id="additionalRoomSelector" onchange="modifyRoomNoToPass()" >
                                                <option value="1">&nbsp 01</option>
                                                <option value="2">&nbsp 02</option>
                                                <option value="3">&nbsp 03</option>
                                                <option value="4">&nbsp 04</option>
                                                <option value="5">&nbsp 05</option>
                                                <option value="1">&nbsp 06</option>
                                                <option value="2">&nbsp 07</option>
                                                <option value="3">&nbsp 08</option>
                                                <option value="4">&nbsp 09</option>
                                                <option value="5">&nbsp 10</option>
                                            </select>
                                        </div>

                                        <div id="adultSelectorPDiv">
                                           <p>Adults:</p>
                                           <select class="additionalSelector" id="addGuestSelector" style="margin-left: 00%;" onchange="modifyFakeGuestCounter()">
                                                <option value="1">&nbsp 01</option>
                                                <option value="2">&nbsp 02</option>
                                                <option value="3">&nbsp 03</option>
                                                <option value="4">&nbsp 04</option>
                                                <option value="5">&nbsp 05</option>
                                                <option value="1">&nbsp 06</option>
                                                <option value="2">&nbsp 07</option>
                                                <option value="3">&nbsp 08</option>
                                                <option value="4">&nbsp 09</option>
                                                <option value="5">&nbsp 10</option>
                                                <option value="1">&nbsp 11</option>
                                                <option value="2">&nbsp 12</option>
                                                <option value="3">&nbsp 13</option>
                                                <option value="4">&nbsp 14</option>
                                                <option value="5">&nbsp 15</option>
                                                <option value="1">&nbsp 16</option>
                                                <option value="2">&nbsp 17</option>
                                                <option value="3">&nbsp 18</option>
                                                <option value="4">&nbsp 19</option>
                                                <option value="5">&nbsp 20</option>
                                                
                                            </select>
                                        </div>
                                   </div>
                                   
                                   
                                   
                                <div id="childrenSelectorPDiv">
                                    <p id="childrenSelectorP">Children (Age: 2-11):</p>
                                    <select class="additionalSelector" id="childrenSelector" onchange="modifyChildNoToPass()">
                                            <option value="1">&nbsp 01</option>
                                                <option value="2">&nbsp 02</option>
                                                <option value="3">&nbsp 03</option>
                                                <option value="4">&nbsp 04</option>
                                                <option value="5">&nbsp 05</option>
                                                <option value="1">&nbsp 06</option>
                                                <option value="2">&nbsp 07</option>
                                                <option value="3">&nbsp 08</option>
                                                <option value="4">&nbsp 09</option>
                                                <option value="5">&nbsp 10</option>
                                                <option value="1">&nbsp 11</option>
                                                <option value="2">&nbsp 12</option>
                                                <option value="3">&nbsp 13</option>
                                                <option value="4">&nbsp 14</option>
                                                <option value="5">&nbsp 15</option>
                                        </select>
                                </div>
                                   
                                   
                               </div>
                               
                           </div>
                           
                           
                                  
                           <p></p>
                           <input type="submit" value="Search" id="searchButton">
                           
                        </fieldset>



                    </form>
                </div>

            </section>
            
            <footer id="pagrFooter">
               
            </footer>
            
        </div>
    </body>
</html>
