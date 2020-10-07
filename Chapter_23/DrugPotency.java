public class DrugPotency {
	public static void main(String[] args){
        int month = 0;
        float effectiveness = 100.f;
        
        while (effectiveness >= 50){
            System.out.print("Month: " + month + "   ");

            effectiveness -= effectiveness*(4/100.f);
            System.out.println("Effectiveness: " + effectiveness);

            month += 1;
        }
	}	
}