import java.util.ArrayList;
import java.util.List;

public class stock {
    public List<toy> toysList;

    public stock() {
        this.toysList = new ArrayList<>();
    }

    public void add(toy toy) {
        int n = this.toysList.size() + 1;
        toy.setId(n);
        this.toysList.add(toy);
    }

    public void print() {
        for (toy toy : toysList) {
            System.out.println(toy.toString());
        }
    }

    public int getTotalWeight() {
        int sum = 0;
        for (toy toy : toysList) {
            sum += toy.getWeight();
        }
        return sum;
    }

    public toy getToybyRnd(int k) {
        int sum = 0;
        for (toy toy : toysList) {
            sum += toy.getWeight();
            if (k < sum) {
                toy.setQuantity(toy.getQuantity() - 1);
                return toy;
            }
        }
        return null;
    }
}
