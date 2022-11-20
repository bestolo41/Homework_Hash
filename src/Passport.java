import java.util.Map;
import java.util.Objects;

public class Passport {
    private String passNum;
    private String name;
    private String surname;
    private String patronymic;

    public Passport(String passNum, String name, String surname, String patronymic) {
        this.passNum = passNum;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Passport(String passNum, String name, String surname) {
        this(passNum, name, surname, null);
    }

    public String getPassNum() {
        return passNum;
    }

    public void setPassNum(String passNum) {
        this.passNum = passNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void addTo(Map<String, Passport> map) {
        map.put(this.getPassNum(), this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passNum, passport.passNum) && Objects.equals(name, passport.name) && Objects.equals(surname, passport.surname) && Objects.equals(patronymic, passport.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passNum, name, surname, patronymic);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passNum='" + passNum + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
