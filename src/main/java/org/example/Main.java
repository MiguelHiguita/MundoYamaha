package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Integer idDeudor;
    Integer motoSeleccionada;
    String tipoDocumento;
    String documentoIdentidad;
    String nombres;
    String apellidos;
    String telefonoMovil;
    String telefonoFijo;
    String direccion;
    String tipoCompra;
    Integer idFiador;
    String nombreFiador;
    String documentoFiador;
    Double valorMoto=0.0;
    Double porcentajeCredito;
    Double valorBrutoMoto;
    Double valorTotalMoto;
    Double valorIntereses;
    Boolean licencia;

    Scanner leer=new Scanner(System.in);

    //proceso:

        System.out.println("******************");
        System.out.println("Mundo Yamaha");
        System.out.println("******************");

        System.out.println("Usted cuenta con una licencia de conducir? ");
        licencia=leer.nextBoolean();

    //1. primer decición

    if (licencia==true){
        leer.nextLine();
        //si tiene licencia

        System.out.print("Nombres del cliente: ");
        nombres=leer.nextLine();

        System.out.print("apellidos del cliente: ");
        apellidos=leer.nextLine();

        System.out.print("Tipo de documento: ");
        tipoDocumento=leer.nextLine();

        System.out.print("Numero de documento: ");
        documentoIdentidad=leer.nextLine();

        System.out.print("Telefono celular: ");
        telefonoMovil=leer.nextLine();

        System.out.print("Telefono fijo: ");
        telefonoFijo=leer.nextLine();

        System.out.print("Dirección cliente: ");
        direccion=leer.nextLine();

        System.out.print("Documento fiador: ");
        documentoFiador=leer.nextLine();

        System.out.print("Nombre fiador: ");
        nombreFiador=leer.nextLine();

        System.out.println("Nuestras motocicletas: ");
        System.out.println("1. Yamaha SZR-125---$9000000");
        System.out.println("2. Yamaha crypton FI---$8000000");
        System.out.println("3. Yamaha XTZ125---$10500000");
        System.out.println("4. Yamaha MT10---$72000000");
        System.out.println("5. Yamaha NMAX300---$34000000");

        System.out.println("digite la moto seleccionada: ");
        motoSeleccionada=leer.nextInt();
        if (motoSeleccionada==1){
            valorMoto=9000000.0;
        }else if (motoSeleccionada==2){
            valorMoto=8000000.0;
        }else if (motoSeleccionada==3){
            valorMoto=10500000.0;
        }else if (motoSeleccionada==4){
            valorMoto=72000000.0;
        }else if (motoSeleccionada==5){
            valorMoto=34000000.0;
        }else{
            System.out.println("Opcion invalida");
        }


        //2. segunda pregunta; ¿lo quiere a credito?

        System.out.println("desea sacar su moto a credito o contado? ");
        leer.nextLine();
        tipoCompra=leer.nextLine().toLowerCase();

        if (tipoCompra.equals("credito")){
            //3. tercer pregunta; % a financiar

            System.out.println("entraremos a financiarlo");
            System.out.println("que porcentaje desea financiar: ");
            leer.nextDouble();
            porcentajeCredito=leer.nextDouble();

            if (porcentajeCredito==1.0){
                valorIntereses=0.25;
                valorMoto=valorMoto+(valorMoto*valorIntereses);

            }else if (porcentajeCredito==0.7){
                valorIntereses=0.15;

            }else if (porcentajeCredito==0.5){
                valorIntereses=0.07;

            }else {

            }


        }else if(tipoCompra.equals("contado")){
            System.out.println("excelente, le daremos un descuento del 10% en su compra. ");

        }else{
            System.out.println("no podemos continuar el proceso, digite una opcion valida.");
        }

    }else{
        //no tiene licencia

        System.out.println("no podemos continuar con el proceso");
        System.out.println("lo invitamos a tramitar su licencia, vuelva pronto...");
    }










    }
}