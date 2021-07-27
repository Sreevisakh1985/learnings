var http = require('http');
var dt = require('./mydate')
http.createServer(function (req, res) {
 res.writeHead(200 , {'Content-Type' : 'text/html'});
 res.write("Date is " + dt.myDateTime()); 	
 res.end('Hello World') ; 
}).listen(8000);

