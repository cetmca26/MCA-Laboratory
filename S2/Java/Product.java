import java.util.Scanner;

public class Product {
    int product_code, price;
    String product_name;

    Product(int product_code, String product_name, int price){
        this.product_code = product_code;
        this.product_name = product_name;
        this.price = price;
    }

    public static void main(String[] args) {
        int smallest = -1, code, price;
        String name;
        Product p[] = new Product[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i ++){
            System.out.printf("%nEnter the details of Product %d: %n", (i+1));
            System.out.print("Product Name: ");
            name = sc.nextLine();
            System.out.print("Product Code: ");
            code = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Product Price: ");
            price = Integer.parseInt(sc.nextLine().trim());
            p[i] = new Product(code, name, price);
            if (smallest == -1 || (smallest / 10) > price){
                smallest = (price * 10) + i;
            }
        }
        System.out.println("The cheapest product among them is: ");
        System.out.printf("Name: %s%nCode: %d%nPrice: %d", p[smallest % 10].product_name, p[smallest % 10].product_code, p[smallest % 10].price);
        sc.close();
    }
    
}
