package aula06.ex02;

import java.util.Scanner;

public class menu {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ContactList contactList = new ContactList();
        
        while (true) {
            System.out.println("1. Add contact");
            System.out.println("2. Update contact");
            System.out.println("3. Remove contact");
            System.out.println("4. Find contact");
            System.out.println("5. List all contacts");
            System.out.println("0. Exit");

            System.out.print("Your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                contactList.addContact();
                    break;
                case 2:
                System.out.print("Contact ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Contact New Number: ");
                String newPhone = sc.nextLine();
                System.out.print("Contact New Email: ");
                String email = sc.nextLine();
                contactList.updateContact(id,newPhone,email);
                    break;
                case 3:
                System.out.print("Contact ID: ");
                id = sc.nextInt();
                contactList.removeContact(id);
                    break;
                case 4:
                System.out.println("1. Find by number");
                System.out.println("2. Find by name");
                int choice2 = sc.nextInt();
                sc.nextLine();
                switch (choice2) {
                    case 1:
                    System.out.print("Contact Number: ");
                    String phone = sc.nextLine();
                    System.out.println(contactList.findContactByNumber(phone));
                        break;
                    case 2:
                    System.out.print("Contact Name: ");
                    String name = sc.nextLine();
                    for (Contact contact : contactList.findContactsByName(name)) {
                        System.out.println(contact);
                    }
                        break;
                }
                break;
                case 5:
                contactList.listContacts();
                    break;
                case 0:
                    System.exit(choice);
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
        }
    }
}
