public class Simulator {
    public static void main(String[] args) {
        SolarSys ss = new SolarSys();
        ss.addSun(new Sun(4859939,85849,0,0,"GIGANTO"));

        Planet p1 = new Planet(797,393,7,12,"Aqua",2,1);
        ss.addPlanet(p1);

        Planet p2 = new Planet(2002,5956,16,21,"Flamenco",2,1);
        ss.addPlanet(p2);

        ss.showPlanets();

        int timePeriod = 100;
        for(int i=0; i<timePeriod; i++) {
            ss.movePlanet();
            ss.showPlanets();
        }
    }
}
