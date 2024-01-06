/*Crie uma lista com o id e nome dos atores que participaram do filme GREEK EVERYONE*/

select ator.ator_id,ator.primeiro_nome,ator.ultimo_nome
from ator
inner join filme_ator using(ator_id)
inner join filme using(filme_id)
where filme.titulo like 'GREEK EVERYONE';

/*Crie uma lista com o nome dos filmes que o Ator JOHNNY LOLLOBRIGIDA atuou em 2006*/

select filme.titulo
from filme
inner join filme_ator using(filme_id)
inner join ator using (ator_id)
where ator.primeiro_nome like 'JOHNNY' and ator.ultimo_nome like 'LOLLOBRIGIDA' and filme.ano_de_lancamento = 2006;

/*Crie uma lista com o id e o título dos filmes que são de comédia*/

select filme.filme_id,filme.titulo
from filme
inner join filme_categoria using (filme_id)
inner join categoria using (categoria_id)
where categoria.nome like 'Comedy';

/*Crie uma lista com o id, nome do cliente e cidade dos clientes brasileiros*/

select cliente.cliente_id,cliente.primeiro_nome,cliente.ultimo_nome,cidade.cidade
from cliente
inner join endereco using (endereco_id)
inner join cidade using (cidade_id)
inner join pais using(pais_id)
where pais.pais like 'Brazil';


/*Crie uma lista com os filmes alugados pela Tamara que mora no Brasil*/

select filme.filme_id,filme.titulo,cliente.primeiro_nome
from filme
inner join inventario using (filme_id)
inner join aluguel using (inventario_id)
inner join cliente using (cliente_id)
inner join endereco using(endereco_id)
inner join cidade using (cidade_id)
inner join pais using (pais_id)
where cliente.primeiro_nome like'Tamara' and pais.pais like 'Brazil'