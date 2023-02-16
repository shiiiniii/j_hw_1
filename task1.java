//1. Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! 
package tasks_1;
public class Program{
    
	public static int triangle(int n) {
        if (n == 1) {
            return 1;
        }
        return triangle(n - 1) + 1;
	}    
    public static int recursion(int b) {
		if (b == 1) {
			return 1;
		}
		return recursion(b - 1) * b;
	}
    public static void main(String[] args) {
        System.out.println(triangle(3)+ "=" + "1+2");
        System.out.println("5!" + "=" + recursion(5)); 
    }
}
