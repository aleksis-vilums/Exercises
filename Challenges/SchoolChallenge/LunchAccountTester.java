public class LunchAccountTester {
    public static void main(String[] args){
        LunchAccount StudentA = new LunchAccount("John", 2390, 20);
        LunchAccount StudentB = new LunchAccount("Iridian", 2134, 0);

        System.out.println(StudentA); //40
        System.out.println(StudentB); //20

        StudentA.addBalance(32);
        StudentB.addBalance(100);

        System.out.println(StudentA.getbalance());//72
        System.out.println(StudentB.getbalance());//120

        StudentA.addBalance(1);
        StudentA.addBalance(100);

        System.out.println(StudentA.getbalance() + "\n");//173

        StudentA.buying(32);

        System.out.println(StudentA);//141

        System.out.println(StudentA.getLunchBought());//1

        System.out.println(StudentA.getTotalSpent());//32

        StudentA.buying(200);

        System.out.println("\n" + StudentA);//141 because not enough in balance

    }

}