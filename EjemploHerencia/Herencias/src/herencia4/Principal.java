package herencia4;

import herencia2.Docente;
import herencia2.Estudiante;
import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Estudiante est1 = new Estudiante("René", "Elizalde", 33, 100.2);
        Docente doc1 = new Docente("José", "Hincapié", 40, 1000); 
        Policia pol1 = new Policia("María", "MENDOZA", 35, "Cabo");
        Estudiante est2 = new Estudiante("Patricia", "Velez", 31, 100.2);
        Docente doc2 = new Docente("Luis", "Alvarez", 38, 1000); 
        Policia pol2 = new Policia("ALEX", "Medina", 33, "Cabo");
        
        ArrayList<Docente> listaDocentes = new ArrayList<>();
        listaDocentes.add(doc1);
        listaDocentes.add(doc2);
        
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(est1);
        listaEstudiantes.add(est2);
        
        ArrayList<Policia> listaPolicias = new ArrayList<>();
        listaPolicias.add(pol1);
        listaPolicias.add(pol2);
        
        
        ReporteDocente rd = new ReporteDocente("0001Doc");
        rd.establecerLista(listaDocentes);
        for (int i = 0; i < listaDocentes.size(); i++) {
            rd.establecerPromSueldos(); 
        }
       
        ReporteEstudiante re = new ReporteEstudiante("0001Est");
        re.establecerLista(listaEstudiantes);
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            re.establecerMatricula();
        }
        
        ReportePolicia rp = new ReportePolicia("0001Pol");
        rp.establecerLista(listaPolicias);
        
        for (int i = 0; i < listaPolicias.size(); i++) {
            rp.establecerEdades();   
        }
        
        System.out.println(rd);
        System.out.println(re);
        System.out.println(rp);
        
    }
}
