public class ProductWarehouse extends Warehouse {

    private String name;

    public String getName() {
        return this.name;
    }

    public ProductWarehouse(String productName, double capacity) {

        super(capacity);
        this.name = productName;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String toString(){

        return this.name + ": " + super.toString() ;
    }

}
