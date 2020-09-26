import java.util.*;

public class Pogreb {

    private final List<Can> pogreb = new ArrayList<>();

    public Pogreb() {
        System.out.println("Надпись на стене: С любовью из погреба");
    }

    public void put(Can can) {
        Random random = new Random();
        if (random.nextInt(100) == 1) {
            throw new RuntimeException("Ну вооот, и эту с пола слизывать");
        }
        pogreb.add(can);
    }

    public Can get(String sticker) {
        Random random = new Random();
        for (Can can : pogreb) {
            if (can.getSticker().equals(sticker)) {
                pogreb.remove(can);
                if (random.nextInt(100) < 2) {
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



