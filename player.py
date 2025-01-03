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
        self.direction = 0
    
    def tick(self):
        vx = input.read_x()
        vy = input.read_y()

        velocity = math.hypot(vx, vy)
        
        if velocity > 1:
            vx /= velocity
            vy /= velocity

        vx = round(vx, 1)
        vy = round(vy, 1)

        self.direction = math.atan2(vx, vy)

        self.x += vx * 2
        self.y += vy * 2