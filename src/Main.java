import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Ваня", "Иванов", 30));
        persons.add(new Person("Сергей", "Митрофанов", 25));
        persons.add(new Person("Игорь", "Ввавилов", 40));
        persons.add(new Person("Петр", "Зуев", 65));
        persons.add(new Person("Олег", "Цой", 10));
        persons.add(new Person("Миша", "Орлов", 55));
        Collections.sort(persons, new PersonsSurnameLengthComparator());
        PersonsSurnameLengthComparator personSurname = new PersonsSurnameLengthComparator();
        System.out.println("Cравнение людей по принципу знатности:");
        System.out.println("Список знатных людей:");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}
