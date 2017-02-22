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
	<form method="POST" action="ticketreserve.php">
    <h2>Transection Details</h2>
    <p><?php echo $row1[1]." ".$row2[2]." ".$row2[3] ?></p>
    <p>Fare:<input id="bus_number_input" class="input" type="text" name="cfare" value="<?php echo $row1[4] ?> " required=1></p>
	<p>Bus Number:<input id="bus_number_input" class="input" type="text" name="cbusnumber" value="<?php echo $row1[0] ?> " required=1></p>
    <p>Total Seat:<input id="total_seat_input" class="input" type="text" name="ctotalseat" value="" required=1></p>
	<h2>Customer Details</h2>
	<p>Name:<input id="customername" class="name_input" type="text" name="customername" value="" required=1></p>
        <p>Mobile Number:<input id="mobile_number_input" class="input" type="text" name="cmobilenumber" value="" required=1></p>
        <p>Email:<input id="email_input" class="input" type="text" name="cemail" value=""></p>
    <h3>Card Details</h3>
    <p>Bank:<input id="bank_input" class="input" type="text" name="cbank" value="" required=1></p>
    <p>Card Type<input id="cardtype_input" class="input" type="text" name="ccardtype" value="" required=1></p>
        <p>Card Number<input id="cardnumber_input" class="input" type="text" name="ccardnumber" value="" required=1></p>
        <p>Security Code:<input id="securitycode_input" class="input" type="password" name="securitycode" value="" required=1></p>
        <p>Expire Date:<input id="expiredate_input" class="input" type="date" name="expiredate" value=""></p>
        <p>Card Holder Name:<input id="card_holder_name_input" class="input" type="text" name="ccardholdername" value="" required=1></p>
        <input class="button" type="submit" value="Pay Now">
    </form>
    <img class="payment" src="../pagebackground/payment.png" width="600px" alt="" />
</div>
