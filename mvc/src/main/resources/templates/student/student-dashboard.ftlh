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

button {
            background: #2d5be3;
            color: #fff;
            border: none;
            border-radius: 4px;
            padding: 0.7rem 1.5rem;
            font-size: 1rem;
            cursor: pointer;
            margin-bottom: 1.5rem;
            transition: background 0.2s;
        }

        button:hover {
            background: #244bb8;
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
        <h1>Welcome, ${student.name}!</h1>
        <section>
            <h2>Your Classes</h2>
            <#list registrations as registration>
                <div style="display: flex; gap: 1rem; flex-wrap: wrap;"></div>
                <div
                    style="background: #f0f4fa; border-radius: 8px; padding: 1rem 1.5rem; box-shadow: 0 1px 4px rgba(0,0,0,0.06); flex: 1 1 150px; min-width: 150px;">
                    <strong>${registration.course.courseCode}</strong><br>
                    <span style="color:#555;">${registration.course.courseName}</span>
                    <button onclick="window.location.href='/students/${student.studentId}/class/${registration.registrationId}'">View</button>

                </div>
            </#list>
        </section>
    </div>
    <section style="margin-top:2rem;">
        <h2>Announcements</h2>
        <table style="width:100%; border-collapse:collapse;">
            <thead>
                <tr style="background:#f0f4fa;">
                    <th style="text-align:left; padding:8px;">Announcement</th>
                    <th style="text-align:left; padding:8px;">Class</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td style="padding:8px;">Reading</td>
                    <td style="padding:8px;">Math 101</td>
                </tr>
            </tbody>
        </table>
    </section>
    </div>
</body>

</html>