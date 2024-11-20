<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Form</title>
</head>
<body>
<h1>User Form</h1>
<form action="MyServlet" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required><br><br>

    <label for="gender">Gender:</label>
    <select id="gender" name="gender">
        <option value="male">Male</option>
        <option value="female">Female</option>
        <option value="other">Other</option>
    </select><br><br>

    <label>
        <input type="checkbox" name="terms" value="agree" required>
        I agree to the terms and conditions
    </label><br><br>

    <button type="submit">Submit</button>
</form>
<h1>Complex Number Calculator</h1>
<form action="ComplexCalculatorServlet" method="post">
    <label for="realPart">Real Part:</label>
    <input type="number" id="realPart" name="realPart" step="any" required><br><br>

    <label for="imaginaryPart">Imaginary Part:</label>
    <input type="number" id="imaginaryPart" name="imaginaryPart" step="any" required><br><br>

    <button type="submit">Calculate</button>
</form>

</body>
</html>
