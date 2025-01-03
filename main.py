from time import sleep
import pygame
from graphics import draw
from game import *
import input

pygame.init()
clock = pygame.time.Clock()
screen = pygame.display.set_mode((480, 320))

try:
    input.init()
    
    while True:
        clock.tick(60)
        
        player.tick()
        
        input.handle_buttons()
        
        draw(screen)
    
except KeyboardInterrupt:
    pass
finally:
    pygame.quit()