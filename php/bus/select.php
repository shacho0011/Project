<?php 
    if(isset($_GET['q']))
        {           
            
 	        if($_GET['q']=="NonAC")
            {
                require_once 'seatplan.php';
            }
			
 	        if($_GET['q']=="AC")
            {
                require_once 'seatplanAC.php';
            }
              if($_GET['q']=="search")
            {
                require_once 'search.php';
            }
             
			
		}
        else
        {
            require_once 'content.php';
        } 

?>
