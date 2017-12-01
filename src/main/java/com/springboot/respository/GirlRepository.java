package com.springboot.respository;

import com.springboot.model.GirlProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<GirlProperties,Integer> {
}
