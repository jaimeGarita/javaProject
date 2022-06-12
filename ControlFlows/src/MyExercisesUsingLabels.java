
public class MyExercisesUsingLabels {
    public static void main(String[] args) {
        hours:
        for(int i = 0; i<=7; i++){
            int day = 0;
                while(day <=8){
                    if(day == 6 || day == 7) {
                        String librar = (day == 6) ? "Sabado" : "Domingo";
                        System.out.println("Libras los dias" + librar);
                        continue hours;
                    }
                    System.out.println("Dia " + i + " trabajando a las " + day);
                        day++;

                }

        }
    }
}

