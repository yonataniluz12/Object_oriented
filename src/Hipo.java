public class Hipo extends Mammal{
    private int fat;

    public Hipo(int fat ,int calories_milk,int intmonths_pregnancy, int Age,int Calories,String Name,boolean Top_predator)
    {
        super(calories_milk,intmonths_pregnancy,Age,Calories,Name,Top_predator);
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
