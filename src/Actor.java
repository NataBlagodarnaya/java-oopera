public class Actor extends Person{

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender, height);
    }


    @Override
    public String toString() {
        return name + " " + surname + " (рост " + height + " см.).";
    }
}
