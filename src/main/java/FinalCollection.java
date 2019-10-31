import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalCollection {

    public static void main(String... argv){

        final List<String> warriors = new ArrayList<String>(){{add("Tyrion");add("Jon");add("Arya");}};

        warriors.add("Kalisi");

        System.out.println("Appended to the final List :" + warriors);
    }
}
