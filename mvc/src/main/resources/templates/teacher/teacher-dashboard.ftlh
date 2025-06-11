<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Class Connect - Teacher Dashboard</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <style>
        body {
            font-family: 'Segoe UI', Arial, sans-serif;
            background: #f4f6fb;
            margin: 0;
            padding: 0;
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
            max-width: 1100px;
            margin: 2rem auto;
            background: #fff;
            border-radius: 8px;
            box-shadow: 0 2px 8px rgba(44, 91, 227, 0.07);
            padding: 2rem;
        }

        h1 {
            margin-top: 0;
            color: #2d5be3;
        }

        .class-list {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(260px, 1fr));
            gap: 1.5rem;
            margin-top: 2rem;
        }

        .class-card {
            background: #f8faff;
            border: 1px solid #e3e8f0;
            border-radius: 6px;
            padding: 1.2rem;
            box-shadow: 0 1px 4px rgba(44, 91, 227, 0.04);
            display: flex;
            flex-direction: column;
            justify-content: space-between;
        }

        .class-card h2 {
            margin: 0 0 0.5rem 0;
            font-size: 1.2rem;
            color: #2d5be3;
        }

        .class-card p {
            margin: 0.3rem 0 1rem 0;
            color: #555;
            font-size: 0.98rem;
        }

        .class-actions {
            margin-top: auto;
        }

        .class-actions button {
            background: #2d5be3;
            color: #fff;
            border: none;
            border-radius: 4px;
            padding: 0.5rem 1rem;
            margin-right: 0.5rem;
            cursor: pointer;
            font-size: 0.95rem;
            transition: background 0.2s;
        }

        .class-actions button:last-child {
            background: #e34d2d;
        }

        .class-actions button:hover {
            opacity: 0.9;
        }

        .add-class-btn {
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

        .add-class-btn:hover {
            background: #244bb8;
        }

        @media (max-width: 700px) {
            .container {
                padding: 1rem;
            }

            .class-list {
                grid-template-columns: 1fr;
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
    <div class="container">
        <h1>Welcome, ${teacher.name}</h1>
        <button class="add-class-btn" onclick="window.location.href='/courses/add/${teacher.teacherId}'">+ Add New Class</button>
        <h4 style="margin-bottom: 0.3rem; color: #2d5be3; font-size: 1.08rem; font-weight: 600;">My Classes</h4>
        <p style="margin-top: 0; color: #555; font-size: 0.98rem;">Manage your classes and students efficiently.</p>
        <div class="class-list">
            <#list dashboardInfo.courses as item>
                <div class="class-card">
                    <h2>${item.courseName}</h2>
                    <p>${item.courseCode}</p>
                    <div class="class-actions">
                        <button onclick="window.location.href='/teachers/class-details/${item.courseId}'">View</button>
                        <button onclick="window.location.href='/courses/update/${item.courseId}'">Edit</button>
                        <a href="/courses/delete/${item.courseId}" class="btn btn-danger " role="button"
                            onclick="return confirm('Are you sure?')">Delete</a>

                    </div>
                </div>
            </#list>
        </div>
    </div>
</body>

</html>