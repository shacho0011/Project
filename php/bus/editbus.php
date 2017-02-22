<?php 
@$conn=mysql_connect("localhost","root","");
mysql_select_db("travelmaker");
?>
<?php
                 if (isset($_GET['update1'])){
			     $ide=$_GET['update1'];
				 $res=mysql_query("SELECT * FROM `bus` where BusId=$ide");
				 $row=mysql_fetch_row($res);
				 }
				 if(isset($_POST['UpdateBus']))
				 {
				 $BusName=$_POST['BusName'];
				 $BusNumber=$_POST['BusNumber'];
				 $Class=$_POST['Class'];
				 $Fare=$_POST['Fare'];
				 $TotalSeat=$_POST['TotalSeat'];
				 $BusId=$_POST['ide'];
				 
				 $update1="update bus set BusName='$BusName',BusNumber='$BusNumber',Class='$Class',Fare='$Fare',TotalSeat='$TotalSeat' where BusId='$ide' ";
				 $res=mysql_query($update1);
				  echo "<meta http-equiv='refresh' content='0; url=adminbus.php'>";
				 }
?>
<style>
  a{text-decoration:none}
  h3{text-align:center; color:#000000}
  #i1{background-image:url(bg112.jpg); width:600px; height:600px; margin:0 auto}
  h2{text-align:center}
  #i3{width:600px; height:30px}
  #i4{width:400px; height:300px; border:2px; padding-left:100px; padding-top:100px}
</style>
<div id="i1">
<div id="i2"><h2>Travel Maker</h2></div>
<div id="i3"><a href="adminbus.php"><h3>Admin</h3></a><a href="../index.php"><h3>Logout</h3></a></div>
<div id="i4">
   <form action="#" method="post" enctype="multipart/form-data" >
	  <fieldset>
		<legend><h2>Update Bus</h2></legend>
		<table>
	      <tr><td><h4>Bus Name</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="BusName"  value="<?php echo $row[1] ?> " /></td></tr>
		  <tr><td><h4>Bus Number</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="BusNumber" value="<?php echo $row[2] ?>" /></td></tr>
	      <tr><td><h4>Class</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="Class" value="<?php echo $row[3] ?> " /></td></tr>
		  <tr><td><h4>Fare</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="Fare" value="<?php echo $row[4] ?> " /></td></tr>
		  <tr><td><h4>Total Seat </h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="TotalSeat" value="<?php echo $row[5] ?> " /></td></tr>
		  <tr><td colspan="2" style="position:absolute"><input type="hidden"  name="ide" value="<?php echo $row[0]?> " /></td></tr>
	      <tr><td colspan="3"><input type="submit" name="UpdateBus"  value="Update"></td></tr>
		</table>
	 </fieldset></form>
</div>
</div>