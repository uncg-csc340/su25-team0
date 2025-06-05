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

    input[type="text"] {
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
      background-color: #1b4fa3;
    }
  </style>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
</head>

<body>
  <header>
    <div class="logo">Class Connect</div>
    <nav>
      <a href="/teachers/dashboard/${course.teacher.teacherId}">Dashboard</a>
      <a href="#">Reports</a>
      <a href="/teachers/${course.teacher.teacherId}">Profile</a>
      <a href="index.html">Logout</a>
    </nav>
  </header>
  <div class="container">
    <h1>Edit Class</h1>
    <form action="/courses/update/${course.courseId}" method="post">

      <input type="number" id="teacher" name="teacher.teacherId" value="${course.teacher.teacherId}" hidden>

      <label for="courseId">ID</label>
      <input type="number" id="courseId" name="courseId" value="${course.courseId}" readonly>

      <label for="courseName">Class Name</label>
      <input type="text" id="courseName" name="courseName" value="${course.courseName}">

      <label for="courseCode">Code</label>
      <input type="text" id="courseCode" name="courseCode" value="${course.courseCode}">

      <label for="description">Description</label>
      <input type="text" id="description" name="description" value="${course.description}">

      <label for="credits">Credits</label>
      <input type="number" id="credits" name="credits" value="${course.credits}">

      <button class="btn btn-danger"
        onclick="window.location.href='/teachers/class-details/${course.courseId}'">Cancel</button>
      <button type="submit">Save Changes</button>
    </form>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
    crossorigin="anonymous"></script>
</body>

</html>