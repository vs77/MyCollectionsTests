import java.util.function.Consumer;

public class SwitchNumber {

    public static void main(String... varg){

        final int varNum = 50;
        String someValue = "";

        switch(varNum){

            case 50:
                someValue +="Me";
            case 10:
                someValue +="Hm";
            default:
                someValue +="Ts";
        }

        Consumer<String> myPrint = System.out::println;
        myPrint.accept(someValue);

    }
}
