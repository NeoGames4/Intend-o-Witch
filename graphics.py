import pygame
from main import read_ads7830
from main import screen

def draw():
    pygame.draw.circle(screen, "green", (read_ads7830(7), read_ads7830(6)), 10)