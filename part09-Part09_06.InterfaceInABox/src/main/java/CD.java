public class CD implements Packable {

    private String singer;
    private String name;
    private int publicationYear;
    private double weight;

    public CD(String singer, String name, int publicationYear) {
        this.singer = singer;
        this.name = name;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {

        return weight;

    }

    @Override
    public String toString() {
        return this.singer + ": " + this.name + " (" + this.publicationYear + ")"; 
    }

}
