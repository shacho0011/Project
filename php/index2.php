<?php
session_start();
?>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>Welcome to Travelmaker </title>
		<link rel="stylesheet" href="css/index.css" />
    </head>
    <body>
        <header>
            <div><?php include('header.php'); ?></div>
        </header>
        <nav>
                <div><?php include('menu.php'); ?></div>
            </nav>
        <section>
            <div id="gallery_slider_class"><?php include('gallery_slider.php'); ?></div>
            <div id="login_create_class">
                <p id="login_class">
                    <?php echo "".$_SESSION["suser_name"]."\t "; ?>
                    <a id="create_class" href="index.php">Logout</a>
                </p>
            </div>
            
                <div id="side_news_class"><?php include('side_news.php'); ?></div>
                
                <img class="award" src="pagebackground/awards.png" width="600px" alt="" />
                <div id="advertisement_class"><?php include('advertisement.php'); ?></div>
                <img class="award" src="pagebackground/award2.jpg" width="480px" alt="" />
                <img class="payment" src="pagebackground/payment.png" width="480px" alt="" />
                
        </section>
        <footer>
            <?php include('footer.php'); ?>
        </footer>
    </body>
</html>