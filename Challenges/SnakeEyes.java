import java.util.Random;
import java.util.Scanner;

public class SnakeEyes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        System.out.print("How many times? ");
        int n = scanner.nextInt();

        int max = 6, i = 0, score = 0, rolls = 0;

        while (i <= n){
            int dice1 = randomGenerator.nextInt(max);
            int dice2 = randomGenerator.nextInt(max);

            while (dice1 != dice2){
                score += dice1 + dice2;
                rolls += 1;
                i += 1;
                dice1 = randomGenerator.nextInt(max);
                dice2 = randomGenerator.nextInt(max);
            }
        }

        int four = 0;

        if (rolls > 4){
            four += 1;
        }

        int avrgRolls = rolls/n;
        int avrgScore = score/n;
        float percent = 100.f * (four/n);

        System.out.println("Average Rolls: " + avrgRolls);
        System.out.println("Average Score: " + avrgScore);
        System.out.println("Percentage Of player with more than 4 rolls: " + percent);

    }
}