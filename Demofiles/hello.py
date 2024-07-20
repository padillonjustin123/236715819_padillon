import sqlite3

# Python code to query SQLite database
conn = sqlite3.connect('example.db')
cursor = conn.cursor()

# SQL query
sql = "SELECT * FROM users WHERE age > 18"
cursor.execute(sql)

# Fetch and print data
for row in cursor.fetchall():
    print(f"Name: {row[0]} - Age: {row[1]}")

conn.close()
