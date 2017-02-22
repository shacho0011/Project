<?php 
@$conn=mysql_connect("localhost","root","");
mysql_select_db("travelmaker");
?>
<?php
                 if (isset($_GET['update2'])){
			     $id=$_GET['update2'];
				 $route="select * from route where RouteId=$id";
				 $res=mysql_query($route);
				 $row=mysql_fetch_row($res);
				 }
				 if(isset($_POST['UpdateRoute']))
				 {
				 $BusId=$_POST['BusId'];
				 $Departure=$_POST['Departure'];
				 $Arrival=$_POST['Arrival'];
				 $RouteId=$_POST['id'];
				 
				 $update="update route set BusId='$BusId',Departure='$Departure',Arrival='$Arrival'  where RouteId='$id' ";
				 $res=mysql_query($update);
				  echo "<meta http-equiv='refresh' content='0; url=admin.php'>";
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
<div id="i3"><a href="index11.php"><h3>Home</h3></a><a href="admin.php"><h3>Admin</h3></a></div>
<div id="i4">
   <form action="#" method="post" enctype="multipart/form-data" >
	  <fieldset>
		<legend><h2>Update Route</h2></legend>
		<table>
		  <tr><td><h4>Bus Id</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="BusId" value="<?php echo $row[1] ?> " /></td></tr>
	      <tr><td><h4>From City</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="Departure" value="<?php echo $row[2] ?> " /></td></tr>
		  <tr><td><h4>To City</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="Arrival"value="<?php echo $row[3] ?> " /></td></tr>
		  <tr><td colspan="2" style="position:absolute"><input type="hidden"  name="id" value="<?php echo $row[0] ?> " /></td></tr>
		  
	      <tr><td colspan="3"><input type="submit" name="UpdateRoute"  value="Update"></td></tr>
		</table>
	 </fieldset></form>
</div>