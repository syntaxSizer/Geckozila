//using sync here we are importing fs 
var fs = require('fs');
// calling readFileSync
var text = fs.readFileSync(process.argv[2]);
//printing the number of new lines in the file
console.log(text.toString().split('\n').length - 1);
