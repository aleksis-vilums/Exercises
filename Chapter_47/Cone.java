public class Cone {
    private double height, radius;

    public Cone(double height, double radius){
        this.height = height; //this = instance variable is on left and right is local
        this.radius = radius;
    }

    public double area() {
        return Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius));
    }

    public double volume(){
        return Math.PI*radius*height/3.0;
    }

    public void setHeight(double height){
        if (height >= 0){
            this.height = height;
        }
    }

    public void setRadius(double radius){
        if (radius >= 0){
            this.radius = radius;
        }
    }  

    public double getHeight(){
        return height;
    }

    public double getRadius(){
        return radius;
    }

    public double slantHeight(){
        return Math.sqrt(radius*radius+height*height);
    }

    public double angle(){
        return Math.atan(radius/height);
    }
}