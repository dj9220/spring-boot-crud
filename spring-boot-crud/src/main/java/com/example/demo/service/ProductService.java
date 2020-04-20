package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements JpaRepository<Product, Integer> {
   @Autowired
   private ProductRepository repository;
   public Product saveProduct (Product product){
      return repository.save(product);
   }
    public List<Product> saveProducts (List<Product> products){
        return repository.saveAll(products);
    }
    public List<Product> getProducts(){
       return repository.findAll();
    }
    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }
    public Product getProductByName(String name){
        return repository.findByName(name);
    }
    public String deleteProduct(int id){
       repository.deleteById(id);
       return "Product removed id: " + id;
    }
    public Product updateProduct (Product product){
       Product existingProduct=repository.findById(product.getId()).orElse(null);
       existingProduct.setName(product.getName());
       existingProduct.setQuantity(product.getQuantity());
       existingProduct.setPrice(product.getPrice());
       return repository.save(existingProduct);
    }
    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public List<Product> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Product> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void deleteAll(Iterable<? extends Product> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Product> S save(S s) {
        return null;
    }

    @Override
    public <S extends Product> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Product> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Product> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Product> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Product getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Product> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Product> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Product> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Product> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Product> boolean exists(Example<S> example) {
        return false;
    }
}
