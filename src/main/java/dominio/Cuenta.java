
package dominio;

public class Cuenta {
  private int nroCuenta;
  private double saldoCuenta;

    public Cuenta(int nroCuenta, double saldoCuenta) {
        this.nroCuenta = nroCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public Cuenta() {
        nroCuenta = 0;
        saldoCuenta=0;
    }
    
    
    public int getNroCuenta() {
        return nroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    

    public void depositar(double cantidad){
        this.saldoCuenta+=cantidad;
    }
    
    public void retirar(double cantidad){
        if(cantidad<saldoCuenta){
            this.saldoCuenta-=cantidad; 
        }else{
            System.out.println("El monto que desea retirar supera a su cupo actual");
        }
       
    }
  
}
