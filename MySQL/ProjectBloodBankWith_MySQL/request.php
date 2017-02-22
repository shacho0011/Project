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