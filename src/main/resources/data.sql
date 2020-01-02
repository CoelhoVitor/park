INSERT INTO ESTACIONAMENTO(id, nome, cnpj, endereco, telefone, vagas_motos, vagas_carros, preco_hora) VALUES(1, 'Estacionamento 1', '1234556', 'Rua Doutor Fulano, 505 - Aparecida, Santos/SP', '123456', '10', '20', '8.50')
INSERT INTO ESTACIONAMENTO(id, nome, cnpj, endereco ,telefone, vagas_motos, vagas_carros, preco_hora) VALUES(2, 'Estacionamento 1', '1234556', 'Rua Doutor Fulano 2, 403 - Embaré, Santos/SP', '123456', '10', '20', '7.80')
INSERT INTO ESTACIONAMENTO(id, nome, cnpj, endereco ,telefone, vagas_motos, vagas_carros, preco_hora) VALUES(3, 'Estacionamento 1', '1234556', 'Rua Doutor Fulano 3, 306 - Mocca, São Paulo/SP', '123456', '10', '20', '9.50')

INSERT INTO VAGA(estacionamento_id, livre) VALUES(1, false)
INSERT INTO VAGA(estacionamento_id, livre) VALUES(1, true)
INSERT INTO VAGA(estacionamento_id, livre) VALUES(1, false)
INSERT INTO VAGA(estacionamento_id, livre) VALUES(2, true)
INSERT INTO VAGA(estacionamento_id, livre) VALUES(2, true)
INSERT INTO VAGA(estacionamento_id, livre) VALUES(2, true)
INSERT INTO VAGA(estacionamento_id, livre) VALUES(3, true)
INSERT INTO VAGA(estacionamento_id, livre) VALUES(3, true)
INSERT INTO VAGA(estacionamento_id, livre) VALUES(3, true)


INSERT INTO VEICULO(marca, modelo, cor, placa, tipo_veiculo, vaga_id) VALUES('Marca 1', 'Modelo 1', 'Preto', 'FFFF-4444', 'MOTO', 1)
INSERT INTO VEICULO(marca, modelo, cor, placa, tipo_veiculo, vaga_id) VALUES('Marca 1', 'Modelo 2', 'Preto', 'FFFF-4444', 'MOTO', 2)
INSERT INTO VEICULO(marca, modelo, cor, placa, tipo_veiculo, vaga_id) VALUES('Marca 1', 'Modelo 3', 'Preto', 'FFFF-4444', 'CARRO', 4)

