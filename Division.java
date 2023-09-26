package division;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
       float n1,n2,r;
       System.out.print("ingresa el primer numero: ");
       n1=leer.nextFloat();
       System.out.print("ingresa el segundo valor: ");
       n2=leer.nextFloat();
       r=n1/n2;
       System.out.print("el resultado es"+r);
    }
    
}
