<%-- 
    Document   : home
    Created on : 30-04-2022, 09:15:56
    Author     : luuti
--%>

<%@page import="dao.ProductDAO"%>
<%@page import="java.util.List"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
     <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.0.0/mdb.min.js"></script>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet"/>
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet"/>
    
     <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/4.0.0/mdb.min.css" rel="stylesheet"/>
      
        <link rel="stylesheet" href="css/webmaincss.css">
        <script type="text/javascript" src="jsfile/jswebmain.js"></script>
    </head>
    
    <body>

  <nav class="navbar fixed-top navbar-expand-lg navbar-light white scrolling-navbar bg-secondary">
    <div class="container">
        <c:if test="${sessionScope.acc.type==2}">
            <a class="navbar-brand waves-effect" href="manager" target="_blank">
         <strong class="blue-text">Sell Manager</strong>
            </a> 
        </c:if>
            
      
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
        aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item">
              <c:if test="${sessionScope.acc.type!=null}">
                   <a class="nav-link waves-effect" href="#" target="_blank">Hello ${sessionScope.acc.name} !!! </a>
              </c:if>
           
          </li>
          <li class="nav-item">
              <c:if test="${sessionScope.acc!=null}">
                  <a class="nav-link waves-effect" href="#" target="_blank">Amout:${sessionScope.acc.amout}$</a>
              </c:if>
            
          </li>
          <li class="nav-item">
              <c:if test="${sessionScope.acc!=null}">
                  <a class="nav-link waves-effect" href="history" target="_blank">Order history</a>
              </c:if>
            
          </li>
        </ul>
         <ul class="navbar-nav nav-flex-icons">
            <li class="nav-item">
              <c:if test="${sessionScope.acc==null}">  
              <a class="nav-link waves-effect" href="login.html">
              <i class="fas fa-sign-in" ></i>
               
              <span class="clearfix d-none d-sm-inline-block"> Login </span>
              
            </a>
              </c:if>  
          </li>   
          <li class="nav-item">
              <a class="nav-link waves-effect" href="show">
              <span class="badge red z-depth-1 mr-1"> ${size}</span>
              <i class="fas fa-shopping-cart"></i>
              <span class="clearfix d-none d-sm-inline-block"> Cart </span>
            </a>
          </li>
              <li class="nav-item">
                <c:if test="${sessionScope.acc!=null}">  
              <a class="nav-link waves-effect" href="logout">
              <i class="fas fa-sign-out" ></i>
              <span class="clearfix d-none d-sm-inline-block"> Logout </span>
            </a>
            </c:if>  
          </li>
        </ul>

      </div>

    </div>
  </nav>

  <div id="carousel-example-1z" class="carousel slide carousel-fade pt-4" data-ride="carousel">

    <ol class="carousel-indicators">
      <li data-target="#carousel-example-1z" data-slide-to="0" class="active"></li>
      <li data-target="#carousel-example-1z" data-slide-to="1"></li>
      <li data-target="#carousel-example-1z" data-slide-to="2"></li>
    </ol>

    <div class="carousel-inner" role="listbox">

      <div class="carousel-item active">
        <div class="view" style="background-image: url('${betselling.anhsp}'); background-repeat: no-repeat; background-size: cover;">

          <div class="mask rgba-black-strong d-flex justify-content-center align-items-center">

            <!-- Content -->
            <div class="text-center white-text mx-5 wow fadeIn">
              <h1 class="mb-4">
                <strong>The best selling product</strong>
              </h1>

              <p>
                <strong>${betselling.tensp}</strong>
              </p>

              <p class="mb-4 d-none d-md-block">
                <strong>${detailz}</strong>
              </p>

              <a  href="productdetail?id=${betselling.masp}" class="btn btn-outline-black btn-lg">View Product
                
              </a>
            </div>
      

          </div>
       

        </div>
      </div>
    
      <div class="carousel-item">
        <div class="view" style="background-image: url('${newest.anhsp}'); background-repeat: no-repeat; background-size: cover;">

          <div class="mask rgba-black-strong d-flex justify-content-center align-items-center">

            <div class="text-center white-text mx-5 wow fadeIn">
              <h1 class="mb-4">
                <strong>The newest product</strong>
              </h1>

              <p>
                <strong>${newest.tensp} </strong>
              </p>

              <p class="mb-4 d-none d-md-block">
                <strong>${detailm}</strong>
              </p>

              <a target="_blank" href="productdetail?id=${newest.masp}" class="btn btn-outline-black btn-lg">View Product</a>
                
              
            </div>
          </div>
        </div>
      </div>

      <div class="carousel-item">
        <div class="view" style="background-image: url('https://img5.thuthuatphanmem.vn/uploads/2021/10/28/hinh-nen-vu-tru-cute-de-thuong-nhat_025115846.jpg'); background-repeat: no-repeat; background-size: cover;">
            
          <div class="mask rgba-black-strong d-flex justify-content-center align-items-center">

            <div class="text-center white-text mx-5 wow fadeIn">
              <h1 class="mb-4">
                <strong>Shopping is happy</strong>
              </h1>

              <p>
                <strong>Shopping now in here fast and convenient</strong>
              </p>

              <p class="mb-4 d-none d-md-block">
                <strong> You can buy or sell product in here</strong>
              </p>

              <a target="_blank" href="register.html" class="btn btn-outline-white btn-lg">
                Sign up now
              </a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <a class="carousel-control-prev" href="#carousel-example-1z" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carousel-example-1z" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  <main>
    <div class="container">
      <nav class="navbar navbar-expand-lg navbar-dark mdb-color lighten-3 mt-3 mb-5">
        <span class="navbar-brand">Categories:</span>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#basicExampleNav" aria-controls="basicExampleNav"
          aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="basicExampleNav">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link text-secondary" href="home">All
                <span class="sr-only">(current)</span>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-secondary" href="class?loai=headphone">Headphone</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-secondary" href="class?loai=smartphone">Smartphone</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-secondary" href="class?loai=phonecharger">Phone Charger</a>
            </li>
            <li class="nav-item">
              <a class="nav-link text-secondary" href="class?loai=other">Other</a>
            </li>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            
            <li>
                <form action="filter" method="get">
                <div class="btn-group">
                    <a type="button" href="home" class="btn btn-primary text-white bg-secondary">Filter</a>
                    <button type="button" class="btn btn-danger dropdown-toggle dropdown-toggle-split bg-secondary" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                      <span class="sr-only">Toggle Dropdown</span>
                    </button>
                    <div class="dropdown-menu">
                        <span class="text-secondary">Type:</span>
                      <div class="form-check">
                          <input class="form-check-input" name="typefilter" type="radio" value="smartphone" checked id="flexCheckDefault">
                        <label class="form-check-label" for="flexCheckDefault">
                          Smartphone
                        </label>
                      </div>
                      <div class="form-check">
                          <input class="form-check-input" name="typefilter" type="radio" value="headphone" id="flexCheckChecked" >
                        <label class="form-check-label" for="flexCheckChecked">
                          Headphone
                        </label>
                      </div>
                      <div class="form-check">
                          <input class="form-check-input" name="typefilter" type="radio" value="phonecharger" id="flexCheckChecked" >
                        <label class="form-check-label" for="flexCheckChecked">
                          Phonecharger
                        </label>
                      </div> 
                        <div class="form-check">
                          <input class="form-check-input" name="typefilter" type="radio" value="other" id="flexCheckChecked" >
                        <label class="form-check-label" for="flexCheckChecked">
                          Other
                        </label>
                      </div> 
                         <span class="text-secondary">Price:</span>
                      <div class="form-check">
                          <input class="form-check-input" name="pricefilter" type="radio" value="1" checked id="flexCheckDefault">
                        <label class="form-check-label" for="flexCheckDefault">
                          1-50$
                        </label>
                      </div>
                      <div class="form-check">
                          <input class="form-check-input" name="pricefilter" type="radio" value="2" id="flexCheckChecked" >
                        <label class="form-check-label" for="flexCheckChecked">
                          50-200$
                        </label>
                      </div>
                      <div class="form-check">
                          <input class="form-check-input" name="pricefilter" type="radio" value="3" id="flexCheckChecked" >
                        <label class="form-check-label" for="flexCheckChecked">
                          200-1000$
                        </label>
                      </div>  
                      <div class="form-check">
                          <input class="form-check-input" name="pricefilter" type="radio" value="4" id="flexCheckChecked" >
                        <label class="form-check-label" for="flexCheckChecked">
                          >1000$
                        </label>
                      </div> 
                      
                      <input class="dropdown-item bg-secondary" type="submit" value="Filter" >
                      
                    </div>
                  </div>
                </form>
            </li>
          </ul>
          <form action="search" class="form-inline">
            <div class="md-form my-0">
              <input class="form-control mr-sm-2" type="text" placeholder="Search" aria-label="Search" name="search">
            </div>
          </form>
        </div>
      </nav>
     <section class="text-center mb-4">       
            <div class="row">
              <c:forEach items="${data}" var="i">
                  <c:if test="${i.hire==0}">
                     
              <div class="col-lg-3 col-md-6 mb-4"> 
              <div class="card">    
              <div class="view overlay"  >
                <img src="${i.anhsp}" class="card-img-top" alt="">
              </div>             
              <div class="card-body text-center">               
                <a href="class?loai=${i.loaisp}" class="grey-text">
                  <h5>${i.loaisp}</h5>
                </a>
                <h5>
                  <strong>
                    <a href="productdetail?id=${i.masp}" class="dark-grey-text">${i.tensp}</a>
                  </strong>
                </h5>
                <h4 class="font-weight-bold blue-text">
                    <strong>${i.giasp}$</strong> <span class="namvutru"> ${i.sumquanlity}</span>
                </h4>           
              </div>
              </div>
                    <a class="btn btn-primary" style="width: 280px" href="buy?id=${i.masp}&num=1" role="button">Add to Cart</a>      
              </div> 
                  </c:if> 
             </c:forEach>
           </div>      
      </section>
