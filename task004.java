package HomeWork;
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class task004 {
    public static void main(String[] args) {
        System.out.println("Task001 - Reversed list:");
        System.out.println(reversedList(createList()));
    }

    private static List createList() {
        List numbersList = new LinkedList<Integer>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            numbersList.add(rd.nextInt(0, 100));
        }
        System.out.println("Original list:");
        System.out.println(numbersList);
        return numbersList;
    }

    private static List reversedList(List list){
        // List originaList = new LinkedList<>();
        LinkedList reversedList = new LinkedList<>();
        
        for(int i = 0; i < list.size(); i++){
            reversedList.addFirst(list.get(i));
        }
        System.out.println("Reversed list:");
        return reversedList;
    }

}
