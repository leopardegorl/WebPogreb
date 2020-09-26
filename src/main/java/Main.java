import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pogreb pogreb = new Pogreb();
        cansRandomInitialisation(pogreb);
        pogreb.showPogreb();
    }


    public static void cansRandomInitialisation(Pogreb pogreb) {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(1000); i++) {
            int random2 = random.nextInt(200);
            pogreb.put(canRandomiser());
        }
    }

    private static Can canRandomiser() {
        Random random = new Random();
        Vegetable[] vegetables = Vegetable.values();
        List<Vegetable> composition = new ArrayList<>();

        for (int i = 0; i <= random.nextInt(10); i++) {
            int vegetableNumber = random.nextInt(vegetables.length);
            composition.add(vegetables[vegetableNumber]);
        }
        return new Can("Banka" + random.nextInt(200), composition);
    }
}






