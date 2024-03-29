const express = require("express");
const router = express.Router();
const ProdutoController = require("../controllers/ProdutoController");

// importa a verificaSessao
const verificaSessao = require("../helpers/sessao").verificaSessao;


router.get("/", ProdutoController.mostrarProdutos);
router.get("/criar", ProdutoController.criarProduto);
router.post("/criarPost", ProdutoController.criarProdutoPost);
router.get("/editar/:id", ProdutoController.editarProduto);
router.post("/editarPost", ProdutoController.editarProdutoPost);
router.post("/remover", ProdutoController.removerProduto);



module.exports = router;