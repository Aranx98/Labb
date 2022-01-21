package uppgift3;

import java.util.List;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {

        List<String> words = List.of("Fridge", "Chair", "Oven", "Tree", "Glass", "Coffee", "Phone", "Animal", "Mouse", "Dragon","Yxa","Ring","Fish");

        Pattern pattern = Pattern.compile(
                "^(.*[AaEeUuiIOoYy].*){2,}$"

        );
        words.stream()
                .filter(s -> s.matches(String.valueOf(pattern)))
                .forEach(System.out::println);


    }


}


//   Använd reguljära uttryck för plocka ut endast de ord som
//innehåller 2 eller fler engelska vokaler (a, e, i, o, u, y)