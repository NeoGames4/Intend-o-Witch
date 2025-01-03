import RPi.GPIO as GPIO
from signal import signal, SIGTERM, SIGHUP, pause
from smbus import SMBus
from gpiozero import PWMLED
from time import sleep
import pygame
from graphics import draw

bus = SMBus(1)
ads7830_commands = (0x84, 0xc4, 0x94, 0xd4, 0xa4, 0xe4, 0xb4, 0xf4)

def safe_exit(signum, frame):
    pygame.quit()
    exit(1)

def read_ads7830(input):
    bus.write_byte(0x4b, ads7830_commands[input])
    return bus.read_byte(0x4b)

pygame.init()
screen = pygame.display.set_mode((480, 320))


try:
    signal(SIGTERM, safe_exit)
    signal(SIGHUP, safe_exit)
    
    while True:
        
        
        screen.fill((255, 0, 0))
        
        
        draw()
        
        
        pygame.display.flip()
    
except KeyboardInterrupt:
    pass
finally:
    pygame.quit()