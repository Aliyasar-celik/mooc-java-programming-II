import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employeeList;

    public Employees() {
        this.employeeList = new ArrayList<Person>();
    }

    public void add(Person personToAdd) {

        this.employeeList.add(personToAdd);

    }

    public void add(List<Person> peopleToAdd) {

        for (Person person : peopleToAdd) {

            employeeList.add(person);
        }
    }

    public void fire(Education education) {

        Iterator<Person> iterator = employeeList.iterator();

        while (iterator.hasNext()) {

            Person iteratedPerson = iterator.next();

            if (iteratedPerson.getEducation().equals(education)) {

                iterator.remove();
            }

        }

    }

    public void print() {

        Iterator<Person> iterator = employeeList.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }

        // this.employeeList.stream()
        // .forEach(System.out::println);
    }

    public void print(Education education) {

        Iterator<Person> iterator = employeeList.iterator();

        while (iterator.hasNext()) {

            Person iteratedPerson = iterator.next();

            if (iteratedPerson.getEducation().equals(education))

                System.out.println(iteratedPerson);
        }

        // this.employeeList.stream()
        // .filter(p -> p.getEducation().equals(education))
        // .forEach(System.out::println);
    }
}
