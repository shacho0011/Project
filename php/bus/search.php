
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
<table bgcolor="#006666"><tr><th>Bus Id</th><th>Bus Name</th><th>Class</th><th>Fare</th><th>Date</th><th>Time</th><th>Seats</th></tr>
<?php 
@$conn=mysql_connect("localhost","root","");
mysql_select_db("travelmaker");
?>
 <?php
 if(isset($_POST['search']))
{
  $from=$_POST['from'];
  $arrive=$_POST['arrive'];
  
  $count=0;
  
 $search=mysql_query("SELECT BUS.BusId, BusName, Class, Fare,SCHEDULE.ScheduleDate,SCHEDULE.ScheduleTime, SCHEDULE.AvailableSeat FROM BUS, SCHEDULE WHERE BUS.BusId=SCHEDULE.BusId AND                      BUS.BusId IN (SELECT BusId FROM ROUTE WHERE Departure =  '$from' AND Arrival =  '$arrive')");

  while($row=mysql_fetch_array($search)){
      
	  if($count % 2 == 0) { echo "<tr bgcolor='#99ffcc'>";} else {echo "<tr bgcolor='#33cccc'>";}
	  $count++;
	  echo"<td> {$row['BusId']}</td>";
      echo"<td> {$row['BusName']}</td>";
	   echo "<td>{$row['Class']}</td>";
	    echo "<td>{$row['Fare']}</td>";
		 echo "<td>{$row['ScheduleDate']}</td>";
		  echo "<td>{$row['ScheduleTime']}</td>";
		   echo "<td>{$row['AvailableSeat']}</td>";
		    echo "<td><a href='payment.php?q=$row[0]'</a>Pick</td>";
	
		    echo "</tr>";
		   
 
  
  }
  
 }
 ?></table>
 </div>