const express = require("express");
const router = express.Router();
const UsuarioController = require("../controllers/UsuarioController");

// importa a verificaSessao
const verificaSessao = require("../helpers/sessao").verificaSessao;

router.get("/", UsuarioController.mostrarUsuarios);
router.get("/criar", UsuarioController.criarUsuario);
router.post("/criarPost", UsuarioController.criarUsuarioPost);
router.get("/editar/:id", UsuarioController.editarUsuario);
router.post("/editarPost", UsuarioController.editarUsuarioPost);
router.post("/remover", UsuarioController.removerUsuario);
router.post("/loginPost", UsuarioController.loginPost);

module.exports = router;