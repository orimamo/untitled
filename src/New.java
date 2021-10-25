import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
       // Scanner scanner3 = new Scanner(System.in);

        // System.out.println("which math calculate do you want to do ? " );
        //System.out.println("1.add \n2. -\n3. *\n4. / ");
        int choise;
        int choise1;
        float firstNumber;
        float secondNumber;
        float sum;
        System.out.println("do you want to start? 1-yes \n2-no");
        choise = scanner.nextInt();
        while (choise == 1)
        {
            System.out.println("which math calculate do you want to do ? ");
            System.out.println("1.add \n2. sub\n3. multipliction\n4.division \n5.exit");
            choise1 = scanner1.nextInt();
            if (choise1 == 1) {
                System.out.println("enter the first number : ");
                firstNumber = scanner2.nextInt();
                System.out.println("enter the second number : ");
                secondNumber = scanner2.nextInt();
                sum = firstNumber + secondNumber;
                System.out.println("the sum is: " + sum);
                continue;
            }
            if (choise1 == 2)
            {
                System.out.println("enter the first number : ");
                firstNumber = scanner2.nextInt();
                System.out.println("enter the second number : ");
                secondNumber = scanner2.nextInt();
                sum = firstNumber - secondNumber;
                System.out.println("the sum is: " + sum);
                continue;
            }
            if (choise1 == 3) {
                System.out.println("enter the first number : ");
                firstNumber = scanner2.nextInt();
                System.out.println("enter the second number : ");
                secondNumber = scanner2.nextInt();
                sum = firstNumber * secondNumber;
                System.out.println("the sum is: " + sum);
                continue;
            }
            if (choise1 == 4) {
                System.out.println("enter the first number : ");
                firstNumber = scanner2.nextInt();
                System.out.println("enter the second number : ");
                secondNumber = scanner2.nextInt();
                sum = firstNumber / secondNumber;
                System.out.println("the sum is: " + sum);
                continue;
            }
            if (choise1 == 5);
            {
                break;
            }
            //System.out.println("wrong number!!!");
            // break;
        }
        System.out.println("goodbye");

    }

}

