<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Teacher Profile | Class Connect</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
  <style>
    body {
      font-family: Arial, sans-serif;
      background: #f7f9fa;
      margin: 0;
    }

    .profile-header {
      background: #2d6cdf;
      color: #fff;
      padding: 2rem 1rem;
      text-align: center;
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
      transition: text-decoration 0.2s;
    }

    nav a:hover {
      text-decoration: underline;
    }

    .profile-pic {
      width: 120px;
      height: 120px;
      border-radius: 50%;
      border: 4px solid #fff;
      background: #e0e7ef;
      object-fit: cover;
    }

    .container {
      max-width: 700px;
      margin: 2rem auto;
      background: #fff;
      border-radius: 10px;
      box-shadow: 0 2px 8px rgba(0, 0, 0, 0.07);
      padding: 2rem;
    }

    .stats {
      display: flex;
      justify-content: space-around;
      margin: 2rem 0;
    }

    .stat {
      text-align: center;
    }

    .stat h2 {
      margin: 0;
      color: #2d6cdf;
      font-size: 2rem;
    }

    .stat p {
      margin: 0.5rem 0 0 0;
      color: #555;
    }

    .bio {
      margin: 2rem 0 0 0;
    }

    .classes-list {
      margin-top: 2rem;
    }

    .classes-list h3 {
      margin-bottom: 1rem;
    }

    .class-item {
      background: #f1f5fa;
      border-radius: 6px;
      padding: 1rem;
      margin-bottom: 1rem;
    }

    @media (max-width: 600px) {
      .stats {
        flex-direction: column;
        gap: 1rem;
      }



      nav {
        margin-top: 1rem;
      }

      nav a {
        margin-left: 0;
        margin-right: 1.5rem;
      }
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
  <div class="profile-header">
    <img src="https://ui-avatars.com/api/?name=${teacher.name?replace('\\s+', '+')}&background=2d6cdf&color=fff&size=120" alt="Profile Picture"
      class="profile-pic">
    <h1>${teacher.name}</h1>
    <p>${teacher.department}</p>
    <button onclick="location.href='/teachers/update/${teacher.teacherId}'"
      style="margin-top:1rem; background:#fff; color:#2d6cdf; border:none; border-radius:4px; padding:0.5rem 1.2rem; font-size:1rem; cursor:pointer; box-shadow:0 1px 3px rgba(0,0,0,0.07);">
      Edit Profile
    </button>
  </div>

  <div class="container">
    <div class="stats">
      <div class="stat">
        <h2>${stats.courseCount}</h2>
        <p>Active Classes</p>
      </div>
      <div class="stat">
        <h2>${stats.registrationCount}</h2>
        <p>Total Students</p>
      </div>
    </div>
    <div class="bio">
      <h3>About</h3>
      <p>
        Passionate educator with 10+ years of experience teaching high school mathematics. Dedicated to helping students
        succeed and fostering a love for learning.
      </p>
    </div>
    <div class="classes-list">
      <h3>Current Classes</h3>
       <#list courses as item>
      <a href="/teachers/class-details/${item.courseId}" class="class-item"
        style="display:block; text-decoration:none; color:inherit;">
        <strong>${item.courseCode}</strong> &mdash;
        <strong>${item.courseName}</strong>
      </a>
      </#list>
    </div>
  </div>
</body>

</html>