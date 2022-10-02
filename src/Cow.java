public class Cow extends Mammal{
    private int birth;

    public Cow(int birth) {
        this.birth = birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "birth=" + birth +
                '}';
    }
}
