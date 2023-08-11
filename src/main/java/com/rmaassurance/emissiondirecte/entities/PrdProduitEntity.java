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
@Table(name = "PRD_PRODUIT" )
public class PrdProduitEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "ID")
 private Long id;
 @Basic
 @Column(name = "AGEMAXADHERENT", nullable = true)
 private Integer agemaxadherent;
 @Basic
 @Column(name = "AGEMAXCONJOINT", nullable = true)
 private Integer agemaxconjoint;
 @Basic
 @Column(name = "AGEMAXENFANT", nullable = true)
 private Integer agemaxenfant;
 @Basic
 @Column(name = "AGEMINADHERENT", nullable = true)
 private Integer ageminadherent;
 @Basic
 @Column(name = "AGEMINCONJOINT", nullable = true)
 private Integer ageminconjoint;
 @Basic
 @Column(name = "AGEMINENFANT", nullable = true)
 private Integer ageminenfant;
 @Basic
 @Column(name = "AGELIMITEADHERENT", nullable = true)
 private Integer agelimiteadherent;
 @Basic
 @Column(name = "AGELIMITECONJOINT", nullable = true)
 private Integer agelimiteconjoint;
 @Basic
 @Column(name = "AGELIMITEENFANT", nullable = true)
 private Integer agelimiteenfant;
 @Basic
 @Column(name = "AVECBENEFICIAIRES", nullable = true)
 private String avecbeneficiaires;
 @Basic
 @Column(name = "AVECCOASSURANCE", nullable = true)
 private Integer aveccoassurance;
 @Basic
 @Column(name = "AVECDOMMAGES", nullable = true)
 private String avecdommages;
 @Basic
 @Column(name = "AVECEPARGNE", nullable = true)
 private String avecepargne;
 @Basic
 @Column(name = "AVECPOIDSTAILLE", nullable = true)
 private String avecpoidstaille;
 @Basic
 @Column(name = "AVECPREVOYANCE", nullable = true)
 private String avecprevoyance;
 @Basic
 @Column(name = "AVECPRIMEPERIODIQUE", nullable = true)
 private Integer avecprimeperiodique;
 @Basic
 @Column(name = "AVECPRIMESSEPAREES", nullable = true)
 private Integer avecprimesseparees;
 @Basic
 @Column(name = "AVECQUESTIONDECLARATION", nullable = true)
 private String avecquestiondeclaration;
 @Basic
 @Column(name = "CODE", nullable = true)
 private String code;
 @Basic
 @Column(name = "CODEABREGE", nullable = true)
 private String codeabrege;
 @Basic
 @Column(name = "CODEPOLICE", nullable = true)
 private String codepolice;
 @Basic
 @Column(name = "CODESERVICE", nullable = true)
 private String codeservice;
 @Basic
 @Column(name = "DATELANCEMENT", nullable = true)
 private Calendar datelancement;
 @Basic
 @Column(name = "DATEFIN", nullable = true)
 private Calendar datefin;
 @Basic
 @Column(name = "EFFETMODIFICATION", nullable = true)
 private String effetmodification;
 @Basic
 @Column(name = "LIBELLEPRODUIT", nullable = true)
 private String libelleproduit;
 @Basic
 @Column(name = "NOMBREMAXENFANTSASSURES", nullable = true)
 private Integer nombremaxenfantsassures;
 @Basic
 @Column(name = "NOMBREMINGARANTIES", nullable = true)
 private Integer nombremingaranties;
 @Basic
 @Column(name = "ROLECONJOINT", nullable = true)
 private String roleconjoint;
 @Basic
 @Column(name = "ROLEENFANTS", nullable = true)
 private String roleenfants;
 @Basic
 @Column(name = "TYPEADHERENT", nullable = true)
 private String typeadherent;
 @Basic
 @Column(name = "ROLEADHERENT", nullable = true)
 private Integer roleadherent;
 @Basic
 @Column(name = "TYPECONTRAT", nullable = true)
 private String typecontrat;
 @Basic
 @Column(name = "TYPESOUSCRIPTEUR", nullable = true)
 private String typesouscripteur;
 @Basic
 @Column(name = "AVECREFERENCEEXTERNE", nullable = true)
 private String avecreferenceexterne;
 @Basic
 @Column(name = "CATEGORIE", nullable = true)
 private String categorie;
 @Basic
 @Column(name = "COMPTECOMPTABLE", nullable = true)
 private String comptecomptable;
 @Basic
 @Column(name = "COMPTEAVANCE", nullable = true)
 private String compteavance;
 @Basic
 @Column(name = "COMPTEPRESTATION", nullable = true)
 private String compteprestation;
 @Basic
 @Column(name = "COMPTECONTREPARTIE", nullable = true)
 private String comptecontrepartie;
 @Basic
 @Column(name = "CODECOMPTABLE", nullable = true)
 private Long codecomptable;
 @Basic
 @Column(name = "AVECBIENASSURE", nullable = true)
 private Long avecbienassure;
 @Basic
 @Column(name = "AVECPERSONNEASSURE", nullable = true)
 private Integer avecpersonneassure;
 @Basic
 @Column(name = "IDPRODUITREMPLACANT", nullable = true)
 private Long idproduitremplacant;
 @Basic
 @Column(name = "IDPARAMETRESEPARGNE", nullable = true)
 private Long idparametresepargne;
 @Basic
 @Column(name = "IDPARAMETRESPREVOYANCE", nullable = true)
 private Long idparametresprevoyance;
 @Basic
 @Column(name = "IDPARAMETRESDOMMAGES", nullable = true)
 private Long idparametresdommages;
 @Basic
 @Column(name = "LIBELLE", nullable = true)
 private String libelle;
 @Basic
 @Column(name = "COMPTEBANCAIRESERVICE", nullable = true)
 private String comptebancaireservice;
 @Basic
 @Column(name = "IDTYPERENOUVELLEMENT", nullable = true)
 private Long idtyperenouvellement;
 @Basic
 @Column(name = "COMPTEBANCAIREPRESTATION", nullable = true)
 private String  comptebancaireprestation;
 @Basic
 @Column(name = "COMPTESERVICE", nullable = true)
 private String compteservice;
 @Basic
 @Column(name = "REFHOMOLOGATION", nullable = true)
 private String refhomologation;
 @Basic
 @Column(name = "MODULABLE", nullable = true)
 private Integer modulable;
 @Basic
 @Column(name = "DELAIPREAVIS", nullable = true)
 private Long delaipreavis;

}
