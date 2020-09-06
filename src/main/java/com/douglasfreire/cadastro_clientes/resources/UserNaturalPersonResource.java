package com.douglasfreire.cadastro_clientes.resources;

import com.douglasfreire.cadastro_clientes.error.ResourceNotFoundException;
import com.douglasfreire.cadastro_clientes.model.UserNaturalPerson;
import com.douglasfreire.cadastro_clientes.repository.UserNaturalPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class UserNaturalPersonResource {

    private UserNaturalPersonRepository userNaturalPersonRepository;

    @Autowired
    public UserNaturalPersonResource(UserNaturalPersonRepository userNaturalPersonRepository ){
        this.userNaturalPersonRepository = userNaturalPersonRepository;
    }


    @GetMapping("/pessoa_fisica")
    public ResponseEntity<List<UserNaturalPerson>>  findAll() {
        return new ResponseEntity(userNaturalPersonRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/pessoa_fisica/{id}")
    public ResponseEntity<Optional<UserNaturalPerson>> findById(@PathVariable(value = "id") Long id) {
        verifyIfIdExists(id);
        Optional<UserNaturalPerson> userNaturalPerson = userNaturalPersonRepository.findById(id);
        return new ResponseEntity(userNaturalPerson, HttpStatus.OK);

    }

    @PostMapping("/pessoa_fisica")
    public ResponseEntity<UserNaturalPerson> save(@Valid @RequestBody UserNaturalPerson userNaturalPerson) {
        return new ResponseEntity<>(userNaturalPersonRepository.save(userNaturalPerson), HttpStatus.CREATED) ;

    }

    @DeleteMapping("/pessoa_fisica/{id}")
    public ResponseEntity<UserNaturalPerson> delete(@PathVariable(value = "id")Long id){
        verifyIfIdExists(id);
        userNaturalPersonRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/pessoa_fisica")
    public ResponseEntity<UserNaturalPerson> update(@Valid @RequestBody UserNaturalPerson userNaturalPerson){
        verifyIfIdExists(userNaturalPerson.getId());
        return new ResponseEntity<>(userNaturalPersonRepository.save(userNaturalPerson), HttpStatus.OK);
    }

    private void verifyIfIdExists(Long id){
        if (userNaturalPersonRepository.findById(id).isEmpty())
            throw new ResourceNotFoundException("Id not found");

    }

}
