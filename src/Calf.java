public class Calf extends Cow {
    private boolean dead;

    public Calf(int birth) {
        super(birth);
    }

    public Calf(int birth, boolean dead) {
        super(birth);
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
