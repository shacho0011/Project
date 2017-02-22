<?php
if($_SERVER['REQUEST_METHOD']=='POST'){
   
    $date = $_POST['rdate'];
    $name = $_POST['rname'];
    $bloodg = $_POST['rbloodgroup'];
    $dieases= $_POST['rdieases'];
    $hospital = $_POST['rhospital'];
    $address = $_POST['raddress'];
    $mobilenumber = $_POST['rmobilenumber'];

    if(!empty($date) && !empty($bloodg) && !empty($dieases) && !empty($mobilenumber)){
        
                $server = ".\SQLEXPRESS";
                $options = array(  "UID" => "sa",  "PWD" => "p@ssword13",  "Database" => "BloodBankMS");
                $conn = sqlsrv_connect($server, $options);
                if ($conn === false) 
                die("<pre>".print_r(sqlsrv_errors(), true));
                $sql = "INSERT INTO BLOODQUERY(QueryDate,QueryName,QueryBloodGroup,QueryDieases,QueryHospital,QueryAddress,QueryMobileNumber,QueryAccept) VALUES ('$date', '$name', '$bloodg', '$dieases', '$hospital', '$address', '$mobilenumber', 'No')";
                $query = sqlsrv_query($conn, $sql);
                if ($query === false){  
                    echo "Request Post Unsuccessful";
                exit("<pre>".print_r(sqlsrv_errors(), true));
                }
        echo "Request Post Successful";
    }
}
sqlsrv_free_stmt($query);
sqlsrv_close($conn);
?>

<div>
    <h2>Blood Request</h2>
    <form method="POST" action="postrequest.php">
        <p>Date:<input id="national_id_input" class="input" type="date" name="rdate" value="" required=1></p>
        <p>Name:<input id="password_input" class="input" type="text" name="rname" value=""></p>
        <p>Blood Group:<input id="national_id_input" class="input" type="text" name="rbloodgroup" value="" required=1></p>
        <p>Dieases:<input id="mobile_no_input" class="input" type="text" name="rdieases" value="" required=1></p>
        <p>Hospital:<input id="mobile_no_input" class="input" type="text" name="rhospital" value=""></p>
        <p>Address:<input id="mobile_no_input" class="input" type="text" name="raddress" value=""></p>
        <p>Mobile Number:<input id="mobile_no_input" class="input" type="text" name="rmobilenumber" value="" required=1></p>
        <input class="button" type="submit" value="Post Request">
    </form>
</div>
