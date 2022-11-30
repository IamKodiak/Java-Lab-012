public class Sun {
    private double radius;
    private double mass;
    private double x;
    private double y;
    private String name;

    public Sun(double radius, double mass, double x, double y, String name) {
        this.radius = radius;
        this.mass = mass;
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public double getX() {return this.x;}

    public double getY() {return this.y;}

    public double getMass() {return this.mass;}
}