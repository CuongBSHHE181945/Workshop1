import java.util.Scanner;
public class part2 {
    public static void main(String[] Args){
        float num1, num2;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num 1: ");
        num1=sc.nextFloat();
        System.out.print("Enter the num 2: ");
        num2=sc.nextFloat();
        System.out.print("Enter the operation: ");
        sc=new Scanner(System.in);
        op=sc.nextLine();
        switch (op) {
            case "+":System.out.println("The result of " + num1 + op + num2 + "=" + (num1+num2));
                    break;
            case "-":System.out.println("The result of " + num1 + op + num2 + "=" + (num1-num2));
                    break;
            case "*":System.out.println("The result of " + num1 + op + num2 + "=" + (num1*num2));
                    break;
            case "/":System.out.println("The result of " + num1 + op + num2 + "=" + (num1/num2));
                    break; 
            default:System.out.println("Operator is not supported");
                    break;
        }
    }
}
