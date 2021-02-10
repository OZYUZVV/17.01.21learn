package calc.data;

import java.util.Scanner;

public class UserInteraction {
    private static Scanner jj = new Scanner(System.in);

    public static double getParamets() {
        System.out.println("Введитее число: ");
        return jj.nextDouble();
    }

    public static char operation() {
        System.out.println("Введите операцию: ");
        char operation = jj.next().charAt(0);
        while (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            System.out.println("Вы ввели ошибочную операцию, попробуйте еще раз");
            operation = jj.next().charAt(0);

        }
        return operation;
    }
    public static double getRightDelimmiter(double b){
        while (b==0){
            System.out.println("Error,введи другое значение");
            b = jj.nextDouble();// сканируем новое значение если то что ввел пользователь не подходит
        }
        return b;// возвращаем правильное значение
    }
    public static void closeScanner(){
        jj.close();
    }

}
