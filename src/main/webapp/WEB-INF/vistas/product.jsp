<%@ include file="header.jsp" %>

<div class="container">    
  <div class="row">
  
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading"> ${product.name} </div>
        <div class="panel-body">
        <p>Descripción : ${product.description}  </p>
        <p>Precio : ${product.price}  </p>
		<p>Vendedor :  ${product.seller} </p>  
        </div>
        <div class="panel-footer"> <button type="button" class="btn btn-primary btn-md"
           onClick="location.href=' ' ">Buy</button></div>
      </div>
    </div>
   
  </div>
</div><br>

</body>
</html>
