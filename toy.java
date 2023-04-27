public class toy {
    private int id;
    private String name;
    private int quantity;
    private int weight;

    public toy(String name, int quantity, int weight) {
        this.id = 0;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public String toString() {
        return String.format("%d. %s %dшт вес:%d", this.id, this.name, this.quantity, this.weight);
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int n) {
        this.id = n;
    }

    public int getId() {
        return this.id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int q) {
        this.quantity = q;
    }
}
