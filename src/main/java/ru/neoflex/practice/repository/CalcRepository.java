package ru.neoflex.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.neoflex.practice.model.Calc;
@Repository
public interface CalcRepository extends JpaRepository<Calc, Long> {

}
