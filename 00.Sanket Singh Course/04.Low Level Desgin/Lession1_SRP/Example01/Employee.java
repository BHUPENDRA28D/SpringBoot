//SOLID - S
/* SRP - Solid Reponsiblity Principle -so this is principal tell us that each class should slove only one or minmum things.
   >> therfore we created class for varouis methodes.

 */

public class Employee{
    private final  int id;

    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

//    public int calculateSalary(){
//        return 0;
//    }

//    public String fetchBioData(){
//        return "Some Bio Data";
//    }

//    public void printPerformanceData(){
//        System.out.println("Printed Performence data here");
//    }
}

//EmpSalary Class

class EmployeeSalaryCalculator{

    public double  calculateSalary(Employee employee){
        return 0;
    }
}


//EmpFetchBioData
class EmpFetchBioData{

    public String fetchBioData(Employee employee){
    return "Some Bio Data";
  }
}

//EmpPerformanceData

class EmpPerformanceData{
    public void printPerformanceData(Employee employee){
        System.out.println("Printed Performence data here");
    }
}