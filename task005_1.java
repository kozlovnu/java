package HomeWork;

import java.util.ArrayList;
import java.util.HashMap;


public class task005_1 {


    public static void main(String[] args) {

        HashMap<String,ArrayList<String>> phoneBook = new HashMap<>();

        ArrayList <String> phones = new ArrayList<>();
        phones.add("89211234567");
        phones.add("89115643298");
        phones.add("89219803245");
        phoneBook.putIfAbsent("Alex", phones);

        ArrayList <String> phones1 = new ArrayList<>();
        phones1.add("89216739826");
        phones1.add("89110941893");
        phones1.add("89214279088");
        phoneBook.putIfAbsent("Mike", phones1);

        ArrayList <String> phones2 = new ArrayList<>();
        phones2.add("89213327843");
        phones2.add("89117778844");
        phones2.add("89211116699");
        phoneBook.putIfAbsent("Jane", phones2);

        for (HashMap.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()){
            Object[] temp = entry.getValue().toArray();
            for (Object phone : temp){
                System.out.printf("Subscriber %s has phone number %s\n", entry.getKey(), phone);
            }
        }
    }
}
