public abstract class Reptile extends Animal {
    protected int Tail_length;

    public Reptile(int age, int calories, String name, boolean top_predator,int Tail_length) {
        super(age, calories, name, top_predator);
        this.Tail_length = Tail_length;
    }

    public void Reptile(int tail_length){
        this.Tail_length = tail_length;
    }
    public void setTail_length(int tail_length) {
        Tail_length = tail_length;
    }

    public int getTail_length() {
        return Tail_length;
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "Tail_length=" + Tail_length +
                '}';
    }
}
