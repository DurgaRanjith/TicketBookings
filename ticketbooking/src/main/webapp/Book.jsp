<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scan=1">
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
  
    <div class="navbar-header">
      <a class="navbar-brand" href="#">BOOK UR SHOW</a>
    </div>
   
  </div>
</nav>
<div class="container" align="center">

  <h2>Book Your Ticket</h2>
  <div class="row">&nbsp;</div>
  <div class="row">&nbsp;</div>
  <div class="row">&nbsp;</div>
 
  <form action="Book" method="post" class="form-horizontal" role="form"  action="" method="post" >
  
    <div class="form-group" >
      <label class="control-label col-sm-5" for="email">Total Count</label>
      <div class="col-sm-3">
        <input type="text" name=totalcount class="form-control" id="count" placeholder="Total Seat Count">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-5" for="pwd">Timings</label>
      <div class="col-sm-3">          
        <input type="text" name=timings class="form-control" id="timings" placeholder="Timings">
      </div>
    </div>
    <div class="row">&nbsp;</div>
    <div class="form-group">        
      <div class="col-sm-offset-1 col-sm-10">
      <button type="submit" class="btn btn-primary">Continue</button>
      </div>
    </div>
    </form>
    </div>

</body>
</html>