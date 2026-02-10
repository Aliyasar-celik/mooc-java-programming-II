public class Person {

    private String name;
    private Education education;

    public Person(String name, Education education) {

        this.name = name;
        this.education = education;

    }

    public Education getEducation() {

        return education;

    }

    public String toString() {

        return this.name + ", " + this.education;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((education == null) ? 0 : education.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (education != other.education)
            return false;
        return true;
    }
}
