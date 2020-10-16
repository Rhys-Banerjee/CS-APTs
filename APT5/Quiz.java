public class Quiz {
    public static int calc(int n){
        if (n == 0) return 1;
        return 2 * calc(n-1);
    }
    public static void main(String[] args){
        System.out.println(calc(4));
    }
    
}
