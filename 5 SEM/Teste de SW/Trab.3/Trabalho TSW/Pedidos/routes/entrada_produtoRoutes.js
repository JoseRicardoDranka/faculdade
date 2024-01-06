const express = require("express");
const router = express.Router();
const Entrada_ProdutoController = require("../controllers/Entrada_ProdutoController");

const verificaSessao = require("../helpers/sessao").verificaSessao;


router.get("/", Entrada_ProdutoController.mostrarEntrada_Produtos);
router.get("/criar", Entrada_ProdutoController.criarEntrada_Produto);
router.post("/criarPost", Entrada_ProdutoController.criarEntrada_ProdutoPost);
router.get("/editar/:id", Entrada_ProdutoController.editarEntrada_Produto);
router.post("/editarPost", Entrada_ProdutoController.editarEntrada_ProdutoPost);
router.post("/remover", Entrada_ProdutoController.removerEntrada_Produto);

module.exports = router;