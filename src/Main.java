import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("hola", "hello");
        dictionary.put("mundo", "world");
        dictionary.put("perro", "dog");
        dictionary.put("gato", "cat");
        dictionary.put("casa", "house");
        dictionary.put("escuela", "school");
        dictionary.put("libro", "book");
        dictionary.put("silla", "chair");
        dictionary.put("mesa", "table");
        dictionary.put("agua", "water");
        dictionary.put("fuego", "fire");
        dictionary.put("tierra", "earth");
        dictionary.put("aire", "air");
        dictionary.put("sol", "sun");
        dictionary.put("luna", "moon");
        dictionary.put("estrella", "star");
        dictionary.put("cielo", "sky");
        dictionary.put("nube", "cloud");
        dictionary.put("montaña", "mountain");
        dictionary.put("río", "river");

        ArrayList<String> keys = new ArrayList<>(dictionary.keySet());
        Collections.shuffle(keys);
        ArrayList<String> selectedWords = new ArrayList<>(keys.subList(0, 5));

        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        for (String word : selectedWords) {
            System.out.println("Traduce la palabra al inglés: " + word);
            String userTranslation = scanner.nextLine();
            if (userTranslation.equalsIgnoreCase(dictionary.get(word))) {
                correctAnswers++;
            } else {
                incorrectAnswers++;
            }
        }

        System.out.println("Respuestas correctas: " + correctAnswers);
        System.out.println("Respuestas incorrectas: " + incorrectAnswers);

        scanner.close();
    }
}