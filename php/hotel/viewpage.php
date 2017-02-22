<?php 
@$conn=mysql_connect("localhost","root","");
mysql_select_db("travelmaker");
?>
<style>
a {text-decoration:none; color:#FF0000}
</style>
<div style="background-image:url(../bus/bg112.jpg)">
<div id="v2">
	<table align="left" border="2px" width="400px">
		<tr bgcolor="#009999"><th>Hotel Id</th><th>Hotel Name</th><th>Address</th><th>City</th><th>Phone No.</th><th>Star</th><th>Loc. Id</th><th>Update</th><th>Delete</th></tr>
		 <?php 
		       $count=0;
		       $query=mysql_query("select * from hotel");
			   while($r=mysql_fetch_row($query)){
			   if($count % 2 == 0) { echo "<tr bgcolor='#99ffcc'>";} else {echo "<tr bgcolor='#33cccc'>";}
	           $count++;
			   echo"<td>{$r[0]}</td>";
			   echo"<td>{$r[1]}</td>";
			   echo"<td>{$r[2]}</td>";
			   echo"<td>{$r[3]}</td>";
			   echo"<td>{$r[4]}</td>";
			   echo"<td>{$r[5]}</td>";
			   echo"<td>{$r[6]}</td>";
			   echo"<td><a href=''>Update</a></td>";
			   echo"<td><a href='viewpage.php?del=$r[0]'>Delete</a></td>";
			   }
			   if (isset($_GET['del'])){
			     $id=$_GET['del'];
				 $delete="delete from hotel where HotelId='$id' ";
				 $res=mysql_query($delete);
				 
			   }
			   ?>
	</table>
	<table align="left" border="2px" width="400px">
		<tr bgcolor="#009999"><th>Class Id</th><th>Hotel Id</th><th>Room Type Id</th><th>Room Rent</th><th>Total Room</th><th>Update</th><th>Delete</th></tr>
		 <?php 
		       $count=0;
		       $query=mysql_query("select * from hotelclass");
			   while($r=mysql_fetch_row($query)){
			   if($count % 2 == 0) { echo "<tr bgcolor='#99ffcc'>";} else {echo "<tr bgcolor='#33cccc'>";}
	           $count++;
			   echo"<td>{$r[0]}</td>";
			   echo"<td>{$r[1]}</td>";
			   echo"<td>{$r[2]}</td>";
			   echo"<td>{$r[3]}</td>";
			   echo"<td>{$r[4]}</td>";
			   echo"<td><a href='editroute.php?update2=$r[0]'>Update</a></td>";
			   echo"<td><a href='viewpage.php?del=$r[0]'>Delete</a></td>";
			   }
			   if (isset($_GET['del'])){
			     $id=$_GET['del'];
				 $res=mysql_query("delete from hotelclass where ClassId='$id' ");
				 
			   }
			   
			   ?>
	</table></div>
	<div>
	
	<table align="left" border="2px" width="400px">
		<tr bgcolor="#009999"><th>Loc. Id</th><th>Loc. Name</th><th>Update</th><th>Delete</th></tr>
		 <?php 
		       $count=0;
		       $loc="select * from location";
		       $query=mysql_query($loc);
			   while($r=mysql_fetch_row($query)){
			   if($count % 2 == 0) { echo "<tr bgcolor='#99ffcc'>";} else {echo "<tr bgcolor='#33cccc'>";}
	           $count++;
			   echo"<td>{$r[0]}</td>";
			   echo"<td>{$r[1]}</td>";
			   
			   echo"<td><a href='editschedule.php?Update=$r[0]'>Update</td>";
			   echo"<td><a href='viewpage.php?del=$r[0]'>Delete</a></td>";
			   }
			   if (isset($_GET['del'])){
			     $id=$_GET['del'];
				 $delete="delete from location where LocationId='$id' ";
				 $res=mysql_query($delete);
				 
			   }
			   ?>
	</table>
	
	<table align="left" border="2px" width="400px">
		<tr bgcolor="#009999"><th>Loc. Id</th><th>Loc. Name</th><th>Update</th><th>Delete</th></tr>
		 <?php 
		       $count=0;
		       $roomtype="select * from roomtype";
		       $query=mysql_query($roomtype);
			   while($r=mysql_fetch_row($query)){
			   if($count % 2 == 0) { echo "<tr bgcolor='#99ffcc'>";} else {echo "<tr bgcolor='#33cccc'>";}
	           $count++;
			   echo"<td>{$r[0]}</td>";
			   echo"<td>{$r[1]}</td>";
			   
			   echo"<td><a href='editschedule.php?Update=$r[0]'>Update</td>";
			   echo"<td><a href='viewpage.php?del=$r[0]'>Delete</a></td>";
			   }
			   if (isset($_POST['del'])){
			     $id=$_POST['del'];
				 $delete="delete from roomtype where RoomTypId='$id' ";
				 $res=mysql_query($delete);
				 
			   }
			   ?>
	</table>
	
</div>
</div>