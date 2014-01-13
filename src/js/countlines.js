var fs = require('fs');

var countLines = function(fileName) {
  var content = fs.readFileSync(fileName);
  var newlines = content.toString().split("\n").length;
  return newlines-1;
};

for(var i=2; i < process.argv.length; i++) {
  console.log(countLines(process.argv[i]));
}
