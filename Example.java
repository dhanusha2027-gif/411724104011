// public class Examplesum {

//     public static int CountEvenDigits(int n) {
//         int count = 0;

//         while (n > 0) {
//             int last = n % 10;

//             if (last % 2 == 0)
//                 count++;

//             n = n / 10;
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         int result = CountEvenDigits(123456);
//         System.out.println(result);
//     }
// }



// public class Example {

//     public static int reverseNumber(int n) {
//         int rev = 0;

//         while (n > 0) {
//             int last = n % 10;
//             rev = rev * 10 + last;
//             n = n / 10;
//         }

//         return rev;
//     }

//     public static void main(String[] args) {
//         int num = 1234;
//         System.out.println(reverseNumber(num));
//     }
// }



// public class Example {

//     public static void main(String[] args) {

//         int n = 121;
//         int original = n;
//         int rev = 0;

//         while (n > 0) {
//             int last = n % 10;
//             rev = rev * 10 + last;
//             n = n / 10;
//         }

//         if (original == rev)
//             System.out.println("Palindrome");
//         else
//             System.out.println("Not Palindrome");
//     }
// }


public class Example {

    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }

        return temp == sum;
    }

    public static void main(String[] args) {
        int num = 153;

        if (isArmstrong(num))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}