const index = require('./index');

test('Aplicar Desconto',()=>{
    const resultado = index.aplicarDesconto(10,5);
    expect(resultado).toEqual(5);
});

test('Aplicar Desconto maior q valor',()=>{
    const resultado = index.aplicarDesconto(10,50);
    expect(resultado).toEqual(0);
});