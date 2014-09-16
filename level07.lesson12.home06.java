package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
 Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human GF1 = new Human("Игорь", true, 88, null, null);
        Human GM1 = new Human("Катя", false, 90, null, null);
        Human GF2 = new Human("Вениамин", true, 88, null, null);
        Human GM2 = new Human("Изольда", false, 90, null, null);
        Human father = new Human("Лось", true, 55, GF1, GM1);
        Human mother = new Human("Лосиха", false, 53, GF2, GM2);
        Human son = new Human("Лосёнок", true, 21, father, mother);
        Human doughter = new Human("Лосасиха", false, 19, father, mother);

        System.out.println(GF1);
        System.out.println(GM1);
        System.out.println(GF2);
        System.out.println(GM2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(doughter);
    }

    public static class Human
    {
        //Написать тут ваш код
        private String name;
        private Boolean sex;
        private int age;
        private Human father;
        private Human mother;

        Human(String name, Boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
    }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
