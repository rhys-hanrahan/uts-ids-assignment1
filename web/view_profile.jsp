<%@page import="uts.isd.model.*"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="header.jsp" />
<%
    User user = (User)session.getAttribute("user");
    Customer customer = (Customer)session.getAttribute("customer");
    boolean isLoggedIn = (user != null);
%>

<main role="main">
  <div style="margin-top: 50px;"></div>
  <div class="container">
  <%
      if (!isLoggedIn) {
  %>
    <p>Sorry, you're not logged in! <a href="register.jsp">Register</a> or <a href="login.jsp">login</a> to see this page.</p>
  <% } else { %>
    <p>Welcome back, <%= customer.getFirstName() %>! Your current details are below:</p>
    <ul>
        <li>First Name: <%= customer.getFirstName() %></li>
        <li>Last Name: <%= customer.getLastName() %></li>
        <li>Email: <%= customer.getEmail() %></li>
        <li>Age: <%= user.getAge() %></li>
    </ul>
  <% } %>
    
    <hr>
  
  </div> <!-- /container -->

</main>
<jsp:include page="footer.jsp" />
</html>