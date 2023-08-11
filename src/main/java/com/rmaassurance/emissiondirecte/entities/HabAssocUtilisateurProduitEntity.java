package com.rmaassurance.emissiondirecte.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "HAB_ASSOC_UTILISATEUR_PRODUIT", schema = "CONVERGPARAM", catalog = "")
public class HabAssocUtilisateurProduitEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDUTILISATEUR")
    private Long idutilisateur;
    @Basic
    @Column(name = "IDPRODUIT", nullable = true)
    private Long idproduit;




}
