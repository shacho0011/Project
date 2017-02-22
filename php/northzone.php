<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>Travelmaker : North Zone </title>
		<link rel="stylesheet" href="css/northzone.css" />
    </head>
    <body>
        <header>
            <div><?php include('header.php'); ?></div>
        </header>
        <section>
            <nav>
                <div><?php include('menu.php'); ?></div>
            </nav>
            <div id="zone_class"><?php include('zone_north.php'); ?></div>
            <div id="login_create_class"><a id="login_class" href="login.php">Login</a>or<a id="create_class" href="registration.php">Create Account</a></div>
            <div id="side_news_class"><?php include('side_news.php'); ?></div>
            <div id="advertisement_class"><?php include('advertisement.php'); ?></div>
        </section>
        <footer>
            <?php include('footer.php'); ?>
        </footer>
    </body>
</html>