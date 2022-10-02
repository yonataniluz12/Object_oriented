public class Hipo extends Mammal{
    private int fat;

    public Hipo(int fat) {
        this.fat = fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getFat() {
        return fat;
    }

    @Override
    public String toString() {
        return "Hipo{" +
                "fat=" + fat +
                '}';
    }
}
