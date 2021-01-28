import java.util.Random;

public class Game {
    private String nameGame, nameCharacter = "", type;
    private String character[] = new String[4];
    private int stats[] = new int[5];

    Game(String nameGame){
        this.nameGame = nameGame;
    }

    public String createCharacter(String character[], String nameCharacter, String type){
        Random random = new Random();
        this.nameCharacter = nameCharacter;

        for (int i = 0; i <= 5; i++)
            if (type.equals("Knight")){
                stats[0] = random.nextInt(4) + 7;
                stats[i] = random.nextInt(7);
            }
    }

    public String toString(){
        String character = nameCharacter + ", " + ;
        return character;
    }

}