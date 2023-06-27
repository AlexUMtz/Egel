
package cajeroegel;

public class Cuenta {
    private String titular;
    private int pinCorrecto =1234;
    private double saldo;

    public Cuenta(String titular, int pinCorrecto, double saldo) {
        this.titular = titular;
        this.pinCorrecto = pinCorrecto;
        if(saldo < 0){
            this.saldo = 0;
        }else{
            this.saldo = saldo;

        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getPinCorrecto() {
        return pinCorrecto;
    }

    public void setPinCorrecto(int pinCorrecto) {
        this.pinCorrecto = pinCorrecto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldoInicial) {
        this.saldo = saldo;
    }

    public void ingresarSaldo(double cantidad){
        if(cantidad > 0){
            this.saldo += cantidad;
        }else{
            System.out.println("Ingrese una cantidad positiva");
        }
    }
    
    public void retirar(double cantidad){
        if(this.saldo < cantidad){
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo -= cantidad;
            System.out.println("Operacion completada, su saldo actual es de: $" + this.saldo);
        }
    }
    
}
