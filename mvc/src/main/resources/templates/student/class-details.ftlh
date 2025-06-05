<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Student Class Details</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 32px;
      background: #f9f9f9;
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
      background: #fff;
      padding: 24px 32px;
      border-radius: 8px;
      max-width: 700px;
      margin: auto;
      box-shadow: 0 2px 8px rgba(0, 0, 0, 0.07);
    }

    h1,
    h2 {
      color: #2c3e50;
    }

    .details,
    .teacher {
      margin-bottom: 24px;
    }

    .details span,
    .teacher span {
      display: inline-block;
      min-width: 120px;
      font-weight: bold;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 16px;
    }

    th,
    td {
      border: 1px solid #ddd;
      padding: 10px 8px;
      text-align: left;
    }

    th {
      background: #f0f0f0;
    }

    .grade {
      font-weight: bold;
    }
  </style>
</head>

<body>
  <header>
    <div class="logo"><a href="/courses">Class Connect</a></div>
  </header>
  <div class="container">
    <h1>Class Details</h1>
    <div class="details">
      <div><span>Class Name:</span> ${course.courseName}</div>
      <div><span>Class Code:</span> ${course.courseCode}</div>
    </div>
    <div class="teacher">
      <h2>Teacher</h2>
      <div><span>Name:</span> ${course.teacher.name}</div>
      <div><span>Email:</span> ${course.teacher.email}</div>
    </div>
    <button id="register-btn" onclick="openForm()"
      style="background: green; color: #fff; border: none; padding: 10px 20px; border-radius: 4px; font-size: 1rem; cursor: pointer;">Register
      for Class</button>
    <!-- Hidden Student ID Form Popup -->
    <form id="new-registration" action="/registrations" method="post" style="display:none">
      <input type="text" id="course" name="courseId" value="${course.courseId}" hidden />
      <input type="text" id="student" name="studentId" placeholder="Enter Your Student ID" />
      <button type="submit" class="btn btn-primary">Save</button>
      <button type="reset" class="btn btn-danger" onclick="closeForm()">Cancel</button>

    </form>
    <script>
      function openForm() {
        document.getElementById("new-registration").style.display = "block";
      }

      function closeForm() {
        document.getElementById("new-registration").style.display = "none";
      }
    </script>
  </div>
</body>

</html>