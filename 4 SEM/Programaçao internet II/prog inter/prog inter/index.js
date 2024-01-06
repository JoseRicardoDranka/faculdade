const expess = require ('express')
const exphbs=require('express-handlebars')



const app =expess()

app.engine('handlebars',exphbs.engine())
app.set('view engine','handlebars')

app.use(expess.static("public"))

app.get('/dashboard',function(req, res){
    const items=['jose','alexandre','luan','ttyago','yasmin','lucas']
    res.render("dashboard",{items:items})
})

app.get('/',function(req, res){
    const user = {
        nome:'jose',
        sobrenome:'ricardo',
        idade:23
    }
    const aprovado = true
    res.render('home',{user:user,autenticado:true,aprovado:aprovado})    
})

app.listen(3000)
