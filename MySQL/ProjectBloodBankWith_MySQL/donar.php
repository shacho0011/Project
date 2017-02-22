<style>
a {text-decoration:none; color:#FF0000}
</style>

<div id="v2">
	<table align="left" border="2px" width="600px">
		<tr bgcolor="#009999"><th>First Name</th><th>Last Name</th><th>Blood Group</th><th>City</th><th>Mobile Number</th><th>Request</th></tr>
		 <?php 
                $server = ".\SQLEXPRESS";
                $options = array(  "UID" => "sa",  "PWD" => "p@ssword13",  "Database" => "BloodBankMS");
                $conn = sqlsrv_connect($server, $options);
                if ($conn === false) 
                die("<pre>".print_r(sqlsrv_errors(), true));

                $sql = "SELECT * FROM dbo.DONAR";
                $query = sqlsrv_query($conn, $sql);
                if ($query === false){  
                exit("<pre>".print_r(sqlsrv_errors(), true));
                }

                while($row = sqlsrv_fetch_array($query)){
                   if($count % 2 == 0) {
                       echo "<tr bgcolor='#99ffcc'>";
                   }else {
                       echo "<tr bgcolor='#33cccc'>";
                   }
                   $count++;
                   echo"<td>{$row[DonarFirstName]}</td>";
                   echo"<td>{$row[DonarLastName]}</td>";
                   echo"<td>{$row[DonarBloodGroup]}</td>";
                   echo"<td>{$row[DonarCity]}</td>";
                   echo"<td>{$row[DonarMobileNumber]}</td>";
                   echo"<td><a href='#?req=$row[DonarId]'>Send Request</a></td>";   
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