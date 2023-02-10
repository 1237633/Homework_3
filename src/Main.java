public class Main {
    public static void main(String[] args) {

    //1
        byte B = 1;
        short S = 228;
        int I = 12345678;
        long L = 9999999999999999L;
        float F = 8.800F;
        double D = 8.8005553535;
        System.out.println("Значение переменной B с типом byte равно " + B);
        System.out.println("Значение переменной S с типом short равно " + S);
        System.out.println("Значение переменной I с типом bint равно " + I);
        System.out.println("Значение переменной L с типом long равно " + L);
        System.out.println("Значение переменной F с типом float равно " + F);
        System.out.println("Значение переменной D с типом double равно " + D);
        System.out.println(" ");

    //2
        byte a = 67;
        short b = -159;
        int c = 27897;
        long d = 987678965549L;
        float e = 27.12F;
        double f = 2.786;

    //3
        byte lP = 23;  //Инициалы преподов
        byte aS = 27;
        byte eA = 30;
        float paperSheets = 480 / (lP + aS + eA);  // а вдруг кому-то попадет пол листа?
        System.out.println("На каждого ученика рассчитано " + paperSheets + " листов бумаги");
        System.out.println(" ");

    //4
        byte bottlesPer2Min = 16;
        int bottlesPer20Min = bottlesPer2Min / 2 * 20; // или * 10, с шортом не считает
        int bottlesPer24H = bottlesPer2Min / 2 * 60 * 24;
        float bottlesPer3D = bottlesPer24H * 2.5F; //если без перерыва, то 2 суток и 1 день, а не 3 дня
        int bottlesPer1M = bottlesPer24H * 30;
        System.out.println("За 20 минут " + bottlesPer20Min + " бутылок");
        System.out.println("За сутки " + bottlesPer24H + " бутылок");
        System.out.println("За 3 дня " + bottlesPer3D + " бутылок");
        System.out.println("За месяц " + bottlesPer1M + " бутылок");
        System.out.println(" ");

    //5
        byte paintCans = 120;
        //На один класс уходит 2 банки белой и 4 банки коричневой краски
        int cabinet = paintCans / 6;
        int white = cabinet * 2;
        int brown = cabinet * 4;
        System.out.println("В школе, где " + cabinet + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
        System.out.println(" ");

    //6
        byte bananana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte drEggman = 70;
        float breakfast = 5*bananana + 2*milk + 2*iceCream + 4*drEggman;
        System.out.println("Завтрак победителя - " + breakfast + "г, или "+ breakfast/1000 + "кг.");
        System.out.println(" ");

    //7
        short days250 = 7000/250;
        short days500 = 7000/500;
        int daysAvg = (days500 + days250)/2;
        System.out.println("От " + days500 + " дней, до " + days250 + " дней. В среднем - " + daysAvg);
        System.out.println(" ");

    //8
            int MashaCurrent = 67760;
            int DenCurrent  = 83690;
            int KrisCurrent = 76230;
            float MashaNew = MashaCurrent * 1.1F;
            float KrisNew = KrisCurrent * 1.1F;
            float DenNew = DenCurrent * 1.1F;
            float MashaDelta = MashaNew - MashaCurrent;
            float DenDelta = DenNew - DenCurrent;
            float KrisDelta = KrisNew - KrisCurrent;
            System.out.println("Маша теперь получает " + MashaNew + ". Надбавка - " + MashaDelta);
            System.out.println("Денис теперь получает " + DenNew + ". Надбавка - " + DenDelta);
            System.out.println("Кристина теперь получает " + KrisNew + ". Надбавка - " + KrisDelta);

    }
}