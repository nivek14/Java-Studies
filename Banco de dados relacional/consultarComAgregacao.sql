select
	regiao as "região",
    sum(populacao) as total
from estados
group by regiao
order by total desc;