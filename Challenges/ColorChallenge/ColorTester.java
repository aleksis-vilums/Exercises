public class ColorTester {
	public static void main(String[] args){
		Color colorClass = new Color();
		
		System.out.println("Original: " + colorClass);
		
		colorClass.randomize();
		System.out.println("Random: " + colorClass);
	
		colorClass.setColor(24, 132, 234);
		System.out.println("Set to (24, 132, 234): " + colorClass);

		colorClass.setGreen(12);
		System.out.println("Green = 12: " + colorClass);

		colorClass.setBlue(45);
		System.out.println("Blue = 45: " + colorClass);

		colorClass.setRed(234);
		System.out.println("Red = 234: " + colorClass);

		colorClass.getColors();
		System.out.println("Before lighten: " + colorClass);

		colorClass.lighten(50.f);
		System.out.println("After lighten: " + colorClass);

		colorClass.darken(10.f);
		System.out.println("After darken: " + colorClass);
	
		Color otherColor = new Color();
		otherColor.setColor(24, 345, 56);
		
		System.out.println("Blend: " + colorClass.blend(otherColor));
		System.out.println("Get Red: " + colorClass.getRed());
		System.out.println("Get Green: " + colorClass.getGreen());
		System.out.println("Get Blue: " + colorClass.getBlue());
	}

}