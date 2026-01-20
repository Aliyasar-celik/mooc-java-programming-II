import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class StorageFacility {

    HashMap<String, ArrayList<String>> facilityHashMap;

    public StorageFacility() {

        this.facilityHashMap = new HashMap<String, ArrayList<String>>();

    }

    public void add(String unit, String item) {

        this.facilityHashMap.putIfAbsent(unit, new ArrayList<String>());

        ArrayList unitItems = this.facilityHashMap.get(unit);

        unitItems.add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.facilityHashMap.containsKey(storageUnit)) {

            if (facilityHashMap.get(storageUnit) != null) {

                return facilityHashMap.get(storageUnit);

            }

            return new ArrayList<String>();

        }

        return new ArrayList<String>();

    }

    public void remove(String storageUnit, String item) {

        this.facilityHashMap.get(storageUnit).remove(item);

    }

    public ArrayList<String> storageUnits() {

        Set<String> keys = this.facilityHashMap.keySet();
        
        ArrayList<String> keysArrayList = new ArrayList<String>();

        for (String key : keys) {
            
            if (!this.facilityHashMap.get(key).isEmpty()) {

                keysArrayList.add(key);
            }
        }
        return keysArrayList;
    }

}
