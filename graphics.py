import pygame
from game import *
import math

# Update GUI
def draw(screen):
    screen_width, screen_height = screen.get_size()

    # Background
    screen.fill((40, 160, 35))

    # The player's location on screen
    player_screen_x = screen_width/2
    player_screen_y = screen_height/2
    object_offset_x = player_screen_x - player.x
    object_offset_y = player_screen_y - player.y

    # Objects (relative to the player)
    closest_object = (None, 100000)
    for o in objects:
        distance = math.hypot(player.x - o.x, player.y - o.y)
        if distance < closest_object[1]:
            closest_object = (o, distance)
        pygame.draw.circle(screen, o.default_color, (o.x + object_offset_x, o.y + object_offset_y), o.radius, width = 0)
    
    closest = closest_object[0]
    
    if(closest != None):
        pygame.draw.circle(screen, (255, 255, 255), (closest.x + object_offset_x, closest.y + object_offset_y), closest.radius + 4, width = 2)

    # Player
    pygame.draw.circle(screen, (100, 80, 15), (player_screen_x, player_screen_y), player.radius, width = 0)

    # Update
    pygame.display.flip()