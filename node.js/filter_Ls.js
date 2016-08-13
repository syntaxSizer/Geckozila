fs= require('fs');
var txt = process.argv[3];
// files with  .txt 
var pat = RegExp('\\.'+ txt +'$');
module.exports = function (){
file = fs.readdir(process.argv[2], function callback(err,files){
for (i = 0 ; i<files.length; i++){
if(pat.test(files[i])){
console.log(files[i]);
}
}
});
}
