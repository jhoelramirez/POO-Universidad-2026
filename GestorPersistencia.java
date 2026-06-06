package sistemapersistencia;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorPersistencia {

    // Método para SERIALIZAR (Guardar la lista de objetos en disco)
    public static void guardarObjetos(String rutaArchivo, List<Estudiante> estudiantes) {
        // Uso de try-with-resources: Inicializa y cierra los flujos automáticamente
        try (FileOutputStream fos = new FileOutputStream(rutaArchivo); BufferedOutputStream bos = new BufferedOutputStream(fos); // Búfer de eficiencia
                 ObjectOutputStream oos = new ObjectOutputStream(bos)) {  // Convertidor a bytes

            oos.writeObject(estudiantes); // Escritura directa del objeto estructurado
            System.out.println("-> Flujo de Salida exitoso: " + estudiantes.size() + " objetos guardados en " + rutaArchivo);

        } catch (IOException e) {
            System.out.println("Error crítico en el flujo de salida: " + e.getMessage());
        }
    }

    // Método para DESERIALIZAR (Recuperar la lista de objetos desde el disco)
    @SuppressWarnings("unchecked")
    public static List<Estudiante> recuperarObjetos(String rutaArchivo) {
        List<Estudiante> listaRecuperada = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(rutaArchivo); BufferedInputStream bis = new BufferedInputStream(fis); // Búfer de lectura
                 ObjectInputStream ois = new ObjectInputStream(bis)) {   // Reconstructor de objetos

            // Rehidratación del objeto en memoria RAM
            listaRecuperada = (List<Estudiante>) ois.readObject();
            System.out.println("-> Flujo de Entrada exitoso: Datos extraídos del archivo binario.");

        } catch (FileNotFoundException e) {
            System.out.println("Aviso: El archivo no existe aún. Se creará una base de datos nueva.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error crítico en el flujo de entrada: " + e.getMessage());
        }

        return listaRecuperada;
    }
}
