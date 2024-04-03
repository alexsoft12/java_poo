import java.util.ArrayList;

public class Manager  extends Employee{
    private ArrayList<Employee> employees = new ArrayList<>();
    public Manager(int id, String name, String dni, double salary, String department, ArrayList<Employee> employees) {
        super(id, name, dni, salary, department);
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String evaluatePerformance() {
        if(this.employees.size() > 6){
            return "Bueno";
        }

        if (this.employees.size() < 6 && this.employees.size() > 3) {
            return "Regular";
        }

        return "Malo";
    }
}
