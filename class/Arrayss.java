/*class Arrayss{
	public static void main(String args[]){
		
	float arr[]={1.2f,882f,5.0f};
	double arrs[]={13.99,22.9,20.9};
	System.out.println("float values"+arr[0]+" "+arr[1]+" "+arr[2]);
	System.out.println("double values"+arrs[0]+" "+arrs[1]+" "+arrs[2]);

	}

}*/
public class Arrayss  {
    public static void main(String[] args) {
        int n = 10; // total items
        int r = 3; // items to choose
        long ncr = calculateNCR(n, r);
        System.out.println("NCR(" + n + "," + r + ") = " + ncr);
    }

    public static long calculateNCR(int n, int r) {
        long numerator = factorial(n);
        long denominator = factorial(r) * factorial(n - r);
        return numerator / denominator;
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
