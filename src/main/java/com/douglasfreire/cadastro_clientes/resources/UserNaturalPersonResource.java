package com.douglasfreire.cadastro_clientes.resources;

import com.douglasfreire.cadastro_clientes.model.UserNaturalPerson;
import com.douglasfreire.cadastro_clientes.repository.UserNaturalPersonRepository;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class UserNaturalPersonResource {


    @Autowired
    private UserNaturalPersonRepository userNaturalPersonRepository;


    @GetMapping("/pessoa_fisica")
    public List<UserNaturalPerson> findAll() {
        return userNaturalPersonRepository.findAll();
    }


    @GetMapping("/pessoa_fisica/{id}")
    public Optional<UserNaturalPerson> findById(@PathVariable(value = "id") Long id) {
        return userNaturalPersonRepository.findById(id);
    }
    @PostMapping("/pessoa_fisica")
    public UserNaturalPerson save(@RequestBody UserNaturalPerson userNaturalPerson) {
        return userNaturalPersonRepository.save(userNaturalPerson);

    }
    @DeleteMapping("/pessoa_fisica/{id}")
    public void delete(@PathVariable(value = "id")Long id){
        this.userNaturalPersonRepository.deleteById(id);
    }

    @PutMapping("/pessoa_fisica")
    public UserNaturalPerson update(@RequestBody UserNaturalPerson userNaturalPerson){
        return userNaturalPersonRepository.save(userNaturalPerson);
    }

}
