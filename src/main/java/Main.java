import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Lista de empleados
        ArrayList<Employee> employees = new ArrayList<>();
        //linkedList
        //hashSet
        employees.add(new Employee(1, "John Doe", "12345678A", 1000, "IT"));
        employees.add(new Employee(2, "Jane Doe", "87654321B", 1200, "HR"));
        employees.add(new Employee(3, "Alice Doe", "12348765C", 1100, "IT"));

        // recorrer la lista de empleados
/*        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }*/
        // gerente
        // // Lista de empleados desarrolladores
        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(new Developer(1, "John Doe", "12345678A", 2000, "IT", new ArrayList<String>() {{
            add("Java");
            add("Python");
            add("JavaScript");
            add("PHP");
        }}));
        developers.add(new Developer(2, "Jane Doe", "87654321B", 1800, "IT", new ArrayList<String>() {{
            add("Java");
            add("JavaScript");
            add("PHP");
        }}));
        developers.add(new Developer(3, "Alice Doe", "12348765C", 1100, "IT", new ArrayList<String>() {{
            add("Java");
            add("Python");
            add("JavaScript");
        }}));
        developers.add(new Developer(4, "Bob Doe", "12348765D", 700, "IT", new ArrayList<String>() {{
            add("HTML");
            add("CSS");
            add("JavaScript");
        }}));


/*        for (Employee developer : developers) {
            System.out.println(developer.getName());
        }*/

        /* =========== POLIMORFISMO ========== */
        System.out.println("=========== POLIMORFISMO ==========");
        Employee newEmployee = new Employee(1, "John Doe", "12345678A", 1000, "IT");
        System.out.println(newEmployee.evaluatePerformance());
        Developer newDeveloper = new Developer(1, "Jane Doe", "87654321B", 1300, "HR", new ArrayList<String>() {{
            add("Java");
            add("JavaScript");
            add("PHP");
        }});

        newEmployee  = newDeveloper;
        System.out.println(newDeveloper.getLenguajes().size());
        System.out.println(newEmployee.getName());
        System.out.println(newEmployee.evaluatePerformance());
        System.out.println("**********");


        // lista de empleados gerentes
        ArrayList<Manager> managers = new ArrayList<>();
        managers.add(new Manager(1, "John Doe", "12345678A", 1000, "IT", new ArrayList<>() {{
            addAll(developers);
            addAll(employees);
        }}));
        managers.add(new Manager(2, "Jane Doe", "87654321B", 1200, "HR", new ArrayList<>() {{
            addAll(employees);
        }}));
        managers.add(new Manager(3, "Alice Doe", "12348765C", 1100, "IT", new ArrayList<>() {{
            addAll(developers);
        }}));

        /*for (Manager manager : managers) {
            System.out.print(manager.getName());
            System.out.println(" ");
            for (Employee employee : manager.getEmployees()) {
                System.out.print(employee.getName() + " | ");
            }
            System.out.println(" ");
        }*/

        System.out.println("========= GERENTE ========");
        for (Manager manager : managers) {
            manager.showDetail();
        }
        System.out.println("========= DESARROLLADOR ========");
        for (Developer developer : developers) {
            developer.showDetail();
        }




       /* Employee[] empleados = new Employee[3];
        empleados[0] = new Employee(1, "John Doe", "12345678A", 1000, "IT");
        empleados[1] = new Employee(2, "Jane Doe", "87654321B", 1200, "HR");
        empleados[2] = new Employee(3, "Alice Doe", "12348765C", 1100, "IT");

        for (i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i].getName());
        }*/


    }
}
