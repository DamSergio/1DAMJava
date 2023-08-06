package paquete1;

/**
 * @author Sergio
 *
 */
public class Persona {
    /**
     * @param nombre cadena de texto
     */
    private String nombre;
    /**
     * @param edad entero
     */
    private int edad;
    
    /**
     * @param sexo caracter
     */
    private char sexo;
    
    /**
     * Constructor vacio
     */
    public Persona(){
    }
    
    /**
     * Constructor con todos los parametros
     * @param nombre
     * @param edad
     * @param sexo
     */
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    /**
     * Metodo para decir que es una persona
     */
    public void printMessage(){
        System.out.println("Soy una persona.");
    }
    
    /**
     * Devuelve el nombre de la persona
     * @return nombre. Cadena de texto
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo para poner el nombre de la persona
     * @param nombre. Cadena de texto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Devuelve la edad de la persona
     * @return edad. Numero entero
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Metodo para poner la edad de la persona
     * @param edad. Numero entero
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Devuelve el sexo de la persona ('H' o 'M')
     * @return sexo. Caracter
     */
    public char getSexo() {
        return sexo;
    }
    
    /**
     * Metodo para poner el sexo de la persona
     * @param sexo. Caracter
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}