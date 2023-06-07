//ROWEL B. DACUT
//BSCOE 2-3
public class assignment3 {
    public static void main(String[] args) {
    int n = 11;
    int t1 = 0, t2 = 1;
    
    System.out.print("First " + n + " terms: ");
    for (int i = 1; i <= n; ++i) {
        System.out.print(t1 + " + ");

        int sum = t1 + t2;
        t1 = t2;
        t2 = sum;}
    }
}
