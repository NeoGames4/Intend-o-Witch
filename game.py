from player import Player
from object import Object
from object import SolidObject

global player	# The main player (player.py)
global objects	# Chests, floating items and similar stuff (object.py)

player	= Player(0, 0)

objects	= [
	Object(30, 20, 7, (255, 100, 100)),
	Object(-40, -20, 10, (255, 100, 100)),
	SolidObject(0, 50, 7, (255, 255, 100), -1)
]