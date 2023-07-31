import java.util.Objects;

public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String toString() {
        return firstName + " " + secondName;
    }

    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }

    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;
        Author author = (Author) a;
        return Objects.equals(firstName, author.firstName) && Objects.equals(secondName, author.secondName);

    }



}
