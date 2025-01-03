import pygame
from game import *

# Update GUI
def draw(screen):
    screen_width, screen_height = screen.get_size()

    # Background
    screen.fill((40, 160, 35))

    # The player's location on screen
    player_screen_x = screen_width/2
    player_screen_y = screen_height/2

    # Objects (relative to the player)
    for o in objects:
        pygame.draw.circle(screen, o.default_color, (o.x - player.x + player_screen_x, o.y - player.y + player_screen_y), o.radius, width = 0)

    # Player
    pygame.draw.circle(screen, (100, 80, 15), (player_pos_x, player_pos_y), player.radius, width = 0)

    # Update
    pygame.display.flip()