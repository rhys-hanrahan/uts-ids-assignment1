<%@page import="uts.isd.model.*"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%
  //We need to figure out if the user is logging out now, or not.
  //then invalidate the session BEFORE including the header, so it shows correctly.
  User user = (User)session.getAttribute("user");
  Customer customer = (Customer)session.getAttribute("customer");
  //Store for later
  boolean isLoggedIn = (user != null);
  
  //TODO:
  //if user is logged in already, dont register.
  //if user is not logged in, create user, customer and add to session.
  //check if user posted to this page or not.

  //Log user in and mock user object
  User user = new User();
  user.setId(1);
  user.setCustomerId(1);
  user.setEmail(request.getParameter("email"));
  user.setPassword(request.getParameter("password"));
  user.setAge(30);
  user.setAccessLevel(1); //Normal user
  session.setAttribute("user", user);
  //Mock customer
  Customer customer = new Customer(request.getParameter("email"), "Rhys", "Hanrahan");
  customer.setId(1);
  session.setAttribute("customer", customer);
  //Load products
  Product p1 = new Product();
  p1.setId(1);
  p1.setName("Widget");
  p1.setDescription("This is a widget");
  p1.setPrice(12.50);
  Product p2 = new Product();
  p2.setId(2);
  p2.setName("Thingy");
  p2.setDescription("This is a thingy");
  p2.setPrice(52.75);
  
  List<Product> products = new ArrayList<Product>();
  products.add(p1);
  products.add(p2);
  session.setAttribute("products", products);
  
  //Load order
  Order order = new Order();
  order.setId(1);
  order.setCustomerId(1);
  order.setBillingAddressId(1);
  order.setShippingAddressId(1);
  order.setPaymentMethodId(1);
  order.setUserId(1);
  
  OrderLine line = new OrderLine();
  line.setId(1);
  line.setOrderId(1);
  line.setProductId(1);
  line.setQuantity(3);
  line.setUnitPrice(12.50);
  order.addOrderLine(line);
  
  OrderLine line2 = new OrderLine();
  line2.setId(2);
  line2.setOrderId(1);
  line2.setProductId(2);
  line2.setQuantity(2);
  line2.setUnitPrice(52.75);
  order.addOrderLine(line2);
  session.setAttribute("order", order);

%>

<jsp:include page="header.jsp" />

<main role="main">
    <div style="margin-top: 50px;"></div>
    <div class="container">
    <%
        if (!isLoggedIn) {
    %>
        <p>You are not logged in! Log in <a href="login.jsp">here</a>.</p>
    <%
    } else {
    %>
        <p>Bye, <%= customer.getFirstName() %>! Come back soon.</p>
        <p>Click <a href="index.jsp">here</a> to look at more products.</p>
        <p>Click <a href="login.jsp">here</a> to log back in.</p>
    <% } %>
        <hr>
    </div> <!-- /container -->

</main>
<jsp:include page="footer.jsp" />
</html>