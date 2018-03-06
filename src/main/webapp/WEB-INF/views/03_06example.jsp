<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>                        
	      </button>
	      <a class="navbar-brand" href="#">WebSiteName</a>
	    </div>
	    <div class="collapse navbar-collapse" id="myNavbar">
	      <ul class="nav navbar-nav navbar-right">
	      	<li>
	      		<form class="navbar-form navbar-left" action="/action_page.php">
				  <div class="input-group">
				    <input type="text" class="form-control" placeholder="Search">
				    <div class="input-group-btn">
				      <button class="btn btn-default" type="submit">
				        <i class="glyphicon glyphicon-search"></i>
				      </button>
				    </div>
				  </div>
				</form>
	      	</li>
	        <li><a href="#">Dashboard</a></li>
	        <li><a href="#">Settings</a></li>
	        <li><a href="#">Profile</a></li>
	        <li><a href="#" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	      </ul>
	    </div>
	  </div>
	</nav>
	
	<div class="container">
		<table class="table table-hover">
		    <thead>
		      <tr>
		        <th>#</th>
		        <th>Header</th>
		        <th>Header</th>
		        <th>Header</th>
		        <th>Header</th>
		      </tr>
		    </thead>
		    <tbody>
		      <tr>
		        <td>1,001</td>
		        <td>Lorem</td>
		        <td>ipsum</td>
		        <td>dolor</td>
		        <td>sit</td>
		      </tr>
		      <tr>
		        <td>1,002</td>
		        <td>amet</td>
		        <td>consectetur</td>
		        <td>adipiscing</td>
		        <td>elit</td>
		      </tr>
		      <tr>
		        <td>1,003</td>
		        <td>Integer</td>
		        <td>nec</td>
		        <td>odio</td>
		        <td>Praesent</td>
		      </tr>
		      <tr>
		        <td>1,004</td>
		        <td>libero</td>
		        <td>Sed</td>
		        <td>cursus</td>
		        <td>ante</td> 
		      </tr>
		      <tr>
		        <td>1,005</td>
		        <td>dapibus</td>
		        <td>diam</td>
		        <td>Sed</td>
		        <td>nisi</td>
		      </tr>
		      <tr>
		        <td>1,006</td>
		        <td>Nulla</td>
		        <td>quis</td>
		        <td>sem</td>
		        <td>at</td>
		      </tr>
		    </tbody>
		  </table>
	</div>
	
	<div class="container">
		<form action="/action_page.php">
		  <div class="form-group">
		    <label for="email">Email address:</label>
		    <input type="email" class="form-control" id="email">
		  </div>
		  <div class="form-group">
		    <label for="pwd">Password:</label>
		    <input type="password" class="form-control" id="pwd">
		  </div>
		  <div class="checkbox">
		    <label><input type="checkbox"> Remember me</label>
		  </div>
		  <button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>
	
	<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
          <form action="/action_page.php">
			  <div class="form-group">
			    <label for="email">id:</label>
			    <input type="email" class="form-control" id="email">
			  </div>
			  <div class="form-group">
			    <label for="pwd">Password:</label>
			    <input type="password" class="form-control" id="pwd">
			  </div>
			  <div class="checkbox">
			    <label><input type="checkbox"> Remember me</label>
			  </div>
			  <button type="submit" class="btn btn-default">Submit</button>
			</form>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
    </div>
  </div>
</body>
</html>