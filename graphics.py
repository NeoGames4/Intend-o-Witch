import pygame
from game import *

def draw(screen):
    pygame.draw.circle(screen, "green", (player.x, player.y), 10)