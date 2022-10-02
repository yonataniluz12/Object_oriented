public class Snake extends Reptile{
    private boolean poisonous;

    public Snake(boolean poisonous) {
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
}
