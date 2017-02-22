<style>
a {text-decoration:none; color:#FF0000}
</style>

<div id="request_div">
	<table align="left" border="2px" width="600px">
		<tr bgcolor="#009999"><th>Request Date</th><th>Name</th><th>Blood Group</th><th>Dieases</th><th>Hospital</th><th>Address</th><th>Mobile Number</th><th>Response</th></tr>
		 <?php 
                $server = ".\SQLEXPRESS";
                $options = array(  "UID" => "sa",  "PWD" => "p@ssword13",  "Database" => "BloodBankMS");
                $conn = sqlsrv_connect($server, $options);
                if ($conn === false) 
                die("<pre>".print_r(sqlsrv_errors(), true));
                echo "Connection Successful";
                $request = "Yes";
                $sql = "SELECT * FROM dbo.BLOODQUERY WHERE QueryAccept='No'";
                $query = sqlsrv_query($conn, $sql);
                if ($query === false){  
                    echo "No row";
                exit("<pre>".print_r(sqlsrv_errors(), true));
                }

                while($row = sqlsrv_fetch_array($query)){
                   if($count % 2 == 0) {
                       echo "<tr bgcolor='#99ffcc'>";
                   }else {
                       echo "<tr bgcolor='#33cccc'>";
                   }
                   $count++;
                   echo"<td>{$row[QueryDate]}</td>";
                   echo"<td>{$row[QueryName]}</td>";
                   echo"<td>{$row[QueryBloodGroup]}</td>";
                   echo"<td>{$row[QueryDieases]}</td>";
                   echo"<td>{$row[QueryHospital]}</td>";
                    echo"<td>{$row[QueryAddress]}</td>";
                    echo"<td>{$row[QueryMobileNumber]}</td>";
                   echo"<td><a href='#?req=$row[QueryId]'>Response</a></td>";
                    }
			   if (isset($_GET['req'])){
			     $id=$_GET['req'];
				 $delete="delete from bus where BusId='$id'";
				 $res=sqlsrv_query($delete);
			   }
                sqlsrv_free_stmt($query);
                sqlsrv_close($conn);
        ?>
</div>