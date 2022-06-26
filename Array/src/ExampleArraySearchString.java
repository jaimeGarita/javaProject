import java.util.Scanner;

public class ExampleArraySearchString {
    public static void main(String[] args) {
        String[] name = new String[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<name.length; i++){
            System.out.println("Please add a name");
            name[i] = sc.next();
        }

        String nameSearch = "";
        System.out.println("Please enter the name that you search");

        nameSearch = sc.next();
        String take = "";
        for(int i = 0; i<name.length; i++){
            if(name[i].toLowerCase().compareTo(nameSearch.toLowerCase()) == 0){
                 take = name[i];
                System.out.println("The name that you add appear in the array and the position is: " + i);
                break;
            }
        }
        if(nameSearch.toLowerCase().compareTo(take.toLowerCase()) != 0){
            System.out.println("The name that you add don't appear in the array");
        }
    }
}
