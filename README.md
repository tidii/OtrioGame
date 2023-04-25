# OtrioGame
Projet d'informatique S1 INSA Strasbourg
Réalisé en équipe avec Jimmy Niyonkuru et Arthur Burger
<programmé entièrement sur Geany et uploadé via NetBeans 4 Mois après>

Premier projet d'informatique pour ma part,
apprentissage complet de la programmation et de java pour ce projet (boucles logiques, instantiation, variables, méthodes, tableaux etc).
AUCUNE notion de programmation orientée objet n'a été vu pour ce projet, ce qui explique le bazar.
Les classes ont été créées uniquement en fin de projet pour donner une certaine structure, en s'inspirant de la classe Lire (voir notes) (les classes n'avaient pas été vu en cours, tout le programme était dans un seul dossier à l'origine excepté Lire()).
l'affichage n'était pas obligatoire, notions très bancales de JPanel/JFrame découvertes sur internet pour ce projet.

PRINCIPE :
  Le programme repose entièrement sur une matrice 3D d'entiers représentant le plateau de jeu d'Otrio. Les deux premières dimensions représentent le "plan" de jeu (3x3), tandis que la 3ème dimension représente la taille des cercles (petit, moyen ou grand).
  La matrice est remplie de 0 au début, un nombre sera assigné à chaque joueur en fonction de leurs sens de jeu. Quand un joueur choisit une case où jouer (matrice 2D) et une taille de cercle (3ème dimension) le nombre correspondant sera placé dans la case en question.

NOTES :
  toutes les actions se font depuis la console
  Le "BOT" fait des coups aléatoires
  Le code est mal rangé à cause de la transition de Geany vers NetBeans, mais des annotations ont été faites dans tout le code (à la demande des professeurs)
  La classe Lire à été fourni par les professeurs
