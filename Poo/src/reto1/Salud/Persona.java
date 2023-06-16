package reto1.Salud;

import java.util.Scanner;

public class Persona {
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;

    public void pedirDatos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de documento");
        tipoDoc = leer.nextLine();
        System.out.println("Ingrese su número de documento");
        documento = leer.nextInt();
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        leer.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = leer.nextLine();
        System.out.println("Ingrese su peso");
        peso = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese su estatura");
        estatura = leer.nextDouble();
        System.out.println("Ingrese su edad");
        edad = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese su sexo");
        sexo = leer.nextLine();
    }

    public void mostrarDatos() {
        System.out.println("Tipo de documento= " + tipoDoc);
        System.out.println("Número de documento= " + documento);
        System.out.println("Nombre= " + nombre);
        System.out.println("Apellido= " + apellido);
        System.out.println("Peso= " + peso);
        System.out.println("Estatura= " + estatura);
        System.out.println("Edad= " + edad);
        System.out.println("Sexo= " + sexo);
    }

    public void calcularIMC() {
        double pesoActual;
        pesoActual = peso / (estatura * estatura);
        if(pesoActual<20){
            System.out.println("El peso está por debajo de lo ideal");
        } else if (pesoActual>=20 && pesoActual <=25){
            System.out.println("El peso es ideal"); 
        } else{
            System.out.println("Tiene sobre peso");
        }
    }

    public void mayorEdad(){
        if(edad>=18){
            System.out.println("Usted es mayor de edad");
        } else{
            System.out.println("Usted es menor de edad");
        }
    }
}
