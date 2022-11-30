import java.util.ArrayList;

public class SolarSys {
    private Sun sun;
    private ArrayList<Planet> planets;

    public SolarSys() {
        planets = new ArrayList<>();
    }

    public void addPlanet(Planet p) {planets.add(p);}

    public void addSun(Sun s) {this.sun = s;}

    public void movePlanet() {
        double G = 0.1;
        double dt = 0.001;

        for(Planet p : this.planets) {
            p.move(
                    p.getX() + dt * p.getVeloX(),
                    p.getY() + dt * p.getVeloY()
            );

            double rx = this.sun.getX() - p.getX();
            double ry = this.sun.getY() - p.getY();
            double r = Math.sqrt(Math.pow(rx,2) + Math.pow(ry,2));

            double accX = G * this.sun.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.sun.getMass() * ry / Math.pow(r, 3);

            p.setVeloX(p.getVeloX() + dt * accX);
            p.setVeloY(p.getVeloY() + dt * accY);
        }
    }

    public void showPlanets() {
        for(Planet p : this.planets) {
            System.out.println(p);
        }
    }

    /*
    Sun bigBoi = new Sun(695700,10,0,0,"Big Boi");
    Planet Earth = new Planet(6378,1,0,0,"Earth",0,0);
     */
}
