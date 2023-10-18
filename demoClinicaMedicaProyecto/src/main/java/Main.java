import Seguridad.Usuario;
import service.IDAO;
import service.ImplIDAO;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IDAO dao = new ImplIDAO();
        //System.out.println(lista);

        Usuario u = new Usuario();


        try {
           u.setPrimerNombre("Shem");
           u.setPrimerApellido("Perez");
           u.setId("21011748");
           dao.insert(u);

           // Carrera carrera = new Carrera(1,"sistemas",u);

            //dao.insert(carrera);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        List<Usuario> lista = dao.getAll("Usuario.all",Usuario.class);


        System.out.println(lista);
    }
}
