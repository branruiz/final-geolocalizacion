package proyecto.hdp;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuarioTest {

	@Test
	public void contextLoads() {
	}
@Autowired
    RepositorioUsuario repo;


    @Test
    public void guardar() {
        //aqui ponemos la logica de guardar un usuario
        //generamos un objeto
        Usuario u = new Usuario();
        Posicion pos = new Posicion();
        Mensaje mensa = new Mensaje();
        //generar un usuario con todos sus atributos incluyendo un mensaje y una posicion
        pos.setLat(19.90);
        pos.setLat(100.0);

        mensa.setContenido("Primer mensaje");
        u.setEmail("");
        ArrayList<Mensaje> mensajes = new ArrayList<>();
        mensajes.add(mensa);
        u.setMensajes(mensajes);
        u.setPassword("xxx");
        u.setNickname("bran");
        u.setPosicion(pos);
        u.setId("primero");
//guardamos
        Usuario guardado = repo.save(u);
        Assert.assertEquals(guardado, u);
//assertthat(mensa.getContenido()).isEquals(#hola")

        //Assert.assertEquals(4, 2 + 2);

    }

    @Test
    public void actualizar() {
       // Assert.assertEquals(4, 2 + 2);
    }

    @Test
    public void borrar() {
       // Assert.assertEquals(4, 2 + 2);
    }

    @Test
    public void buscarTodos() {
        //Assert.assertEquals(4, 2 + 2);
        
       // int tamaño=repo.findAll().size();
       // Assert.assertEquals(1, tamaño);
       
       Usuario encontrado = repo.findAll().get(0);
       Assert.assertEquals("primero", encontrado.getId());
    }

    @Test
    public void buscarPorId() {
        //Assert.assertEquals(4, 2 + 2);
        Usuario usuariobuscado =repo.findById("primero").get();
        Assert.assertEquals("primero",usuariobuscado.getId() );
        
    }
    
    
    
}
