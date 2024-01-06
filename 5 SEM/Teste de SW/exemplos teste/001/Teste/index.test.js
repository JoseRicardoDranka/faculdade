const axios = require ('axios')

//testando metodo adicionar tarefa

test('POST-> Cria uma tarefa com o titulo Correr',async()=>{
    // preparar cenario
    let task = {
        title:"correr",
        description:"vou sair para correr as 15:00h"
    }

    //execução
    const response = await axios.post("http://localhost:5000/tasks/add",task);

    //verificaçoes
    expect(response.status).toBe(201);
    expect(response.data).toHaveProperty('message','Tarefa correr criada com sucesso')


});
//teste com exceção
test("POST-> Tenta criar uma tarefa sem titulo",async()=>{
    let task={
        title:"",
        description: "algumas descrição"
    }

    await axios.post('http://localhost:5000/add/',task).catch(
        function(error){
            if(error.response){
                expect(error.response.status).toBe(422);
                expect(error.response.data).toHaveProperty('message','Faltou informar o título');
            }
        });
});

test('GET-> metodo "todas as tarefas" esta funcionando',async()=>{
    
    const response= await axios('http://localhost:5000')
    expect(response.status).toBe(200);

});

test('GET-> metodo "todas as tarefas" esta retornando algum resultado',async()=>{
    
    const response= await axios('http://localhost:5000')
    expect(response.data).toBeTruthy();

});

test('GET-> a ultima tarefa possui o titulo correr',async()=>{
    
    const response= await axios('http://localhost:5000')

    let ultima_tarefa = response.data.tasks.length-1;
    expect(response.data.tasks[ultima_tarefa]).toHaveProperty('title','correr');

});

//testa update GET
test('GET-> testa update Get',async()=>{
    
    const response= await axios('http://localhost:5000/tasks/edit/3')

    expect(response.data.task).toHaveProperty('id',3);
    expect(response.data.task).toHaveProperty('title','correr');
    expect(response.data.task.description).toMatch(/15:00/);

});