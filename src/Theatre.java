import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actorOne = new Actor("Светлана", "Антонова", Gender.FEMALE, 179);
        Actor actorTwo = new Actor("Ирина", "Апексимова", Gender.FEMALE, 171);
        Actor actorThree = new Actor("Дмитрий", "Высоцкий", Gender.MALE, 180);
        Director directorOne = new Director("Юрий", "Муравицкий",
                Gender.MALE, 170, 7);
        Director directorTwo = new Director("Максим", "Диденко",
                Gender.MALE, 175, 1);
        Person musicAuthor = new Person("Иван", "Кушнир", Gender.MALE, 175);
        Person choreographer = new Person("Ксения", "Тер-Григорян", Gender.FEMALE, 168);

        //создаем спектакли
        ArrayList<Actor> listOfActorsShow = new ArrayList<>();
        listOfActorsShow.add(actorOne);
        listOfActorsShow.add(actorTwo);
        Show show = new Show("Беги, Алиса, беги", 90, directorOne, listOfActorsShow);

        ArrayList<Actor> listOfActorsOpera = new ArrayList<>();
        listOfActorsOpera.add(actorTwo);
        listOfActorsOpera.add(actorThree);
        Opera opera = new Opera("Пиковая дама", 120, directorTwo, listOfActorsOpera, musicAuthor,
                "Либретто 'Пиковая дама'", 32);

        ArrayList<Actor> listOfActorsBallet = new ArrayList<>();
        listOfActorsBallet.add(actorOne);
        listOfActorsBallet.add(actorTwo);
        Ballet ballet = new Ballet("Лебединое озеро", 100, directorOne, listOfActorsBallet, musicAuthor,
                "Либретто 'Лебединое озеро'", choreographer);

        //выводим список актеров для каждого спектакля
        show.printlistOfActors(listOfActorsShow, show.title);
        System.out.println("-".repeat(20)); //разделительная строка для удобства прочтения
        opera.printlistOfActors(listOfActorsOpera, opera.title);
        System.out.println("-".repeat(20)); //разделительная строка для удобства прочтения
        ballet.printlistOfActors(listOfActorsBallet, ballet.title);
        System.out.println("-".repeat(20)); //разделительная строка для удобства прочтения

        //заменим актера
        show.changeActor(actorThree, "Антонова");
        System.out.println("Список актеров после замены");
        show.printlistOfActors(listOfActorsShow, show.title);
        System.out.println("-".repeat(20)); //разделительная строка для удобства прочтения

        //заменим несуществующего актера
        ballet.changeActor(actorThree, "Прокофьев");
        System.out.println(" ".repeat(20));//разделительная строка для удобства прочтения
        System.out.println("Список актеров после неудачной замены");
        ballet.printlistOfActors(listOfActorsBallet, ballet.title);
        System.out.println("-".repeat(20)); //разделительная строка для удобства прочтения

        //добавим актера
        opera.addNewActor(actorOne);
        System.out.println(" ".repeat(20));//разделительная строка для удобства прочтения
        System.out.println("Список актеров после добавления");
        opera.printlistOfActors(listOfActorsOpera, opera.title);
        System.out.println("-".repeat(20)); //разделительная строка для удобства прочтения

        //добавим существующего актера
        opera.addNewActor(actorTwo);
        System.out.println(" ".repeat(20));//разделительная строка для удобства прочтения
        System.out.println("Список актеров после неудачного добавления");
        opera.printlistOfActors(listOfActorsOpera, opera.title);
        System.out.println("-".repeat(20)); //разделительная строка для удобства прочтения

        //выводим текст либретто
        opera.printlibrettoText(opera.librettoText);
        System.out.println("-".repeat(20)); //разделительная строка для удобства прочтения
        ballet.printlibrettoText(ballet.librettoText);
        System.out.println("-".repeat(20)); //разделительная строка для удобства прочтения

    }
}