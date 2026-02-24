import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printlistOfActors(ArrayList<Actor> listOfActors, String title) {
        System.out.println("Название постановки: " + title);
        System.out.println("Список актеров: ");
        for (int i = 0; i < listOfActors.size(); i++) {
            System.out.println((i + 1) + ". " + listOfActors.get(i));
        }
    }

    public void addNewActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Этот актер уже есть в списке!");
                break;
            } else {
                listOfActors.add(newActor);
                break;
            }
        }
    }

    public void changeActor(Actor newActor, String newSurname) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(newSurname)) {
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Такого актера нет в списке!");
        }
    }
}