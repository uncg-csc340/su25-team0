<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <title>Sign In</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="/styles.css">
</head>

<body>
  <div class="container">
    <h2>Sign In</h2>
    <form action="/teachers/signin" method="post">
      <label for="email">Email</label>
      <input type="email" id="email" name="email" required>

      <label for="password">Password</label>
      <input type="password" id="password" name="password" required>
      <button type="submit"> Sign In</button>

    </form>
    <a class="register-link" href="/teachers/signup">New Teacher? Register here</a>
  </div>
</body>

</html>