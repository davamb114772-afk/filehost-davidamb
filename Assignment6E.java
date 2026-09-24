import java.util.Scanner;
public class Assignment6D {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double c2 = 0;
        double a2 = 0;
        double b2 = 0;
        int value2 = 0;
        double angle1 = 0;
        double angle2 = 0;
        boolean value = true;
        System.out.println("This is a program to do pythagorean theorem");
        while(value = true){
            System.out.print("Input the first number ");
            a = input.nextInt();
            System.out.print("Input the second number ");
            b = input.nextInt();
            a2 = a * a;
            System.out.println(a);
            b2 = b * b;
            System.out.println(b);
            c = a2 + b2;
            c2 = Math.pow(c, 0.5);
            System.out.println(c2);
            angle1 = Math.atan2(a, b);
            angle1 = Math.toDegrees(angle1);
            angle2 = 90 - angle1;
            System.out.printf("The acute angles are %f and %f %n", angle1, angle2);
            System.out.println("Do you want to end the program type 1 if yes");
            value2 = input.nextInt();
            if(value2 == 1){
                System.exit(0);
            }

        }
    }
    
}
