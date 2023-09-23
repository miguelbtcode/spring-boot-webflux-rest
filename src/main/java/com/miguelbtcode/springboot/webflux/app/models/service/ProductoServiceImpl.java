package com.miguelbtcode.springboot.webflux.app.models.service;

import com.miguelbtcode.springboot.webflux.app.models.dao.CategoriaDao;
import com.miguelbtcode.springboot.webflux.app.models.dao.ProductoDao;
import com.miguelbtcode.springboot.webflux.app.models.document.Categoria;
import com.miguelbtcode.springboot.webflux.app.models.document.Producto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoDao productoDao;
    private final CategoriaDao categoriaDao;

    public ProductoServiceImpl(ProductoDao productoDao, CategoriaDao categoriaDao) {
        this.productoDao = productoDao;
        this.categoriaDao = categoriaDao;
    }

    @Override
    public Flux<Producto> findAll() {
        return productoDao.findAll();
    }

    @Override
    public Flux<Producto> findAllWithNameToUpperCase() {
        return productoDao.findAll().map(producto -> {
            producto.setNombre(producto.getNombre().toUpperCase());
            return producto;
        });
    }

    @Override
    public Flux<Producto> findAllWithNameToUpperCaseAndRepeat() {
        return findAllWithNameToUpperCase().repeat(5000);
    }

    @Override
    public Mono<Producto> findById(String id) {
        return productoDao.findById(id);
    }

    @Override
    public Mono<Producto> save(Producto producto) {
        return productoDao.save(producto);
    }

    @Override
    public Mono<Void> delete(Producto producto) {
        return productoDao.delete(producto);
    }

    @Override
    public Flux<Categoria> findAllCategoria() {
        return categoriaDao.findAll();
    }

    @Override
    public Mono<Categoria> findCategoriaById(String id) {
        return categoriaDao.findById(id);
    }

    @Override
    public Mono<Categoria> saveCategoria(Categoria categoria) {
        return categoriaDao.save(categoria);
    }
}
