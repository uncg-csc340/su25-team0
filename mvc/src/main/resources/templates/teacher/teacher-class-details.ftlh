<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Class Connect - Class Details</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            background: #f7f9fb;
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
            max-width: 900px;
            margin: 2rem auto;
            background: #fff;
            border-radius: 8px;
            box-shadow: 0 2px 8px #0001;
            padding: 2rem;
        }

        h1 {
            margin-top: 0;
        }

        .class-info {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .class-meta {
            color: #555;
        }

        .section {
            margin-top: 2rem;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 1rem;
        }

        th,
        td {
            padding: 0.75rem;
            border-bottom: 1px solid #eee;
            text-align: left;
        }

        th {
            background: #f0f4fa;
        }

        .actions button {
            margin-right: 0.5rem;
        }

        .add-btn {
            background: #2d6cdf;
            color: #fff;
            border: none;
            padding: 0.5rem 1rem;
            border-radius: 4px;
            cursor: pointer;
        }

        .add-btn:hover {
            background: #1b4fa3;
        }
    </style>
</head>

<body>
    <header>
        <div class="logo">Class Connect</div>
        <nav>
            <a href="teacher-dashboard.html">Dashboard</a>
            <a href="#">Reports</a>
            <a href="teacher-profile.html">Profile</a>
            <a href="index.html">Logout</a>
        </nav>
    </header>
    <div class="container">
        <div class="class-info">
            <div>
                <h1>${course.courseCode } - ${course.courseName}</h1>
                <div class="class-meta">
                    <span><strong>Teacher:</strong> ${course.teacher.name}</span> |
                </div>
            </div>
            <div>
                <button class="add-btn" onclick="window.location.href='teacher-edit-class.html'">Edit Class</button>
            </div>
        </div>

        <div class="section">
            <h3>Enrolled Students</h3>
            <table>
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Status</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <#list registrations as reg>
                        <tr>
                            <td>${reg.student.name}</td>
                            <td>${reg.student.email}</td>
                            <td>Active</td>
                            <td class="actions">
                                <button onclick="confirm('Deactivate Student?')">Deactivate</button>
                                <button onclick="confirm('Remove Student?')">Remove</button>
                            </td>
                        </tr>                       
                    </#list>
                </tbody>
            </table>
        </div>

        <div class="section">
            <h3>Class Announcements</h3>
            <button class="add-btn" onclick="window.location.href='teacher-edit-announcement.html'">Add
                Announcement</button>
            <ul>
                <li><strong>2025-06-01:</strong> Welcome to class! Please review the syllabus.</li>
                <li><strong>2025-06-05:</strong> Orientation on June 8th.</li>
            </ul>
        </div>
    </div>
</body>

</html>