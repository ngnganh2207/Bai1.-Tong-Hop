import java.util.Scanner;

public class TestVongLap {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        int number1= number.nextInt();
        int number2= number.nextInt();
        int expectedAnswer = number.nextInt();
        while(number1+number2!= expectedAnswer){
            System.out.print("Wrong answer");
            expectedAnswer=number.nextInt();
        }
        System.out.print("You got it!");
    }
}
