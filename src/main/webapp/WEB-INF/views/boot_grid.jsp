<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
 #row1 div{
 	border:3px solid red;
 	padding:2px;
 }
 #row2 div{
 	border:1px solid black;
 	padding:10px;
 	background: pink;
 }
 #row3 div{
 	border:1px solid black;
 	padding:10px;
 	background: skyblue;
 }
  #row4 div{
 	border:1px solid black;
 	padding:10px;
 	background: yellow;
 }
 #row5 div{
 	margin-top:50px;
 	border:1px solid black;
 	padding:10px;
 	background: green;
 }
</style>
</head>
<body>
	<div class="row" id="row1">
		<div class="col-sm-1">col-sm-1</div>
		<div class="col-sm-1">col-sm-1</div>
		<div class="col-sm-1">col-sm-1</div>
		<div class="col-sm-1">col-sm-1</div>
		<div class="col-sm-1">col-sm-1</div>
		<div class="col-sm-1">col-sm-1</div>
		<div class="col-sm-1">col-sm-1</div>
		<div class="col-sm-1">col-sm-1</div>
		<div class="col-sm-1">col-sm-1</div>
		<div class="col-sm-1">col-sm-1</div>
		<div class="col-sm-1">col-sm-1</div>
		<div class="col-sm-1">col-sm-1</div>
	</div>
	
	<div class="row" id="row2">
		<div class="col-sm-4">col-sm-4</div>
		<div class="col-sm-8">col-sm-8</div>
	</div>
	
	<div class="row" id="row3">
		<div class="col-sm-6">col-sm-6</div>
		<div class="col-sm-6">col-sm-6</div>
	</div>
	
	<div class="row" id="row4">
		<div class="col-sm-4 col-sm-offset-4">col-sm-4</div>
	</div>
	
	<div class="row" id="row5">
		<div class="col-xs-6 col-sm-3">col1</div>
		<div class="col-xs-6 col-sm-3">col2</div>
		<div class="col-xs-6 col-sm-3">col3</div>
		<div class="col-xs-6 col-sm-3">col4</div>
	</div>
</body>
</html>