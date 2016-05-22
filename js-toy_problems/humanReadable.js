/*Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)*/


function humanReadable(seconds) {
  // TODO
  var arr = [];
  var q = seconds, r=0;

  for(var i=0; i<2; i++) {
    r = q%60;
    q = Math.floor(q/60);
    arr.unshift(r);
    if(i==1) arr.unshift(q);
  }
  return arr.map(function(n){
    return (n<10) ? '0'+n : n;
  }).join(':');

}
