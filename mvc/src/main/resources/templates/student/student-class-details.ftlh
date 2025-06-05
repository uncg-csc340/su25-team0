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
        <nav>
            <a href="/students/dashboard/${student.studentId}">Dashboard</a>
            <a href="#">Assignments</a>
            <a href="/students/profile/${student.studentId}">Profile</a>
            <a href="index.html">Logout</a>
        </nav>
    </header>
    <div class="container">
        <h1>Class Details</h1>
        <div class="details">
            <div><span>Class Name:</span> ${registration.course.courseName}</div>
            <div><span>Class Code:</span> CSC 101</div>
        </div>
        <div class="teacher">
            <h2>Teacher</h2>
            <div><span>Name:</span> ${registration.course.teacher.name}</div>
            <div><span>Email:</span> ${registration.course.teacher.email}</div>
        </div>
        <div class="assignments">
            <h2>Announcements</h2>
            <table>
                <thead>
                    <tr>
                        <th>Announcement</th>
                        <th>Date</th>
                        <th>Details</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Reading</td>
                        <td>2025-06-10</td>
                        <td>Chapter 4</td>
                    </tr>
                    <tr>
                        <td>Quiz Soon</td>
                        <td>2025-06-20</td>
                        <td>Units 1 and 2</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <a href="/registrations/delete/${registration.registrationId}" class="btn btn-danger " role="button"
                            onclick="return confirm('Are you sure?')">Drop Class</a>
    </div>
</body>

</html>