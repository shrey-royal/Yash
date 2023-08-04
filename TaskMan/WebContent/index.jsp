<jsp:include page="Header.jsp"></jsp:include>
<div class="card m-5">
  <div class="card-body">
  
  	<nav class="navbar bg-body-tertiary">
	  <div class="container-fluid">
	    <a class="navbar-brand"></a>
	    <form class="d-flex" role="search">
	      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
	      <button class="btn btn-outline-success" type="submit">Search</button>
	    </form>
	  </div>
	</nav>

    <table class="table mx-auto p-2 align-middle">
	  <thead>
	    <tr>
	      <th scope="col">TaskID</th>
	      <th scope="col">Title</th>
	      <th scope="col">Description</th>
	      <th scope="col">DueDate</th>
	      <th scope="col">Priority</th>
	      <th scope="col">Status</th>
	      <th scope="col">Category</th>
	      <th scope="col">UserID</th>
	    </tr>
	  </thead>
	  <tbody>
	    <tr>
	      <th scope="row">1</th>
	      <td>Mark</td>
	      <td>Otto</td>
	      <td>@mdo</td>
	    </tr>
	    <tr>
	      <th scope="row">2</th>
	      <td>Jacob</td>
	      <td>Thornton</td>
	      <td>@fat</td>
	    </tr>
	    <tr>
	      <th scope="row">3</th>
	      <td colspan="2">Larry the Bird</td>
	      <td>@twitter</td>
	    </tr>
	  </tbody>
	</table>
  </div>
</div>
<jsp:include page="Footer.jsp"></jsp:include>