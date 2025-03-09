/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Portafolio.Portafolio.service;

/**
 *
 * @author Andy
 */
import Portafolio.Portafolio.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    // Se obtiene un listado de categorias en un List
    public List<Categoria> getCategorias(boolean activos);
 
    public Categoria getCategoria(Categoria categoria);
    //Se inserta un Categoria si el id del categoria esta vacio
    //Se actualiza un categoria si el id del categoria NO esta vacio
    public void save(Categoria categoria);
  
    //Se elimina el categoria que tiene el id pasado por parametro
    public void delete(Categoria categoria);
}
