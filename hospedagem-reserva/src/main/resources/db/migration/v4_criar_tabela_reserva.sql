CREATE TABLE reserva (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_inicio DATETIME NOT NULL,
    data_fim DATETIME NOT NULL,
    acomodacao_id INT,
    hospede_id INT,
    FOREIGN KEY (acomodacao_id) REFERENCES acomodacao(id),
    FOREIGN KEY (hospede_id) REFERENCES hospede(id)
);