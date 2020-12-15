import java.util.Scanner;
import java.io.*;

public class Menu {

    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        System.out.println("Menu: \n1. Create New Game\n2. Validate a save file\n3. Reroll/Randomize an existing character\n4. Quit");
        int option = scan.nextInt();
        scan.nextLine();

        while (option != 4){
            if (option == 1){
                System.out.println("Name of new game?");
                String nameGame = scan.nextLine();
                System.out.println("File?");
                String nameFile = scan.nextLine();

                Save newGame = new Save(nameFile);
                newGame.setName(nameGame);

                for (int i = 0; i < 4; i++){
                    System.out.println("Type?");
                    String type = scan.nextLine();
                    Boolean fullType = newGame.fullType(newGame.typeStrToInt(type));

                    while (fullType){
                        System.out.println("Sorry there are already 2 of the same type. Choose a different type.");
                        type = scan.nextLine();
                        System.out.println(newGame.typeStrToInt(type));
                        fullType = newGame.fullType(newGame.typeStrToInt(type));
                    }

                    Character character = new Character("", newGame.typeStrToInt(type));
                    System.out.println(character + "\nAccept press 1 or Decline press 2");
                    int acceptDecline = scan.nextInt();
                    scan.nextLine();

                    while (acceptDecline != 1){
                        System.out.println("Type?");
                        type = scan.nextLine();
                        character = new Character("", newGame.typeStrToInt(type));
                        System.out.println(character + "\nAccept press 1 or Decline press 2");
                        acceptDecline = scan.nextInt();
                        scan.nextLine();
                    }

                    System.out.println("Name?");
                    String name = scan.nextLine();
                    character.setName(name);

                    newGame.addCharacter(character);
                }

                newGame.writeSave();

            } else if (option == 2){
                System.out.println("Which file to validate?");
                String file = scan.nextLine();

                Save validate = new Save(file);
                if (validate.readFile()){
                    System.out.println("Looks good");
                } else {
                    System.out.println("Looks bad not proper");
                }

            } else if (option == 3){
                System.out.println("File?");
                String nameFile = scan.nextLine();
                System.out.println("Name to Reroll?");
                String characterName = scan.nextLine();

                Save game = new Save(nameFile);// testing savegame.txt usually nameFile variable tho
                game.readFile();
                Character character = game.getCharacterFromName(characterName);
                character.setSave(game);
                character.randomize(-1);

                game.writeSave();
            }

            System.out.println("Menu: \n1. Create New Game\n2. Validate a save file\n3. Reroll/Randomize an existing character\n4. Quit");
            option = scan.nextInt();
            scan.nextLine();
        }

    }

}