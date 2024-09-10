import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Напишите 5 имен: ");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }
        System.out.println(listA.toString());
        System.out.println("Напишите еще 5 имен: ");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }
        System.out.println(listA.toString());
        ArrayList<String> listC = new ArrayList<>();
        Collections.reverse(listB);
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(i));
        }
        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);
    }
}