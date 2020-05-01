package com.company;

public class Main {

    public static void main(String[] args) {

        Name n1 = new Name("Эльсанта","Сахар 4,5-7,9% Кислота 0,78% С витамин 53,2-86,5 мг в 100 г Р " +
                "витамин 80-126,4 мг" +" в 100 г\n");
        Name n2 = new Name ("Сударушка","Сахар 6 % Кислота 0,88% С витамин 55,2-66,5 мг в 100 г Р \" +\n" +
                "                \"витамин 80 мг\" ");
        Name n3 = new Name ("Мальвина", "Сахар 9% Кислота 0,8% С витамин 2,2-96,5 мг в 100 г Р \" +\n" +
                "                \"витамин 126,4 мг\" +\" в 100 г\\n\"");


        Strawberry strawberry = new Strawberry(n1, "Клубника", Colors.RED);
        Raspberry raspberry = new Raspberry(n2, "Малина", Colors.PINK);
        Raspberry raspberry1 = new Raspberry(n3, "Ежемалина", Colors.MAROON);


        strawberry.makeGift("Сахар 6 % Кислота 0,88% С витамин 55,2-66,5 мг в 100 г Р \" +\n" +
                "                \"витамин 80 мг\" ", 2);
        strawberry.makeGift("Сахар 4,5-7,9% Кислота 0,78% С витамин 53,2-86,5 мг в 100 г Р " +
                "витамин 80-126,4 мг" +" в 100 г\n", 3);
                raspberry.makeGift(1);


        System.out.println(strawberry.getInfo());
        System.out.println(raspberry.getInfo());
        System.out.println(raspberry1.getInfo());
    }
}
