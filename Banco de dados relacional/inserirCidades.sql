insert into cidade 
	(nome, area, estado_id)
VALUES
	('Campinas', 795, 25);

insert into cidade
	(nome, area, estado_id)
VALUES
	('juazeiro do norte',
    248.2,
    (select id from estados where sigla = 'AC'));
    
select * from cidade;