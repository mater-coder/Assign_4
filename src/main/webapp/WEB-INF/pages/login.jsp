<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
  <title>Login Form</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f2f2f2;
    }
    
    h1 {
      text-align: center;
    }
    
    form {
      border: 3px solid #f1f1f1;
      width: 50%;
      margin: 0 auto;
      padding: 20px;
      background-color: #ffffff;
    }
    
    input[type="text"], input[type="password"] {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      display: inline-block;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }
    
    button {
      background-color: #4CAF50;
      color: white;
      padding: 14px 20px;
      margin: 8px 0;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      width: 100%;
    }
    
    button:hover {
      background-color: #45a049;
    }
    
    .registerbtn {
      background-color: #f44336;
    }
    
    .container {
      padding: 16px;
    }
    
    span.password {
      float: right;
      padding-top: 16px;
    }
    
    @media screen and (max-width: 600px) {
      form {
        width: 80%;
      }
    }
  </style>
</head>
<body>
  <h1>Login Form</h1>
  
  <form action= "processform" method = "post">
    <div class="container">
      <label for="email"><b>Email</b></label>
      <input type="text" id = "email"  placeholder="Enter Email" name="email" required>
  
      <label for="password"><b>Password</b></label>
      <input type="password" id="password" placeholder="Enter Password" name="password" required>
        
      <button type="submit" name = "action" value= "login">Login</button>
      <button type="submit" name = "action" class="registerbtn" value="register">Register</button>
    </div>
  </form>
</body>
<script type="text/javascript">
	
</script>
</html>