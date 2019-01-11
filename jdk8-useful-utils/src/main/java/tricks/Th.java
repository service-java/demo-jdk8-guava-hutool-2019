package tricks;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class Th {
    private String name;
    private String job;
    private String career;
}
