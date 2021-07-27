package dominio;

public class Cliente {
   private String cedula;
   private String nombres;
   private Cuenta [] cuentas;
   private int it;
    public Cliente(String cedula, String nombres, Cuenta[] cuentas) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.cuentas = cuentas;
    }

    public Cliente() {
       cedula="";
       nombres="";
       cuentas=new Cuenta[10];
       it=0;
    }
    
    public void asignarCuentaIngresada(Cuenta cta,int i){
        it=i+1;
        cuentas[i]=cta;
        
        
    }
    
    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    //Metodo para saber si existe la cuenta y devuelve el indice de dicha cuenta
    public int existeCuenta(int numCuenta){
        //mostrarCuentas();
        int j=-1;
        for(int i=0;i<it;i++){
            
            if(cuentas[i].getNroCuenta()==numCuenta){
                
                j=i;
            }
        }
        return j;
    }
    /*public void mostrarCuentas(){
        for(int i=0;i<it;i++){
            System.out.println(cuentas[i].getNroCuenta()+"->");
        }
    }*/
    //metodo para consultar el saldo
    public double consultarSaldo(int numCuenta){
        int index=existeCuenta(numCuenta);
        double saldo=0;
        if(index<0){
            System.out.println("EL NUMERO DE CUENTA INGRESADO NO EXISTE");
        }else{
             saldo=cuentas[index].getSaldoCuenta();
        }
        return saldo;
    }
    
    //Depositar
    public void ingresarDinero(int numCuenta, double dinero){
        int index=existeCuenta(numCuenta);
        cuentas[index].depositar(dinero);
    }
    
    //retirar
    public void retirarDinero(int numCuenta, double dinero){
        int index=existeCuenta(numCuenta);
        cuentas[index].retirar(dinero);
    }
}
