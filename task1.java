import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PC {

    public static void main(String[] args) throws Exception {

        Notebook notebook1 = new Notebook("Asus", 8, 256, "Windows 7", "red", 15.6);
        Notebook notebook2 = new Notebook("Hp 420", 16, 512, "no OS", "green", 16.1);
        Notebook notebook3 = new Notebook("Acer", 8, 256, "Xp", "blue", 14.3);
        Notebook notebook4 = new Notebook("HP 350", 4, 1024, "no OS", "gray", 15.6);
        Notebook notebook5 = new Notebook("Samsung", 8, 256, "Windows 10", "black", 15.6);
        Notebook notebook6 = notebook1;

        Set<Notebook> unicNotebook = new HashSet<Notebook>();
        unicNotebook.add(notebook1);
        unicNotebook.add(notebook2);
        unicNotebook.add(notebook3);
        unicNotebook.add(notebook4);
        unicNotebook.add(notebook5);
        unicNotebook.add(notebook6);

        System.out.printf("Unique notebooks, total: %d \n", unicNotebook.size());

        for (Notebook notebook : unicNotebook) {
            System.out.println();
            System.out.println(notebook);
        }

        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "RAM size");
        mapCrit.put(2, "HDD (or SSD) size");
        mapCrit.put(3, "OS");
        mapCrit.put(4, "Colour");
        mapCrit.put(5, "Display size");

        Scanner sc = new Scanner(System.in);
        System.out.println("Input minimal parameter for search \n1. RAM size: ");
        int ramUser = sc.nextInt();

        System.out.println("HDD (or SSD) size: ");
        int storUser = sc.nextInt();

        System.out.println("Display size");
        double digUser = sc.nextDouble();

        System.out.println();

        for (Notebook note : unicNotebook) {
            if ((note.getRam() >= ramUser) && (note.getStorageCap() >= storUser) && note.getDiagonal() >= digUser) {
                System.out.println(note.toString());
            }
        }
        sc.close();
    }
}