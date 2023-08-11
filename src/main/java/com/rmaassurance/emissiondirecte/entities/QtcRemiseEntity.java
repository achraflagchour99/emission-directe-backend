package com.rmaassurance.emissiondirecte.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Calendar;
import java.util.Date;

@Entity
@Data
@Table(name = "QTC_REMISE_QUITTANCE" )
public class QtcRemiseEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "ID" )
    private Long id;
    @Basic
    @Column(name = "NUMEROREMISE")
    private Long numeroremise;
    @Basic
    @Column(name = "MONTANTREMISE")
    private Double montantremise;
    @Basic
    @Column(name = "ETAT")
    private String etat;
    @Basic
    @Column(name = "DATEETAT")
    private Calendar dateetat = Calendar.getInstance();


}
