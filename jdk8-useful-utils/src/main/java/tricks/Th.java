package tricks;

import lombok.Data;
import lombok.experimental.Accessors;

//@Data
//@Accessors(chain=true)
public class Th {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    private String job;
    private String career;
}
