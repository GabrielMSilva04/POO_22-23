package aula06.ex02;
import Utils.DateYMD;
import aula06.Pessoa;

public class Contact extends Pessoa {
    private static int idCount = 0;
    private int id;
    private String phone;
    private String email;

    public Contact(String nome, int cc, DateYMD dataNasc, String phone, String email) {
        super(nome, cc, dataNasc);
        this.phone = phone;
        this.email = email;
        this.id = ++idCount;
    }

    public static boolean validatePhone(String phone){
        return ((phone).matches("^(9[0-9]{2}) ?([0-9]{3}) ?([0-9]{3})$") ? true : false);
    }

    public static boolean validateEmail(String email){
        return (email.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}") ? true : false);
    }
    

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return super.toString() + "; Phone: " + this.phone + "; Email: " + this.email + "; Id: " + this.id;
    }
}
