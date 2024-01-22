package com.cursojavaspring.curso.controllers;

import com.cursojavaspring.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // anotacion para que spring sepa que es un controlador
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")

        public Usuario getUsuario (@PathVariable Long id) {

        Usuario usuario = new Usuario();

        usuario.setNombre("Lucas");
        usuario.setApellido("Hernandez");
        usuario.setEmail("lukah@hotmail.com");
        usuario.setTelefono("2345678");
        usuario.setId(id);

        return usuario;

        }

    @RequestMapping(value = "editarusuario")

    public Usuario editarUsuario () {

        Usuario usuario = new Usuario();

        usuario.setNombre("Lucas");
        usuario.setApellido("Hernandez");
        usuario.setEmail("lukah@hotmail.com");
        usuario.setTelefono("2345678");

        return usuario;

    }

    @RequestMapping(value = "buscarusuario")

    public Usuario buscarUsuario () {

        Usuario usuario = new Usuario();

        usuario.setNombre("Lucas");
        usuario.setApellido("Hernandez");
        usuario.setEmail("lukah@hotmail.com");
        usuario.setTelefono("2345678");

        return usuario;

    }

    @RequestMapping(value = "eliminarusuario")

    public Usuario eliminarUsuario () {

        Usuario usuario = new Usuario();

        usuario.setNombre("Lucas");
        usuario.setApellido("Hernandez");
        usuario.setEmail("lukah@hotmail.com");
        usuario.setTelefono("2345678");

        return usuario;

    }

}
