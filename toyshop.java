import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class toyshop {

    public static Random rnd = new Random();

    public static void main(String[] args) {

        toy toy1 = new toy("Toy1", 10, 20);
        toy toy2 = new toy("Toy2", 10, 20);
        toy toy3 = new toy("Toy3", 10, 60);

        stock stockShop = new stock();

        stockShop.add(toy1);
        stockShop.add(toy2);
        stockShop.add(toy3);
        System.out.println();

        System.out.println("На складе:");
        stockShop.print();
        System.out.println();

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        StringBuilder lottery = new StringBuilder();
        for (int j = 0; j < 10; j++) {
            toy t = getRandomToy(stockShop);
            lottery.append(t.getName() + "\n");
            if (t.getId() == 1)
                sum1++;
            else if (t.getId() == 2)
                sum2++;
            else if (t.getId() == 3)
                sum3++;
        }
        writeData("lottery.txt", lottery.toString());

        System.out.println("Разыграно:");
        System.out.println("Toy1: " + sum1);
        System.out.println("Toy2: " + sum2);
        System.out.println("Toy3: " + sum3);
        System.out.println("Список - в файле lottery.txt");
        
        System.out.println();
        System.out.println("На складе осталось:");
        stockShop.print();

    }

    public static toy getRandomToy(stock shop) {
        int totW = shop.getTotalWeight();
        int num = rnd.nextInt(totW) + 1;
        return shop.getToybyRnd(num);
    }

    static void writeData(String file, String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(data);
        } catch (IOException ex) {
            System.out.println("Ошибка записи выходного файла: ");
            System.out.println(ex.getMessage());
        }
    }
}