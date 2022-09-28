package sk.sosholic;

public class SecandMin {
    public static void main (String [] args){
        static String getDurationString(){
            int second = 0;
            int minutyCele = second /60;
            int zostatokSekund = second % 60;
            int hours = minutyCele/60;
            int reminderMinutes = minutyCele %60;

            return hours + "Hod" + reminderMinutes + "Min" + zostatokSekund + "Sec"
        }
    }
}
