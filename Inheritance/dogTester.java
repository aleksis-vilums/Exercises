public class dogTester{
    public static void main(String[] args) {
        dog dog1 = new dog("John", "Husky", 3);
        System.out.println(dog1.isHappy());
        dog1.sleep();
        System.out.println(dog1.hasSlept());
        dog1.eat();
        System.out.println(dog1.hasEaten());
        dog1.play();
        System.out.println(dog1.hasPlayed());
        System.out.println(dog1.isHappy());

        System.out.println(dog1.bark());

    }
}