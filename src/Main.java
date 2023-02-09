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

    //2
        byte a = 67;
        short b = -159;
        int c = 27897;
        long d = 987678965549L;
        float e = 27.12F;
        double f = 2.786;

    //3
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        float paperSheets = 480 / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано "+ paperSheets + " листов бумаги");

    //4
        byte bottlesPer2Min = 16;
        int bottlesPer20Min = bottlesPer2Min / 2 * 20; // или * 10, с шортом не считает
        int bottlesPer24H = bottlesPer2Min / 2 * 60 * 24;
        float bottlesPer3D = bottlesPer24H * 2.5F; //если без перерыва, то 2 суток и 1 день, а не 3 дня
        //
    }
}