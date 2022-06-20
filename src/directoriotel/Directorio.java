package directoriotel;

import java.util.*;

public class Directorio {

    private TreeMap<Long, Cliente> agenda = new TreeMap();

    public boolean agregarCliente(Cliente cliente, long telefono) {

        if (agenda.containsKey(telefono)) {
            return false;
        }

        agenda.put(telefono, cliente);

        return true;
    }

    public Cliente buscarCliente(Long phone) {
        Cliente cliente = new Cliente();

        for (Map.Entry<Long, Cliente> aux : agenda.entrySet()) {
            if (aux.getKey() == phone) {
                cliente = aux.getValue();
            }
        }

        return cliente;
        // return agenda.get(phone);
    }

    public ArrayList<Long> buscarTelefono(String apellido) {
        ArrayList<Long> telefonos = new ArrayList();
        for (Map.Entry<Long, Cliente> aux : agenda.entrySet()) {
            String value = aux.getValue().getApellido();
            if (value.equalsIgnoreCase(apellido)) {
                telefonos.add(aux.getKey());
            }
        }
        return telefonos;
    }

    public ArrayList<Cliente> buscarClientes(String ciudad) {

        ArrayList<Cliente> clientes = new ArrayList();

        for (Map.Entry<Long, Cliente> aux : agenda.entrySet()) {
            String value = aux.getValue().getCiudad();
            if (value.equalsIgnoreCase(ciudad)) {
                clientes.add(aux.getValue());
            }
        }

        return clientes;
    }

    public boolean borrarCliente(Long telefono) {

        if (agenda.containsKey(telefono)) {

            agenda.remove(telefono);
            return true;
        }
        return false;
    }
 //return agenda.remove(tel) != null;

}
