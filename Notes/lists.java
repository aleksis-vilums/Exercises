import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lists{
    public static void main(String[] args) {
        //Array list
        ArrayList<String> list = new ArrayList<String>();

        list.add("apples"); //  array[0] = apple

        list.get(2);

        list.set(1, "pineapple");

        list.size();

        // list.remove("blueberry");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for(String s : list){
            System.out.println(s);
        }

        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(Integer.valueOf(3));

        int x = nums.get(0).intValue() + 1;

        // ArrayList<String> fruits = Arrays.asList("apple", "blueberry");

        Collections.sort(list);
    }
}