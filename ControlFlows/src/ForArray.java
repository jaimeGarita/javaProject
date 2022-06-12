import java.util.Locale;

public class ForArray {
    public static void main(String[] args) {

        String[] names = {"Jaime", "Daniel", "Nacho", "Jojuan", "Manolo", "Julio", "Manoli", "Fernando"};
        int max = names.length;

        for(int i = 0; i < max; i++){
            if(names[i].toLowerCase().contains("Daniel".toLowerCase()) || names[i].equalsIgnoreCase("jaime")) {
               continue;
            }
            System.out.println(i + ".- " + names[i]);
        }
    }
}
