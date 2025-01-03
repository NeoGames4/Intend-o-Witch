from time import sleep
import pygame
from graphics import draw
from game import *
import input

pygame.init()
clock = pygame.time.Clock()
screen = pygame.display.set_mode((480, 320))

input.Button(17, lambda: print("Punch"))

try:
    input.init()
    
    while True:
        clock.tick(60)
        
        vx = input.read_x()
        vy = input.read_y()
        
        player.x += (vx - 128) // 4 / 32
        player.y += (vy - 128) // 4 / 32
        
        input.handle_buttons()
        
        draw(screen)
    
except KeyboardInterrupt:
    pass
finally:
    pygame.quit()