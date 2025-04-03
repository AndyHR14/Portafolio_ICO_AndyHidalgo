package Portafolio.Portafolio.dao;

import Portafolio.Portafolio.domain.Constante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConstanteDao 
        extends JpaRepository<Constante,Long> {
    
    public Constante findByAtributo(String stributo);
}
