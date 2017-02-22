/*var passedDate = new Date();
function myJavascriptFunction() { 
  //var javascriptVariable = "John";
  window.location.href = "getHotel.php?CheckIndate=" + passedDate; 
}
*/

var caheckInDateToPass, guestNoToPass = 1, childNoToPass = 0, roomNoToPass = 1, nightNoToPass = 1;

window.onload = function(){
    var d = new Date();
    var year = d.getFullYear();
    var month = d.getMonth();
    var monthName = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];
    
    //var mySelect = document.getElementById('checkInMonthSelector');
    
    for(var i=year; i<= year+1; i++){
        if(year === i){
            for(j=month; j>=0; j--){
                var opt = document.createElement('option');


                //opt.appendChild(document.createTextNode('&#160;'+monthName[j]+", "+i));
                opt.innerHTML = '&#160;'+'&#160;'+monthName[j]+", "+i;
                //opt.innerHTML='&nbsp'+monthName[j]+', '+i;
                document.getElementById("checkInMonthSelector").appendChild(opt);
            }
        }
        else{
            for(j=0; j<12; j++){
                var opt = document.createElement('option');


                //opt.appendChild(document.createTextNode('&#160;'+monthName[j]+", "+i));
                opt.innerHTML = '&#160;'+'&#160;'+monthName[j]+", "+i;
                //opt.innerHTML='&nbsp'+monthName[j]+', '+i;
                document.getElementById("checkInMonthSelector").appendChild(opt);
            }
        }
        
    }
    
    //Populating CheckIn-> date:day selector
    var cDays = calculateDays(monthName[month], year);
    //console.log("cDays: "+cDays);
    var cDate = d.getDate();
    for(j=cDate; j<=cDays; j++){
                var opt = document.createElement('option');


                if(j<10)
                    opt.innerHTML = '&#160;'+'&#160;'+"0"+j;
                else    
                    opt.innerHTML = '&#160;'+'&#160;'+j;
                //opt.innerHTML='&nbsp'+monthName[j]+', '+i;
                document.getElementById("checkInDaySelector").appendChild(opt);
    }
    
    
    //Populating nihgt selector:
    populateNightSelector();
    
    
    //Valuating CheckOutDate:
    document.getElementById("checkOutDateLabel").innerHTML = calculateCheckOutDate();
    //document.getElementById("fakeCheckOut").innerHTML = calculateCheckOutDate();
    
    //Modifying CheckOut date to the preferable formate:
    /*var tCheckOut = calculateCheckOutDate().substring(4, 15);
    tCheckOut = tCheckOut.replace(/ /g, "-");
    var tCheckOutDay = tCheckOut.split("-")[1];
    var tCheckOutMonth = tCheckOut.split("-")[0];
    var tCheckOutYear = tCheckOut.split("-")[2];
    tCheckOutMonth = convertMonthToIndex(tCheckOutDay+"-"+tCheckOutMonth+"-"+tCheckOutYear);
    document.getElementById("fakeCheckOut").value = tCheckOutDay+"/"+(tCheckOutMonth+1)+"/"+tCheckOutYear;
    */
   
    makefakeCheckOutPreferable();
   
    //document.getElementById("fakeCheckOut").value = tCheckOut;
        
    //console.log("Fake input: "+document.getElementById("fakeCheckOut").value);
   
    //caheckInDateToPass = checkInDate.toString();
    document.getElementById("fakeCheckIn").value = caheckInDateToPass; 
   
    //guestNoToPass = 1;
    document.getElementById("fakeGuestNo").value = guestNoToPass;    
   //myJavascriptFunction();
   
   document.getElementById("fakeNightNo").value = nightNoToPass; 
   //console.log("nightNoToPass: "+nightNoToPass);
   
   document.getElementById("fakeChildNo").value = childNoToPass;
   
   document.getElementById("fakeRoomNo").value = roomNoToPass;
   
   
   //populateRoomSelector();
};

function populateRoomSelector(){
    var selctor = document.getElementById('additionalRoomSelector');
    
    for(var x=1; x<=50; x++){
        var room = document.createElement('option');
        if(j<10)
                    room.innerHTML = '&#160;'+'&#160;'+"0"+j;
                else    
                    room.innerHTML = '&#160;'+'&#160;'+j;
        selctor.appendChild(room);
    }
}


