package quessNumber;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public  void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;
        boolean p1Right = false;
        boolean p2Right = false;
        boolean p3Right = false;
        int targetNumber = (int)(Math.random()*10);

        System.out.println("Я загадал число: " +targetNumber);
        while (true){
            p1.guess();
            p2.guess();
            p3.guess();

            guessP1=p1.number;
            guessP2=p2.number;
            guessP3=p3.number;

            System.out.println("PLayer 1 thinks that: "+ guessP1);
            System.out.println("PLayer 2 thinks that: "+ guessP2);
            System.out.println("PLayer 3 thinks that: "+ guessP3);

            if (guessP1==targetNumber){
                p1Right=true;
            }
            if(guessP2==targetNumber){
                p2Right=true;
            }
            if(guessP3==targetNumber){
                p3Right=true;
            }

            if (p1Right||p2Right||p3Right){
                System.out.println("winner is player:");
                System.out.println("player1 is "+p1Right);
                System.out.println("player2 is "+p2Right);
                System.out.println("player3 is "+p3Right);
                break;
            }else{System.out.println("try now pls");}

        }
    }
}
