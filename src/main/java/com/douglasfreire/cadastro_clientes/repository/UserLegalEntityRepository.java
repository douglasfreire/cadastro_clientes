package com.douglasfreire.cadastro_clientes.repository;

import com.douglasfreire.cadastro_clientes.model.UserLegalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLegalEntityRepository extends JpaRepository<UserLegalEntity, Long> {
}
