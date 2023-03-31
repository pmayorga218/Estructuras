
import javax.swing.JOptionPane;

public class MenuDibujo {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Bienvenido al programa de dibujo");

        String nombreDibujo = JOptionPane.showInputDialog(null, "Ingrese el nombre del dibujo:");

        Dibujo dibujo = new Dibujo("", "", "", nombreDibujo);

        String[] opcionesDiseño = {"Escudo del Barcelona", "Rosa", "Guitarra", "Arbol de Navidad", "Galleta de Jegibre"};
        String disenoSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione un diseño:", "Diseño", JOptionPane.PLAIN_MESSAGE, null, opcionesDiseño, opcionesDiseño[0]);
        dibujo.setDiseño(disenoSeleccionado);

        String[] opcionesColores = {"Rojo,Amarillo,Azul,Blanco", "Rosado,Verde", "Verde,Rosado,Gris ", "Rojo,Verde,Dorado,Cafe", "Rojo,Verde,Amarrillo,Cafe,Blanco"};
        String colorSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione un color:", "Colores", JOptionPane.PLAIN_MESSAGE, null, opcionesColores, opcionesColores[0]);
        dibujo.setColor(colorSeleccionado);

        String[] opcionesTamaño = {"Pequeño", "Mediano", "Grande", "Muy grande", "Enorme"};
        String tamanioSeleccionado = (String) JOptionPane.showInputDialog(null, "Seleccione un tamaño:", "Tamaño", JOptionPane.PLAIN_MESSAGE, null, opcionesTamaño, opcionesTamaño[0]);
        dibujo.setTamaño(tamanioSeleccionado);

        

        JOptionPane.showMessageDialog(null, "Dibujo creado:\nNombre: " + dibujo.getNombre() + "\nColor: " + dibujo.getColor() + "\nDiseño: " + dibujo.getDiseño() + "\nTamaño: " + dibujo.getTamaño());
    }
}
