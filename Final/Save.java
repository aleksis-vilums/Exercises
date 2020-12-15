import java.util.Scanner;
import java.io.*;

public class Save {

    String fileName, name;
    Character[] party = {new Character(), new Character(), new Character(), new Character()};
    int partyIndex = 0;

    public Save(String fileName) throws IOException{ //construct
        this.fileName = fileName;
    }

    public void setName(String name){
        this.name = name;
    }

    public int typeStrToInt(String type){ // String type to Int in stats
        for(int i = 0; i < 5; i++){
            if(type.equals(Character.types[i])){
                return i;
            }
        }

        return -1;
    }

    public boolean fullType(int type){ // If the type is already full this checks
        if(type < 0 || type > 4){
            return true;
        }

        int[] num = new int[5];

        for (int i = 0; i < party.length; i++){
            if(party[i].getTypeNum() >= 0){
                num[party[i].getTypeNum()]++;
            }
        }

        if(num[type] >= 2){
            return true;
        }

        return false;
    }

    public Character getCharacterFromName(String charName){ //Gets character stats from name 
        for (int i = 0; i < party.length; i++){
            if (party[i].getName().equals(charName)){
                return party[i];
            }
        }

        return null;
    }

    public boolean addCharacter(Character c){ // Add character to game then in menu it writes to file
        if(partyIndex >= 4){
            return false;
        }

        party[partyIndex] = c;
        partyIndex++;
        return true;
    }

    public boolean readFile() throws IOException{ // reads file to check and validate
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        int index = 0;
        while(scanner.hasNextLine() && index <= 4){
            if(index > 0){
                if(!party[index-1].createFromLine(scanner.nextLine())){ //Character.java function
                    return false;
                }
            } else {
                name = scanner.nextLine();
            }

            index++;
        }

        scanner.close();
        return true;
    }

    public void writeSave() throws IOException{ //Saves to file (game.csv or game.txt)
        PrintWriter out = new PrintWriter(fileName);
        
        out.print(toString());

        out.close();
    }

    public String toString(){
        String str = "";

        str += name + "\n";
        for(int i = 0; i < party.length; i++){
            str += party[i] + "\n";
        }

        return str;
    }

}