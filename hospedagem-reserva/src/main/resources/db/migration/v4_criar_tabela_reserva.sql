CREATE TABLE Reserva (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data_inicio DATE NOT NULL,
    data_fim DATE NOT NULL,
    acomodacao_id INT,
    hospede_id INT,
    FOREIGN KEY (acomodacao_id) REFERENCES Acomodacao(id),
    FOREIGN KEY (hospede_id) REFERENCES Hospede(id)
);