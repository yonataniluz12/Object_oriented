public class Cow extends Mammal{
    protected int birth;

    public Cow(int calories_milk, int intmonths_pregnancy,int birth, int Age,int Calories,String Name,boolean Top_predator) {
        super(calories_milk, intmonths_pregnancy,Age,Calories,Name,Top_predator);
        this.Calories_milk = calories_milk;
        this.Intmonths_pregnancy = intmonths_pregnancy;
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
    public int Eat(){
        return super.Eat()/4;
    }
}
