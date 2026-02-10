public class Book {
    private String name;
    private int recommendedAge;

    public Book(String name, int recommendedAge) {

        this.name = name;
        this.recommendedAge = recommendedAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    public void setRecommendedAge(int recommendedAge) {
        this.recommendedAge = recommendedAge;
    }

    @Override
    public String toString() {

        return this.name + " (recommmened for " + this.recommendedAge + " year-olds or older)";
    }

}
