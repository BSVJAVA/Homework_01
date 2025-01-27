public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задача 6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println(totalWeight);
        var differenceWeight = boxerWeight2 - boxerWeight1;
        System.out.println(differenceWeight);
        //Задача 7
        var remainsWeight = boxerWeight2 % boxerWeight1;
        System.out.println(remainsWeight);
        //Задача 8
        var fullTime = 640;       //Полное время в часах
        var timeWorkingDay = 8;   //Время рабочего дня в часах
        var workHuman = 640 / 8;  //Количество работающих людей в компании
        System.out.println("Всего работников в компании — " + workHuman + " человек");
        workHuman = workHuman + 94;
        var timeWorkNew = fullTime / workHuman;
        System.out.print("Если в компании работает ");
        System.out.print(workHuman + " человек, то всего ");
        System.out.print(timeWorkNew + " часа работы может быть поделено между сотрудниками");
    }
}