
package directoriotel;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DirectorioTel {

    public static void main(String[] args) {
      
     Directorio dire=new Directorio();
        Cliente francisco=new Cliente(43953752L, "Francisco", "Cordoba", "San Luis", "Naciones Unidas 1742");
        Cliente luis=new Cliente(26083817L, "Luis", "Brandoni",  "Villa Mercedes", "retamo");
        Cliente diego=new Cliente(48905670L, "Diego", "Orellano", "New York", "Washingtong 400");
        
        dire.agregarCliente(francisco, 10);
        dire.agregarCliente(luis, 11);
        dire.agregarCliente(diego, 12);
        ArrayList<Cliente> lista=dire.buscarClientes("San Luis");
        for(Cliente cli:lista){
        
            System.out.println("Apellido "+cli.getApellido());
            System.out.println("Nombre "+cli.getNombre());
        }
     /*  if(dire.borrarCliente(11L)){
        
            JOptionPane.showMessageDialog(null,"Borrado con éxito");
        }else{
        
            JOptionPane.showMessageDialog(null,"No se encontró el tel");
        }*/
    }
    
}
