package com.URL.demo.repositoy;

import com.URL.demo.entities.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url,String> {
}
