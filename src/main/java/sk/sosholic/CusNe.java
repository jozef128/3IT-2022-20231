package sk.sosholic;

public class CusNe {
    public static void main(String[] args){

        MojeMeno mojeMeno= new MojeMeno ("Jozef"," Pradlovsky");

        String x ="Jozef Pradlovsky";

        for(int y=1;y<11;y++){

            if(y%2==0) {
                System.out.println(x + y);
            }
        }
    }
}
