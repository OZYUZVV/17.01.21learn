package calc.application;

import calc.data.Calculator;
import calc.data.UserInteraction;

import java.util.Scanner;

import static calc.data.UserInteraction.getParamets;

public class CalculatorApplication {
    public static void main(String[] args) {
        /*System.out.println("Введите число a: ");
        Scanner jj = new Scanner(System.in);*/
        /*
        Calculator.calculation(a,b,operation);
        double a = jj.nextDouble();
        System.out.println("Введите число b: ");
        double b = jj.nextDouble();
        System.out.println("Введите операцию: ");
        char operation = jj.next().charAt(0);
        //String это масив char  по этой причине нам нужен первый элемент тоесть нулевой, это про операции.
        while (operation != '+'&& operation != '-' && operation !='*'&& operation !='/'){
            System.out.println("Вы ввели ошибочную операцию, попробуйте еще раз");
            operation = jj.next().charAt(0);
        }
        Calculator.calculation(a,b,operation);
        jj.close();//scanner нужно закрывать для того что бы он не использовал лишнюю память*/
        double a = getParamets();
        double b = getParamets();
        char operation = UserInteraction.operation();
        Calculator.calculation(a,b,operation);
        UserInteraction.closeScanner();



    }

}
