package com.Ahlyab.crudTut.repositories;

import com.Ahlyab.crudTut.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    // CRUD is already implemented
}
