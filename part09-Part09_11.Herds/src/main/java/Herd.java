import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> members;

    public Herd() {
        this.members = new ArrayList<Movable>();
    }

    public String toString() {
        String toString = "";
        for (Movable member : members) {

            toString = toString.concat(member.toString() + "\n");
        }
        return toString;
    }

    public void addToHerd(Movable movable) {

        this.members.add(movable);

    }

    public void move(int dx, int dy) {
        for (int i = 0; i < this.members.size(); i++) {

            members.get(i).move(dx, dy);
        }
    }
}