function populateNightSelector(){
    for(j=1; j<=30; j++){
                var opt = document.createElement('option');


                //opt.appendChild(document.createTextNode('&#160;'+monthName[j]+", "+i));
                if(j<10)
                    opt.innerHTML = '&#160;'+'&#160;'+"0"+j;
                else{
                    if(j===30)
                        opt.innerHTML = '&#160;'+'&#160;'+j+"+";
                    else    
                        opt.innerHTML = '&#160;'+'&#160;'+j;
                }
                
                //opt.innerHTML='&nbsp'+monthName[j]+', '+i;
                document.getElementById("nightSelector").appendChild(opt);
    }
}

function calculateDays(month3, year){
    
    //console.log("month3: "+month3+"\nYear: "+year);
    
    
    var noOfDays;
    if(month3 === "Jan" || month3 === "Mar" || month3 === "May" || month3 === "Jul" || month3 === "Aug" || month3 === "Oct" || month3 === "Dec"){
        noOfDays = 31;
    }
    else if(month3 === "Feb"){
        if(year%4)
            noOfDays = 28;
        else
            noOfDays = 29;
    }
    else
        noOfDays = 30;
    
    /*
    var month = "Jan";
    if(month == "Jan"){
        console.log("OK");
    }
    else 
        console.log("NOT OK");
    */

        return noOfDays;
}


/*

function calculateDays(monthIndx, year){
    var noOfDays;
    if(monthIndx === 0 || monthIndx === 2 || monthIndx === 4 || monthIndx === 6 || monthIndx === 7 || monthIndx === 9 || monthIndx === 11){
        noOfDays = 31;
    }
    else if(monthIndx === 1){
        if(year%4)
            noOfDays = 28;
        else
            noOfDays = 29;
    }
    else
        noOfDays = 30;
    
    return noOfDays;
}

*/
function modifycheckInDaySelector(){
    //var value = frm.checkInMonthSelector.var strUser = e.options[e.selectedIndex].text;;
    var sel = document.getElementById("checkInMonthSelector");
    var selDate = sel.options[sel.selectedIndex].text;
    var month = new String();
    month = selDate.split(" ")[0];
    var year = selDate.split(" ")[1];
    
    //console.log("Selected month: "+month);
    
    month = selDate.split(",")[0];
    //console.log("Selected month: "+month);
    
    /*
    var month1 = ''+month;
    var m;
        switch (month1){
            case 'Jan':
                m = 0;
                break;
            case 'Feb':
                m = 1;
                break;
            case "Mar":
                m = 2;
                break;
            case "Apr":
                m = 3;
                break;
            case "May":
                m = 4;
                break;
            case "Jun":
                m = 5;
                break;
            case "Jul":
                m = 6;
                break;
            case 'Aug':
                m = 7;
                break;
            case "Sep":
                m = 8;
                break;
            case "Oct":
                m = 9;
                break;
            case "Nov":
                m = 10;
                break;
            case "Dec":
                m = 11;
                break;
        }
    
    console.log(m);
    */
    //month.replace(',','');
   // console.log("Selected month: "+month);
    
    //console.log("Selected year: "+year);
    month = month.replace(/ /g,'');
    //if(month === "Jan")
    //    console.log("Fine");
    
   /* var str = new String(month);
    console.log("Str: "+str);
    */
    var days = calculateDays(month.charAt(2)+''+month.charAt(3)+''+month.charAt(4), year);
   // console.log("Days: "+days);
    
    
    //Modifying CheckIn-> date:day selector depending on selected month
    //Removing all existing options
    document.getElementById("checkInDaySelector").options.length = 0;
    for(j=1; j<=days; j++){
                var opt = document.createElement('option');


                //opt.appendChild(document.createTextNode('&#160;'+monthName[j]+", "+i));
                if(j<10)
                    opt.innerHTML = '&#160;'+'&#160;'+"0"+j;
                else    
                    opt.innerHTML = '&#160;'+'&#160;'+j;
                //opt.innerHTML='&nbsp'+monthName[j]+', '+i;
                document.getElementById("checkInDaySelector").appendChild(opt);
    }
    
   /*
    console.log("0: "+month.charAt(0));
    console.log("1: "+month.charAt(1));
    console.log("2: "+month.charAt(2));
    console.log("3: "+month.charAt(3));
    console.log("4: "+month.charAt(04));
    console.log("5: "+month.charAt(05));
    console.log("6: "+month.charAt(06));
    console.log("7: "+month.charAt(07));
    console.log("8: "+month.charAt(08));
    console.log("9: "+month.charAt(09));
    console.log("10: "+month.charAt(10));
    
    */
    /*
    console.log("Selected month: "+month);
    var m1 = month.length;
    console.log("month1: "+m1);

    month.replace(/ /g,'');
    var m2 = month.length;
    
    console.log("Selected month: "+month);
    console.log("month2: "+m2);
    
    var year = selDate.split(",")[1];
    console.log("Selected year: "+year);
    var y1 = year.lenght;
    console.log("year1: "+y1);
    year.replace(/ /g,'');
    console.log("Selected year: "+year);
    var y2 = year.lenght;
    console.log("year2: "+y2);
    */
   
   document.getElementById("checkOutDateLabel").innerHTML = calculateCheckOutDate();
   //document.getElementById("fakeCheckOut").innerHTML = calculateCheckOutDate();
   //document.getElementById("fakeCheckOut").value = calculateCheckOutDate(); 
   
   //Modifying CheckOut date to the preferable formate:
   /* var tCheckOut = calculateCheckOutDate().substring(4, 15);
    tCheckOut = tCheckOut.replace(/ /g, "-");
    var tCheckOutDay = tCheckOut.split("-")[1];
    var tCheckOutMonth = tCheckOut.split("-")[0];
    var tCheckOutYear = tCheckOut.split("-")[2];
    tCheckOutMonth = convertMonthToIndex(tCheckOutDay+"-"+tCheckOutMonth+"-"+tCheckOutYear);
    document.getElementById("fakeCheckOut").value = tCheckOutDay+"/"+(tCheckOutMonth+1)+"/"+tCheckOutYear;
   */
    makefakeCheckOutPreferable();
   
   //caheckInDateToPass = checkInDate.toString();
   document.getElementById("fakeCheckIn").value = caheckInDateToPass;  
}

