import mysql.connector
cnx=mysql.connector.connect(user='root', pass='', host='' database='main')
cursor=cnx.cursor()
query=("SELECT * FROM mytable ")
cursor.execute(query)
print cursor.fetchall
cursor.close()
cnx.close()
