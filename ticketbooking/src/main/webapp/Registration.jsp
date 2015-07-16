
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

<title>Registration</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
  
    <div class="navbar-header">
      <a class="navbar-brand" href="#">BOOK UR SHOW</a>
    </div>
   
  </div>
</nav>
<div class="wrapper">

 <form action="Reg/Register" method="post" class="form-horizontal" role="form">
 <div class="col-md-12 col-md-offset-2">
     <div class="form-group">
        <label for="username" class="control-label col-xs-2">Name</label>
        <div class="col-xs-3">
            <input type="username" name="username" class="form-control" id="username" placeholder="Enter User Name">
        </div>
    </div>
      <div class="form-group">
        <label for="password" class="control-label col-xs-2">Password</label>
        <div class="col-xs-3">
            <input type="password" name="password" class="form-control" id="name" placeholder="Enter password">
        </div>
    </div>
      <div class="form-group">
        <label for="temp_pass" class="control-label col-xs-2">Temp pass</label>
        <div class="col-xs-3">
            <input type="temp_pass" name="temp_pass" class="form-control" id="temp_pass" placeholder="Enter Temp pass">
        </div>
    </div>
      <div class="form-group">
        <label for="first_name" class="control-label col-xs-2">First Name</label>
        <div class="col-xs-3">
            <input type="first_name" name="first_name" class="form-control" id="first_name" placeholder="Enter First Name">
        </div>
    </div>
      <div class="form-group">
        <label for="last_name" class="control-label col-xs-2">Last Name</label>
        <div class="col-xs-3">
            <input type="last_name" name="last_name" class="form-control" id="last_name" placeholder="Enter Last Name">
        </div>
          </div>
      <div class="form-group">
        <label for="email_address" class="control-label col-xs-2">Email Address</label>
        <div class="col-xs-3">
            <input type="email_address" name="emailaddress" class="form-control" id="email_address" placeholder="Enter Email Address">
        </div>
        </div>
      <div class="form-group">
        <label for="address" class="control-label col-xs-2">Address</label>
        <div class="col-xs-3">
            <input type="address" name="address" class="form-control" id="address" placeholder="Enter  Address">
        </div>
        </div>
         <div class="form-group">
        <label for="user_role" class="control-label col-xs-2">User Role</label>
        <div class="col-xs-3">
            <input type="user_role" name="user_role" class="form-control" id="user_role" placeholder="Enter  User Role">
        </div>
        </div>
        
    <div class="col-md-5 text-center">     
       
            <input type="submit" name="submit" value="Register"/>
            
            </div>
        </div>
    
   </form>
       
       
    
   
  
 </div>

</body>


</html>