function modifyCheckOutDate(){
    document.getElementById("checkOutDateLabel").innerHTML = calculateCheckOutDate();
    //document.getElementById("fakeCheckOut").innerHTML = calculateCheckOutDate();
    //document.getElementById("fakeCheckOut").value = calculateCheckOutDate();
    
    //Modifying CheckOut date to the preferable formate:
    /*var tCheckOut = calculateCheckOutDate().substring(4, 15);
    tCheckOut = tCheckOut.replace(/ /g, "-");
    var tCheckOutDay = tCheckOut.split("-")[1];
    var tCheckOutMonth = tCheckOut.split("-")[0];
    var tCheckOutYear = tCheckOut.split("-")[2];
    tCheckOutMonth = convertMonthToIndex(tCheckOutDay+"-"+tCheckOutMonth+"-"+tCheckOutYear);
    document.getElementById("fakeCheckOut").value = tCheckOutDay+"/"+(tCheckOutMonth+1)+"/"+tCheckOutYear;
    */
   
    makefakeCheckOutPreferable();
    
    //caheckInDateToPass = checkInDate.toString();
    document.getElementById("fakeCheckIn").value = caheckInDateToPass; 
}





/*document.getElementById("calendarPng1").addEventListener("hover", getGif);
function getGif(){
    this.src='image/calendar.gif';
}*/



/*
 function handleSelect(sel){
    var value = sel.guestSelector.options[sel.guestSelector.selectedIndex].text;
    var elem = document.getElementById('addOpDiv');
    var str = "  More options";
    
    console.log(value);
    console.log(str);
    
    if(value.valueOf() == str.valueOf()){
        console.log(value.valueOf() == str.valueOf());
        elem.style.visibility = 'hidden';
        alert("in");
    }else{
        elem.style.visibility = 'visible';
        alert("out");
    }

} 
 */


