public class Teacher extends Person{
     
    private int salaryInEuros;

    public Teacher(String name, String address, int salary){

        super(name,address);
        this.salaryInEuros = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salaryInEuros + " euro/month";
    }

}
