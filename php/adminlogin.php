<link rel="stylesheet" href="css/login.css" />
<div id="login_div">
    <h1>Login</h1>
    <form method="POST" action="adminloginconfirmation.php">
        <p>User Name:<input id="username_input" class="input" type="text" name="username" value="" required=1></p>
        <p>Password:<input id="password_input" class="input" type="password" name="password" value="" required=1></p>
        <input class="button" type="submit" name="login" value="Login">
        <a class="button" href="adminregistration.php">Create New Admin</a>
    </form>
</div>
