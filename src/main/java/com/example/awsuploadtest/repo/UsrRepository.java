package com.example.awsuploadtest.repo;

import com.example.awsuploadtest.model.Usr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsrRepository extends JpaRepository<Usr, Long> {
}