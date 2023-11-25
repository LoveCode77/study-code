const express = require('express');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.json());

// 单一请求
app.get('/test', (req, res) => {
    console.log("test被请求!");
    console.log(req);
    res.setHeader('Access-Control-Allow-Origin','*')
    res.send('Hello World!');
});
app.listen(4000, () => {
    console.log('Server started on port 4000');
});


