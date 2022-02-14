package ejercicio_16;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        int edad = 0;
        String sexo = "M";
        double peso = 0;
        double altura = 0;

        System.out.println("Ingresa el nombre ");
        nombre = sc.nextLine();
        System.out.println("Ingresa la edad ");
        edad = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa el sexo 'M' para masculino, 'F' para femenino");
        sexo = sc.nextLine();
        System.out.println("Ingresa el peso");
        peso = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa la altura");
        altura = Double.parseDouble(sc.nextLine());

        Persona usuario1 = new Persona(nombre,edad,sexo.charAt(0),peso,altura);
        Persona usuario2 = new Persona(nombre,edad,sexo.charAt(0));
        Persona usuario3 = new Persona();
        usuario3.setNombre("Felipe");
        usuario3.setEdad(28);
        usuario3.setSexo('M');
        usuario3.setPeso(69);
        usuario3.setAltura(1.70);

        usuario1.generaDNI();
        System.out.println(usuario1.toString());;
        usuario1.mostrarPeso();
        usuario1.muestraEdad();

        usuario2.generaDNI();
        System.out.println(usuario2.toString());;
        usuario2.mostrarPeso();
        usuario2.muestraEdad();

        usuario3.generaDNI();
        usuario3.setNombre("Andres");
        usuario3.setEdad(27);
        usuario3.setSexo('M');
        usuario3.setPeso(87);
        usuario3.setAltura(1.80);
        System.out.println(usuario3.toString());;
        usuario3.mostrarPeso();
        usuario3.muestraEdad();


    }

}
