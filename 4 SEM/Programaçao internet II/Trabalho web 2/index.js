//Instalar os módulos
//npm install nodemon express express-handlebars mysql

//Estrutura básica da aplicação
const express = require('express')
const exphbs = require('express-handlebars')
const pool = require('./db/conn')

const app = express()

app.engine('handlebars', exphbs.engine())
app.set('view engine', 'handlebars')

//midleware para interpretar os dados do formulário POST
app.use(
    express.urlencoded({
        extended : true
    })
)

app.use(express.json())

//midleware para definir a pasta estática 'pública'
app.use(express.static('public'))

//Rota inicial
app.get('/', function(req,res){
    res.render('home')
})

//Rota para receber os dados do formulário cadastrar
app.post('/alunos/insertbook', function(req,res){
    const nome = req.body.nome
    const sobrenome = req.body.sobrenome

    const sql = `INSERT INTO alunos (nome,sobrenome) VALUES ('${nome}','${sobrenome}');`

    pool.query(sql, function(err){
        if (err){
            console.log(err)
        }

        res.redirect('/')
    })
})

//Rota para listar todos os livros
app.get('/alunos/', function(req,res){
    const sql = "SELECT * FROM alunos;"
    pool.query(sql, function(err,data){
        if (err){
            console.log(err)
        }

        res.render('alunos', {alunos:data})
    })
})

//Rota para listar o livro específico
app.get('/alunos/:id',function(req,res){
    const id = req.params.id
    const sql = `SELECT * FROM alunos WHERE id = ${id}`
    pool.query(sql, function (err,data){
        if (err){
            console.log(err)
        }
        const aluno = data[0]
        res.render('aluno', {aluno: aluno})
    })
})

//Rota para editar o livro
app.get('/alunos/edit/:id',function(req,res){
    const id = req.params.id
    const sql = `SELECT * FROM alunos WHERE id = ${id}`
        pool.query(sql,function(err,data){
            if (err){
                console.log(err)
            }
            const aluno = data[0]
            

            res.render('editaraluno',{aluno:aluno})
        })
})





//Rota para receber os dados atualizados do livro
app.post('/alunos/updatebook', function(req,res){
    const id = req.body.id
    const nome = req.body.nome
    const sobrenome = req.body.sobrenome

    const nota1 = parseInt(req.body.nota1)
    const nota2 = parseInt(req.body.nota2)
    const nota3 = parseInt(req.body.nota3)
    const media = (nota1+nota2+nota3)/3

    const sql = `UPDATE alunos SET nome='${nome}', sobrenome='${sobrenome}', nota1='${nota1}', nota2='${nota2}', nota3='${nota3}', media='${media}' WHERE id = ${id}`
    pool.query(sql,function(err){
        if (err){
            console.log(err)
        }
        res.redirect(`/alunos/${id}`)
    })
})



//Rota para excluir o livro
app.post('/alunos/remove/:id', function(req,res){
    const id = req.params.id
    const sql = `DELETE FROM alunos WHERE id = ${id}`
    pool.query(sql,function(err){
        if (err){
            console.log(err)
        }
        res.redirect(`/alunos`)
    })
})

app.listen(3000)