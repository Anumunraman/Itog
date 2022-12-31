import java.util.Arrays;
import java.util.HashSet;

public class Prgogram extends Reader{
    public static Prgogram main;

    public static void main (String[] args) {
        Reader r1 = new Reader();
        r1.firstName = "Ivan";
        r1.lastName = "Ivanov";
        r1.patronymicName = "Ivanovich";
        r1.facultyName = "Facultuy1";
        r1.birthDate = "01.01.2000";
        r1.readerId = 1;
        
        
        Reader r2 = new Reader();
        r2.firstName = "Ivan1";
        r2.lastName = "Ivanov1";
        r2.patronymicName = "Ivanovich1";
        r2.facultyName = "Facultuy2";
        r2.birthDate = "01.00.2001";
        r2.readerId = 2;

        Reader r3 = new Reader();
        r3.firstName = "Ivan3";
        r3.lastName = "Ivanov3";
        r3.patronymicName = "Ivanovich3";
        r3.facultyName = "Facultuy1";
        r3.birthDate = "01.01.2002";
        r3.readerId = 3;

        Reader r4 = new Reader();
        r4.firstName = "Ivan3";
        r4.lastName = "Ivanov3";
        r4.patronymicName = "Ivanovich3";
        r4.facultyName = "Facultuy1";
        r4.birthDate = "01.01.2002";
        r4.readerId = 4;

        var readers = new HashSet<Reader>(Arrays.asList(r1,r2,r3,r4));
        System.out.println(readers.toString());
        System.out.println(r1);
    }
    



}


