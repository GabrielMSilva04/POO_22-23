package aula04.ex2;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}


class CashRegister {
    private ArrayList<Product> produtos;

    public CashRegister() {
        this.produtos = new ArrayList<Product>();
    }
    
    public void addProduct(Product product) {
        produtos.add(product);
    }

    public String toString() {
        String header = String.format("%-13s %8s %11s %10s\n", "Product", "Price", "Quantity", "Total");

        double total = 0.0;
        String lines = "";
        for (Product p : produtos) {
            double productTotal = p.getTotalValue();
            total += productTotal;

            String line = String.format("%-13s %8.2f %11d %10.2f\n", p.getName(), p.getPrice(), p.getQuantity(),
                    productTotal);
            lines += line;
        }

        String totalLine = String.format("\nTotal value: %.2f", total);

        return header + lines + totalLine;
    }
}
    

public class CashRegisterDemo {

    public static void main(String[] args) {

        // Cria e adiciona 5 produtos
        CashRegister cr = new CashRegister();
        cr.addProduct(new Product("Book", 9.99, 3));
        cr.addProduct(new Product("Pen", 1.99, 10));
        cr.addProduct(new Product("Headphones", 29.99, 2));
        cr.addProduct(new Product("Notebook", 19.99, 5));
        cr.addProduct(new Product("Phone case", 5.99, 1));
        
        System.out.println(cr);
    }
}