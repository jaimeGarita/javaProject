import java.util.Scanner;

public class NewSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String curso = "dev";
            switch (curso){
                case "programmer" -> System.out.println("Java");
                case "dev" -> System.out.println("Jaime Garitagoitia");
            }

            int mes = 0;
        System.out.println("Introduce mes");
            mes = sc.nextInt();

            String  temporada = "";


            switch (mes){
                case 1:
                case 2:
                case 3:
                    temporada = "Invierno";
                    break;
                case 4:
                case 5:
                case 6:
                    temporada = "Primavera";
                    break;
            }
        System.out.println("Temporada" + temporada);
    }
}
