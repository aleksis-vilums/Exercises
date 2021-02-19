public class Sum {
    public static void main(String[] args) {
        int[] testArray = {3, 4, 5, 2, 1}; //15
        System.out.println(sum(testArray, 0)); //15
        System.out.println(sum(testArray, 1)); //12
        System.out.println(sum(testArray, 2)); //8
        System.out.println(sum(testArray)); //15
        

    }


    public static int sum(int[] array, int index){
        if (array.length == index){
            return 0;
        } else {// index < array.length
            return array[index] + sum(array, index + 1);
        }
    }

    public static int sum(int[] array){
        return sum(array, 0);
    }
}