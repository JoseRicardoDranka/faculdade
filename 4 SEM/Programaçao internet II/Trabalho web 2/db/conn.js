const mysql = require('mysql')

const pool = mysql.createPool({
    connectionLimit : 10,
    host: 'localhost',
    user: 'eduardo',
    password: 'czkiller',
    database:'alunos',
    port: 3306
})

module.exports = pool