package Java101.EmployeeSystem;

public class Employee {
    
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary < 1000.0){
            return 0.0;
        }else{
            return this.salary * 0.03;
        }
    }

    public double bonus(){
        if(this.workHours > 40){
            return (this.workHours - 40) * 30.0;
        }else{
            return 0.0;
        }
    }

    public double riseSalary(){
        if(2021 - hireYear < 10){
            return salary * 0.05;
        }else if (2021 - hireYear >= 10 && 2021 - hireYear < 20){
            return salary * 0.1;
        }else{
            return salary * 0.15;
        }
    }

    public String toString(){

        double newSalary = salary + bonus() + riseSalary();
        double netSalary = newSalary - tax();

        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " + salary);
        System.out.println("Çalışma Saati : " + workHours);
        System.out.println("Başlangıç Yılı : " + hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş artışı : " + riseSalary());
        System.out.println("Toplam maaş" + newSalary);
        System.out.println("Net Maaş " + netSalary);

        return null;

    }
}
