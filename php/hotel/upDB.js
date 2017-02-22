window.onload = function(){
    
};


function loadGetCapacityDiv(){
    
    var sel = document.getElementById("insrtDB_hotelNoofClassSelector");
    
    var n = sel.options[sel.selectedIndex].text;
    
    
    console.log("0: "+n.charAt(0));
    
    
    var names = document.getElementById("insrtDB_ClassNameInput").value;
    //console.log(names);
    var counter = (names.match(/,/g) || []).length;
    if(counter < n || counter >n){
        alert(n+" Number of names must be inserted separated by comma");
        
        window.location = 'InsertDataForAdmin.php';
    }
      
    
    var div = document.getElementById("capacityDiv");
    div.innerHTML="";
    for(var i=0; i<n; i++){
        var cls = names.split(",")[i];
        var id = "insrtDB_capacityOf"+cls+"Input";
        div.innerHTML = div.innerHTML + "<label for='"+id+"'>Capacity of class: "+cls+"</label>"+
                "<input id='"+id+"' class='insrtDBInput' type='text'>"+"<br />";
        counter++;

    }
    
    
    
   
      
    
    
}

function modifyCapacityDic(){
    var div = document.getElementById("capacityDiv");
    div.innerHTML="";
}


function loadInsert(){
    window.location = 'InsertDataForAdmin.php';
}

function loadUpdate(){
    window.location = 'getHotelforUpdate.php';
}

function loadDelete(){
    window.location = 'getHotelforDelete.php';
}

function loadHotelData(){
    alert("hi");
    window.location = 'getHotelData.php';
}