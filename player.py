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
    
    def tick():
        vx = input.read_x()
        vy = input.read_y()
        
        x += (vx - 128) // 4 / 32
        y += (vy - 128) // 4 / 32