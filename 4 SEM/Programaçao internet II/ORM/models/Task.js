const { DataTypes}=require('sequelize')

const db = require('../db/conn')

const task = db.define('Task',{
    title: {
        type:DataTypes.STRING,
        allowNull:false,
    },
    description:{
        type:DataTypes.STRING,
    },
    done:{
        type:DataTypes.BOOLEAN,
    }
})
module.exports= task;