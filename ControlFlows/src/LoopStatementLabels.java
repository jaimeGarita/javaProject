public class LoopStatementLabels {
    public static void main(String[] args) {

        bucle1:
        for (int i = 0; i < 5; i++) { //Bucle1 is the name of the loop
            bucle2:
            for (int j = 0; j < 5; j++) {
                if (j == 2) {
                    continue bucle2; //A QUE BUCLE QUIERO SALIRME CON BUCLE
                }
                System.out.println("i = " + i + " --- J = " + j);
            }
        }
        System.out.println("\n\n_____________________________________________________________");
        loop:
        for(int i = 0; i<=7; i++){
            int hours = 0;
                while(hours <= 8){
                    if(i == 7 || i == 6){
                        String day = (i == 7) ? "Domingo" : "Sabado";
                        System.out.println("Dias libres = " + day);
                        continue loop; //USAMOS EL LOOP PARA INDICAR AL LOOP QUE CONTINUE CON EL BUCLE O INTERRUMPIR

                    }
                    System.out.println(" work day " + i + " Total hours: " + hours +"h");
                    hours++;
                }
        }
    }
}

