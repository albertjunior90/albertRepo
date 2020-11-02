<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>E Commerce</title>
  <link rel="shortcut icon" href="logo.png" />
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 
</head>
<body>
	
  <div class="container text-center">
    <h1>Bienvenido a nuestra tienda</h1>      
    <p>Busque entre nuestros increibles productos</p>
  </div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="/">Inicio</a></li>
        <li><a href="/productos/todos">Productos</a></li>
        <li><a href="#">Tiendas</a></li>
        <li><a href="#">Contacto</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Autenticar</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Carrito</a></li>
      </ul>
    </div>
  </div>
</nav>