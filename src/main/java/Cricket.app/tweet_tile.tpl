<html>
<head>
<style>
body {
	background-color:#323d47;
	padding:15px;
	color:white;
	font-family: sans-serif;
}
h1 {
	font-size: 15px;
	margin:0 0 5px 0;
	font-weight: bold;
}
#time {
	color:#aaaeb2;
	margin:0;
}
#name {
	font-weight: bold;
}
#twitter_logo {
	float:right;
	width:20px;
	height:16px;
}
#photo {
	float:left;
	width:40px;
	height:40px;
	margin-right:15px;
	margin-bottom:10px;
	background-color:#66686b;
}
p {
	font-size:14px;
	line-height:1.35em;
	margin:5px;
}


.ellipsis {
    overflow: hidden;
    height: 180px;
    line-height: 1.35em;
}

.ellipsis:before {
    content:"";
    float: left;
    width: 5px; height: 180px;
}

.ellipsis > *:first-child {
    float: right;
    width: 100%;
    margin-left: -5px; 
}

.ellipsis:after {
    content: "\02026";  

    box-sizing: content-box;
    -webkit-box-sizing: content-box;

    float: right; position: relative;
    top: -25px; left: 100%;
    width: 3em; margin-left: -3em;
    padding-right: 5px;
    
    text-align: right;
    background:#323d47;
    background: -webkit-gradient(linear, left top, right top,
        from(rgba(50, 61, 71, 0)), to(#323d47), color-stop(50%, #323d47));
    background: linear-gradient(to right, rgba(50, 61, 71, 0), #323d47 50%, #323d47)
}

</style>
</head>
<body>
<div class="ellipsis">
<div>
<img id="twitter_logo" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACgAAAAgCAYAAABgrToAAAAB3ElEQVR4AcXTUWRbURjA8Y9LuZQRRgllT2OMEUYopYxQwihlr2PsqZQQLmOE0dc9lRBKmYaQ11L6NEoZeRphlFAulz6Vcvn2f8g4xrm5N+ckJ/xecjn+57v3k1X/Xl/ctTHCFIoU10hQg1hsQ8w/XmAD4kkdY2iBBxxBDHsYo/d/4AhjRBBHTTxASxpgiAyKOzwzAzeRQ3HuOMk6UuiS7tGAIDZvrIZr1CBL6EOXNEELHzDCp3+H7kNhmuE9pIIaHqEe9M1XvAO1GGELUsIB1IMBNiDmzfMF29YtEdqBOuqaZ5qHX0EXyDFG27Ltx1AHGcQWuAOtIMUQHbxDA5+hDlJ7IHACDeiPLXAPB4jxHRrIT1tgGzo3wRM0gDNbYB0aGjpF3+AlNLDmoi3OoYFkiOyBQAINZAApDgSSQJPcLRcIvMU5HqFr8AtSNrCJLr7gx5qmeVglcBMpdE1uIOUDgSPoGuRoVA8EzqAr1oMsFwgkK1yUK0RugcA2ephAPfmN5xDXQFOMEw9bPUUd4iswwiGmnjZ2C+IjsIEEM6gHp4ghVQN3cWq4QQb1ZIYWpFjxBN/gEupRhmPEEJdA00t8xcwhqo99RBBXRQ9f4SP6uJ17gs7d4xZDfEML4ttfIFRpBkBjM0AAAAAASUVORK5CYII=" />
<h1>Favourite tweet</h1>
<p id="time">{{time}}</p>
<div><img id="photo" src="{{photo}}" /><p><span id="name">{{name}}</span><br />
{{text}}</p></div>
</div>
</div>
</body>
</html>