package HomeWork;

import java.util.HashMap;
import java.util.Map;

public class task005_2 {
    public static void main(String[] args) {
        String[] nameWorkers = { "Иван", "Петр", "Антон", "Сергей", "Иван",
                "Антон", "Иван", "Антон", "Иван", "Петр", "Антон", "Сергей", "Антон", "Антон" };
        HashMap<String, Integer> workers = new HashMap<>();
        for (String i : nameWorkers) {
            int newValue = workers.getOrDefault(i, 0) + 1;
            workers.put(i, newValue);
        }
        System.out.println(workers);

        workers.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
