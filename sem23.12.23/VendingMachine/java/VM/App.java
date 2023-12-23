import java.util.ArrayList;
import java.util.List;



import Domain.Bottle;
import Domain.HotDrink;
import Domain.Product;
import Service.CoinDispencer;
import Service.Display;
import Service.Holder;
import Service.VendingMachine;

public class App {
    public static void main (String[] args) throws Exception {
        Product item1 = new Product(100, 12, "Lays", 1234);
        Product item2 = new Product(120, 14, "Nuts", 1235);
        Product item3 = new Product(90, 16, "bubbles", 1236);
        Product item4 = new Product(20, 18, "m&ms", 1237);
        Product item5 = new Product(60, 1, "tofle", 1238);
        Product item6 = new Product(150, 2, "snikers", 1239);
        Product item7 = new Bottle(160, 3, "coca cola", 1229, 0.5f);
        Product item8 = new Bottle(130, 4, "Lipton", 1212, 0.33f);
        Product item9 = new Bottle(110, 5, "Tea mushroom", 1211, 0.4f);
        Product item10 = new Bottle(115, 6, "Everwess", 1216, 1f);
        Product item11 = new HotDrink(45, 78, "Hot Tea with Lime", 1110, 0.2f, 100);
        Product item12 = new HotDrink(70, 79, "Cacao", 1111, 0.3f, 80);
        Product item13 = new HotDrink(90, 80, "Capuchino", 1112, 0.2f, 90);
        Product item14 = new HotDrink(100, 81, "Latte", 1229, 0.4f, 85);


        Holder hold = new Holder();
        CoinDispencer coin = new CoinDispencer();
        Display disp = new Display();
        List<Product> listProd = new ArrayList<>();

        listProd.add(item1);
        listProd.add(item2);
        listProd.add(item3);
        listProd.add(item4);
        listProd.add(item5);
        listProd.add(item6);
        listProd.add(item7);
        listProd.add(item8);
        listProd.add(item9);
        listProd.add(item10);
        listProd.add(item11);
        listProd.add(item12);
        listProd.add(item13);
        listProd.add(item14);

        VendingMachine vm = new VendingMachine(hold, coin, disp, listProd);

        for(Product p : vm.getAssort()){
            System.out.println(p);
        }

        // MainFrame myFrame = new MainFrame();
        // myFrame.initialize();
    }
    
}
