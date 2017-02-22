window.onload = function(){
    
   /* echo '<input type="hidden" id="fAddress" value="{$hAddress}">';
            echo '<input type="hidden" id="fAreaCode" value="{$hAreaCode}">';
            echo '<input type="hidden" id="fName" value="{$hName}">';
            echo '<input type="hidden" id="fCity" value="{$hCity}">';
            echo '<input type="hidden" id="fphoneNo" value="{$phoneNo}">';
            echo '<input type="hidden" id="fRoomRent1" value="{$RoomRent1}">';
            echo '<input type="hidden" id="fRoomRent2" value="{$RoomRent2}">';
            echo '<input type="hidden" id="fRoomRent3" value="{$RoomRent3}">';
            echo '<input type="hidden" id="ftotalRoomNoClass1" value="{$totalRoomNoClass1}">';
            echo '<input type="hidden" id="ftotalRoomNoClass2" value="{$totalRoomNoClass2}">';
            echo '<input type="hidden" id="ftotalRoomNoClass3" value="{$totalRoomNoClass3}">';
            echo '<input type="hidden" id="fRoomTypeNameClass1" value="{$RoomTypeNameClass1}">';
            echo '<input type="hidden" id="fRoomTypeNameClass2" value="{$RoomTypeNameClass2}">';
            echo '<input type="hidden" id="fRoomTypeNameClass3" value="{$RoomTypeNameClass3}">';
            echo '<input type="hidden" id="fRoomFeatureClass1" value="{$RoomFeatureClass1}">';
            echo '<input type="hidden" id="fRoomFeatureClass2" value="{$RoomFeatureClass2}">';
            echo '<input type="hidden" id="fRoomFeatureClass3" value="{$RoomFeatureClass3}">';
   */
  
  var jName, jAddress, jAreaCode, jCity, jPhoneNo, jRoomRent1, jRoomRent2, jRoomRent3, jTotalRoom1,
    jTotalRoom2, jTotalRoom3, JRTypeName1, JRTypeName2, JRTypeName3, jRoomFet1, jRoomFet2, jRoomFet3;
    
    if(!jName)
        jName = " ";
    else if(!jAddress)
        jAddress = " ";
    else if(!jAreaCode)
        jAreaCode = " ";
    else if(!jCity)
         jCity= " ";
    else if(!jPhoneNo)
        jPhoneNo = " ";
    else if(!jRoomRent1)
        jRoomRent1 = " ";
    else if(!jRoomRent2)
        jRoomRent2 = " ";
    else if(!jRoomRent3)
        jRoomRent3 = " ";
    else if(!jTotalRoom1)
        jTotalRoom1 = " ";
    else if(!jTotalRoom2)
        jTotalRoom2 = " ";
    else if(!jTotalRoom3)
        jTotalRoom3 = " ";
    else if(!JRTypeName1)
        JRTypeName1 = " ";
    else if(!JRTypeName2)
        JRTypeName2 = " ";
    else if(!JRTypeName3)
        JRTypeName3 = " ";
    else if(!jRoomFet1)
        jRoomFet1 = " ";
    else if(!jRoomFet2)
        jRoomFet2 = " ";
    else if(!jRoomFet3)
        jRoomFet3 = " ";
    
    jName = document.getElementById("fName").value;
    jAddress = document.getElementById("fAddress").value;
    jAreaCode = document.getElementById("fAreaCode").value;
    jCity = document.getElementById("fCity").value;
    jPhoneNo = document.getElementById("fphoneNo").value;
    jRoomRent1 = document.getElementById("fRoomRent1").value;
    jRoomRent2 = document.getElementById("fRoomRent2").value;
    jRoomRent3 = document.getElementById("fRoomRent3").value;
    jTotalRoom1 = document.getElementById("ftotalRoomNoClass1").value;
    jTotalRoom2 = document.getElementById("ftotalRoomNoClass2").value;
    jTotalRoom3 = document.getElementById("ftotalRoomNoClass3").value;
    JRTypeName1 = document.getElementById("fRoomTypeNameClass1").value;
    JRTypeName2 = document.getElementById("fRoomTypeNameClass2").value;
    JRTypeName3 = document.getElementById("fRoomTypeNameClass3").value;
    jRoomFet1 = document.getElementById("fRoomFeatureClass1").value;
    jRoomFet2 = document.getElementById("fRoomFeatureClass2").value;
    jRoomFet3 = document.getElementById("fRoomFeatureClass3").value;
    
    
    document.getElementById("insrtDB_hotelNameInput").value = jName;
    document.getElementById("insrtDB_hotelAddressInput").value=jAddress;
    document.getElementById("insrtDB_hotelAreaCodeInput").value=jAreaCode;
    document.getElementById("insrtDB_hotelCityInput").value=jCity;
    document.getElementById("insrtDB_hotelPhoneNoInput").value=jPhoneNo;
    document.getElementById("insrtDB_ClassNameInput1").value=JRTypeName1;
    document.getElementById("insrtDB_ClassNameInput2").value=JRTypeName2;
    document.getElementById("insrtDB_ClassNameInput3").value=JRTypeName3;
    document.getElementById("insrtDB_ClassCapInput1").value=jTotalRoom1;
    document.getElementById("insrtDB_ClassCapInput2").value=jTotalRoom2;
    document.getElementById("insrtDB_ClassCapInput3").value=jTotalRoom3;
    document.getElementById("insrtDB_ClassRateInput1").value=jRoomRent1;
    document.getElementById("insrtDB_ClassRateInput2").value=jRoomRent2;
    document.getElementById("insrtDB_ClassRateInput3").value=jRoomRent3;
    document.getElementById("insrtDB_ClassFetInput1").value=jRoomFet1;
    document.getElementById("insrtDB_ClassFetInput2").value=jRoomFet2;
    document.getElementById("insrtDB_ClassFetInput3").value=jRoomFet3;

            
};