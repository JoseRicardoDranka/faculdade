const express = require("express");
const router = express.Router();
const IntermediarioController = require("../controllers/IntermediarioController");

// importa a verificaSessao
const verificaSessao = require("../helpers/sessao").verificaSessao;


router.get("/", IntermediarioController.mostrarIntermediarios);
router.get("/criar", IntermediarioController.criarIntermediario);
router.post("/criarPost", IntermediarioController.criarIntermediarioPost);
router.get("/editar/:id", IntermediarioController.editarIntermediario);
router.post("/editarPost", IntermediarioController.editarIntermediarioPost);
router.post("/remover", IntermediarioController.removerIntermediario);

module.exports = router;