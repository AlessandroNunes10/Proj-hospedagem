CREATE TABLE Acomodacao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    localizacao VARCHAR(100) NOT NULL,
    numero_registro VARCHAR(50) NOT NULL,
    quartos_disponiveis INT NOT NULL,
    anfitriao_id INT,
    FOREIGN KEY (anfitriao_id) REFERENCES Anfitriao(id)
);