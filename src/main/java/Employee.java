public class Employee implements EvaluatePerformance {
    // atributos
    private int id;
    private String name;
    private String dni;
    private double salary;
    private String department;


    // constructor
    public Employee(int id, String name, String dni, double salary, String department) {
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String evaluatePerformance() {
        if (this.getSalary() > 1500) {
            return "Bueno";
        }

        if (this.getSalary() < 1500 && this.getSalary() > 800) {
            return "Regular";
        }

        return "Malo";
    }

    public double calculateBonus(){
        double bonoTotal = this.salary * 0.3;
        if (this.evaluatePerformance() == "Bueno"){
            return bonoTotal * 1;
        }

        if (this.evaluatePerformance() == "Regular"){
            return bonoTotal * 0.5;
        }

        return bonoTotal * 0;
    }
    // mostrar detalle
    public void showDetail(){
        System.out.println("**********");
        System.out.println("ID: " + this.getId());
        System.out.println("Nombre: " + this.getName());
        System.out.println("DNI: " + this.getDni());
        System.out.println("Salario: " + this.getSalary());
        System.out.println("Departamento: " + this.getDepartment());
        System.out.println("Bono: " + this.calculateBonus());
        System.out.println("Rendimiento: " + this.evaluatePerformance());
        System.out.println("**********");

    }
}
