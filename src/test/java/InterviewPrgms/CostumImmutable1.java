package InterviewPrgms;

import java.util.List;

public final class CostumImmutable1 {

    private final int id;
    private final String name;
    private final List<String> skilset;

    public CostumImmutable1(int Id,String Name, List<String> Skillset){
        this.id = Id;
        this.name = Name;
        this.skilset = Skillset;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkilset() {
        return skilset;
    }
}
