import RPi.GPIO as GPIO
from signal import signal, SIGTERM, SIGHUP, pause
from smbus import SMBus
from gpiozero import PWMLED
import pygame
from typing import Callable

def safe_exit(signum, frame):
    pygame.quit()
    exit(1)

global bus
bus = SMBus(1)

def init():
    bus = SMBus(1)

    GPIO.setmode(GPIO.BCM)
    GPIO.setup(17, GPIO.IN)
    
    signal(SIGTERM, safe_exit)
    signal(SIGHUP, safe_exit)

def read_x():
    return read_joystick(7)

def read_y():
    return read_joystick(6)

def read_joystick(input: int):
    ads7830_commands = (0x84, 0xc4, 0x94, 0xd4, 0xa4, 0xe4, 0xb4, 0xf4)
    bus.write_byte(0x4b, ads7830_commands[input])
    return bus.read_byte(0x4b)

class Button:
    buttons = []	# static because Python is weird
    def __init__(self, pin: int, listener: Callable[[], None]):
        self.is_pressed = False
        self.pin = pin
        self.listener = listener
        Button.buttons.append(self)

def handle_buttons():
    for button in Button.buttons:
        is_pressed = GPIO.input(button.pin) == GPIO.LOW
        if is_pressed and not button.is_pressed:
            button.listener()
        button.is_pressed = is_pressed