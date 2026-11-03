import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

// Float multiplication
/*public class Newprograms {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();
        double mul = first * second;
        System.out.println("\n result is: " + mul);
    }
}*/


// To calculate perimeter of rectangle
/*public class Newprograms {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        double first = input.nextDouble();
        System.out.print("Enter the second side: ");
        double second = input.nextDouble();
        System.out.print("Enter the third side: ");
        double third = input.nextDouble();
        System.out.print("Enter the fourth side: ");
        double fourth = input.nextDouble();
        double perimeter = first + second + third + fourth;
        System.out.println("\n result is: " + perimeter);
    }
}*/


// To calculate simple interest
/*public class Newprograms {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle value: ");
        int principle = input.nextInt();
        System.out.print("Enter the rate: ");
        float rate = input.nextFloat();
        System.out.print("Enter the time: ");
        float time = input.nextFloat();
        float interest = (principle * rate * time) / 100;
        System.out.println("\n result is: " + interest);
    }
}*/



// To calculate compound interest
/*public class Newprograms {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle value: ");
        int principle = input.nextInt();
        System.out.print("Enter the rate: ");
        float rate = input.nextFloat();
        System.out.print("Enter the time: ");
        float time = input.nextFloat();
        double interest = principle * Math.pow((1 + rate / 100), time) ;
        System.out.println("\n result is: " + interest);
    }
}*/




// To convert farenheit to celsius
/*public class Newprograms {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temp in F: ");
        float feh = input.nextFloat();
        float cel = (feh - 32) * 5 / 9;
        System.out.println("\n result is: " + cel);
    }
}*/



// To find greatest of two numbers
/*public class Newprograms {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int firstnum = input.nextInt();
        System.out.print("Enter the second num: ");
        int secondnum = input.nextInt();
        System.out.print("Enter the third num: ");
        int thirdnum = input.nextInt();
        if (firstnum >= secondnum && firstnum >= thirdnum)
        {
            System.out.println(firstnum + " is the greatest");
        }
        else if (secondnum >= firstnum && secondnum >= thirdnum)
        {
            System.out.println(secondnum + " is the greatest");
        }
        else {
            System.out.println(thirdnum + " is the greatest");
        }

    }
}*/



// To check the leap year
/*public class Newprograms {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        if (year % 400 == 0)
        {
            System.out.println("leap year");
        }
        else if (year % 4 == 0 && year % 100 != 0){
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }

    }
}*/


//Program to check whether a number is even or odd using bitwise operator

//public class Newprograms {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        if ((num & 1) == 1) {
//            System.out.println("your number is odd");
//        } else{
//            System.out.println("your number is even");
//        }
//    }
//}


//Program to print the table of a number
//public class Newprograms {
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        printMultiplicationTable(num);
//
//
//    }
//    public static void printMultiplicationTable(int num){
//        int i = 1;
//        while (i <= 10){
//            System.out.println(num + "X" + i + " = " + (num * i));
//            i++;
//        }
//
//    }
//}


//Program to print sum of all odd numbers from 1 to specified number
//public class Newprograms {
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        int sum = oddsum(num);
//        System.out.println(sum);
//
//
//    }
//    public static int oddsum(int num){
//        int sum = 0;
//        int i = 1;
//        while (i <= num){
//            sum = sum + i;
//            i += 2;
//        }
//        return sum;
//
//    }
//}

//To calculate factorial of a number
//public class Newprograms {
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        long fact = factorial(num);
//        System.out.println(fact);
//
//
//    }
//    public static long factorial(int num){
//        long fact = 1;
//        int i = 1;
//        while (i <= num){
//            fact = fact * i;
//            i++;
//        }
//        return fact;
//
//    }
//}

//To print sum of digits of a number
//public class Newprograms {
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        int sum = Sumofdigits(num);
//        System.out.println(sum);
//
//
//    }
//    public static int Sumofdigits(int num){
//        int sum = 0;
//        while (num > 0) {
//            sum  = sum + (num % 10);
//            num = num / 10;
//        }
//        return sum;
//
//    }
//}


