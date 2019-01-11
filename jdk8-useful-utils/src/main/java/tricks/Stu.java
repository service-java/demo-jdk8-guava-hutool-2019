package tricks;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class Stu {
    private String name;
    private String job;
    private String hobby;
}
