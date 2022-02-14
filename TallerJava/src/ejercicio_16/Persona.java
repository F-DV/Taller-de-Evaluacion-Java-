package ejercicio_16;

/**
 * @author FelipeQG
 */
public class Persona {
    //Atributos
    private String nombre = "";
    private int edad= 0;
    private long DNI;
    private char sexo = 'M';
    private double peso = 0;
    private double altura = 0;

    //constructores
    public Persona(){                                                                                       //constructor 1
    }
    public Persona(String nombre, int edad,char sexo){                                                      //constructor 2
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {               //constructor 3
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * calcula el peso ideal teniendo encuenta peso y altura
     * @return  0 si esta por debajo del peso ideal, mayor a 25 sobre peso,
     * -1  si esta por debajo del peso ideal
     */

    public int calcularIMC(){
        double pesoIdeal;
        pesoIdeal = this.peso/(Math.pow(this.altura,2));
        if(pesoIdeal > 25){
            return 1;
        }else if(pesoIdeal >= 20 && pesoIdeal <= 25){
            return 0;
        }else
            return  -1;
        }

    /**
     *
     * @return true, si es mayor de edad o false si no lo es
     */
    public boolean esMayorDeEdad(){
        if(this.edad >= 18){
            return true;
        }
        return false;
    }

    /**
     *
     * @param sexo comprueba el sexo del usuario, por defecto
     *             pone M (Masculino)
     */
    private void comprobarSexo(char sexo){
        if(sexo == 'F'){
            this.sexo = 'F';
        }else
            this.sexo =  'M';
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura;
    }

    /**
     * genera un numero aleatorio de entre 0 y 10.000000
     * y lo asigna al DNI
     */
    public void generaDNI(){
        long aleatorio = (long) (Math.random() * 10000000);
        this.DNI = aleatorio;
    }

    public void mostrarPeso(){                                                      //Metodo que muestra el peso ideal en pantalla
        if(this.calcularIMC() == 1){
            System.out.println("-> Tiene sobre peso");
        }else if(this.calcularIMC() == 0){
            System.out.println("-> Esta por debajo del peso ideal");
        }else if(this.calcularIMC()==-1){
            System.out.println("-> Esta en el peso ideal");
        }

    }
    public void muestraEdad(){                                                          //metodo que muestra si es mayor de edad en pantalla

        if(this.esMayorDeEdad() == true){
            System.out.println("-> Es mayor de edad");
        }else{
            System.out.println("-> Es menor de edad");
        }
    }

    //Generamos guetters and setter para la mayoria de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public long getDNI() {
        return DNI;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
