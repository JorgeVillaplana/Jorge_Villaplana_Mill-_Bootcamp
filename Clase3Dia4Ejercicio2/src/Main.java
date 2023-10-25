public class Main {
    public static void main(String[] args) {
        System.out.println("Prgrama para probar los vectores de objetos");

        //Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
        Persona[] personas = new Persona[5];
        personas[0]= new Persona(1, "Laura", 29, "Albacete", "5555");
        personas[1]= new Persona(2, "Susana", 13, "Toledo", "4444");
        personas[2]= new Persona(3, "Verónica", 43, "Zaragoza", "3333");
        personas[3]= new Persona(4, "Raúl", 17, "Madrid", "2222");
        personas[4]= new Persona(5, "Jorge", 31, "Alicante", "1111");

        //Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
        for(Persona persona: personas){
            System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años.");
        }

        //Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y
        // luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
        personas[2].setNombre("María");
        personas[3].setNombre("Luis");

        System.out.println("Las personas que se han cambiado el nombre son " + personas[2].getNombre() +" y " + personas[3].getNombre());

        //Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
        for(Persona persona: personas){
            if (persona.getEdad() >= 30 ) {
                System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años.");
            }
        }
    }
}