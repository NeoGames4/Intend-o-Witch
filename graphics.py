import pygame
from game import *

# Update GUI
def draw(screen):
    # Background
    pygame.fill((80, 190, 90))

    # Objects
    for i, o in enumerate(objects):
        pygame.draw.rect(screen, o.default_color, (o.x, o.y, o.width, o.height), width = 0)

    # Player
    pygame.draw.ellipse(screen, (100, 80, 15), (screen.width/2 - player.width/2, screen.height/2 - player.height/2, player.width, player.height), width = 0)

    # Update
    pygame.display.flip()