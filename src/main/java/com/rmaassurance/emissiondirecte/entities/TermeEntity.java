package com.rmaassurance.emissiondirecte.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TERME")
public class TermeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String terme;
/*    @OneToMany(mappedBy = "terme")
    private List<PoliceEntity> polices;*/

}
