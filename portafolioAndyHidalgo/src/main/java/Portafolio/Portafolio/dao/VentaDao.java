package Portafolio.Portafolio.dao;

import Portafolio.Portafolio.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao extends JpaRepository <Venta,Long> {
     
}