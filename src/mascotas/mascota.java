package mascotas;

import javax.swing.JOptionPane;

public class mascota {
    // Atributos
	int codigo;
    String nombre;
    String especie;
    int edad;

    //Constructor sin parametros
    public mascota() {
    	  nombre = "Firu";
          especie = "Default";
          edad = 0;
    }
    
    public void ingresar() {
        this.nombre = JOptionPane.showInputDialog("Ingrese nombre");
        this.especie = JOptionPane.showInputDialog("Ingrese especie");
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Edad de la mascota"));
    }

    public void menu(int opt) {
    	switch (opt) {
		case 1:
			ingresar();
			break;
		case 2:
			
			break;
		

		default:
			break;
		}
    }
    public void buscarMascota(String nombreM) {
        if (this.nombre.equalsIgnoreCase(nombreM)) {
        	System.out.println("entro" );
            JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre +
                    "\nEspecie: " + this.especie +
                    "\nEdad: " + this.edad + " años");
            hacerSonido();
        }
    }

    
    // Constructor con parametros
    public mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }
    
    // Método para mostrar información de la mascota
 // Método para mostrar información de la mascota
    public void mostrarInformacion() {
        String mensaje = "Nombre: " + nombre + "\n";
        mensaje += "Especie: " + especie + "\n";
        mensaje += "Edad: " + edad + " años";

        JOptionPane.showMessageDialog(null, mensaje, "Información de la mascota", JOptionPane.INFORMATION_MESSAGE);
    }


    // Método para hacer que la mascota realice un sonido
    public void hacerSonido() {
        if (especie.equalsIgnoreCase("perro")) {
            System.out.println("¡Guau guau!");
        } else if (especie.equalsIgnoreCase("gato")) {
            System.out.println("¡Miau miau!");
        } else {
            System.out.println("La mascota no hace sonidos conocidos.");
        }
    }
}
