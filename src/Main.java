import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        System.out.print("ilk sayıyı girin");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı girin");
        n2 = input.nextInt();
        int i =n1*n2;
        int ebob=0;
        int ekok=0;
        while (i!=1) {
        if (n1%i==0 && n2%i==0){
            ebob=i;
            System.out.println("ebob "+ebob);
            break;
        }
            i--;
        }
        int a=1;
        while ( a <=n1*n2){
        if (a%n1==0 && a%n2==0){
            ekok=a;
break;
        }
        a++;
}
        System.out.println("ekok " + ekok);
    }
}