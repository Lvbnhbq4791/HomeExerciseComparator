# Описание сравнения  людей по принципу знатности
1.В классе `PersonsSurnameLengthComparator` в поле `maxNumberLettersSurname` через конструктор прописываем       
количество минимальное колличество букв в фамилии для сравнения обьектов                                               
в методе `public int compare(Person o1, Person o2)` сначала прописываем условие сравнения обьектов с учетом значения     
поля `maxNumberLettersSurname`, где определяем фамилии которые по колличеству букв равны или больше значения поля
`maxNumberLettersSurname` и записываем их в первые ячейки списка в порядке уменьшения возраста:
```java
        if(o1.getSurname().length()>maxNumberLettersSurname-1 && o2.getSurname().length()<maxNumberLettersSurname){
        return -1;
        }else if(o1.getSurname().length()<maxNumberLettersSurname && o2.getSurname().length()>maxNumberLettersSurname-1){
        return 1;
        }else if(o1.getSurname().length()>maxNumberLettersSurname-1 && o2.getSurname().length()>maxNumberLettersSurname-1){
        return Integer.compare(o2.getAge(), o1.getAge());
```

2.В следующей части кода 
```java
        }else if(o1.getSurname().length()>o2.getSurname().length()){
        return -1;
        }else if(o1.getSurname().length()<o2.getSurname().length()){
        return 1;
        }else{
        return Integer.compare(o2.getAge(), o1.getAge());
        }
```
прописываев условия сравнения обьектов когда колличество слов в фамилии меньше значения поля   
`maxNumberLettersSurname` и записываем их в ячейки списка в порядке уменьшения колличества букв в фамилии если   
они равны в порядке уменьшения возраста.                                                                                 

3.Если надо чтобы выводились только те обьекты у которых колиличество букв в фамилии не меньше значения поля             
`maxNumberLettersSurname`, тогда в классе `PersonsSurnameLengthComparator` прописываем метод 
```java
    public int getMaxNumberLettersSurname() {
        return maxNumberLettersSurname;
    }
```
который возращает значение поля `maxNumberLettersSurname`, в классе `Main` создаем обьект класса `PersonsSurnameLengthComparator`
`PersonsSurnameLengthComparator personSurname =  new PersonsSurnameLengthComparator();`
и меняем код цикла `for` на следующий:
```java
        for (int i = 0; i < persons.size(); i++) {
            Person p = persons.get(i);
            if(p.getSurname().length()> personSurname.getMaxNumberLettersSurname()-1){
                System.out.println(p);
            }
```

4.Если нужно отделить обьекты с меньшим колличеством букв в фамилии и вывести на экран
прописываем все что сказано в пункте 3, кроме цикла `for` он будет другой, а именно:
```java
        for (int i = 0; i < persons.size(); i++) {
            Person p = persons.get(i);
            if (p.getSurname().length() > personSurname.getMaxNumberLettersSurname() - 1) {
                System.out.println(p);
            } else {
                if(ch==0){
                    System.out.println("_________________________");
                    System.out.println("Список не знатных людей:");
                    ch++;
                }
                System.out.println(p);
            }
        }
```
для выполнения условия:
```java
                if(ch==0){
                    System.out.println("_________________________");
                    System.out.println("Список не знатных людей:");
                    ch++;
                }
```
выше цикла заводим переменную `int ch=0;`.




