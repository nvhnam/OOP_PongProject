# OOP_PongProject
NGUYEN VIET HOANG NAM_ITITIU19162\
HUYNH DUC PHAT_ITITIU1917

Our project has 7 classes in this Pong game:

* __Game.java:__ It contains all the game objects and uses seperated thread to update the game physics. This class extends Canvas to draw and implements Runnable to run the game loop.
* __Window.java:__ It has JFrame and adds the Game Canvas to it.
* __Ball.java:__ Properties for the ball to bounce.
* __Paddle.java:__ Properties for 2 paddles to move and properties for the Game score.
* __KeyInput.java:__ It contains the commands to make both paddles moving.
* __MainMenu.java:__ It displays the "Play" or "Quit" at the start of the game.
* __Test.java:__ It will run the Game.
