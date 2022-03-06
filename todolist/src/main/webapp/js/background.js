body = document.querySelector("body");
let randomNum = parseInt(Math.random()*3);
body.style = `background-image:url("./img/${randomNum}.jpg")`;