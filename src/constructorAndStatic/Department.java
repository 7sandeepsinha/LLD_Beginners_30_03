package constructorAndStatic;

public class Department {
    int id;
    String name;
    int budget;
    int numberOfEmployees;
    int startingYear;
    String companyName;
    String ceo;

    public Department(){

    }

    public Department(int dId, String dName, int dBudget, int dNoOfEmployees, int dStartingYear,
                      String dCompanyName, String dCEO){
        id = dId;
        name = dName;
        budget = dBudget;
        numberOfEmployees = dNoOfEmployees;
        startingYear = dStartingYear;
        companyName = dCompanyName;
        ceo = dCEO;
    }

    public Department(Department department){
        //this constructor creates a new object, and that object has values same as the department object being passed here
        id = department.id + 1; //3
        budget = department.budget; //5L
        numberOfEmployees = department.numberOfEmployees; //5
        startingYear = department.startingYear; //2023
        companyName = department.companyName; // ABC
        ceo = department.ceo; // Mr.X
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", budget=" + budget +
                ", numberOfEmployees=" + numberOfEmployees +
                ", startingYear=" + startingYear +
                ", companyName='" + companyName + '\'' +
                ", ceo='" + ceo + '\'' +
                '}';
    }
}
