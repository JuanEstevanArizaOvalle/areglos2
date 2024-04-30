import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        System.out.println("guardando los datos de su arreglo........");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+"dijita tus numeros: ");
            numeros[i] = entrada.nextFloat();
        }
        System.out.println("imprimendo datos....");
        for(float i:numeros){
            System.out.println(i);
        }
    }
}