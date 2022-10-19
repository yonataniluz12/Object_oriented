public class Eagle extends Bird {
    private int sight_distance;


    public Eagle(int sight_distance,int wingspan,int flight_altitude, int Age,int Calories,String Name,boolean Top_predator) {
        super(wingspan,flight_altitude,Age,Calories,Name,Top_predator);
        this.sight_distance = sight_distance;
    }

    public void setSight_distance(int sight_distance) {
        this.sight_distance = sight_distance;
    }

    public int getSight_distance() {
        return sight_distance;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "sight_distance=" + sight_distance +
                '}';
    }
}
