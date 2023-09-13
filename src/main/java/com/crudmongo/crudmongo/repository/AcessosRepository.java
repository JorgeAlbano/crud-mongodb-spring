package com.crudmongo.crudmongo.repository;

import com.crudmongo.crudmongo.domain.Acessos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessosRepository extends MongoRepository<Acessos, String> {
}
