package com.crudmongo.crudmongo.controller;

import com.crudmongo.crudmongo.domain.Acessos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.crudmongo.crudmongo.service.MongoService;

@RestController
@RequestMapping("/mongodb")
public class Controller {

    @Autowired
    MongoService mongoService;

    @PostMapping("/create")
    public Acessos createAcessos (@RequestBody Acessos acessos){
        return mongoService.createAcessos(acessos);
    }

    @GetMapping("/{id}")
    public Acessos getAcessosById (@RequestBody Acessos acessos) {
        return mongoService.getAcessosById(acessos);
    }

    @PutMapping("/{id}")
    public Acessos updateAcessos (@RequestBody Acessos acessos){
        return mongoService.updateAcessos(acessos);
    }

    @DeleteMapping("/{id}")
    public  String deleteAcessos (@RequestBody Acessos acessos){
        return mongoService.deleteAcessosById(acessos);
    }



}

