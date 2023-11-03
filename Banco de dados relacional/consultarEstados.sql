select * from estados;

select nome as 'Nome do estado' , sigla from estados
where regiao = 'Norte'
order by populacao desc;