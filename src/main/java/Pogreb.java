import java.util.*;

public class Pogreb {

    private List<Can> pogreb = new ArrayList<>();

    public Pogreb() {
        System.out.println("Надпись на стене: С любовью из погреба");
        cansInitialisation();
    }

    private void cansInitialisation() {
        Random random = new Random();
        for (int i = 0; i < random.nextInt(10); i++) {
            int random2 = random.nextInt(200);
            pogreb.add(new Can("Banka" + random2));
        }
    }

    public void put(Can can) {
        Random onePercentChance = new Random();
        if (onePercentChance.nextInt(101) == 1) {
            throw new RuntimeException("Ну вооот, и эту с пола слизывать");
        }
        pogreb.add(can);
    }

    public Can get(String sticker) {
        Random twoPercentChance = new Random();
        for (Can can : pogreb) {
            if (can.getSticker().equals(sticker)) {
                pogreb.remove(can);
                if (twoPercentChance.nextInt(51) == 1) {
                    throw new RuntimeException("А ручки то корявые");
                }
                return can;
            }
        }
        throw new NoSuchElementException("There are no such can in pogreb.");
    }

    public void showPogreb() {
        for (Can can:pogreb) {
            System.out.println(can);
        }
    }
}



