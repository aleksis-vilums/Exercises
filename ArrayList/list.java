import java.util.*;

public class list {
    
    public static ArrayList<String> problem0(ArrayList<String> veggies, ArrayList<String> fruits){
        ArrayList<String> main = new ArrayList<String>();
        
        for (String veggie : veggies){
            main.add(veggie);
        }

        for (String fruit : fruits){
            main.add(fruit);
        }

        Collections.sort(main);
        
        return main;
    }

    public static ArrayList<String> problem1(ArrayList<String> fruits1, ArrayList<String> fruits2){
        ArrayList<String> main = new ArrayList<String>();

        for(String fruit : fruits1){
            if(fruits2.contains(fruit)){
                main.add(fruit);
            }
        }
        return main;

    }

    public static ArrayList<String> problem2(ArrayList<String> animals){
        for(int i = 0; i < animals.size(); i++){
            for(int x = i + 1; x < animals.size(); x++){
                if(animals.get(i).equals(animals.get(x))){
                    animals.remove(x);
                }
            }
        }
        return animals;
    }

    public static ArrayList<Integer> problem3(ArrayList<Integer> nums, int num){
        Collections.sort(nums);

        for(int i = 0; i < nums.size(); i++){
            if(num < nums.get(i)){
                nums.add(i, num);;
                i = nums.size();
            }
        }

        return nums;
    }

    public static ArrayList<Integer> problem4(ArrayList<Integer> nums){
        int back = nums.size() - 1;
        int half = nums.size()/2;
        
        for(int i = 0; i < half; i++){
            int temp = nums.get(back - i);
            nums.set(back - i, nums.get(i));
            nums.set(i, temp);
        }

        return nums;
    
    }

    public static ArrayList<Point> problem5(ArrayList<Float> nums){
        ArrayList<Point> points = new ArrayList<Point>();

        for (int i = 0; i < nums.size() - 1; i++){
            points.add(new Point(nums.get(i), nums.get(i + 1)));
        }
    
        return points;
    }

    public static ArrayList<Point> problem6(ArrayList<Point> nums){
        for (int i = 0; i < nums.size() - 1; i =  i + 2){
            float midx = (nums.get(i).getX() + nums.get(i + 1).getX())/2;
            float midy = (nums.get(i).getY() + nums.get(i + 1).getY())/2;
            nums.add(i + 1, new Point(midx, midy));
        }
    
        return nums;
    }

    public static ArrayList<Point> problem7(ArrayList<Point> nums){
        //distance to origin math.sqrt(x^2+y^2)

        for (int i = 0; i < nums.size() - 1; i++){
            for(int x = i; x < nums.size() - 1; x++){
                double dist1 = Math.sqrt((nums.get(i).getX()*nums.get(i).getX())+(nums.get(i).getY()*nums.get(i).getY()));
                double dist2 = Math.sqrt((nums.get(x + 1).getX()*nums.get(x + 1).getX())+(nums.get(x + 1).getY()*nums.get(x + 1).getY()));

                if(dist1 > dist2){
                    Point temp = nums.get(i);
                    nums.set(i, nums.get(x + 1));
                    nums.set(x + 1, temp);
                }
            }
        }
    
        return nums;
    }
    public static void main(String[] args) {
        ArrayList<String> veggies = new ArrayList<String>(Arrays.asList("Potato", "Carrot", "Lettuce", "Spinach", "Beets", "Corn", "Radish", "Tomato", "Chickpea", "Pea"));
        ArrayList<String> fruits1 = new ArrayList<String>(Arrays.asList("Apple", "Blueberry", "Pineapple", "Banana", "Strawberry", "Mango", "Grape", "Coconut", "Watermelon", "Kiwi"));
        ArrayList<String> fruits2 = new ArrayList<String>(Arrays.asList("Banana", "Strawberry", "Mango", "Blackberries", "Lemon", "Cherries", "Durian", "Watermelon", "Guava", "Lime"));
        ArrayList<String> animals = new ArrayList<String>(Arrays.asList("Dog", "Cat", "Horse", "Frog", "Cat", "Dolphin", "Whale", "Duck", "Monkey", "Dog", "Frog", "Monkey"));
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(3, 5, 2, 1, 3, 4, 6));
        ArrayList<Float> floatNum = new ArrayList<Float>(Arrays.asList(54.f, 3.f, 546.f, 234.f, 12.f, 34.f));
    
        // System.out.println(problem0(veggies, fruits1));

        // System.out.println(problem1(fruits1, fruits2));

        // System.out.println(problem2(animals));

        // System.out.println(problem3(nums, 4));

        // System.out.println(problem4(nums));

        // System.out.println(problem5(floatNum));

        ArrayList<Point> pointNum = problem5(floatNum);

        // System.out.println(problem6(pointNum));

        System.out.println(problem7(pointNum));
        
    }
}