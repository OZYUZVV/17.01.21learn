package calc.data;

public class Calculator {
    public static void calculation(double a,double b,char operation){
        // + - / =
        double result;
         if(operation=='+'){
             result = a + b;

         }
         else if (operation=='-'){
             result = a - b;
        }
         else if (operation=='*'){
             result= a*b;

         }
         else{
             if (b==0){
                 b = UserInteraction.getRightDelimmiter(b);
                 result = a/b;
                 /*System.out.println("wrong delimiter ");
                 result = -1;*/
             }else{
                 result =a/b;

             }
         }
        System.out.println("Result is "+result);


    }
}
