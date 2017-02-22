<?php 
@$conn=mysql_connect("localhost","root","");
mysql_select_db("travelmaker");
?>
<style>
a {text-decoration:none; color:#FF0000}
</style>
<div id="v2">
	<table align="left" border="2px" width="400px">
		<tr bgcolor="#009999"><th>Bus Id</th><th>Bus Operator</th><th>Bus No.</th><th>Class</th><th>Fare</th><th>Seats</th><th>Update</th><th>Delete</th></tr>
		 <?php 
		       $count=0;
		       $bus="select * from bus";
		       $query=mysql_query($bus);
			   while($r=mysql_fetch_row($query)){
			   if($count % 2 == 0) { echo "<tr bgcolor='#99ffcc'>";} else {echo "<tr bgcolor='#33cccc'>";}
	           $count++;
			   echo"<td>{$r[0]}</td>";
			   echo"<td>{$r[1]}</td>";
			   echo"<td>{$r[2]}</td>";
			   echo"<td>{$r[3]}</td>";
			   echo"<td>{$r[4]}</td>";
			   echo"<td>{$r[5]}</td>";
			   echo"<td><a href='editbus.php?update1=$r[0]'>Update</a></td>";
			   echo"<td><a href='adminbus.php?del=$r[0]'>Delete</a></td>";
			   }
			   if (isset($_GET['del'])){
			     $id=$_GET['del'];
				 $delete="delete from bus where BusId='$id'";
				 $res=mysql_query($delete);
				 
			   }
			   ?>
	</table>
	<table align="right" border="2px" width="400px">
		<tr bgcolor="#009999"><th>Route No.</th><th>Bus Id</th><th>Route Details</th><th>Update</th><th>Delete</th></tr>
		 <?php 
		       $count=0;
		       $routes="select * from route";
		       $query=mysql_query($routes);
			   while($r=mysql_fetch_row($query)){
			   if($count % 2 == 0) { echo "<tr bgcolor='#99ffcc'>";} else {echo "<tr bgcolor='#33cccc'>";}
	           $count++;
			   echo"<td>{$r[0]}</td>";
			   echo"<td>{$r[1]}</td>";
			   echo"<td>{$r[2]} - {$r[3]}</td>";
			   echo"<td><a href='editroute.php?update2=$r[0]'>Update</a></td>";
			   echo"<td><a href='adminbus.php?del=$r[0]'>Delete</a></td>";
			   }
			   if (isset($_GET['del'])){
			     $id=$_GET['del'];
				 $res=mysql_query("delete from route where RouteId='$id'");
				 
			   }
			   
			   ?>
	</table></div>
	<div>
	
	<table align="left" border="2px" width="400px">
		<tr bgcolor="#009999"><th>Schdl No.</th><th>Bus Id</th><th>Schedule Date</th><th>Time</th><th>Seats</th><th>Update</th><th>Delete</th></tr>
		 <?php 
		       $count=0;
		       $schedule="select * from schedule";
		       $query=mysql_query($schedule);
			   while($r=mysql_fetch_row($query)){
			   if($count % 2 == 0) { echo "<tr bgcolor='#99ffcc'>";} else {echo "<tr bgcolor='#33cccc'>";}
	           $count++;
			   echo"<td>{$r[0]}</td>";
			   echo"<td>{$r[1]}</td>";
			   echo"<td>{$r[2]}</td>";
			   echo"<td>{$r[3]}</td>";
			   echo"<td>{$r[4]}</td>";
			   echo"<td><a href='editschedule.php?Update=$r[0]'>Update</td>";
			   echo"<td><a href='adminbus.php?del=$r[0]'>Delete</a></td>";
			   }
			   if (isset($_GET['del'])){
			     $id=$_GET['del'];
				 $delete="delete from schedule where ScheduleId='$id'";
				 $res=mysql_query($delete);
				 
			   }
			   ?>
	</table>
	
</div>
