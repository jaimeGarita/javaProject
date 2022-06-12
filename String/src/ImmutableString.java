public class ImmutableString {
    public static void main(String[] args) {
        String curse = "Java programation"; //REFERENCE CREATION OBJECT STRING
        String pupil = "Jaime Garitagoitia";


        /*STRING IS IMMUTABLE, THE VALUE DON'T CHANGE, IF WE CHANGE THE VALUE, WE CREATE A NEW INSTANCE RETURN A NEW INSTANCE WITH THIS CHANGES*/
        String result = curse.concat(pupil);
        System.out.println(curse);
        System.out.println("result = " + result);
        System.out.println(curse == result); //COMPARATION DIRECTION AND NO VALUE

        String result2 = curse.transform((c)->{ //THE VALUE IS NOT CHANGE //LAMBDA EXPRESSION
            return c + " " + pupil;
        });
        System.out.println(curse);
        System.out.println(result2);
        String result3 = result.replace("a", "A"); //result doesn't change te value, we need other variable to change this result
        System.out.println("result3 = " + result3);

    }
}
