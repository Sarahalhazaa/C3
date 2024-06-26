package com.example.mylaundry.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "It must not be empty")
    @Column(columnDefinition = " varchar(40) not null ")
    private String district ;

    @NotEmpty(message = "It must not be empty")
    @Column(columnDefinition = " varchar(40) not null ")
    private String street ;

    @NotNull(message = "It must not be empty")
    @Column(columnDefinition = " int not null")
    private Integer evaluation;


}
