var j=0;



function  logInClicked(){
    j++;
    //document.getElementById("logInFormContainer").color ='red';
      
    if(j%2 !== 0){
       //myFunction2();
        document.getElementById("logInFormContainer").style.visibility = 'visible';
        //j = 0;
        console.log("j%2: "+j%2);
        
        
    }
    else{
        document.getElementById("logInFormContainer").style.visibility = 'hidden';
    }
        
}
/*
document.getElementById("wrapper").onClick = function(e){
    if(e.terget !== document.getElementById("logInbutton")){
        document.getElementById("logInFormContainer").style.visibility = 'hidden';
    }
    else{
        console.log("You clicked inside");
    }
}*/