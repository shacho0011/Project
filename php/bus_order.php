<link rel="stylesheet" href="css/payment.css" />
<?php 
@$conn=mysql_connect("localhost","root","");
mysql_select_db("travelmaker");
?>
<?php
                 if (isset($_GET['q'])){
			     $ide=$_GET['q'];
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
				  echo "<meta http-equiv='refresh' content='0; url=admin.php'>";
				 }
?>
<div id="payment_div">
    <h1>Payment Information</h1>
    <h2>Transection Details</h2>
    <p>Total Transection Amount:</p>
    <form method="POST" action="post_registration.php">
        <p>Bus Name:"<?php echo $row[1] ?> "</p>
        <p>Departure Date: <?php echo $row[1]?></p>
        <p>Departure Time:</p>
        <p style="padding-right:20px;">Total Seat:<input id="total_seat_input" class="input" type="text" name="totalseat" value="" required=1></p>
        <input class="button" type="submit" value="Confirm">
    </form>
    <img class="payment" src="pagebackground/payment.png" width="600px" alt="" />
</div>
