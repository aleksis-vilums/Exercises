import java.util.Random;

public class Color {
	
	int colors[] = new int[3];// variables array use index to change indvisual

	// Start constructor
	Color(){
		randomize();
	}
	
	public void randomize(){
		Random random = new Random();

		for (int i = 0; i < 3; i++){
			colors[i] = random.nextInt(256);
		}

	}
	
	Color(int r, int g, int b){
		setColor(r, g, b);
	}

	// set colors on large scale
	public void setColor(int r, int g, int b){
		colors[0] = r;
		colors[1] = g;
		colors[2] = b;

		rules();
	}

	// set any of the r, g, b values indivisually refers to the up top method
	public void setRed(int r){
		setColor(r, colors[1], colors[2]);
	}

	public void setGreen(int g){
		setColor(colors[0], g, colors[2]);
	}

	public void setBlue(int b){
		setColor(colors[0], colors[1], b);
	}
	
	//lighten/darken the colors 
	public void lighten(double percent){
		for (int i = 0; i < 3; i++){
			colors[i] *= 1.f + (percent/100);
		}

		rules();
	}

	public void darken(double percent){
		lighten(percent * -1);
	}
	
	//blend by getting old color and adding them to new colors then returning that value
	public Color blend(Color otherColor){
		int[] newColors = otherColor.getColors();

		for (int i = 0; i < 3; i++){
			newColors[i] = (newColors[i] + colors[i])/2; // average
		}

		return new Color(newColors[0], newColors[1], newColors[2]);	
	}


	// get values of (r, g, b)
	public int[] getColors(){
		return colors;
	}

	public int getRed(){
		return getColors()[0];
	}
	
	public int getGreen(){
		return getColors()[1];
	}

	public int getBlue(){
		return getColors()[2];
	}
	
	// format and rules to (r, g, b) and returns the (r, g, b) values
	public String toString(){
		String value = new String("(" + colors[0] + ", " + colors[1] + ", " + colors[2] + ")");
		
		return value;
	}

	private void rules(){
		for (int i = 0; i < 3; i++){
			if(colors[i] > 255){
				colors[i] = 255;
			} else if (colors[i] < 0){
				colors[i] = 0;
			}
		}
	}

}