CREATE TABLE acomodacao (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    localizacao VARCHAR(100) NOT NULL,
    numero_registro INT NOT NULL,
    quartos_disponiveis INT NOT NULL,
    anfitriao_id INT,
    FOREIGN KEY (anfitriao_id) REFERENCES anfitriao(id)
);