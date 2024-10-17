package StreamsMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{
    int id ;
    String name;
    double salary;

    Employee(int ID, String Name, double Sal ){
        this.id = ID;
        this.name=Name;
        this.salary =Sal;
    }
}


 class FIlterSalaries {

     public static void main(String[] args) {
         List<Employee> empList = Arrays.asList(
                 new Employee(1, "Shyam", 35000),
                 new Employee(2, "Shyam", 20000),
                 new Employee(4, "Ram", 10000),
                 new Employee(3, "Govind", 60000),
                 new Employee(5, "Sahiti", 85000));

         List<Employee> optEmpList = new ArrayList<>();

         empList.stream().filter(sal -> sal.salary >20000).map(s
                 -> s.salary).forEach(System.out::println);
     }
}
