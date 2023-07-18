import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //сужение типов
        int intVar = 1000;
        byte byteVar = (byte)intVar;

        System.out.println(byteVar);

        //расширение типов
        byte byteVar2 =10;
        int intVar2 = byteVar2;

        System.out.println(intVar);

        //сужение  типов
        double doubleVar = 1200889.5;
        float floatVar = (float)doubleVar;

        System.out.println(floatVar);

        //расширение типов
        float floatVar2 = 132.6f;
        double doubleVar2 = floatVar2;

        System.out.println(doubleVar2);




        Scanner scanner = new Scanner(System.in);

        System.out.print("Как вас зовут?:");
        String name = scanner.nextLine();

        System.out.println();
        System.out.println("Привет," +name);



























    }
}