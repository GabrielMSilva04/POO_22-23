package aula06.ex02;
import java.util.ArrayList;
import java.util.Scanner;

import Utils.DateYMD;

public class ContactList {
    private ArrayList<Contact> contacts;
    private static Scanner sc = new Scanner(System.in);

    public ContactList() {
        contacts = new ArrayList<>();
    }

    public void addContact() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        if (findContactsByName(nome).size() != 0) {
            System.out.print("Nome já se encontra na lista, pretende continuar(S/N): ");
            String option = sc.nextLine();
            if (option.equals("N") || option.equals("n")) {
                return;
            }
        }
        System.out.print("CC: ");
        int cc = sc.nextInt();
        sc.nextLine();
        
        while (true) {
            System.out.print("Data de nascimento (dd mm aaaa): ");
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            int ano = sc.nextInt();
            sc.nextLine();
    
            if (DateYMD.valid(ano, mes, dia)) {
                System.out.print("Número de telefone: ");
                String phone = sc.nextLine();
    
                if (Contact.validatePhone(phone)) {
                    System.out.print("Email: ");
                    String email = sc.nextLine();
    
                    if (Contact.validateEmail(email)) {
                        contacts.add(new Contact(nome, cc, new DateYMD(ano, mes, dia), phone, email));
                        break;
                    }
                    System.out.println("Email inválido, tente novamente.");
                }
                System.out.println("Número de telefone inválido, tente novamente.");
            } else {
                System.out.println("Data inválida, tente novamente.");
            }
        }
    }
    

    public void updateContact(int id, String phoneNumber, String email) {
        Contact contact = findContactById(id);
        if (contact != null) {
            if (phoneNumber != null) {
                contact.setPhone(phoneNumber);
            }
            if (email != null) {
                contact.setEmail(email);
            }
        }
    }

    public void removeContact(int id) {
        Contact contact = findContactById(id);
        if (contact != null) {
            contacts.remove(contact);
        }
    }

    public Contact findContactById(int id) {
        for (Contact contact : contacts) {
            if (contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }

    public Contact findContactByNumber(String phone) {
        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phone)) {
                return contact;
            }
        }
        return null;
    }

    public ArrayList<Contact> findContactsByName(String name) {
        ArrayList<Contact> matchingContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                matchingContacts.add(contact);
            }
        }
        return matchingContacts;
    }

    public ArrayList<Contact> getAllContacts() {
        return contacts;
    }

    public void listContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
