package com.money_api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.money_api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
