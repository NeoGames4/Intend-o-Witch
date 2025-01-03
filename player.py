class Player:
    def __init__(self, x, y):
        # Position
        self.x = x
        self.y = y
        self.radius = 10
        # Game status
        self.health = 10
        self.inventory = []