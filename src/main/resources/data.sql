-- Script para dropar a tabela se existir
DROP TABLE IF EXISTS game;

-- Script para criar a tabela game
CREATE TABLE game (
    id BIGINT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    "year" INT NOT NULL,
    console INT NOT NULL,
    URL_IMAGE CLOB(4000) NOT NULL,
    finished CHAR(1) NOT NULL DEFAULT 'N'
);

-- Script para criar a sequência, se necessário
CREATE SEQUENCE IF NOT EXISTS GAME_SEQ START WITH 1 INCREMENT BY 1;


INSERT INTO game (id, name, "year", console, URL_IMAGE, finished) VALUES (NEXTVAL('game_seq'),'Super Mario World',1991,1,'https://upload.wikimedia.org/wikipedia/pt/0/06/Super-Mario-World.jpg', 'Y');
INSERT INTO game (id, name, "year", console, URL_IMAGE, finished) VALUES (NEXTVAL('game_seq'),'Top Gear',1992,1,'https://vimm.net/image.php?type=box_large&id=1719', 'N');
INSERT INTO game (id, name, "year", console, URL_IMAGE, finished) VALUES (NEXTVAL('game_seq'),'Mortal Kombat II',1994,1,'https://vimm.net/image.php?type=box_large&id=1408', 'Y');