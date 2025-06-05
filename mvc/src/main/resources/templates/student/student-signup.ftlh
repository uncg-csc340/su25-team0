<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
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
    <div class="logo"><a href="/courses">Class Connect</a></div>
  </header>
  <div class="container">
    <h1>Edit Profile</h1>
    <form action="/students" method="post">
      <label for="name">Full Name</label>
      <input type="text" id="name" name="name" placeholder="Enter Full Name" required>

      <label for="email">Email</label>
      <input type="email" id="email" name="email" placeholder="Email" required>

      <label for="major">Major</label>
      <input type="text" id="major" name="major" placeholder="Enter Major" required>

      <label for="gpa">GPA</label>
      <input type="number" id="gpa" name="gpa" step="0.01" />

      <button type="submit" onclick="window.location.href='student-profile.html'">Save Changes</button>
    </form>

</body>

</html>