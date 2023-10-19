import seguridad.Rol;
import seguridad.Usuario;
import service.IDAO;
import service.ImplIDAO;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IDAO dao = new ImplIDAO();
        //System.out.println(lista);

        Usuario u = new Usuario();
        Rol rol = new Rol(1,"Enfermero/a");


        try {
            System.out.println("Se crea un USUARIO de ROL ENFERMERO/A");
           u.setPrimer_NombreP("Juan");
           u.setPrimer_ApellidoP("Hernandez");
           u.setID_User("0410102031000N");
           u.setEstado('A');
           u.setID_Rol(rol);
            dao.insert(rol);
            dao.insert(u);


        }
        catch(Exception e) {
            System.out.println(e);
        }
        List<Usuario> lista = dao.getAll("Usuario.all",Usuario.class);


        System.out.println(lista);
    }

    }
