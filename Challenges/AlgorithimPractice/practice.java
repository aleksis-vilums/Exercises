public class practice{
    public static int search(int[] haystack, int needle){
        for (int i = 0; i <= haystack.length - 1; i++){
            if (haystack[i] == needle){
                return i;
            }
        }
        return -1;
    }

    public static void swap(int[] data){
        int temp = 0;
        int n = 0;

        for(int x = 0; x <= n; x++){
            for (int i = 0; i <= data.length - 2; i++){
                if (data[i] >= data[i + 1]){
                    temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    n++;
                }
            }
        }
    }

    public static void selectionSort(int[] data){
        int location = 0;

        for(int i = 0; i < data.length; i++){
            int minimum = data[i];
            for (int x = i; x < data.length; x++){
                if (minimum >= data[x]){
                    minimum = data[x];
                    location = x;
                }
            }
    
            int temp = data[i];
            data[i] = minimum;
            data[location] = temp;
        }

    }

    public static void insertionSort(int[] data){  
        for(int x = 0; x < data.length; x++){
            for (int i = x; i > 0; i--){
                if (data[i] <= data[i - 1]){
                    int temp = data[i];
                    data[i] = data[i - 1];
                    data[i - 1] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] data){
        for (int x = 0; x < data.length - 1; x++){
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] >= data[i + 1]) { 
                    int temp = data[i]; 
                    data[i] = data[i + 1]; 
                    data[i + 1] = temp; 
                } 
            }
        }
    }
}