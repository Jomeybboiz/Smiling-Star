public class Star {
    public static void main(String[] args) 

    {

        Turtle bob = new Turtle();
        
        bob.penColor("orange");
        
        for(int i = 0; i < 5; i++){
            bob.left(72.25);
            bob.forward(100);
            bob.right(144);
            bob.forward(100);
        }


        bob.up();
        bob.right(80);
        bob.forward(25);
        bob.down();
        
        for(int i = 0; i < 36; i++){
            bob.right(10);
            bob.forward(1);
        }

        bob.up();
        bob.left(80);
        bob.forward(50);
        bob.down();

        for(int i = 0; i < 36; i++){
            bob.left(10);
            bob.forward(1);
        }

        bob.up();
        bob.right(140);
        bob.forward(40);

        bob.left(90);
        bob.down();
        for(int i = 0; i < 9; i++){
            bob.forward(2);
            bob.right(2);
        }

        bob.right(225);
        for(int i = 0; i < 9; i++){
            bob.forward(2);
            bob.left(2);
        }

        bob.up();
        bob.forward(250);
    }
}
