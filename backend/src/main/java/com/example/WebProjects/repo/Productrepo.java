package com.example.WebProjects.repo;

import com.example.WebProjects.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productrepo extends JpaRepository<Products,Integer> {

}
