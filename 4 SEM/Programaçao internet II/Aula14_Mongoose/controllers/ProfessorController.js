const Professor = require('../models/Professor')
const mongoose = require('mongoose')


module.exports = class ProfessorController {
  static async mostrarProfessores(req, res) {
    const professores = await Professor.find({}).lean()

    //console.log(professores)

    res.render('Professores/all', { professores })
  }

  static criarProfessor(req, res) {
    res.render('Professores/create')
  }

  static async criarProfessorPost(req, res) {

    const nome = req.body.nome
    const descricao = req.body.descricao

    const imagem = req.file.filename
    const professor = new Professor({ nome, descricao, imagem })

    await professor.save()

    res.redirect('/Professores')
  }

  static async buscaProfessor(req, res) {
    const id = req.params.id

    const professor = await Professor.findById(id).lean()

    //console.log(professor)

    res.render('Professores/detail', { professor })
  }

  static async removeProfessor(req, res) {
    const id = req.params.id

    await Professor.deleteOne({ _id: id })

    res.redirect('/Professores')
  }

  static async editaProfessor(req, res) {
    const id = req.params.id

    const professor = await Professor.findById(id).lean()

    res.render('Professores/edit', { professor })
  }

  static async editaProfessorPost(req, res) {
    const id = req.body.id; 

    const nome = req.body.nome
    const descricao = req.body.descricao

    if (req.file) {

      const imagem = req.file.filename
      var professor = { nome, descricao, imagem }
    }
    else {
      var professor = { nome, descricao }
    }

    await Professor.updateOne({ _id: id }, professor)

    res.redirect('/Professores')
  }
}
