import java.util.Comparator;

public class PersonsSurnameLengthComparator implements Comparator<Person> {
    protected int maxNumberLettersSurname;

    public PersonsSurnameLengthComparator(int maxNumberLettersSurname ) {
        this.maxNumberLettersSurname = maxNumberLettersSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() > maxNumberLettersSurname - 1 && o2.getSurname().length() < maxNumberLettersSurname) {
            return -1;
        } else if (o1.getSurname().length() < maxNumberLettersSurname && o2.getSurname().length() > maxNumberLettersSurname - 1) {
            return 1;
        } else if (o1.getSurname().length() > maxNumberLettersSurname - 1 && o2.getSurname().length() > maxNumberLettersSurname - 1) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else if (o1.getSurname().length() > o2.getSurname().length()) {
            return -1;
        } else if (o1.getSurname().length() < o2.getSurname().length()) {
            return 1;
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }
}
