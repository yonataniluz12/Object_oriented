public class Crocodile extends Reptile {
    private boolean Crocodile;

    public Crocodile(boolean crocodile,int age, int calories, String name, boolean top_predator,int Tail_length) {
        super(age, calories, name, top_predator,Tail_length);
        Crocodile = crocodile;
    }

    public void setCrocodile(boolean crocodile) {
        Crocodile = crocodile;
    }

    public boolean isCrocodile() {
        return Crocodile;
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "Crocodile=" + Crocodile +
                '}';
    }
    @Override
    public int Eat(){
        return this.Calories * 4;
    }
}
