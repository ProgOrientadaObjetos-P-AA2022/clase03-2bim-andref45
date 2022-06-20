
package herencia3;

import java.util.ArrayList;

public class ReporteDistancia extends Reporte{
    
    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;
    
    public ReporteDistancia(String nombre, String carrera, String ciclo){
        super(nombre, carrera, ciclo);
        
    }
    
    public void establecerLista(ArrayList<EstudianteDistancia> listado){
        lista = listado;
    }
    
    public void establecerTotalMatriculasDistancia(){
        
        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia + 
                    lista.get(i).obtenerMatriculaDistancia();
        }
    }
    
    public ArrayList<EstudianteDistancia> obtenerLista(){
        return lista;
    }
    
    public double obtenerTotalMatriculasDistancia(){
        return totalMatriculaDistancia;
    }
    
    /*@Override
    public String toString(){
        
        
        String cadena = String.format("%s\nCarrera: %s \n"
                + "Ciclo: %s\n\n"
                + "Lista de estudiantes\n\n", 
                nombre,
                carrera,
                ciclo);
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena = String.format("%sNombre: %s\n"
                    + "Apellido: %s\n"
                    + "Identificación: %s\n"
                    + "Edad: %d\n"
                    + "Costo Asignatura: %.2f\n"
                    + "Número de Asignaturas: %d\n\n", 
                    cadena, 
                    lista.get(i).nombresEstudiante, 
                    lista.get(i).apellidosEstudiante,
                    lista.get(i).identificacionEstudiante,
                    lista.get(i).edadEstudiante,
                    lista.get(i).costoAsignatura,
                    lista.get(i).numeroAsignaturas);
        }
        cadena = String.format("%s\nEl total de matriculas es: %.2f\n", 
                cadena, totalMatriculaDistancia);
        return cadena;
    }*/
    @Override
    public String toString(){
        
        
        String cadena = String.format("%s\nCarrera: %s \n"
                + "Ciclo: %s\n\n"
                + "Lista de estudiantes\n\n", 
                nombre,
                carrera,
                ciclo);
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena = String.format("%s%s\n", 
                    cadena, 
                    lista.get(i));
        }
        cadena = String.format("%s\nEl total de matriculas es: %.2f\n", 
                cadena, totalMatriculaDistancia);
        return cadena;
    }
    
}
/*"El total de matriculas es: %.2f\n"
Nombre: Mario
Apellido: Mills
Identificación: 212233
Edad: 23
Costo Asignatura: 100,20
Número de Asignaturas: 1
Total Matricula: 100,20*/