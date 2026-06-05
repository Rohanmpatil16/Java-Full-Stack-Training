<!DOCTYPE html>
<html>
<head><title>Result</title></head>
<body>

    <h2>Calculator Result</h2>

    <p>Number 1: <%= request.getAttribute("num1") %></p>
    <p>Number 2: <%= request.getAttribute("num2") %></p>
    <p>Operation: <%= request.getAttribute("operationName") %></p>
    <h3>Result: <%= request.getAttribute("result") %></h3>

    <br>
    <a href="index.html">Calculate Again</a>

</body>
</html>
