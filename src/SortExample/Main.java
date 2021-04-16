package SortExample;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        Player nikoletta = new Player("Nikoletta", 400);
        Player ania = new Player("Ania", 300);
        Player przemek = new Player("Przemek", 50000);
        Player barylek = new Player("Barylek", 20000);

        Player[] pracownicy = {nikoletta, ania, przemek, barylek};

        //Sort by score (from the lowest to the highest):
        Comparator<Player> comparatorWyplaty = new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return (int) (o1.score - o2.score);
            }
        };

        Arrays.sort(pracownicy, comparatorWyplaty);

        for (Player pracownik : pracownicy) {
            System.out.println(pracownik);
        }

        System.out.println(" ");

        //Sort by name length (from the shortest to the longest) - using lambda :
        Comparator<Player> comparatorImienia2 = (o1, o2) -> o1.name.length() - o2.name.length();

        Arrays.sort(pracownicy, comparatorImienia2);

        for (Player pracownik : pracownicy) {
            System.out.println(pracownik);
        }
    }
}


