select * from estados e, cidade c
where e.id = c.estado_id;

select c.nome as cidade, e.nome as estado, regiao
from estados
inner join cidade c
on e.id = c.estado_id;