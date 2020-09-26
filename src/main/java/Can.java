import lombok.Data;

import java.util.List;

@Data
public class Can {
    private final String sticker;
    private final List<Vegetable> composition;
}
