<?php
// PHP code to connect to a database and fetch data
$servername = "localhost";
$username = "username";
$password = "password";
$dbname = "database";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

// SQL query
$sql = "SELECT * FROM users WHERE age > 18";
$result = $conn->query($sql);

// Output data
if ($result->num_rows > 0) {
  while($row = $result->fetch_assoc()) {
    echo "Name: " . $row["name"]. " - Age: " . $row["age"]. "<br>";
  }
} else {
  echo "0 results";
}

$conn->close();
?>