function showCheckOut(){
    var selector = document.getElementById("nightSelector");
    var selNight = new String();
    selNight = selector.options[selector.selectedIndex].text;
    
    
    if(selNight.charAt(2)+selNight.charAt(3) === "30"){
        alert("The longest stay you can make in a single booking is 30 days. Of course, you’re welcome to stay longer. Simply make another booking for the additional days. You might never go home!");
        document.getElementById("nightSelector").options.length = 0;
        populateNightSelector();
    }
    else{
//        var daySelector = document.getElementById("checkInDaySelector");
//        var monthSelector = document.getElementById("checkInMonthSelector");
//        var selectedCheckInDate = daySelector.options[daySelector.selectedIndex].text + monthSelector.options[monthSelector.selectedIndex].text;
//        

        
        
        document.getElementById("checkOutDateLabel").innerHTML = calculateCheckOutDate();
        //document.getElementById("fakeCheckOut").innerHTML = calculateCheckOutDate();
        //document.getElementById("fakeCheckOut").value = calculateCheckOutDate(); 
        
        //Modifying CheckOut date to the preferable formate:
        /*var tCheckOut = calculateCheckOutDate().substring(4, 15);
        tCheckOut = tCheckOut.replace(/ /g, "-");
        var tCheckOutDay = tCheckOut.split("-")[1];
        var tCheckOutMonth = tCheckOut.split("-")[0];
        var tCheckOutYear = tCheckOut.split("-")[2];
        tCheckOutMonth = convertMonthToIndex(tCheckOutDay+"-"+tCheckOutMonth+"-"+tCheckOutYear);
        document.getElementById("fakeCheckOut").value = tCheckOutDay+"/"+(tCheckOutMonth+1)+"/"+tCheckOutYear;
        */
       
       makefakeCheckOutPreferable();
       
        //caheckInDateToPass = checkInDate.toString();
        document.getElementById("fakeCheckIn").value = caheckInDateToPass; 
        
        nightNoToPass = selNight.substring(2, 4);
        document.getElementById("fakeNightNo").value = nightNoToPass; 
        //console.log("nightNoToPass: "+nightNoToPass);
        
    }
    
    /*console.log("SelNight 0: "+selNight.charAt(0));
    console.log("SelNight 1: "+selNight.charAt(1));
    console.log("SelNight 2: "+selNight.charAt(2));
    console.log("SelNight 3: "+selNight.charAt(3));
    console.log("SelNight 4: "+selNight.charAt(4));
    console.log("SelNight 5: "+selNight.charAt(5));*/
}


function calculateCheckOutDate(){
    var selector = document.getElementById("nightSelector");
    var nights = new String();
    nights = selector.options[selector.selectedIndex].text;
    var daySelector = document.getElementById("checkInDaySelector");
    var monthSelector = document.getElementById("checkInMonthSelector");
    var date = daySelector.options[daySelector.selectedIndex].text + monthSelector.options[monthSelector.selectedIndex].text;
        
    
   /* console.log("SelNight 0: "+date.charAt(0));
    console.log("SelNight 1: "+date.charAt(1));
    console.log("SelNight 2: "+date.charAt(2));
    console.log("SelNight 3: "+date.charAt(3));
    console.log("SelNight 4: "+date.charAt(4));
    console.log("SelNight 5: "+date.charAt(5));
    console.log("SelNight 6: "+date.charAt(6));
    console.log("SelNight 7: "+date.charAt(7));
    console.log("SelNight 8: "+date.charAt(8));
    console.log("SelNight 9: "+date.charAt(9));
    console.log("SelNight 10: "+date.charAt(10));
    console.log("SelNight 11: "+date.charAt(11));
    console.log("SelNight 12: "+date.charAt(12));
    console.log("SelNight 13: "+date.charAt(13));
    console.log("SelNight 14: "+date.charAt(14));
    console.log("SelNight 15: "+date.charAt(15));
    console.log("SelNight 16: "+date.charAt(16));
    console.log("SelNight 17: "+date.charAt(17));
*/
    var checkInDate = new String();
    checkInDate = date.charAt(2)+date.charAt(3)+"-"+
            date.charAt(6)+date.charAt(7)+date.charAt(8)+"-"+
            date.charAt(11)+date.charAt(12)+date.charAt(13)+date.charAt(14);
    //console.log(checkInDate);
    
    
    //console.log("Month converted: "+convertMonthToIndex(checkInDate));
    
    /*------*///passedDate= checkInDate;
    
    
    
    var day, month, year;
    day = checkInDate.split("-")[0];
    month = convertMonthToIndex(checkInDate);
    year = checkInDate.split("-")[2];
    
    //console.log("Splited Date: \day: "+day+"\tmonth: "+month+"\tyear: "+year);
    
    
    if(month<9)
        caheckInDateToPass = day+"/0"+(month+1)+"/"+year;
    else
        caheckInDateToPass = day+"/"+(month+1)+"/"+year;
    document.getElementById("fakeCheckIn").value = caheckInDateToPass; 
    
    
    var dateO = new Date(year, month, day);
    //console.log("DateObject: "+dateO.toString());
    
    
    var tCheckOutDate = new Date();
    tCheckOutDate.setTime(dateO.getTime() + nights*24*60*60*1000);
    
    //console.log("nights: "+nights+"\tCheckOutDate: "+tCheckOutDate.toString());
    
    var checkOutDate = tCheckOutDate.toString().substring(0, 15);
    //console.log("CheckOutDate: "+checkOutDate);
    
    return checkOutDate;
    
    
}

