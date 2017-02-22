<?php 
@$conn=mysql_connect("localhost","root","");
mysql_select_db("travelmaker");
?>
<?php
                 if (isset($_GET['Update'])){
			     $id=$_GET['Update'];
				 $schedule="select * from schedule where RouteId=$id";
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
<div id="editschedule" style="width:400; height:200">
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