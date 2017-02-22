<link rel="stylesheet" href="css/registration.css" />
<div id="login_div">
    <h1>Create Account</h1>
    <form method="POST" action="postadminregistration.php">
        <h2>Login Information</h2>
        <p>User Name:<input id="username_input" class="input" type="text" name="username" value="" required=1></p>
        <p>Password:<input id="password_input" class="input" type="password" name="password" value="" required=1></p>
        <p>Confirm Password:<input id="confirm_password_input" class="input" type="password" name="confirm_password" value="" required=1></p>
        <p>Admin Password:<input id="confirm_password_input" class="input" type="password" name="admin_password" value="" required=1></p>
        <p>Email:<input id="email_input" class="input" type="text" name="email" value="example@example.com" required=1></p>
        <h3>Personal Information</h3>
        <p>First Name:<input id="first_name_input" class="input" type="text" name="first_name" value="" required=1></p>
        <p>Last Name:<input id="last_name_input" class="input" type="text" name="last_name" value="" required=1></p>
        <p>Mobile No:<input id="mobile_no_input" class="input" type="text" name="mobile_no" value="" required=1></p>
        <input class="button" type="submit" value="Create Admin">
    </form>
</div>
