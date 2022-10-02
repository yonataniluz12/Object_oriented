public class Animal {
    private String Name;
    private int Age;
    private int Calories;
    private boolean Top_predator;

    public void Animal(String Name,int Age,int Calories,boolean Top_predator){
        this.Age = Age;
        this.Top_predator = Top_predator;
        this.Calories = Calories;
        this.Name = Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setCalories(int calories) {
        Calories = calories;
    }

    public void setTop_predator(boolean top_predator) {
        Top_predator = top_predator;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getCalories() {
        return Calories;
    }

    public boolean isTop_predator() {
        return Top_predator;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Calories=" + Calories +
                ", Top_predator=" + Top_predator +
                '}';
    }
}

