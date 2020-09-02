package com.douglasfreire.cadastro_clientes.repository;

import com.douglasfreire.cadastro_clientes.model.UserNaturalPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserNaturalPersonRepository extends JpaRepository<UserNaturalPerson, Long> {

}
