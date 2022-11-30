public class Planet {
    private double radius;
    private double mass;
    private double x;
    private double y;
    private String name;
    private double veloX;
    private double veloY;

    public double getX() {return this.x;}

    public double getY() {return this.y;}

    public double getMass() {return this.mass;}

    public double getVeloX() {return this.veloX;}

    public double getVeloY() {return this.veloY;}

    public void setVeloX(double newVeloX) {
        this.veloX = newVeloX;
    }

    public void setVeloY(double newVeloY) {
        this.veloY = newVeloY;
    }

    public void move(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    public String toString() {
        return String.format("%s's x:%f%n%s's y:%f",this.name,this.x,this.name,this.y);
    }

    public Planet(double radius,double mass, double x, double y, String name, double veloX, double veloY) {
        this.radius = radius;
        this.mass = mass;
        this.x = x;
        this.y = y;
        this.name = name;
        this.veloX = veloX;
        this.veloY = veloY;
    }
}
