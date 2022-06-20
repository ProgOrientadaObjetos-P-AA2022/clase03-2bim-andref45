
package herencia4;

/**
 *
 * @author reroes
 */
public class Reporte {
   protected String codigo;
   
   public Reporte (String cod){
       codigo = cod;
   }
   public void establecerCod(String cod){
       codigo = cod; 
   }
   public String obtenerCod(){
       return codigo;
   }
   
   @Override
   public String toString(){
       String cadena = String.format("%s\n", codigo);
       return cadena;
   }
}
