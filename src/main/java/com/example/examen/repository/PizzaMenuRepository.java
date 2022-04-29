package com.example.examen.repository;

import com.example.examen.model.PizzaMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaMenuRepository extends JpaRepository<PizzaMenu, Long> {
}
