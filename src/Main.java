public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int i = 900;
        System.out.println("Значение переменной i с типом int равно" + i);
        byte b = 10;
        System.out.println("Зрачение переменной b с типом byte равно" + b);
        short s = 200;
        System.out.println("Значение переменной s с типом short равно" + s);
        long l = 2000L;
        System.out.println("Значение переменной l c типом long равно" + l);
        float f = 10.55f;
        System.out.println("Значение переменной f с типом float равно" + f);
        double d = 50.123;
        System.out.println("Значение переменной d с типом double равно" + d);

    }

    public static void task2() {
        System.out.println("Задача 2");
        float f = 27.12f;
        System.out.println(f);
        long l = 987678965549L;
        System.out.println(l);
        double d = 2.786;
        System.out.println(d);
        int i = 569;
        System.out.println(i);
        short s = -159;
        System.out.println(s);
        int i1 = 27897;
        System.out.println(i1);
        byte b = 67;
        System.out.println(b);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte oneClass = 23;
        byte twoClass = 27;
        byte threeClass = 30;
        int lists = 480;
        int students = oneClass + twoClass + threeClass; // Всего учеников
        int evryStudent = lists / students; // Листов бумаги на каждого ученика
        System.out.println("На каждого ученика рассчитано" + evryStudent + "листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte machinePerform = 16; // Бутылок за две минуты
        int machinePerform1 = machinePerform / 2; // Бутылок за одну минуту
        int bottelTventyMinets = machinePerform1 * 20;
        System.out.println("За 20 минут машина произвела" + bottelTventyMinets + "штук бутылок");
        byte oneClok = 60; // Минут в часе
        int sytku = 24 * oneClok; // Минут в сутках
        int bottelSytku = sytku * machinePerform1;
        System.out.println("За сутки машина произвела" + bottelSytku + "штук бутылок");
        int minutesThreeDay = sytku * 3; // Минут за три дня
        int bottelThreeDay = minutesThreeDay * machinePerform1;
        System.out.println("За 3 дня машина произвела" + bottelThreeDay + "штук бутылок");
        int minutesMonth = sytku * 30; // Минут за месяц
        int bottelMonth = minutesMonth * machinePerform1;
        System.out.println("За 1 месяц машина произвела" + bottelMonth + "штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int vcegoBanok = 120; // Всего краски
        byte whiteOneClass = 2; // Белой на один класс
        byte brownOneClass = 4; // Коричневой на один класс
        int oneClass = whiteOneClass + brownOneClass; // Краска на один класс
        int classes = vcegoBanok / oneClass; // Классов в школе
        int whiteColor = classes * whiteOneClass;
        int brownColor = classes * brownOneClass;
        System.out.println("В школе, где" + classes + "классов, нужно" + whiteColor + "банок белой краски и" + brownColor +
                "банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5; // 1 банан - 80 грамм
        int milk = 200; // 100мл = 105 грамм
        int iceCream = 2; // 1 брикет - 100 грамм
        byte eggs = 4; // 1 яйцо - 70 грамм
        int weightBananasGr = bananas * 80;
        int weightMilkGr = milk * 105 / 100;
        int weightIceCreamGr = iceCream * 100;
        int weightEggsGr = eggs * 70;
        int weightGr = weightBananasGr + weightMilkGr + weightIceCreamGr + weightEggsGr;
        System.out.println(weightGr);
        int grPerKg = 1000; // Грамм в одном килограмме
        float weightKg = weightGr / (float)grPerKg;
        System.out.println(weightKg);

    }

    public static void task7() {
        System.out.println("Задача 7");
        byte loseWeight = 7; // Вес в килограммах
        int losesWeight = 250;
        int loses1Weight = 500;
        int grPerKg = 1000; // Грамм в 1 килограмме
        float loseWeightGr = loseWeight * (float) grPerKg; // Вес в граммах
        float losesWeightDays = loseWeightGr / losesWeight;
        System.out.println(losesWeightDays);
        float loses1WeightDays = loseWeightGr / loses1Weight;
        System.out.println(loses1WeightDays);
        float averageWeightDays = (losesWeightDays + loses1WeightDays) / 2;
        System.out.println(averageWeightDays);

    }

    public static void task8() {
        System.out.println("Задача 8");
        int mashaReceives = 67760;
        int denisReceives = 83690;
        int kristinaReceives = 76230;
        int year = 12;
        int increase = 10; // Увеличить в процентах
        int mashaPercent = mashaReceives * increase / 100;
        int mashaGet = mashaReceives + mashaPercent;
        int mashaYear = mashaReceives * year;
        int mashaYearGet = mashaGet * year;
        int mashaDifference = mashaYearGet - mashaYear;
        System.out.println("Маша теперь получает" + mashaGet + "рублей. Годовой доход вырос на" + mashaDifference +
                "рублей");
        int denisPercent = denisReceives * increase / 100;
        int denisGet = denisReceives + denisPercent;
        int denisYear = denisReceives * year;
        int denisYearGet = denisGet * year;
        int denisDifference = denisYearGet - denisYear;
        System.out.println("Денис теперь получает" + denisGet + "рублей. Годовой доход вырос на" + denisDifference +
                "рублей");
        int kristinaPercent = kristinaReceives * increase / 100;
        int kristinaGet = kristinaReceives + kristinaPercent;
        int kristinaYear = kristinaReceives * year;
        int kristinaYearGet = kristinaGet * year;
        int kristinaDifference = kristinaYearGet - kristinaYear;
        System.out.println("Кристина теперь получает" + kristinaGet + "рублей. Годовой доход вырос на"
                + kristinaDifference + "рублуй");


    }


}





