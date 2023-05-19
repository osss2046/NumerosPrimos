import javax.swing.*;
public class NumeroPrimos {
    public static void main(String[] args) {
    String sc1=JOptionPane.showInputDialog(null, "Introduzca un numero");
    int N=Integer.parseInt(sc1);
    int M=N-1;
    int Conta=0;


do {
        if(N%M==0){Conta+=1;}
        M--;

    }while(M>1);

if(Conta==0) {System.out.println(N+" Es Primo ");}
else {System.out.println(N+" No es primo");}

}


}