public class Calf extends Cow {
    private boolean dead;



    public Calf( boolean dead,int calories_milk, int intmonths_pregnancy,int birth, int Age,int Calories,String Name,boolean Top_predator) {
        super(birth,calories_milk, intmonths_pregnancy,Age,Calories,Name,Top_predator);
        this.birth = birth;
        this.dead = dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public boolean isDead() {
        return dead;
    }

    @Override
    public String toString() {
        return "Calf{" +
                "dead=" + dead +
                '}';
    }
}
