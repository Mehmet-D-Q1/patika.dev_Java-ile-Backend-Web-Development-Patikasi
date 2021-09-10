package patika_dev_java101;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        double tax;
        if (salary < 1000){
            return 0;
        }
        else{
            tax = salary*0.03;
            return tax;
        }
    }

    double bonus(){
        double bonus ;
        if (workHours > 40){
            bonus = 30*(workHours-40);
            return bonus;
        }
        else
        {
            return 0;
        }
    }

    double raiseSalary(){
        int currentYear = 2021;
        double raiseSalary = 0;
        if ((currentYear-hireYear) < 10){
            raiseSalary = salary * 0.05;
        }
        else if(((currentYear-hireYear) > 9) && ((currentYear-hireYear) < 20)){
            raiseSalary = salary * 0.10;
        }
        else if (((currentYear-hireYear) > 19)){
            raiseSalary = salary * 0.15;
        }
        return raiseSalary;
    }

    double withTaxAndBonusSalary(){
        double withTaxAndBonusSalary;
        withTaxAndBonusSalary = this.salary - tax() + bonus();
        return withTaxAndBonusSalary;

    }

    @Override
    public String toString() {
        return
                "\nAdı: " + name +
                " \nMaaşı: " + salary +
                " \nÇalışma saati: " + workHours +
                " \nBaşlangıç Yılı: " + hireYear +
                " \nVergi: " + tax() +
                " \nBonus: " + bonus() +
                " \nMaaş Artışı: " + raiseSalary() +
                " \nVergi ve Bonuslar ile birlikte maaş: " + withTaxAndBonusSalary() +
                " \nToplam Maaş: " + (this.salary + raiseSalary())  ;
    }

}
