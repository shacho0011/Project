<?php 
@$conn=mysql_connect("localhost","root","");
mysql_select_db("tktrsrv");
?>
<style>
a{text-decoration:none}
h4{color:#000000; text-align:center}
#ad1{width:1300; height:800; background-image:url(bg112.jpg)}
#ad12{height:80px; width:1300px}
#ad121{width:400px; height:800px; background-image:url(bg112.jpg); float:left}
#ad122{width:400px; height:300px; border:2px}
#ad123{width:400px; height:220px; border:2px}
#ad124{width:400px; height:280px; border:2px}
#ad2{height:800px; width:835px;float:right; background-image:url(bg112.jpg)}

</style>
<div id="ad1">
<div id="ad12"><h2>Travel Maker(Easy Ticket)</h2><a href="../index.php"><h4>Logout</h4></a></div>
<div id="ad121">
<div id="ad122">
   <form action="adminbus.php" method="post" enctype="multipart/form-data" >
	  <fieldset>
		<legend><h2>BusInfo</h2></legend>
		<table>
	     
          <tr><td><h4>Bus Name</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="BusName" required="1" /></td></tr>
		   <tr><td><h4>Bus Number</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="BusNumber" required="1" /></td></tr>
	      <tr><td><h4>Class</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="Class" required="1" /></td></tr>
		  <tr><td><h4>Fare</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="Fare" required="1" /></td></tr>
		  <tr><td><h4>Total Seat </h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="TotalSeat" required="1" /></td></tr>
	      <tr><td colspan="3"><input type="submit" name="insert"  value="Insert"></td></tr>
		</table>
	 </fieldset></form>
</div>
<div id="ad123">
   <form action="adminbus.php" method="post" enctype="multipart/form-data" >
	  <fieldset>
		<legend><h2>RouteInfo</h2></legend>
		<table>
	      
          <tr><td><h4>Bus Id</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="BusId" required="1" /></td></tr>
	      <tr><td><h4>From City</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="Departure" required="1" /></td></tr>
		  <tr><td><h4>To City</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="Arrival" required="1" /></td></tr>
		  
	      <tr><td colspan="3"><input type="submit" name="qq"  value="Insert"></td></tr>
		</table>
	 </fieldset></form>
</div>
<div id="ad124" >
   <form action="adminbus.php" method="post" enctype="multipart/form-data" >
	  <fieldset>
		<legend><h2>ScheduleInfo</h2></legend>
		<table>
	       <tr><td><h4>Bus Id</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="BusId" required="1" /></td></tr>
		   <tr><td><h4>Schedule Date</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="ScheduleDate" required="1" /></td></tr>
		   <tr><td><h4>Schedule Time</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="ScheduleTime" required="1" /></td></tr>
		   <tr><td><h4>Available Seats</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="AvailableSeat" required="1" /></td></tr>
	      <tr><td colspan="3"><input type="submit" name="rr"  value="Insert"></td></tr>
		</table>
	 </fieldset></form>
</div></div>
<div id="ad2">
 <?php include('view.php'); ?>
</div></div>

<?php
if(isset($_POST['insert']))
{
  
  $BusName=$_POST['BusName'];
  $BusNumber=$_POST['BusNumber'];
  $Class=$_POST['Class'];
  $Fare=$_POST['Fare'];
  $TotalSeat=$_POST['TotalSeat'];
   

$insert=mysql_query("INSERT INTO bus(BusName,BusNumber,Class,Fare,TotalSeat)

VALUES('$BusName','$BusNumber','$Class','$Fare','$TotalSeat')");

 if($insert)
{
echo "<script>alert('data insert successful')</script>";
echo "<script>window.location='admin.php?r=cat'</script>";

}
else
{
echo "<script>alert('data insert unsuccessful')</script>";
echo "<script>window.location='error.php'</script>";
}
}

?>
<?php
if(isset($_POST['rr']))
{
 
  $BusId=$_POST['BusId'];
  $ScheduleDate=$_POST['ScheduleDate'];
  $ScheduleTime=$_POST['ScheduleTime'];
  $AvailableSeat=$_POST['AvailableSeat'];
  

$rr=mysql_query("INSERT INTO Schedule(BusId,ScheduleDate,ScheduleTime,AvailableSeat)

VALUES('$BusId','$ScheduleDate','$ScheduleTime','$AvailableSeat')");

 if($rr)
{
echo "<script>alert('data insert successful')</script>";
echo "<script>window.location='admin.php?r=cat'</script>";

}
else
{
echo "<script>alert('data insert unsuccessful')</script>";
echo "<script>window.location='error.php'</script>";
}
}

?>

<?php
if(isset($_POST['qq']))
{
 
  $BusId=$_POST['BusId'];
  $Departure=$_POST['Departure'];
  $Arrival=$_POST['Arrival'];
  

$qq=mysql_query("INSERT INTO route(BusId,Departure,Arrival)

VALUES('$BusId','$Departure','$Arrival')");

 if($qq)
{
echo "<script>alert('data insert successful')</script>";
echo "<script>window.location='admin.php?r=cat'</script>";

}
else
{
echo "<script>alert('data insert unsuccessful')</script>";
echo "<script>window.location='error.php'</script>";
}
}

?>