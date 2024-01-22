package xshohrukh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        topshiriq1();
        topshiriq2();
        topshiriq3();
        topshiriq4();
        topshiriq5();
    }

    public static void topshiriq1(){
        //a.
        List<String> colours = new ArrayList<>();
        colours.add("Qora");
        colours.add("Qizil");
        colours.add("Oq");
        colours.add("Kulrang");
        colours.add("Moviy");
        colours.add("Pushti");
        colours.add("Yashil");
        System.out.println(colours);
        //b.
        colours.set(0, "Ko'k");
        System.out.println(colours);
        //c.
        System.out.println(colours.toArray().length);
    }
    public static void topshiriq2(){
        //a.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(11);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers.indexOf(2));
        //b
        List<Integer> numbersClone = new ArrayList<>(numbers);
        System.out.println(numbersClone);
        //c
        Collections.shuffle(numbersClone);
        System.out.println("numbersClone = " + numbersClone);
    }

    public static void topshiriq3(){
        //a.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(21);
        numbers.add(11);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        //b.
        List<Integer> subNumbers = numbers.subList(1, 3);
        System.out.println(subNumbers);
    }

    public static void topshiriq4(){
        List<String> colour1 = new ArrayList<>();
        colour1.add("Green");
        colour1.add("Red");
        List<String> colour2 = new ArrayList<>();
        colour2.add("Green");
        colour2.add("Black");
        List<String> result = new ArrayList<>();

        for (String s : colour1) {
            if (colour2.contains(s))
                result.add("Yes");
            else
                result.add("No");
        }
        System.out.println(result);
    }

    public static void topshiriq5() {
        //a
        List<String> list = new ArrayList<>();
        list.add("Element1");
        list.add("Element2");
        System.out.println(list);
        Collections.swap(list, 0, 1);
        System.out.println(list);
        //b
        List<String> list2 = new ArrayList<>();
        list.add("Element1");
        list.add("Element2");
        list.addAll(list2);
        System.out.println(list2);
        System.out.println(list);
        //c
        List<Integer> numbers = new ArrayList<>(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println(numbers);
    }
}