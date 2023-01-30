package com.example.providerapi.pojo;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "provider")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String first_name;
    @Column
    private String middle_name;
    @Column(nullable = false)
    private String last_name;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dob;

}
