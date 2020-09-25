import lombok.Data;

import java.util.List;
import java.util.Random;

@Data
public class Can {
    private final String sticker;
    private final List<Vegetable> composition;

    private List<Vegetable> canRandomiser() {
        Random quantity = new Random();

        for (int i = 0; i <= quantity.nextInt(10); i++) {
            composition.add(Vegetable.CABBAGE);
        }

        for (int i = 0; i <= quantity.nextInt(10); i++) {
            composition.add(Vegetable.CARROT);
        }

        for (int i = 0; i <= quantity.nextInt(10); i++) {
            composition.add(Vegetable.TOMATO);
        }
        return composition;
    }
}
