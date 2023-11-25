const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();

app.use(bodyParser.json());
const corsOptions = {
    origin: '*', // 指定允许的源
    methods: 'GET,HEAD,PUT,PATCH,POST,DELETE', // 指定允许的 HTTP 方法
    allowedHeaders: 'Content-Type,Authorization',
    credentials: true, // 允许发送凭据（例如 cookie）
    optionsSuccessStatus: 204 // 用于预检请求的 HTTP 状态码
  };
app.use(cors(corsOptions));

// 1 GET
app.get('/api', (req, res) => {
    res.send('Received get request');
});

// 2 POST
app.post('/api', (req, res) => {
    console.log(req.body);
    res.send('Received POST request');
});
// 3 HEAD
app.head('/api', (req, res) => {
    console.log(req);
    res.send('Received head request');
});
// 4 put
app.put('/api', (req, res) => {
    console.log(req);
    res.send('Received put request');
});
//5 patch
app.patch('/api', (req, res) => {
    console.log(req);
    res.send('Received patch request');
});
//6 delete
app.delete('/api', (req, res) => {
    console.log(req);
    res.send('Received delete request');
});
//7 options
app.options('/api', (req, res) => {
    console.log(req);
    res.send('Received options request');
});
// 8  connect
app.connect('/api', (req, res) => {
    console.log(req);
    res.send('Received connect request');
});
// 9 trace
app.trace('/', (req, res) => {
    console.log(req);
    res.send('Received trace request');
});

// 启动服务器

app.listen(3000, () => {
    console.log('Server started on port 3000');
});


