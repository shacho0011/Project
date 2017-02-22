<link rel="stylesheet" href="payment.css" />
<?php 
@$conn=mysql_connect("localhost","root","");
mysql_select_db("travelmaker");
?>
<?php
                 if (isset($_GET['q'])){
			     $ide=$_GET['q'];
				 $res1=mysql_query("SELECT * FROM `bus` where BusId=$ide");
				 $row1=mysql_fetch_row($res1);
				 $res2=mysql_query("SELECT * FROM `schedule` where BusId=$ide");
				 $row2=mysql_fetch_row($res2);
				 }
?>
<div id="payment_div">
    <h1>Payment Information</h1>
    <h2>Transection Details</h2>
    <p>Total Transection Amount:</p>
    <form method="POST" action="payment.php">
        <p>Bus Name:<?php echo $row1[1] ?></p>
        <p>Departure Date:<?php echo $row2[2] ?></p>
        <p>Departure Time:<?php echo $row2[3] ?></p>
		<p>Fare:<?php echo $row1[4] ?></p>
        <p>Total Seat:<input id="total_seat_input" class="input" type="text" name="totalseat" value="" required=1></p>
        <a href='payment.php?q=$row[0]'><input class="button" type="submit" value="Confirm"></a>
    </form>
    <img class="payment" src="pagebackground/payment.png" width="600px" alt="" />
</div>
