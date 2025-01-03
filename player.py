import input
import math

class Player:
    def __init__(self, x, y):
        # Position
        self.x = x
        self.y = y
        self.radius = 10
        # Game status
        self.health = 10
        self.inventory = []
    
    def tick(self):
        joystick_x = input.read_x()
        joystick_y = input.read_y()

        velocity = max(1, math.sqrt((joystick_x**2) + (joystick_y**2)))

        print('Joystick x: ', joystick_x, ', joystick y: ', joystick_y, ', total_v: ', velocity)

        direction = math.atan(joystick_x/joystick_y)

        vx = math.sin(direction) * velocity * 4
        vy = math.cos(direction) * velocity * 4
        
        self.x += vx
        self.y += vy