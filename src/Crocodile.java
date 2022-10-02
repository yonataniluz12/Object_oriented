public class Crocodile extends Reptile {
    private boolean Crocodile;

    public Crocodile(boolean crocodile) {
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
}
