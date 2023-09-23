package com.miguelbtcode.springboot.webflux.app.models.service;


import com.miguelbtcode.springboot.webflux.app.models.document.Categoria;
import com.miguelbtcode.springboot.webflux.app.models.document.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoService {

    public Flux<Producto> findAll();
    public Flux<Producto> findAllWithNameToUpperCase();
    public Flux<Producto> findAllWithNameToUpperCaseAndRepeat();
    public Mono<Producto> findById(String id);
    public Mono<Producto> save(Producto producto);
    public Mono<Void> delete(Producto producto);

    public Flux<Categoria> findAllCategoria();
    public Mono<Categoria> findCategoriaById(String id);
    public Mono<Categoria> saveCategoria(Categoria categoria);
}
