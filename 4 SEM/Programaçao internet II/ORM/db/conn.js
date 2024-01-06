const { Sequelize } = require("sequelize")

const sequelize=new Sequelize('node_tarefas','eduardo','info2k21',{
    host:'localhost',
    port:3306,
    dialect:'mysql'
})

try{
    sequelize.authenticate()
    console.log('Conectado com Banco de Dados')
} catch(error){
    console.error('Nao foi possivel estabelecer conexao com o banco',error);
}

module.exports=sequelize