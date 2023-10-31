package tn.esprit.tp1_benelbeyskander_4twin7.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Universite implements Serializable {

@GeneratedValue ( strategy = GenerationType.IDENTITY)
@Id
    private long  idUniversite ;
    private String nomUniversite ;
    private String adresse ;
    @JsonIgnore
    @OneToOne
    private Foyer foyer  ;

}


