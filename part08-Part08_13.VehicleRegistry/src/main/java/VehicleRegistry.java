import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> licenseOwnersHashMap;

    public VehicleRegistry() {
        this.licenseOwnersHashMap = new HashMap<LicensePlate, String>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {

        if (this.licenseOwnersHashMap.containsKey(licensePlate)) {

            if (this.licenseOwnersHashMap.get(licensePlate) == null) {

                this.licenseOwnersHashMap.put(licensePlate, owner);
                return true;
            }

            return false;
        }

        this.licenseOwnersHashMap.put(licensePlate, owner);
        return true;

    }

    public String get(LicensePlate licensePlate) {
        // this returns null if the key is not present or the keys value is null.
        // (This null thing is a hashmap feature.)

        return this.licenseOwnersHashMap.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {

        if (!this.licenseOwnersHashMap.containsKey(licensePlate)) {

            return false;
        }

        this.licenseOwnersHashMap.remove(licensePlate);
        return true;

    }

    public void printLicensePlates() {

        for (LicensePlate licensePlate : this.licenseOwnersHashMap.keySet()) {

            System.out.println(licensePlate);
        }

    }

    public void printOwners() {
        ArrayList<String> ownersListWithoutDuplicates = new ArrayList<String>();

        for (LicensePlate licensePlate : this.licenseOwnersHashMap.keySet()) {

            if (!ownersListWithoutDuplicates.contains(licenseOwnersHashMap.get(licensePlate))) {

                ownersListWithoutDuplicates.add(licenseOwnersHashMap.get(licensePlate));

            }
        }

        for (String owners : ownersListWithoutDuplicates) {
            System.out.println(owners);
        }

    }

}
