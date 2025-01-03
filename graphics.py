import pygame
from game import *

# Update GUI
def draw(screen):
    # Background
    screen.fill((40, 160, 35))

    # The player's location on screen
    player_pos_x = screen.width/2
    player_pos_y = screen.height/2

    # Objects (relative to the player)
    for o in objects:
        pygame.draw.circle(screen, o.default_color, (o.x - player_pos_x, o.y - player_pos_y), o.radius, width = 0)

    # Player
    pygame.draw.circle(screen, (100, 80, 15), (player_pos_x, player_pos_y), player.radius, width = 0)

    # Update
    pygame.display.flip()