function aplicarDesconto(valor,desconto){
    if(desconto>valor) return 0;
    return valor-desconto;
}


module.exports={aplicarDesconto};
//let valor_liquido = aplicarDesconto(10,2);

//console.log("valor liquido "+valor_liquido);