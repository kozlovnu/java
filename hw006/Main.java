package HomeWork.hw006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Notebook nbApple = new Notebook("Apple", "16", "darkgrey", "macOs", "256");
        Notebook nbHP = new Notebook("HP", "8", "silver", "windows", "500");
        Notebook nbAcer = new Notebook("Acer", "8", "darkgrey", "windows", "256");
        Notebook nbAsus = new Notebook("Asus", "16", "silver", "windows", "500");

        Set<Notebook> nbList = new HashSet<>();
        nbList.add(nbAcer);
        nbList.add(nbApple);
        nbList.add(nbHP);
        nbList.add(nbAsus);
        nbList.add(new Notebook("Lenovo", "32", "white", "Linux", "1024"));

        System.out.println(nbList);

        System.out.println("----------------");

        System.out.println(filterList(nbList));
    }

    private static List<Notebook> filterList(Set<Notebook> notebooks) {
        List <Notebook> filteredNotebooks = new ArrayList<>();
        Map<String, String> filters = paramRequest();
        for (Notebook notebook : notebooks){
            String manufacture = filters.get("manufacture");
            String ram = filters.get("RAM");
            String color = filters.get("color");
            String operatingSystem = filters.get("operating system");
            String hddCapacity = filters.get("HDD capacity");

            if (manufacture != "" && !manufacture.equals(notebook.getManufacture())){
                continue;
            }
            if (ram != "" && !ram.equals(notebook.getRam())){
                continue;
            }
            if (color != "" && !color.equals(notebook.getColor())){
                continue;
            }
            if (operatingSystem != "" && !operatingSystem.equals(notebook.getOperatingSystem())){
                continue;
            }
            if (hddCapacity != "" && !hddCapacity.equals(notebook.getHddCapacity())){
                continue;
            }
            filteredNotebooks.add(notebook);
        }

        return filteredNotebooks;

    }

    private static Map<String,String> paramRequest(){
        Map <String, String> filter = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter preffered manufacture:");
        filter.put("manufacture", scanner.nextLine());
        System.out.println("Enter preffered RAM:");
        filter.put("RAM", scanner.nextLine());
        System.out.println("Enter preffered color:");
        filter.put("color", scanner.nextLine());
        System.out.println("Enter preffered operating system:");
        filter.put("operating system", scanner.nextLine());
        System.out.println("Enter preffered HDD capacity:");
        filter.put("HDD capacity", scanner.nextLine());


        return filter;
    }

}
