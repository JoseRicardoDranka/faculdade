const express = require("express");
const router = express.Router();
const PedidoController = require("../controllers/PedidoController");

// importa a verificaSessao
const verificaSessao = require("../helpers/sessao").verificaSessao;


router.get("/", PedidoController.mostrarPedidos);
router.get("/criar", PedidoController.criarPedido);
router.post("/criarPedido", PedidoController.criarPedidoPost);
router.post("/addProduto", PedidoController.adicionarProdutoPost);
router.post("/removeProduto", PedidoController.removeProdutoPost);
router.post("/salvarPedido", PedidoController.editarPedidoPost);
router.get("/editar/:id", PedidoController.editarPedido);
router.get("/imprimir/:id", PedidoController.imprimirPedido);
router.post("/remover", PedidoController.removerPedido);

module.exports = router;