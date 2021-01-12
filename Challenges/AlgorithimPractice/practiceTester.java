public class practiceTester{
    public static void main(String[] args){
        int[] haystack = {1, 4, 4, 2, 3};
        System.out.println(practice.search(haystack, 5)); // -1
        System.out.println(practice.search(haystack, 4)); // 1

        int[] data = {4, 2, 6, 1, 9};

        // practice.swap(data);
        // for (int i = 0; i <= data.length - 1; i++){
        //     System.out.print(data[i]);
        // }

        // practice.selectionSort(data);
        // for (int num : data){
        //     System.out.print(num);
        // }

        practice.insertionSort(data);
        for (int num : data){
            System.out.print(num);
        }

        // practice.bubbleSort(data);
        // for (int num : data){
        //     System.out.print(num);
        // }
    }
}