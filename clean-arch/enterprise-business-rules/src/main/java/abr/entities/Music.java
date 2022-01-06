package abr.entities;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Music {
    private String id;
    private String name;
}
