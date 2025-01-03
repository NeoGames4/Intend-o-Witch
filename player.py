import input

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
        vx = input.read_x()
        vy = input.read_y()
        
        self.x += (vx - 128) // 4 / 32
        self.y += (vy - 128) // 4 / 32