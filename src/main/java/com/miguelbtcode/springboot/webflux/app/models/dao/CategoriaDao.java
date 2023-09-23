package com.miguelbtcode.springboot.webflux.app.models.dao;

import com.miguelbtcode.springboot.webflux.app.models.document.Categoria;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoriaDao extends ReactiveMongoRepository<Categoria, String> {
}
