public class Student extends Person {

    private int credits;

    public int getCredits() {
        return credits;
    }

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;

    }

    public void study() {
        this.credits += 1;

    }

}
