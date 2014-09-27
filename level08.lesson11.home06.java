package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human son1 = new Human("Son1", true, 3);
        Human son2 = new Human("Son2", true, 4);
        Human doughter = new Human("doughter", false, 5);

        ArrayList<Human> ch = new ArrayList<Human>();
        ch.add(son1);
        ch.add(son2);
        ch.add(doughter);

        Human man = new Human("man", true, 20, ch);
        Human woman = new Human("woman", false, 19, ch);

        ArrayList<Human> chM = new ArrayList<Human>();
        chM.add(man);
        ArrayList<Human> chW = new ArrayList<Human>();
        chW.add(woman);

        Human GFman = new Human("GFman", true, 45, chM);
        Human GMman = new Human("GMman", false, 44, chM);

        Human GFwoman = new Human("GFwoman", true, 46, chW);
        Human GMwoman = new Human("GMwoman", false, 43, chW);

        System.out.println(son1);
        System.out.println(son2);
        System.out.println(doughter);
        System.out.println(man);
        System.out.println(woman);
        System.out.println(GFman);
        System.out.println(GMman);
        System.out.println(GFwoman);
        System.out.println(GMwoman);
    }

    public static class Human
    {
        //Написать тут ваш код
        private String name;
        private Boolean sex;
        private int age;
        public ArrayList<Human> children = new ArrayList<Human>();

        Human(String name, Boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        Human(String name, Boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
