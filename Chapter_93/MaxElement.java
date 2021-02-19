public class MaxElement {
    public static void main(String[] args) {
        int[] testArray = {4, 3, 8, 65, 12, 32};
        System.out.println(max(testArray));
    }

    public static int max(int[] array, int index){
        //one base case, and two recursive
        if (index >= array.length){
            return 0;
        } else if (array[index] >= max(array, index+1)){
            return array[index];
        } else {
            return max(array, index + 1);
        }
    }

    
    public static int max(int[] array){
        return max(array, 0);
    }
}