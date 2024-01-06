const http = require("http")
const fs = require("fs")
const url=require("url")

const port = 3000
const server = http.createServer((req, res) => {
    var urlInfo=url.parse(req.url,true)
    const nome=urlInfo.query.nome
    if(!"nome"){
        
        fs.readFile("index.html", function (err, data) {
            res.writeHead(200, { "Constent-type": "text/html" })
            res.write(data)
            return res.end()

        })
    }else{
        const nomeNewLine=nome+"\r\n"
        fs.appendFile("arq.txt",nomeNewLine,function(err,data){
            res.writeHead(302,{
                location:"/"
            })
            return res.end()
        })
    }



})
server.listen(port,()=>{
    console.log(`Servidor rodando na porta: ${port}`)
})











///////////////////////////////////////////////////
//                 exemplo9

/*const http = require("http")
const fs = require("fs")

const port = 3000
const server = http.createServer((req, res) => {

    fs.readFile("msg.html", function (err, data) {
        res.writeHead(200, { "Constent-type": "text/html" })
        res.write(data)
        return res.end()

    })



})
server.listen(port,()=>{
    console.log(`Servidor rodando na porta: ${port}`)
})
*/
/////////////////////////////////////////////////////////
//                  Exemplo 8
/*
const http = require("http")
const url = require("url")

const port=3000
const server=http.createServer((req,res)=>{
    var urlInfo=url.parse(req.url,true)
    const v1=parseFloat(urlInfo.query.valor1)
    const v2=parseFloat(urlInfo.query.valor2)
    const v3=parseFloat(urlInfo.query.valor3)
    const v4=parseFloat(urlInfo.query.valor4)

    res.statusCode = 200
    res.setHeader("Content-typer","text/html")


    if(!v1){
        res.end(
            "<h1>Soma de dois valores</h1><form method='GET'> "+
            "<div>"+
                "<label for='valor1'>Digite o valor 1:</label>"+
                "<input type='text' name='valor1'/>"+
            "</div>"+
            "<div>"+
                "<label for='valor2'>Digite o valor 2:</label>"+
                "<input type='text' name='valor2'/>"+
            "</div>"+
            "<div>"+
                "<label for='valor3'>Digite o valor 3:</label>"+
                "<input type='text' name='valor3'/>"+
            "</div>"+
            "<div>"+
                "<label for='valor4'>Digite o valor 4:</label>"+
                "<input type='text' name='valor4'/>"+
            "</div>"+
            "<input type='submit' value='Calcular'></form>"
        )
    }else{
        const soma = (v1+v2+v3+v4)/4
        res.end(
            "<h1>Soma de dois valores</h1><form method='GET'> "+
            "<div>"+
                "<label for='valor1'>Digite o valor 1:</label>"+
                "<input type='text' name='valor1'/>"+
            "</div>"+
            "<div>"+
                "<label for='valor2'>Digite o valor 2:</label>"+
                "<input type='text' name='valor2'/>"+
            "</div>"+
            "<div>"+
                "<label for='valor3'>Digite o valor 3:</label>"+
                "<input type='text' name='valor3'/>"+
            "</div>"+
            "<div>"+
                "<label for='valor4'>Digite o valor 4:</label>"+
                "<input type='text' name='valor4'/>"+
            "</div>"+
            "<input type='submit' value='Calcular'></form>"+
            "<h1>Média: "+soma+"<\h1>"
        )
    }
})



server.listen(port,()=>{
    console.log(`Servidor rodando na porta: ${port}`)
})

*/
/////////////////////////////////////////////////////
//              Exemplo 7
/*const http = require("http")
const url = require("url")

const port=3000
const server=http.createServer((req,res)=>{
    var urlInfo=url.parse(req.url,true)
    const v1=parseFloat(urlInfo.query.valor1)
    const v2=parseFloat(urlInfo.query.valor2)

    res.statusCode = 200
    res.setHeader("Content-typer","text/html")

    if(!v1){
        res.end(
            "<h1>Soma de dois valores</h1><form method='GET'> "+
            "<div>"+
                "<label for='valor1'>Digite o valor 1:</label>"+
                "<input type='text' name='valor1'/>"+
            "</div>"+
            "<div>"+
                "<label for='valor2'>Digite o valor 2:</label>"+
                "<input type='text' name='valor2'/>"+
            "</div>"+
            "<input type='submit' value='Calcular'></form>"
        )
    }else{
        const soma = v1+v2
        res.end(
            "<h1>Soma de dois valores</h1><form method='GET'> "+
            "<div>"+
                "<label for='valor1'>Digite o valor 1:</label>"+
                "<input type='text' name='valor1'/>"+
            "</div>"+
            "<div>"+
                "<label for='valor2'>Digite o valor 2:</label>"+
                "<input type='text' name='valor2'/>"+
            "</div>"+
            "<input type='submit' value='Calcular'></form>"+
            "<h1>Resultado da soma: "+soma+"<\h1>"
        )
    }

})
server.listen(port,()=>{
    console.log(`Servidor rodando na porta: ${port}`)
}
)
*/



//////////////////////////////////////////////////////////
//                  Exemplo 6
/*const http = require("http")
const url =require("url")

const port=3000

const server=http.createServer((req,res)=>{
var urlInfo=url.parse(req.url,true)
const nome=urlInfo.query.nome

res.statusCode=200
res.setHeader("Content-Type","text/html")

if(!nome){
    res.end(
        "<h1>Preencha seu nome: </h1><form method ='GET'><input type ='text'name=nome/><input type='submit' value = Enviar></form>"
    )

}else{
    res.end("<h1>seja bem vindo" +nome+"</h1>")
}
})
server.listen(port, () => {
    console.log(`Servidor rodando na porta: ${port}`)
})




*/



//////////////////////////////////////////////////////////////
//                  Exemplo 5
/*const url = require("url")
const end = "https://www.ifsc.edu.br/cursos?alunos=ads"
const parsedUrl = new url.URL(end)

console.log(parsedUrl.host)
console.log(parsedUrl.pathname)
console.log(parsedUrl.search)
console.log(parsedUrl.searchParams)
console.log(parsedUrl.searchParams.get("alunos"))
*\








////////////////////////////////////////////////////////////////////////////
//              Exemplo 4

const http = require("http")

const port = 3000
const server = http.createServer((req, res) => {
    res.statusCode = 200
    res.setHeader("Content-type", "text/html")
    res.write("<h1>hello wolrd</h1>")
    res.end()
})
server.listen(port, () => {
    console.log(`Servidor rodando na porta: ${port}`)
})




















/////////////////////////////////////////////////////////
//              Exemplo 3

/*const http = require("http")

    const port=3000
    const server = http.createServer((req,res)=>{
        res.write("hello world")
        res.end()
    })
    server.listen(port,()=>{
        console.log(`Servidor rodando na porta: ${port}`)
    })*/



////////////////////////////////////////////////////////////////////
//                Exemplo 2

/*const fs=require("fs")

fs.readFile("arquivo.txt","utf8",(err,data)=>{
    console.log(data)
})*/


/////////////////////////////////////////////////////////////////

//          Exemplo 1

// console.log("hello world")