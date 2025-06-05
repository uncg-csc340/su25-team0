<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
  <title>Document</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background: #f7f9fb;
      margin: 0;
    }

    header {
      background: #2d5be3;
      color: #fff;
      padding: 1rem 2rem;
      display: flex;
      align-items: center;
      justify-content: space-between;
    }

    .logo {
      font-size: 1.5rem;
      font-weight: bold;
      letter-spacing: 1px;
    }

    nav a {
      color: #fff;
      text-decoration: none;
      margin-left: 2rem;
      font-weight: 500;
    }

    .container {
      max-width: 600px;
      margin: 2rem auto;
      background: #fff;
      border-radius: 8px;
      box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
      padding: 2rem;
    }

    h1 {
      margin-top: 0;
    }

    label {
      display: block;
      margin-bottom: 0.5rem;
    }

    input[type="text"],
    input[type="email"],
    input[type="password"] {
      width: calc(100% - 20px);
      padding: 10px;
      margin-bottom: 1rem;
      border-radius: 4px;
      border: 1px solid #ccc;
    }

    button {
      background-color: #2d6cdf;
      color: white;
      border: none;
      padding: 10px 20px;
      border-radius: 4px;
      cursor: pointer;
    }

    button:hover {
      background-color: #1b4fa3
    }
  </style>
</head>

<body>
  <header>
        <div class="logo">Class Connect</div>
        <nav>
            <a href="/teachers/dashboard/${teacher.teacherId}">Dashboard</a>
            <a href="#">Reports</a>
            <a href="/teachers/${teacher.teacherId}">Profile</a>
            <a href="index.html">Logout</a>
        </nav>
    </header>
  <div class="container">
    <h1>Edit Profile</h1>
    <form action="/teachers/update/${teacher.teacherId}" method="post">
      <label for="teacherId">ID</label>
      <input type="text" id="teacherId" name="teacherId" value="${teacher.teacherId}" readonly>
      <label for="name">Full Name</label>
      <input type="text" id="name" name="name" value="${teacher.name}">
      <label for="email">Email</label>
      <input type="email" id="email" name="email" value="${teacher.email}">
       <label for="department">Department</label>
      <input type="text" id="department" name="department" value="${teacher.department}">
      <button type="submit">Save Changes</button>
    </form>

</body>

</html>