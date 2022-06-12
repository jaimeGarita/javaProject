public class ConcatenationString {
    public static void main(String[] args) {
        String curse = "Java programation"; //REFERENCE CREATION OBJECT STRING
        String pupil = "Jaime Garitagoitia";

        String details = curse + " with the pupil " + pupil;
        System.out.println(details);

        int numberA = 10;
        int numberB = 5;

        System.out.println(details + numberA + numberB); //AS THERE IS A STRING AT THE BEGINNING IT UNDERSTAND THAT THE REST IS THE SAME
        System.out.println(numberA + numberB + details);

        String details2 = curse.concat(" ".concat(pupil)); //MORE EFFICIENT BECAUSE WITH THE + WE CONCATENATE BEHIND A CLASS CREATING AN INSTANCE
        System.out.println(details2);


    }
}
