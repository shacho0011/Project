<?php
    $hName = $_POST['hotelName'];
    $hAddress = $_POST['hotelAddress'];
    
    
?>
<html>
    <head>
        <title>ভ্রমণ.কম</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <script type="text/javascript" src="populateHotelForm.js"></script>
    </head>
    
    <body>
        <?php
            echo file_get_contents(HotelFormToPopulate.php);
        ?>
    </body>