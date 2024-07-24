package InterviewPrgms;

import java.math.BigDecimal;
import java.util.List;

public final class CUstomImmutableClass {

    private final Integer id;
    private final String name;
    private final double salary;
    private final String Address;
    private final List<String> skills;

    public CUstomImmutableClass(Integer id, String name, double salary, String address, List<String> skills) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.Address = address;
        this.skills = skills;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return Address;
    }

    public List<String> getSkills() {
        return skills;
    }





}
