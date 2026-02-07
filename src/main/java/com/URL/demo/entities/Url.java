package com.URL.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "urls")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Url {

    @Id
    @Column(length = 10)
    private String id;

    @Column(nullable = false)
    private String fullUrl;
}
