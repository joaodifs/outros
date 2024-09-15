import java.util.Scanner;
class Q2{
    public static void contarAs(String palavra){
        int cont = 0;
        for(int i =0; i<palavra.length();i++){
            if(palavra.charAt(i)=='a'){
                cont++;
            }
        }
        if(cont==0){
            System.out.println("A palavra digitada nao tem a letra 'a'");
        }else{
            System.out.println("A palavra digitada tem "+cont+" letras 'a'");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        contarAs(palavra);
        scanner.close();
    }
}