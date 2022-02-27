/**
* Java 1. Home Work #2
*
* @author Artem Anurin
* @version 27.02.2022
*/


class HomeWork5 {
    public static void main(String[] args) {
        Employee[] emplPeop = new Employee[5];
            emplPeop[0] = new Employee("Vasiliy Petrov", "Tehnic", "petrovvs@email.com", "548937", 28000, 31);
            emplPeop[1] = new Employee("Vladimir Sergeev", "Engeneer", "sergeevvl@email.com", "2468794", 35000, 44);
            emplPeop[2] = new Employee("Ivan Lupen", "Mechanic", "lupivan@email.com", "36421589", 27000, 25);
            emplPeop[3] = new Employee("Sergey Sidorov", "Engeneer", "sidorovser@email.com", "4587129", 40000, 41);
            emplPeop[4] = new Employee("Petr Fedorov", "Analitic", "fedorovpt@email.com", "6448894", 38000, 32);
        
        for (Employee employee : emplPeop) {
            if (employee.getAge() > 40)
                System.out.println(employee);
        }
    }
    
}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    
    Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    
    public int getAge() {
        return age;
    }



    
    @Override
    public String toString() {
        return name + ", " + position + ", " + email + "," + phone + "," + salary + "," + age;
    }
}