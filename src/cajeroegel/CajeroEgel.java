
package cajeroegel;

import java.util.Scanner;


public class CajeroEgel {
    
    private static Scanner scanner = new Scanner(System.in);
        
    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta("Alejandro", 1234, 1000.0);
       
        System.out.println("Bienvenidos al cajero automatico");
        
        validarPin(cuenta1);      
        
    }
    
    private static void validarPin(Cuenta cuenta){
        int intentos = 0;
        while (intentos < 3) {            
            System.out.println("Por favor, ingrese su PIN: ");
            int pinIngresado = scanner.nextInt();
            
            if (pinIngresado == cuenta.getPinCorrecto()) {
                mostrarMenu(cuenta);
                return;
            }else{
                intentos++;
                System.out.println("PIN incorrecto. Intento " + intentos +  " de 3.");
            }
        }
        System.out.println("Ha excedido el numero maximo de intentos. El programa se cerrara");
    }
    
    private static void mostrarMenu(Cuenta cuenta){
        while (true) {            
            System.out.println("");
            System.out.println("Menu principal:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar saldo");
            System.out.println("3. Salir");
            
            System.out.println("Selecciona una opcion: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    consultarSaldo(cuenta);
                    break;
                case 2:
                    retirarSaldo(cuenta);
                    break;
                case 3:
                    System.out.println("Gracias por utilizar el cajero automatico.");
                    return;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una opcion valida");
            }
        }
    }
    
    private static void consultarSaldo(Cuenta cuenta){
        System.out.println("Su saldo actual es: $" + cuenta.getSaldo());
    }
    
    private static void retirarSaldo(Cuenta cuenta){
        System.out.println("Ingresa la cantidad a retirar: $");
        double cantidad = scanner.nextDouble();
        
        cuenta.retirar(cantidad);
    }
}