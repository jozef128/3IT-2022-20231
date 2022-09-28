package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Chovatel {
        private List<Animal> Zoo = new ArrayList<>();
        private String menoPriezvisko;

        public Chovatel(String menoPriezvisko) {
            this.menoPriezvisko = menoPriezvisko;
        }


    public void pridatZviera(Animal animal){
            Zoo.add(animal);
    }

    private Animal zistiNajdrahsieZviera(){
         for (Animal animal : Zoo) {
             if  (animal.getValue() >najdrahsieZviera.getVaule()){
               zistiNajdrahsieZviera animal;
           }
         }
    }
}