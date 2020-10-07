import java.util.Random;
import java.util.Scanner;

public class SnakeEyes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.print("How many times? ");
        int n = scanner.nextInt();

        int max = 6, i = 0, score = 0, rolls = 0, four = 0, totalrolls = 0;

        while (i < n){
            int dice1 = randomGenerator.nextInt(max) + 1;
            int dice2 = randomGenerator.nextInt(max) + 1;

            while (dice1 + dice2 != 2){
                score += dice1 + dice2;
                rolls += 1;
                dice1 = randomGenerator.nextInt(max) + 1;
                dice2 = randomGenerator.nextInt(max) + 1;
            }

            totalrolls += rolls;

            if (rolls >= 4){
                four += 1;
            }

            rolls = 0;
            i += 1;
        }

        double avrgRolls = (double) totalrolls/n;
        double avrgScore = (double) score/n;
        double percent = ( (double) four/ (double) n)*100.f;

        System.out.println("Average Rolls: " + avrgRolls);
        System.out.println("Average Score: " + avrgScore);
        System.out.println("Percentage of players with more than 4 rolls: " + percent);

    }
}