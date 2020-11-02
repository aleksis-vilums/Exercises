public class ColorTester {
	public static void main(String[] args){
        Color colorClass = new Color();
        
        System.out.println(colorClass);
        
		colorClass.randomColor();
    	System.out.println(colorClass);
    
        colorClass.setColor(24, 132, 234);
        System.out.println(colorClass);

		colorClass.setG(12);
		System.out.println(colorClass);

		colorClass.lighten(50.f);
		System.out.println(colorClass);

		colorClass.darken(10.f);
		System.out.println(colorClass);
	
		Color otherColor = new Color();
		otherColor.setColor(24, 345, 56);
		
		System.out.println(colorClass.blendColor(otherColor));
		System.out.println(colorClass.getRed());
    }

}