// require http module and assign to variable http
var http = require("http");

// call fun createServer which will return an object
// the object has a method called listen
// which has a parameter assigning the port no. of HTTP server
// function is the first and the only parameter of createServer
// an anonymous function is passed to createServer 
/* 
http.createServer(function(request, response){
	response.writeHead(200, {"Content-Type": "text/plain"});
	response.write("Hello World");
	response.end();
}).listen(8888); 
*/

function onRequest(request, response){
	console.log("Request received.");
	response.writeHead(200, {"Content-Type": "text/plain"});
	response.write("Hello World");
	response.end();
}
http.createServer(onRequest).listen(8888);

console.log("Server has started.");
