public class Bird extends Animal{
    private int flight_altitude;
    private int wingspan;

    public Bird(int wingspan,int flight_altitude, int Age,int Calories,String Name,boolean Top_predator){
        super(Age,Calories,Name,Top_predator);
        this.wingspan = wingspan;
        this.flight_altitude = flight_altitude;
    }

    public void setFlight_altitude(int flight_altitude) {
        this.flight_altitude = flight_altitude;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getFlight_altitude() {
        return flight_altitude;
    }

    public int getWingspan() {
        return wingspan;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "flight_altitude=" + flight_altitude +
                ", wingspan=" + wingspan +
                '}';
    }
    @Override
    public int Eat(){
        return this.Calories*3-1000;
    }
    public static String sing(){
        return "chif chif";
    }
    public static void Dance(){
        System.out.println("guru guru");
    }
}
