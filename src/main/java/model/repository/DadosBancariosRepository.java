package model.repository;

import model.cd_dados_bancarios_cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadosBancariosRepository extends JpaRepository<cd_dados_bancarios_cliente,Long>{
}
