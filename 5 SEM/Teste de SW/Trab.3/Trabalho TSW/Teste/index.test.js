const axios = require ('axios')

////////////////////////////////////////// 1 ////////////////////////////////////////////

//criando um produto chamado banana

test('POST-> Cria um Produto novo(banana)',async()=>{
    // preparar cenario
    let Produto = {
        nome:"banana",
        valor_unitario:14
    }

    //execução
    const response = await axios.post('http://localhost:3000/produto/criarPost',Produto);

    //verificaçoes
    expect(response.status).toBe(200);
    // expect(response.data).toHaveProperty('message','Produto criado com sucesso!')
});

//////////////////////////////////////////////////// 2 ///////////////////////////////////////

//criando um produto sem titulo
test("POST-> Tenta criar um produto sem titulo",async()=>{
    let Produto={
        nome:"",
        valor_unitario: 10
    }

    await axios.post('http://localhost:3000/produto/criarPost',Produto).catch(
        function(error){
            if(error.response){
                //expect(error.response.status).toBe(422);
                expect(error.response.data).toHaveProperty('message','Faltou informar o título');
            }
        });
});

///////////////////////////////////////////////// 3 ////////////////////////

//verifica se retorna os produtos na tela principal
test('GET-> metodo "todas as tarefas" esta retornando algum resultado',async()=>{
    
    const response= await axios('http://localhost:3000/produto')
    expect(response.data).toBeTruthy();

});

//////////////////////////////////////////// 4 //////////////////////////////////////

//criando um usuario com nome dranka
test('POST-> Cria um usuario com nome (dranka)',async()=>{
    // preparar cenario
    let usuario = {
        nome:"dranka",
        email:'adasda@gmail.com',
        senha:'darkness'
    }

    //execução
    const response = await axios.post('http://localhost:3000/usuario/criarPost',usuario);

    //verificaçoes
    expect(response.status).toBe(200);
});

//////////////////////////////////////////////// 5 //////////////////////////////////

//verifica se retorna os produtos na tela principal
test('GET-> verifica se retorna os usuarios cadastrados',async()=>{
    
    const response= await axios('http://localhost:3000/usuario')
    expect(response.data).toBeTruthy();

});

//////////////////////////////////////////////// 6 ///////////////////////////////////

//criando uma entrada de produto (Papel)

test('POST-> Cria uma entrada de produto (Papel)',async()=>{
    // preparar cenario
    let entrada = {
        produto:"Papel",
        peso:10.5,
        data:'15/02/2023'
    }

    //execução
    const response = await axios.post('http://localhost:3000/entrada_produto/criarPost',entrada);

    //verificaçoes
    expect(response.status).toBe(200);
});
/////////////////////////////////////////////////// 7 ///////////////////////////////////

test('GET-> o ultimo usuario possui o nome dranka',async()=>{
    
    const response= await axios('http://localhost:3000/usuario')

    let ultima_tarefa = response.data.usuario.length-1;
    expect(response.data.usuario[ultima_tarefa]).toHaveProperty('nome','dranka');

});