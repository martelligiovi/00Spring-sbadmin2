package edu.EscuelaIT.tienda.dao;

import edu.EscuelaIT.tienda.model.Usuario;

import java.util.List;

public interface usuariojava {

    List<Usuario> getUsuarios();
    void eliminar(Long id);
    void registrar(Usuario u);
    Usuario obtenerUsuarioPorCredenciales(Usuario u);

}
