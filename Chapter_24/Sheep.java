public class Sheep {
	public static void main(String[] args){
        double n = 0;
        double t = 0;
        for (double i = 0; i <= 25; i++){
            n = 220.f/(1.f + 10.f*(Math.pow(0.83, (t + i))));
            if (n >= 80){
                System.out.println(t+i);
                return;
            }
        }
	}	
}