<!--      <nav class="d-flex justify-content-center wow fadeIn">
        <ul class="pagination pg-blue">
          <li class="page-item disabled">
            <a class="page-link" href="#" aria-label="Previous">
              <span aria-hidden="true">&laquo;</span>
              <span class="sr-only">Previous</span>
            </a>
          </li>
          <li class="page-item active">
            <a class="page-link" href="#">1
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#">2</a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#">3</a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#">4</a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#">5</a>
          </li>
          <li class="page-item">
            <a class="page-link" href="#" aria-label="Next">
              <span aria-hidden="true">&raquo;</span>
              <span class="sr-only">Next</span>
            </a>
          </li>
        </ul>
      </nav>-->
    </div>
  </main>
  <footer class="page-footer text-center font-small mt-4 wow fadeIn">
    <div class="pt-4">
      <a class="btn btn-outline-white" href="https://mdbootstrap.com/docs/jquery/getting-started/download/" target="_blank" role="button">Download MDB
        <i class="fas fa-download ml-2"></i>
      </a>
      <a class="btn btn-outline-white" href="https://mdbootstrap.com/education/bootstrap/" target="_blank" role="button">Start free tutorial
        <i class="fas fa-graduation-cap ml-2"></i>
      </a>
    </div>
    <hr class="my-4">
    <div class="pb-4">
      <a href="https://www.facebook.com/mdbootstrap" target="_blank">
        <i class="fab fa-facebook-f mr-3"></i>
      </a>
      <a href="https://twitter.com/MDBootstrap" target="_blank">
        <i class="fab fa-twitter mr-3"></i>
      </a>
      <a href="https://www.youtube.com/watch?v=7MUISDJ5ZZ4" target="_blank">
        <i class="fab fa-youtube mr-3"></i>
      </a>
      <a href="https://plus.google.com/u/0/b/107863090883699620484" target="_blank">
        <i class="fab fa-google-plus-g mr-3"></i>
      </a>
      <a href="https://dribbble.com/mdbootstrap" target="_blank">
        <i class="fab fa-dribbble mr-3"></i>
      </a>
      <a href="https://pinterest.com/mdbootstrap" target="_blank">
        <i class="fab fa-pinterest mr-3"></i>
      </a>
      <a href="https://github.com/mdbootstrap/bootstrap-material-design" target="_blank">
        <i class="fab fa-github mr-3"></i>
      </a>
      <a href="http://codepen.io/mdbootstrap/" target="_blank">
        <i class="fab fa-codepen mr-3"></i>
      </a>
    </div>

    <div class="footer-copyright py-3">
      © 2018 Copyright:
      <a href="https://mdbootstrap.com/education/bootstrap/" target="_blank"> MDBootstrap.com </a>
    </div>
  </footer>
    
     <!-- search for type Modal HTML -->
        <div id="searchEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="add" method="get">
                        <div class="modal-header">						
                            <h4 class="modal-title">Add Product</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="form-group">
                                <label>Name</label>
                                <input name="name" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Type</label>
                                <input name="type" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Price</label>
                                <input name="price" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Image</label>
                                <input name="image" type="text" class="form-control" required>
                                
                            </div>
                            <div class="form-group">
                                <label>Sumquantity</label>
                                <input name="quantity" type="text" class="form-control" required>
                            </div>
                            <input type="hidden" name="idseller" value="${sessionScope.acc.id}">

                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
        </div>
                            
        <div class="fixed-bottom " style="padding-left: 92%"><a   href="#"><img style="width:100px" src="https://cdn-icons.flaticon.com/png/512/536/premium/536449.png?token=exp=1651982672~hmac=450a382638de5cc802a94ac204814db7"></a></div> 
    </body>
</html>
