import java.util.ArrayList;
public class park {
    private Animal [] animal = new Animal[1000];
    private int NumOfanimal;

    public park(){
        NumOfanimal = 0 ;
    }
    public void add_animals(Animal animals){
        animal[NumOfanimal] = animals;
        NumOfanimal++;
    }
    public ArrayList<Animal> getList(){
        ArrayList<Animal>
        list = new ArrayList<Animal>();
        for(int i = 0; i< NumOfanimal; i++){
            if(animal[i].getAge() > 10 && animal[i].getTop_predator()){
                list.add(animal[i]);
            }
        }
        return list;
    }
    public int Predatory_bird(){
        int num = 0;
        for(int i = 0; i< NumOfanimal; i++){
            if(animal[i] instanceof Reptile || animal[i] instanceof Bird){
                if(animal[i].getTop_predator()){
                    num++;
                }
            }
        }
        return num;
    }
}