import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class Can {
    private final String sticker;
    private final List<Vegetable> composition = new ArrayList<>();

    public Can(String sticker) {
        this.sticker = sticker;
        canRandomiser();
    }

    private void canRandomiser() {
        Random random = new Random();
        Vegetable[] vegetables = Vegetable.values();

        for (int i = 0; i <= random.nextInt(10); i++) {
            int random2 = random.nextInt(vegetables.length);
            composition.add(vegetables[random2]);
        }
    }
}
