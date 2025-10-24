
INSERT INTO users (username, email, created_at)
VALUES
    ('admin', 'admin@example.com', CURRENT_TIMESTAMP),
    ('sophie.durand', 'sophie.durand@example.com', CURRENT_TIMESTAMP),
    ('paul.martin', 'paul.martin@example.com', CURRENT_TIMESTAMP),
    ('julie.lefevre', 'julie.lefevre@example.com', CURRENT_TIMESTAMP),
    ('marc.dupont', 'marc.dupont@example.com', CURRENT_TIMESTAMP),
    ('emma.moreau', 'emma.moreau@example.com', CURRENT_TIMESTAMP),
    ('lucas.benoit', 'lucas.benoit@example.com', CURRENT_TIMESTAMP),
    ('lea.roche', 'lea.roche@example.com', CURRENT_TIMESTAMP),
    ('nicolas.fabre', 'nicolas.fabre@example.com', CURRENT_TIMESTAMP),
    ('elise.garnier', 'elise.garnier@example.com', CURRENT_TIMESTAMP);

INSERT INTO nursery (name, adress, city, post_code, nb_children_max, hourly, user_id)
VALUES
    ('Les Petits Loups', '12 rue des Lilas', 'Paris', 75012, 25, '8h - 18h', 2),
    ('Jardin d’Enfants Arc-en-Ciel', '45 avenue Victor Hugo', 'Lyon', 69003, 30, '7h30 - 18h30', 3),
    ('Crèche Les Coccinelles', '3 rue des Écoles', 'Marseille', 13008, 20, '8h - 17h30', 4),
    ('Les Chérubins', '27 boulevard Pasteur', 'Bordeaux', 33000, 28, '8h - 18h30', 5),
    ('Les P’tits Explorateurs', '10 rue Saint-Pierre', 'Toulouse', 31000, 22, '7h30 - 18h', 6),
    ('Crèche du Parc', '15 allée des Peupliers', 'Nantes', 44000, 18, '8h - 17h', 7),
    ('Les Mini Pousses', '9 rue du Moulin', 'Strasbourg', 67000, 24, '7h45 - 18h15', 8),
    ('Petite Étoile', '6 avenue de la Liberté', 'Nice', 06000, 20, '8h - 17h30', 9),
    ('Les Bambins Heureux', '18 rue de la Gare', 'Montpellier', 34000, 26, '8h - 18h', 10),
    ('Arcadia Kids', '55 rue Lafayette', 'Lille', 59000, 30, '7h30 - 18h30', 2);
