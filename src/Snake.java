public class Snake extends Reptile{
    private boolean poisonous;

    public Snake(boolean poisonous,int age, int calories, String name, boolean top_predator,int Tail_length) {
        super(age, calories, name, top_predator,Tail_length);
        this.poisonous = poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "poisonous=" + poisonous +
                '}';
    }
    public static void Dance(){
        System.out.println("kshshshsh");
    }
}
