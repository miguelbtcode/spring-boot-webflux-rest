package com.miguelbtcode.springboot.webflux.app.models.dao;


import com.miguelbtcode.springboot.webflux.app.models.document.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductoDao extends ReactiveMongoRepository<Producto, String> {
}
