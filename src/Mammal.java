public abstract class Mammal extends Animal {
    protected int Calories_milk;
    protected int Intmonths_pregnancy;

    public Mammal(int calories_milk,int intmonths_pregnancy, int Age,int Calories,String Name,boolean Top_predator) {
        super(Age,Calories,Name,Top_predator);
        this.Calories_milk = calories_milk;
        this.Intmonths_pregnancy = intmonths_pregnancy;
    }

    public void setCalories_milk(int calories_milk) {
        Calories_milk = calories_milk;
    }

    public void setIntmonths_pregnancy(int intmonths_pregnancy) {
        Intmonths_pregnancy = intmonths_pregnancy;
    }

    public int getIntmonths_pregnancy() {
        return Intmonths_pregnancy;
    }

    public int getCalories_milk() {
        return Calories_milk;

    }

    @Override
    public String toString() {
        return "Mammal{" +
                "Calories_milk=" + Calories_milk +
                ", Intmonths_pregnancy=" + Intmonths_pregnancy +
                '}';
    }
    public int Eat(){
        return super.Eat()+this.Calories_milk;
    }
}
