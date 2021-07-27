package test;


import dominio.*;

import static java.lang.System.exit;
import java.util.Scanner;

public class PruebaCuentaBanco {
    public static void main(String[] args) throws InterruptedException {
        Cliente c1=new Cliente();
        
        int cont=0;
        int opc;
        int numCuenta;
        String nombre="";
        String cedula="";
        int cuenta=0;
        double cantidad;
        Scanner entrada=new Scanner(System.in);
        do{
            
            menu();
            opc=entrada.nextInt();
            entrada.nextLine();
            switch(opc){
                case 1:
                    System.out.println("Ingrese la cédula del cliente: ");
                    cedula=entrada.nextLine();
                    System.out.println("Ingrese el nombre del cliente: ");
                    nombre=entrada.nextLine();
                    c1.setCedula(cedula);
                    c1.setNombres(nombre);
                
                    break;
                case 2:
                    Cuenta cta = new Cuenta();
                    System.out.println("Digite el número de cuenta: ");
                    cuenta=entrada.nextInt();
                    cta.setNroCuenta(cuenta);
                    c1.asignarCuentaIngresada(cta, cont);
                    cont++;
                    entrada.nextLine();
                    break;
                case 3:
                    System.out.println("Digite el número de cuenta: ");
                    numCuenta=entrada.nextInt();
                    if(c1.existeCuenta(numCuenta)>=0){
                        System.out.println("Ingrese la cantidad a depositar: ");
                        cantidad=entrada.nextDouble();
                        c1.ingresarDinero(numCuenta, cantidad);
                    }
                    entrada.nextLine();
                    break;
                case 4:
                    System.out.println("Digite el número de cuenta: ");
                    numCuenta=entrada.nextInt();
                    if(c1.existeCuenta(numCuenta)>=0){
                        System.out.println("Ingrese la cantidad a retirar: ");
                        cantidad=entrada.nextDouble();
                        c1.retirarDinero(numCuenta, cantidad);
                    }
                    entrada.nextLine();
                    break;
                case 5:
                    System.out.println("Digite el número de cuenta: ");
                    numCuenta=entrada.nextInt();
                    System.out.println("Saldo actual de la cuenta: $"+c1.consultarSaldo(numCuenta));
                    entrada.nextLine();
                    break;
                case 6:
                    System.out.println("GRACIAS POR USAR ESTA APLICACION");
                    exit(1);
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
                    break;
            }
            Thread.sleep(2000);//ESPERAR 2 SEGUNDOS PARA MOSTRAR EL CONTENIDO QUE SIGUE, se ajusta en milisegundos
            //2000ms = 2 segundos
            
        }while(opc!=6);
    }
    
    public static void menu(){
        System.out.println("###SISTEMA DE GESTION DE CUENTAS BANCARIAS###");
        System.out.println("MENU");
        System.out.println("1. Crear Cliente");
        System.out.println("2. Asignar cuenta o cuentas al cliente");
        System.out.println("3. Depositar");
        System.out.println("4. Retirar");
        System.out.println("5. Consultar saldo");
        System.out.println("6. Salir");
        System.out.println("Elige una de las opciones: ");
    }
}