function convertMonthToIndex(date){
    var month = new String();
    //month = date.charAt(3)+date.charAt(4)+date.charAt(5);
    month = date.split("-")[1];
    //console.log(month);
    
    switch (month){
        case "Jan":
            return 00;
            break;
        case "Feb":
            return 01;
            break;
        case "Mar":
            return 02;
            break;
        case "Apr":
            return 03;
            break;
        case "May":
            return 04;
            break;
        case "Jun":
            return 05;
            break;
        case "Jul":
            return 06;
            break;
        case "Aug":
            return 07;
            break;
        case "Sep":
            return 08;
            break;
        case "Oct":
            return 09;
            break;
        case "Nov":
            return 10;
            break;
        case "Dec":
            return 11;
            break;
    }
    
}

function getAdditionalSelectors(sel){
    var value = sel.guestSelector.selectedIndex;
    var elem = document.getElementById('addOpDiv');
    //console.log(value === 2);
    //alert("hfhg");
    //console.log("hgfhg");
    if(value === 2){
        
        elem.style.visibility = 'visible';
        
    }
    else{
        if(value === 0)
            guestNoToPass = 1;
        else if(value === 1)
            guestNoToPass = 2;
        elem.style.visibility = 'hidden';
    }
    
    
}

function modifyFakeGuestCounter(){
    var guestSel = document.getElementById("addGuestSelector");
    var  guestNo = guestSel.options[guestSel.selectedIndex].text;
    
   /*
    console.log("guest number 0: "+guestNo.charAt(0));
    console.log("guest number 1: "+guestNo.charAt(1));
    console.log("guest number 2: "+guestNo.charAt(2));
    console.log("guest number 3: "+guestNo.charAt(3));
    console.log("guest number 4: "+guestNo.charAt(4));
    console.log("guest number 5: "+guestNo.charAt(5));
    */
    guestNoToPass = guestNo.substring(2, 4);
    document.getElementById("fakeGuestNo").value = guestNoToPass;    
    //console.log("guestNoToPass: "+guestNoToPass);
   
}

function modifyChildNoToPass(){
    var childSel = document.getElementById("childrenSelector");
    var childNo = new String();
    childNo = childSel.options[childSel.selectedIndex].text;
    /*
    console.log("child number 0: "+childNo.charAt(0));
    console.log("child number 1: "+childNo.charAt(1));
    console.log("child number 2: "+childNo.charAt(2));
    console.log("child number 3: "+childNo.charAt(3));
    console.log("child number 4: "+childNo.charAt(4));
    console.log("child number 5: "+childNo.charAt(5));
    */
    childNoToPass = childNo.substring(2, 4);
    //console.log("childNoToPass: "+childNoToPass);
    document.getElementById("fakeChildNo").value = childNoToPass;
}

function modifyRoomNoToPass(){
    var roomSel = document.getElementById("additionalRoomSelector");
    var roomNo = new String();
    roomNo = roomSel.options[roomSel.selectedIndex].text;
    
    roomNoToPass = roomNo.substring(2, 4);
    document.getElementById("fakeRoomNo").value = roomNoToPass;
}

function makefakeCheckOutPreferable(){
    var tCheckOut = calculateCheckOutDate().substring(4, 15);
    tCheckOut = tCheckOut.replace(/ /g, "-");
    var tCheckOutDay = tCheckOut.split("-")[1];
    var tCheckOutMonth = tCheckOut.split("-")[0];
    var tCheckOutYear = tCheckOut.split("-")[2];
    tCheckOutMonth = convertMonthToIndex(tCheckOutDay+"-"+tCheckOutMonth+"-"+tCheckOutYear);
    
    if(tCheckOutMonth<9)
        document.getElementById("fakeCheckOut").value = tCheckOutDay+"/0"+(tCheckOutMonth+1)+"/"+tCheckOutYear;
    else
        document.getElementById("fakeCheckOut").value = tCheckOutDay+"/"+(tCheckOutMonth+1)+"/"+tCheckOutYear;
}

function adminPanelClicked(){
    window.location = 'getHotelforUpdate.php';
}