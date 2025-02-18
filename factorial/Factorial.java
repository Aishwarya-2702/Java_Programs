public class Factorial{
    public static void main(String[] args){
        int num = 5;
        System.out.println("The entered number is: "+num);
        if(num>=0)
        {
            int factorial = findFactorial(num);
            System.out.println("The Factorial of the entered number is: "+factorial);
        }
        else{
            System.out.println("Not a Factorial");
        }
    }
    public static int findFactorial(int num)
    {
        if(num == 0)
        return 1;
        else{
            return num*findFactorial(num-1);
        }
    }
}