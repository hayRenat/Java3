package Lesson1;

import java.net.Authenticator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
        List<String> list = Arrays.asList("Первый", "Второй", "Третий", "Четвертый");
        ReplacingPlacesInTheArray(list);
        System.out.println(list);

        //2. Написать метод, который преобразует массив в ArrayList;
        String[] array = {"Колин Фаррелл", "Брендан Глисон", "Рэйф Файнс", "Клеманс Поэзи", "Джордан Прентис", "Элизабет Беррингтон"};
        ArrayList arrayList = new ArrayList();
        FromArrayToArraylist(array, arrayList);
        System.out.println(arrayList);

        //3. Большая задача:
        //a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
        //b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        //c. Для хранения фруктов внутри коробки можете использовать ArrayList;
        //d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
        //e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        //f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
        //g. Не забываем про метод добавления фрукта в коробку.
        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange = new Orange();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> appleBox = new Box<>();
        appleBox.add(apple);
        appleBox.add(apple1);
        appleBox.add(apple2);
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(orange);
        orangeBox.add(orange1);
        orangeBox.add(orange2);
        orangeBox.add(orange3);

        System.out.println(appleBox.getWeight());

        System.out.println(orangeBox.getWeight());

        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();


        System.out.println(appleBox);
        System.out.println(orangeBox);
        appleBox.pour(appleBox1);
        System.out.println(appleBox);
        System.out.println(appleBox1);

   }


    private static void ReplacingPlacesInTheArray(List list) {
        try {
            for (int i = 0; i < list.size(); i++) {
                Object obj1 = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, obj1);
            }
        } catch (ArrayIndexOutOfBoundsException e ){
    }
}

    private static void FromArrayToArraylist(Object[] array, ArrayList list) {
        for (int i = 0; i < array.length; i++) {
            list.add(i, array[i]);
        }
    }
}
