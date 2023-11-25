const express = require('express');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.json());

app.get('/test', (req, res) => {
    console.log("test被请求!");
    const callback = req.query.callback;
    const data = { name: 'xiongdu', age: 18 };
    var dataString = JSON.stringify(data);
    const s = callback + '(' + dataString + ')';
    console.log(`${callback}`);
    console.log(s);
    const s1 = 'handleData(11111)';
    console.log(s1);
    res.send(s);
});
app.listen(4000, () => {
    console.log('Server started on port 4000');
});