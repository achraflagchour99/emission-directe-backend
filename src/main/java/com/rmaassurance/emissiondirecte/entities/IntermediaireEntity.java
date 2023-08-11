package com.rmaassurance.emissiondirecte.entities;

import com.rmaassurance.emissiondirecte.entities.PoliceEntity;
import com.rmaassurance.emissiondirecte.entities.PrdVersioncommercialeEntity;
import com.rmaassurance.emissiondirecte.entities.QtcQuittanceEntity;
import com.rmaassurance.emissiondirecte.entities.RefIntermediaireEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Intermediaire")
//, schema = "CONVERGPARAM", catalog = ""
public class IntermediaireEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NOMIntermediaire")
    private String nomCommercial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ref_intermediaire")
    private RefIntermediaireEntity refIntermediaire;
/*    @OneToMany(mappedBy = "intermediaire")
    private List<QtcQuittanceEntity> quittances;*/
/*    @OneToMany(mappedBy = "intermediaire")
    private List<PoliceEntity> polices;*/

/*    @OneToMany(mappedBy = "intermediaire")
    private List<PrdVersioncommercialeEntity> prd_versionCommerciales;*/

}
