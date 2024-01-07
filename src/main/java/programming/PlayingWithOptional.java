package programming;

import java.util.List;
import java.util.Optional;

public class PlayingWithOptional {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Pear", "Orange", "Pineapple");

        Optional<String> optional = fruits.stream()
                .filter(fruit -> fruit.toLowerCase().startsWith("b"))
                .findFirst(); // Terminal Operation

        System.out.println(optional.orElse("No fruit found"));
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        //System.out.println(optional.get());

        Optional<String> fruit = Optional.of("Peach");
        System.out.println(fruit.orElse("No fruit found"));

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.orElse("No fruit found"));
    }
}
