package com.rmaassurance.emissiondirecte.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "HAB_MOTDEPASSE", schema = "CONVERGPARAM", catalog = "")
public class HabMotdepasseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = true)
    private Long id;
    @Basic
    @Column(name = "COURANT", nullable = true)
    private String courant;
    @Basic
    @Column(name = "DATECREATION", nullable = true)
    private Calendar datecreation;
    @Basic
    @Column(name = "REALMOTDEPASSE", nullable = true)
    private String realmotdepasse;
    @Basic
    @Column(name = "MOTDEPASSE", nullable = true)
    private String motdepasse;
    @Basic
    @Column(name = "IDUTILISATEUR", nullable = true)
    private Long idutilisateur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "habUtilisateur")
    private HabUtilisateurEntity habUtilisateur;
}
