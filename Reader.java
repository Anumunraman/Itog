public class Reader {
    String patronymicName;
    String firstName;
    String lastName;
    int readerId;
    String facultyName;
    String birthDate;
    String phoneNumber;

    @Override
    public String toString() {
        return String.format("id:%d fn:%s ln:%s fn:%s", readerId, firstName, lastName, facultyName);
    }

    public Integer getReaderID() {
        return readerId;
    }

    public String getFistname() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

}
