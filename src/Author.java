public class Author {
    private String firstName;
    private String surname;
    private String fullName;
    public Author(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
        fullName = firstName + " " + surname;
    }
    public String getFullName() {
        return this.fullName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getSurname() {
        return this.surname;
    }
    //пишу коммент чисто впихнуть в новую ветку класс
}
