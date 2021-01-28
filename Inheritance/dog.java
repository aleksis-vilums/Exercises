
public class dog{
    private String name;
    private String breed;
    private int age;
    private Boolean eaten = false, played = false, slept = false;

    dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void eat(){
        eaten = true;
    }

    public void play(){
        played = true;
    }

    public void sleep(){
        slept = true;
    }

    public String bark(){
        String bark = "Bark";
        return bark;
    }

    public Boolean hasEaten(){
        return eaten;
    }

    public Boolean hasPlayed(){
        return played;
    }

    public Boolean hasSlept(){
        return slept;
    }

    public Boolean isHappy(){
        if(eaten || played || slept){
            return true;
        }

        return false;
    }
}