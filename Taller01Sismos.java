import java.util.Random;
import java.util.Scanner;

class Taller01Sismos{
    public static void main(String[] args){
        valorRandom(0.0, 9.9);
    }
    public static void menu(){
        System.out.println("Ingrese el número correspondiente a lo que desea realizar: ");
        System.out.println("[1].-Ingresar Datos");
        System.out.println("[2].-Mostrar Sismo de Mayor Magnitud");
        System.out.println("[3].-Contar Sismos Mayores a 5.0");
        System.out.println("[4].-Enviar SMS Por Cada Sismo Mayor o Igual a 7.0");
        System.out.println("[0].-Salir");
        validarMenu(null);

    }
    public static int IngresarNumeroMenu(String[] args){
        Scanner sn = new Scanner(System.in);
        int opcion;
        opcion = sn.nextInt();
        return opcion;
    }
    public static int validarMenu(String[] args){
        int valor;
        int aux = 0;
        while(aux==0){
            IngresarNumeroMenu(args);
            valor = IngresarNumeroMenu(args);

            if(valor<0||valor>4){
                System.out.println("Se ha ingresado un valor no permitido, por favor intentelo nuevamente");
            } 
            else{
                aux = 1;
            }
        }
        return IngresarNumeroMenu(args);
    }

    public static double valorRandom(Double valorMinimo, Double valorMaximo) {
        Random rand = new Random();
        return  valorMinimo + ( valorMaximo - valorMinimo ) * rand.nextDouble();

    }


}