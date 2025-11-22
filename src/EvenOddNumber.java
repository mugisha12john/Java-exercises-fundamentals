import java.util.Scanner;
public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner  input= new Scanner(System.in);
        System.out.println("welcome to this app enter number to check the odd or even\n");
        System.out.print("enter number 1:   ");
        int num1 = input.nextInt();
//        System.out.println("enter number 2 :   ");
//        int num2 =input.nextInt();
        if(num1%2 ==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
}
