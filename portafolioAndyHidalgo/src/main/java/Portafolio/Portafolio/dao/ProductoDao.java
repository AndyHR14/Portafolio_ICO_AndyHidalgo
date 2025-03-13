/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
/*
Esta clase es la encargada de conectar nuestro proyecto a la bd por medio de JpaRepository
*/
package Portafolio.Portafolio.dao;

import Portafolio.Portafolio.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository <Producto, Long> {
    

}
