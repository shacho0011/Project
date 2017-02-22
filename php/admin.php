<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>Welcome to Travelmaker</title>
		<link rel="stylesheet" href="css/admin.css" />
    </head>
    <body>
        <header>
            <div><?php include('header.php'); ?></div>
        </header>
        <section id="main_div" class="main_div_class">
            <nav>
                <div><?php include('menu.php'); ?></div>
            </nav>
            <section>
                <div style="text-align:center" id="login_create_class"><a id="login_class" href="bus/adminbus.php">Bus Section</a>or<a id="create_class" href="hotel/InsertDataForAdmin.php">Hotel Section</a></div> 
            </section>
        </section>
        <footer>
            <?php include('footer.php'); ?>
        </footer>
    </body>
</html>