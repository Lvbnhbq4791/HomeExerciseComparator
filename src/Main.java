import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        int maxNumLetSurname = 6;// максимальное колличество слов в фамилии
        persons.add(new Person("Ваня", "Иванов", 30));
        persons.add(new Person("Сергей", "Митрофанов", 25));
        persons.add(new Person("Игорь", "Вавилов", 40));
        persons.add(new Person("Петр", "Зуев", 65));
        persons.add(new Person("Олег", "Цой", 10));
        persons.add(new Person("Миша", "Орлов", 55));
        Comparator<Person> comparison = (o1, o2) -> {
            if (o1.getSurname().length() >= maxNumLetSurname && o2.getSurname().length() < maxNumLetSurname)
                return -1;
            else if (o1.getSurname().length() < maxNumLetSurname && o2.getSurname().length() >= maxNumLetSurname)
                return 1;
            else if (o1.getSurname().length() >= maxNumLetSurname && o2.getSurname().length() >= maxNumLetSurname)
                return Integer.compare(o2.getAge(), o1.getAge());
            else if (o1.getSurname().length() > o2.getSurname().length())
                return -1;
            else if (o1.getSurname().length() < o2.getSurname().length())
                return 1;
            else return Integer.compare(o2.getAge(), o1.getAge());
        };
        persons.sort(comparison);
        System.out.println("Cравнение людей по принципу знатности");
        System.out.println("Список знатных людей:");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}