//taking LCM of two numbers
//public class Newprograms {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int first = input.nextInt();
//        System.out.print("Enter a number: ");
//        int second = input.nextInt();
//
//        int lcm = lcm(first, second);
//        System.out.println(lcm);
//
//
//    }
//    public static int lcm(int first, int second){
//        int i = 1;
//        while (true) {
//            int factor = first * i;
//            if (factor % second == 0){
//                return factor;
//            }
//            i++;
//        }
//    }
//}

//taking GCD of two numbers
//public class Newprograms {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int first = input.nextInt();
//        System.out.print("Enter a number: ");
//        int second = input.nextInt();
//
//        int gcd = gcd(first, second);
//        System.out.println(gcd);
//
//
//    }
//    public static int gcd(int first, int second){
//        int gcd = 1;
//        int i = 2;
//        int least = least(first, second);
//        while (i <= least){
//            if (first % i == 0 && second % i == 0){
//                gcd = i;
//            }
//            i++;
//        }
//        return gcd;
//    }
//    public static int least(int first, int second){
//        if (first < second) {
//            return first;
//        } else {
//            return second;
//        }
//
//    }
//}


//to check whether a number is prime or not
//taking GCD of two numbers
//public class Newprograms {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        boolean prime = prime(num);
//        if (prime) {
//            System.out.println("number is prime");
//        } else {
//            System.out.println("number is not prime");
//        }
//
//    }
//    public static boolean prime(int num){
//        int i = 2;
//        while (i < num){
//            if (num % i == 0){
//                return false;
//            }
//            i++;
//        }
//            return true;
//        }
//    }

//Reverse the digits of a number
//public class Newprograms {
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        int reverse = reverse(num);
//        System.out.println(reverse);
//
//
//    }
//    public static int reverse(int num){
//        int Newnum = 0;
//        while (num > 0) {
//            int digit = num % 10;
//            Newnum = Newnum * 10 + digit;
//            num = num / 10;
//        }
//        return Newnum;
//
//    }
//}


//print fibonacci series upto a certain number

//public class Newprograms {
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        printfibonacci(num);
//    }
//    public static void printfibonacci(int num){
//        if (num < 0) return;
//        System.out.print("0 ");
//        if (num == 0) return;
//        System.out.print("1 ");
//
//        int first = 0, second = 1;
//        while (first + second <= num) {
//            int third = first + second;
//            System.out.print(third + " ");;
//            first = second;
//            second = third;
//        }
//    }
//}



//print palindrome number
//public class Newprograms {
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = scanner.nextInt();
//        boolean ispalindrome = ispalindrome(num);
//        if (ispalindrome) {
//            System.out.println("It is a palindrome number");
//        } else {
//            System.out.println("It is not a palindrome number.");
//        }
//
//
//    }
//    public static boolean ispalindrome(int num) {
//        return num == reverse(num);
//    }
//    public static int reverse(int num){
//        int Newnum = 0;
//        while (num > 0) {
//            int digit = num % 10;
//            Newnum = Newnum * 10 + digit;
//            num = num / 10;
//        }
//        return Newnum;
//
//    }
//}


//Array Travesal
//public static void main(String[] args) {
//    int[] myArr = {98, 2, 8, 65, 37};
//    int index = 0;
//    while (index < myArr.length){
//        System.out.println(myArr[index]);
//        index++;
//    }
//}


//Array searching
//public class Newprograms {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] arr = {3, 6, 8, 87, 65 ,9, 4, 68, 23, 98, 34};
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        boolean isfound = isfound(arr,num);
//        if (isfound){
//            System.out.println("Number was found in array");
//        } else {
//            System.out.println("Number was not found in array");
//        }
//
//    }
//
//    public static boolean isfound(int[] arr, int num) {
//        int index = 0;
//        while (index < arr.length) {
//            if (arr[index] == num){
//                return true;
//            }
//            index++;
//        }
//        return false;
//
//    }
//}


//2D Array
public class Newprograms {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        //Travesal
        int i = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}











