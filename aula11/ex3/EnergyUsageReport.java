package ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class EnergyUsageReport {
    private List<Customer> customers;

    public EnergyUsageReport() {
        this.customers = new ArrayList<Customer>();
    }
    
    // Create a method that loads customer data from a text file
    public void load(String filename) {
        System.out.println("Text file:");
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                int id = Integer.parseInt(parts[0]);
                List<Double> usage = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) {
                    usage.add(Double.parseDouble(parts[i]));
                }
                System.out.println("ID: " + id);
                System.out.println("Usage: " + usage);

                Customer customer = new Customer(id, usage);
                this.customers.add(customer);
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
    
    // Create a method that adds a customer to the collection
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }
    
    // Create a method that removes a customer from the collection
    public void removeCustomer(int customerId) {
        for (Customer customer : this.customers) {
            if (customer.getCustomerId() == customerId) {
                this.customers.remove(customer);
                break;
            }
        }
    }
    
    // Create a method that retrieves a customer from the collection
    public Customer getCustomer(int customerId) {
        for (Customer customer : this.customers) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }
    
    // Create a method that calculates the total energy usage for a specific customer
    public double calculateTotalUsage(int customerId) {
        for (Customer customer : this.customers) {
            if (customer.getCustomerId() == customerId) {
                double total = 0.0;
                for (Double usage : customer.getMeterReadings()) {
                    total += usage;
                }
                return total;
            }
        }
        return 0.0;
    }
    
    // Create a method that generates a report of all customers and their total energy usage
    public void generateReport(String filename) {
        for (Customer customer : this.customers) {
            System.out.println("ID: " + customer.getCustomerId());
            System.out.println("Usage: " + customer.getMeterReadings());
            System.out.println("Total: " + calculateTotalUsage(customer.getCustomerId()));
        }
    }
}
