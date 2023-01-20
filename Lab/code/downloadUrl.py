import requests

url = 'https://www.booksfree.org/wp-content/uploads/2022/06/Big-Data-in-Practice-by-Bernard-Marr-pdf-free-download.pdf'
response = requests.get(url)
open('Big-Data-in-Practice.pdf', 'wb').write(response.content)
