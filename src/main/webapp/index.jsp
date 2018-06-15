<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>guitar</title>
  <script src="//cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" rel="stylesheet">
  <link href="//cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
  <script src="//cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
  	$(function(){
  		$('#btn').click(function(){
  			var url="${pageContext.request.contextPath}/search?"+$('#searchGuitar').serialize();
  			
  			$.ajax({
  				url:url,
  				data:{},
  				dataType:'json',  //返回JSON数据
  				success:function(data){
  					$('#table').empty(); //清空table里面的所有内容
  					for(var i=0;i<data.length;i++){
  						var guitar=data[i]
  						var html="<tr>"
  						+"<td>"+guitar.price+"</td>"
  						+"<td>"+guitar.builder+"</td>"
  						+"<td>"+guitar.model+"</td>"
  						+"<td>"+guitar.type+"</td>"
  						+"<td>"+guitar.backWood+"</td>"
  						+"<td>"+guitar.topWood+"</td></tr>"
  						
  						$('#table').append(html);
  					}
  				}
  			})
  		})
  	})
  </script>
  <style>
table {
    border-collapse: collapse;

}

table, td, th {
    border: 1px solid black;
    margin:auto;
    font-size:1em;
    border:1px solid #98bf21;
    padding:10px 20px 10px 20px;
    text-align:center
}
</style>
</head>
<body>
	<div class="container-fluid">
  		<div class="row">
		  <div class="col-lg-4 col-md-4 col-sm-4"><h1>GuitarSearch</h1></div>
		</div>
		
		<form class="form-horizontal" id="searchGuitar" >
			<div class="form-group" >
			   <label for="builder" class="col-sm-4 control-label">builder</label>
			   <div class="col-sm-4" >
			   	<!-- <input name="builder" type="text" class="form-control" id="builder" placeholder="builder"> -->
			   	<select class="form-control" name="builder" id="builder">
				  <option value="FENDER">FENDER</option>
				  <option value="MARTIN">MARTIN</option>
				  <option value="GIBSON">GIBSON</option>
				  <option value="COLLINGS">COLLINGS</option>
				  <option value="OLSON">OLSON</option>
				  <option value="RYAN">RYAN</option>
				  <option value="PRS">PRS</option>
				</select>
			   </div>
			</div>
			
			<div class="form-group">
			   <label for="model" class="col-sm-4 control-label">model</label>
			   <div class="col-sm-4">
			   <input name="model" type="text" class="form-control" id="model" placeholder="model">
			   </div>
			</div>
			
			<div class="form-group">
			   <label for="type" class="col-sm-4 control-label">type</label>
			   <div class="col-sm-4">
			   		<select class="form-control" name="type" id="type">
					  <option value="ACOUSTIC">ACOUSTIC</option>
					  <option value="ELECTRIC">ELECTRIC</option>
					  <option value="UNSPECIFIED">UNSPECIFIED</option>
					</select>
			   </div>
			</div>
			
			<div class="form-group">
			   <label for="backWood" class="col-sm-4 control-label">backWood</label>
			   <div class="col-sm-4">
			   	<select class="form-control" name="backWood" id="backWood">
					  <option value="INDIAN_ROSEWOOD">INDIAN_ROSEWOOD</option>
					  <option value="BRAZILIAN_ROSEWOOD">BRAZILIAN_ROSEWOOD</option>
					  <option value="MAHOGANY">MAHOGANY</option>
					  <option value="MAPLE">MAPLE</option>
					  <option value="COCOBOLO">COCOBOLO</option>
					  <option value="CEDAR">CEDAR</option>
					  <option value="ADIRONDACK">ADIRONDACK</option>
					  <option value="ALDER">ALDER</option>
					  <option value="SITKA">SITKA</option>
					</select>
			   </div>
			</div>
			
			<div class="form-group">
			   <label for="topWood" class="col-sm-4 control-label">topWood</label>
			   <div class="col-sm-4">
			   <select class="form-control" name="topWood" id="topWood">
					  <option value="INDIAN_ROSEWOOD">INDIAN_ROSEWOOD</option>
					  <option value="BRAZILIAN_ROSEWOOD">BRAZILIAN_ROSEWOOD</option>
					  <option value="MAHOGANY">MAHOGANY</option>
					  <option value="MAPLE">MAPLE</option>
					  <option value="COCOBOLO">COCOBOLO</option>
					  <option value="CEDAR">CEDAR</option>
					  <option value="ADIRONDACK">ADIRONDACK</option>
					  <option value="ALDER">ALDER</option>
					  <option value="SITKA">SITKA</option>
					</select>
			   </div>
			</div>

		    <div class="form-group">
			    <div class="col-sm-offset-7 col-sm-6">
			      <button id="btn" type="button" class="btn btn-default" style="margin-top:15px;width:100px;">√ Go</button>
			    </div>
			  </div>
			  
		  </div>
		</form>
		
		<table >
		  <thead>
		  	<tr >
		  		<td><h4>price</h4></td>
		  		<td><h4>builder</h4></td>
		  		<td><h4>model</h4></td>
		  		<td><h4>type</h4></td>
		  		<td><h4>backWood</h4></td>
		  		<td><h4>topWood</h4></td>
		  	</tr>
		  </thead>
		  <tbody id="table" >
		  	
		  </tbody>
		</table>
	</div>
</body>
</html>