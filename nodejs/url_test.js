var url = require('url')

var link = 'http://localhost:8000/reader?name=Minny&age=11';
var q = url.parse(link , true)
console.log(q.host)
console.log(q.pathname)
console.log(q.query)


