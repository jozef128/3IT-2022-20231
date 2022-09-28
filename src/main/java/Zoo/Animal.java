package Zoo;

import sk.sosholic.String;

public class Animal {
    java.lang.String AnimalType = "typ zvierata";
    double value = 25000;
    public java.lang.String getAnimalType() {
        return AnimalType;
    }

    public void Animal(String animalType, double value) {
        if (value<=0){
          this.value =0;
        }else{
         this.value=value;
        }
        if(animalType.equals("")){
          this.AnimalType= "Student 3TPI";
        }else{
           this.AnimalType=AnimalType ;
        }

    }

    public double getValue() {
        return value;
    }


    @Override
    public java.lang.String toString() {
        return "Animal{" +
                "AnimalType='" + AnimalType + '\'' +
                ", value=" + value +
                '}';
    }

    public Animal(java.lang.String animalType, double value) {
        AnimalType = animalType;
        this.value = value;
    }
}

