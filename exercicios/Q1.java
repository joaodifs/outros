import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int n = 50; // vai calcular a sequencia ate o 50º numero

            verificarFibo(n, numero);

        scanner.close();
        }

    public static void verificarFibo(int n, int numero) {
        int[] fibonacci = new int[n];
        
        if (n > 0) fibonacci[0] = 0;
        if (n > 1) fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        boolean resp = false;
        for (int i=0; i<n;i++){
            if(numero==fibonacci[i]){
                resp=true;
            }
        }
        if(resp){
            System.out.println(numero+" esta na sequencia de fibonacci.");
        }else{
            System.out.println(numero+" nao esta na sequencia de fibonacci.");
        }
}
}