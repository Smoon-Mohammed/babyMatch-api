INSERT INTO users (id, username, email, password, first_name, last_name, age, address, city, created_at)
VALUES
    (1, 'admin', 'admin@example.com', 'admin123', 'Admin', 'Root', 35, '1 rue du Système', 'Paris', CURRENT_TIMESTAMP),
    (2, 'sophie.durand', 'sophie.durand@example.com', 'sophie2025', 'Sophie', 'Durand', 29, '12 rue des Lilas', 'Paris', CURRENT_TIMESTAMP),
    (3, 'paul.martin', 'paul.martin@example.com', 'paul2025', 'Paul', 'Martin', 32, '45 avenue Victor Hugo', 'Lyon', CURRENT_TIMESTAMP),
    (4, 'julie.lefevre', 'julie.lefevre@example.com', 'julie2025', 'Julie', 'Lefevre', 27, '3 rue des Écoles', 'Marseille', CURRENT_TIMESTAMP),
    (5, 'marc.dupont', 'marc.dupont@example.com', 'marc2025', 'Marc', 'Dupont', 41, '27 boulevard Pasteur', 'Bordeaux', CURRENT_TIMESTAMP),
    (6, 'emma.moreau', 'emma.moreau@example.com', 'emma2025', 'Emma', 'Moreau', 30, '10 rue Saint-Pierre', 'Toulouse', CURRENT_TIMESTAMP),
    (7, 'lucas.benoit', 'lucas.benoit@example.com', 'lucas2025', 'Lucas', 'Benoit', 34, '15 allée des Peupliers', 'Nantes', CURRENT_TIMESTAMP),
    (8, 'lea.roche', 'lea.roche@example.com', 'lea2025', 'Léa', 'Roche', 26, '9 rue du Moulin', 'Strasbourg', CURRENT_TIMESTAMP),
    (9, 'nicolas.fabre', 'nicolas.fabre@example.com', 'nicolas2025', 'Nicolas', 'Fabre', 38, '6 avenue de la Liberté', 'Nice', CURRENT_TIMESTAMP),
    (10, 'elise.garnier', 'elise.garnier@example.com', 'elise2025', 'Elise', 'Garnier', 31, '18 rue de la Gare', 'Montpellier', CURRENT_TIMESTAMP);

SELECT setval(pg_get_serial_sequence('users', 'id'), 10, true);

-- 2️⃣ NURSERY
INSERT INTO nursery (name, address, city, post_code, nb_children_max, hourly, user_id)
VALUES
    ('Les Petits Loups', '12 rue des Lilas', 'Paris', 75012, 25, '8h - 18h', 2),
    ('Jardin d’Enfants Arc-en-Ciel', '45 avenue Victor Hugo', 'Lyon', 69003, 30, '7h30 - 18h30', 3),
    ('Crèche Les Coccinelles', '3 rue des Écoles', 'Marseille', 13008, 20, '8h - 17h30', 4),
    ('Les Chérubins', '27 boulevard Pasteur', 'Bordeaux', 33000, 28, '8h - 18h30', 5),
    ('Les P’tits Explorateurs', '10 rue Saint-Pierre', 'Toulouse', 31000, 22, '7h30 - 18h', 6),
    ('Crèche du Parc', '15 allée des Peupliers', 'Nantes', 44000, 18, '8h - 17h', 7),
    ('Les Mini Pousses', '9 rue du Moulin', 'Strasbourg', 67000, 24, '7h45 - 18h15', 8),
    ('Petite Étoile', '6 avenue de la Liberté', 'Nice', 6000, 20, '8h - 17h30', 9),
    ('Les Bambins Heureux', '18 rue de la Gare', 'Montpellier', 34000, 26, '8h - 18h', 10),
    ('Arcadia Kids', '55 rue Lafayette', 'Lille', 59000, 30, '7h30 - 18h30', 1);