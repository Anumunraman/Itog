import java.util.Scanner;

public class takeBook {
    public void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int input = in.nextInt();
            Reader r5 = new Reader();
            r5.firstName = "Petrov";
            r5.lastName = "Vladimir";
            r5.patronymicName = "Vladimirovich";
            r5.facultyName = "Facultuy5";
            r5.birthDate = "01.01.2005";
            r5.readerId = 5;
            System.out.print("\nID:" + r5.getReaderID() + " " + r5.getFistname() + " " + r5.getLastname().charAt(0) + ". " + r5.getPatronymicName().charAt(0) + ". " );
            System.out.print("took ");
            System.out.print(input);
            System.out.print(" book(s)");
        }
    }

    public int takeBook (int input) {
        return input;
    }
    
    public String takeBook (String a, String b, String c) {
        return a + " " + b + " " + c;
    }
        
}





