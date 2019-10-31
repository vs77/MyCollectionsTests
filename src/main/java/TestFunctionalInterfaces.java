import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestFunctionalInterfaces {

    private static int drunkness;

    public static void main(String... argv){
        Supplier<Integer> moeBeerSupplier = ()->drunkness=5;
        System.out.println("Drunkeness level : " + moeBeerSupplier.get());
        drunkness = 10;
        System.out.println("Drunkeness level : " + moeBeerSupplier.get());
        Function<Integer,Integer> processBeer = beerProcessor -> drunkness = (beerProcessor+2);
        Consumer<Integer> homeBeerConsumer    = System.out::println;
        homeBeerConsumer.accept(moeBeerSupplier.get() + processBeer.apply(drunkness));
    }
}
