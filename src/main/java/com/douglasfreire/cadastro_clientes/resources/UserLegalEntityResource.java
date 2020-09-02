package com.douglasfreire.cadastro_clientes.resources;

import com.douglasfreire.cadastro_clientes.model.UserLegalEntity;
import com.douglasfreire.cadastro_clientes.repository.UserLegalEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class UserLegalEntityResource {

    private UserLegalEntityRepository userLegalEntityRepository;

    @Autowired
    public UserLegalEntityResource (UserLegalEntityRepository userLegalEntityRepository){
        this.userLegalEntityRepository = userLegalEntityRepository;
    }

    @GetMapping("/pessoa_juridica")
    public List<UserLegalEntity> findAll() {
        return userLegalEntityRepository.findAll();
    }

    @GetMapping("/pessoa_juridica/{id}")
    public Optional<UserLegalEntity> findById(@PathVariable(value = "id") Long id ){
        return userLegalEntityRepository.findById(id);

    }

    @PostMapping("/pessoa_juridica")
    public UserLegalEntity create(@RequestBody UserLegalEntity userLegalEntity){
        return this.userLegalEntityRepository.save(userLegalEntity);
    }

    @PutMapping("/pessoa_juridica")
    public UserLegalEntity update(@RequestBody UserLegalEntity userLegalEntity) {
        return this.userLegalEntityRepository.save(userLegalEntity);
    }
    @DeleteMapping("/pessoa_juridica/{id}")
    public void delete(@PathVariable(value = "id") Long id){
        this.userLegalEntityRepository.deleteById(id);
    }

}
