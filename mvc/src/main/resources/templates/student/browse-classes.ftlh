<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Class Connect - Bringing Teachers and Students Together Seamlessly</title>
  <link rel="stylesheet" href="/styles.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>

<body>
  <header>
    <h1>Class Connect</h1>
    <p>Bringing Teachers and Students Together Seamlessly</p>
  </header>
  <div class="container">
    <h2>Welcome to Class Connect</h2>
    <p>
      Class Connect is your all-in-one platform to foster collaboration, streamline communication, and enhance learning
      experiences for teachers and students. Join us to make classroom connections easier than ever!
    </p>
  </div>
  <section class="highlights">
    <h2>Featured Classes</h2>
    <div class="class-list">
      <#list courses as course>
        <div class="class-card">
          <h3>${course.courseName}</h3>
          <p>${course.description}</p>
          <span class="teacher">${course.teacher.name}</span>
          <a href="/courses/${course.courseId}" class="btn btn-primary" role="button">Details</a>
        </div>
        <hr>
    </div>
    </#list>
  </section>
</body>

</html>