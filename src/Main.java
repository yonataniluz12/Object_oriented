public class Main {
    public static double calo(Animal [] animals)
    {
        double sumOFcalo = 0;
        for(int i = 0; i< animals.length;i++)
        {
            sumOFcalo += animals[i].getCalories();
        }
        return sumOFcalo;
    }
    public static void singsong(Animal [] animals)
    {
        for(int i =0;i< animals.length;i++)
        {
            if( animals[i] instanceof Bird){
                System.out.println(Bird.sing());
            }
        }
    }
    public static void danceing(Animal [] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Bird || animals[i] instanceof Snake) {
                Bird.Dance();
                Snake.Dance();
            }
        }
    }
    public static int fat(Animal [] animals) {
        int max = 0 ;
        for (int i = 0 ; i < animals.length;i++){
            if (animals[i] instanceof Hipo) {
                max = Math.max(max,((Hipo) animals[i]).getFat());
            }
        }
    return max;
    }
}
