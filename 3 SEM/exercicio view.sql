# Atividade View - Utilizar Banco Sakila

#1) Crie uma view com o registro dos clientes e filmes alugados
create view filme_cliente as
select cliente.cliente_id,cliente.loja_id,cliente.primeiro_nome,cliente.ultimo_nome,cliente.email,cliente.endereco_id,cliente.ativo,cliente.data_criacao,filme.*
from cliente
inner join aluguel using(cliente_id)
inner join inventario using (inventario_id)
inner join filme using (filme_id);

#2) Crie uma view com os filmes atuados por um determindao ator 
create view ator_filme as
select filme.filme_id,filme.titulo,ator.primeiro_nome,ator.ultimo_nome
from filme
inner join filme_ator using(filme_id)
inner join ator using (ator_id);
#3) Crie uma view com a lista de filmes por categoria
create view categoria_filme as
select filme.filme_id,filme.titulo,categoria.nome as categoria
from filme
inner join filme_categoria using(filme_id)
inner join categoria using (categoria_id);
#4) Crie uma view para listar os pagamentos dos clientes pelo nome
select pagamento.valor,cliente.primeiro_nome,cliente.ultimo_nome
from cliente
inner join pagamento using (cliente_id);
#5) Crie uma view para listar os clientes por cidade
create view cliente_cidade as
select cliente.primeiro_nome,cliente.ultimo_nome,cidade.cidade
from cliente
inner join endereco using (endereco_id)
inner join cidade using (cidade_id);
#6) Crie uma view para listar os aluguéis de cada funcionário
create view aluguel_funcionario as
select aluguel.aluguel_id,funcionario.primeiro_nome,funcionario.ultimo_nome
from aluguel
inner join funcionario using (funcionario_id);
#7) Crie uma view para listar o cadastro do cliente com os dados de endereço, cidade
#	e país 
create view cliente_endereco as
select cliente.*,endereco.endereco,endereco.endereco2,endereco.bairro,endereco.cidade_id,endereco.cep,endereco.telefone,cidade.cidade,pais_id
from cliente
inner join endereco using(endereco_id)
inner join cidade using (cidade_id);

