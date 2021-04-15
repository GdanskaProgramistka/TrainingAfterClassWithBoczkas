package Lambda;

public class Main {
    public static void main(String[] args) {

    //WSZYSTKIE ZADANIA WYKONAć PRZY UŻYCIU LAMBDY:

    // Krzykacz kuchenny:
        Krzykacz kuchennyKrzykacz = () -> System.out.println("Umyj gary Dziadu!");
        kuchennyKrzykacz.wydajDzwiek();

    //Krzykacz ma krzyknać wielokrotnie:
        Krzykacz krzykaczWielokrotny = () -> {
            for (int i = 1; i < 4; i++) {
                System.out.println("Krzyczę po raz: " + i);
            }
        };
        krzykaczWielokrotny.wydajDzwiek();

    //Manager ma podać komunikat o podwyżce:
        Manager milymanager = podwyzka -> System.out.println("Daję Ci podwyżkę w wysokości " + podwyzka);
        Manager niemilymanager = podwyzka -> System.out.println("Nic nie dostaniesz Ty głupi Dziadu! Jeszcze obniżę Ci pesnję o: " + podwyzka);

        milymanager.podajInfoOPodwyzce(100);
        niemilymanager.podajInfoOPodwyzce(-10);
    }
}
