<?php 
@$conn=mysql_connect("localhost","root","");
mysql_select_db("travelmaker");
?>
<?php
                 if (isset($_GET['Update'])){
			     $id=$_GET['Update'];
				 $schedule="select * from schedule where ScheduleId=$id";
				 $res=mysql_query($schedule);
				 $row=mysql_fetch_row($res);
				 }
				 if(isset($_POST['UpdateSchedule']))
				 {
				 $BusId=$_POST['BusId'];
				 $ScheduleDate=$_POST['ScheduleDate'];
				 $ScheduleTime=$_POST['ScheduleTime'];
				 $AvailableSeat=$_POST['AvailableSeat'];
				 $RouteId=$_POST['id'];
				 
				 $update="update schedule set BusId='$BusId',ScheduleDate='$ScheduleDate',ScheduleTime='$ScheduleTime',AvailableSeat='$AvailableSeat' where RouteId='$id' ";
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
		<legend><h2>Schedule Update</h2></legend>
		<table>
	       <tr><td><h4>Bus Id</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="BusId" value="<?php echo $row[1] ?>"  /></td></tr>
		   <tr><td><h4>Schedule Date</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="date"  name="ScheduleDate" value="<?php echo $row[2] ?>"  /></td></tr>
		   <tr><td><h4>Schedule Time</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="time"  name="ScheduleTime"  value="<?php echo $row[3] ?>" /></td></tr>
		   <tr><td><h4>Available Seats</h4></td><td><h4>:</h4></td><td style="position:absolute"><input type="text"  name="AvailableSeat" value="<?php echo $row[4] ?>" /></td></tr>
		   <tr><td colspan="2" style="position:absolute"><input type="hidden"  name="id" value="<?php echo $row[0]?>" /></td></tr>
	      <tr><td colspan="3"><input type="submit" name="UpdateSchedule"  value="Update"></td></tr>
		</table>
	</fieldset>
 </form>
</div>