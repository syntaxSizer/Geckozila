//async function
var fs = require('fs');
// calling readFile
fs.readFile(process.argv[2],function(err, data){
//printing the number of new lines in the file
console.log(data.toString().split('\n').length - 1);
});                                                   
