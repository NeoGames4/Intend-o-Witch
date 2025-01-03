class Player:
    def __init__(self, x, y):
        # Position
        self.x = x
        self.y = y
        self.width = 10
        self.height = 10
        # Game status
        self.health = 10
        self.inventory = []