public class ArrayPractice{
    int[] data;
    
    public static void swapEnds(int[] data){
        int temp = data[0];
        data[0] = data[data.length - 1];
        data[data.length - 1] = temp;
    }

    public static boolean hasSeven(int[] data){
        for (int num : data){
            if (num == 7){
                return true;
            }
        }
        return false;
    }

    public static double mean(int[] data){
        int total = 0;

        for (int num : data){
            total += num;
        }
        double avg = total/data.length;
        return avg;
    }

    public static void reverse(int[] data){
        int otherEnd = data.length - 1;
        for (int num : data){
            num = data[otherEnd];
            otherEnd -= 1;
        }
    }

    // Constant Time
    // Linear Time
}
