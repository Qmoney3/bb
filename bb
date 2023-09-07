import pygame
import random

# Initialisation de Pygame
pygame.init()

# Définition des couleurs
noir = (0, 0, 0)
jaune = (255, 255, 0)

# Configuration de la fenêtre du jeu
largeur, hauteur = 800, 600
fenetre = pygame.display.set_mode((largeur, hauteur))
pygame.display.set_caption("Pac-Man")

# Position initiale de Pac-Man
pacman_x = 400
pacman_y = 300

# Boucle principale du jeu
jeu_en_cours = True
while jeu_en_cours:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            jeu_en_cours = False

    # Déplacement de Pac-Man
    touches = pygame.key.get_pressed()
    if touches[pygame.K_LEFT]:
        pacman_x -= 5
    if touches[pygame.K_RIGHT]:
        pacman_x += 5
    if touches[pygame.K_UP]:
        pacman_y -= 5
    if touches[pygame.K_DOWN]:
        pacman_y += 5

    # Effacer l'écran
    fenetre.fill(noir)

    # Dessiner Pac-Man
    pygame.draw.circle(fenetre, jaune, (pacman_x, pacman_y), 20)
    pygame.draw.polygon(fenetre, noir, [(pacman_x, pacman_y), (pacman_x + 20, pacman_y + 10), (pacman_x + 20, pacman_y - 10)])

    # Rafraîchir l'affichage
    pygame.display.flip()

# Quitter Pygame
pygame.quit()
