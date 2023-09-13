package com.crudmongo.crudmongo.service;

import com.crudmongo.crudmongo.domain.Acessos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crudmongo.crudmongo.repository.AcessosRepository;

@Service
public class MongoService {

    @Autowired
    AcessosRepository acessosRepository;

    public Acessos createAcessos(Acessos acessos){
        return acessosRepository.save(acessos);
    }

    public Acessos getAcessosById(Acessos acessos){
        return acessosRepository.findById(acessos.getId()).get();
    }

    public Acessos updateAcessos(Acessos acessosRequest){
        Acessos acessos = acessosRepository.findById(acessosRequest.getId()).get();
        acessos.setNome(acessosRequest.getNome());
        acessos.setNumero(acessosRequest.getNumero());
        return acessosRepository.save(acessos);
    }

    public String deleteAcessosById(Acessos acessosRequest){
        acessosRepository.deleteById(acessosRequest.getId());
        return "Deleted";

    }
}
