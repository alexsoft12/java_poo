import java.util.ArrayList;

public class Developer extends Employee  {

    private ArrayList<String> lenguajes = new ArrayList<>();
    public Developer(int id, String name, String dni, double salary, String department, ArrayList<String> lenguajes) {
        super(id, name, dni, salary, department);
        this.lenguajes = lenguajes;
    }

    public ArrayList<String> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(ArrayList<String> lenguajes) {
        this.lenguajes = lenguajes;
    }

    @Override
    public String evaluatePerformance() {
        if(this.lenguajes.size() > 4){
            return "Bueno";
        }

        if (this.lenguajes.size() < 4 && this.lenguajes.size() >= 2 ) {
            return "Regular";
        }

        return "Malo";
    }
}
