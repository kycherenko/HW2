public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);

        var weightBoxer1 = 78.2;
        System.out.println(weightBoxer1);
        var weightBoxer2 = 82.7;
        System.out.println(weightBoxer2);
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println(totalWeight);
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println(weightDifference);

        var advantage = weightBoxer2 % weightBoxer1;
        System.out.println(advantage);

        var totalHours = 640;
        System.out.println(totalHours);
        var workingHours = 8;
        System.out.println(workingHours);
        var workers = totalHours / workingHours;
        System.out.println("Всего работников в компании " + workers + " человек");
        workers = workers + 94;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + workers * workingHours + " часов работы может быть поделено между сотрудниками ");


    }

}
