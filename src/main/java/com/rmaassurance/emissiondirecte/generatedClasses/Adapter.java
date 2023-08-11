
package com.rmaassurance.emissiondirecte.generatedClasses;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour adapter complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="adapter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fEntries" type="{http://ws.pub.services.referentiel.devass.eai/}myEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adapter", propOrder = {
    "fEntries"
})
public class Adapter {

    protected List<MyEntry> fEntries;

    /**
     * Gets the value of the fEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MyEntry }
     * 
     * 
     * @return
     *     The value of the fEntries property.
     */
    public List<MyEntry> getFEntries() {
        if (fEntries == null) {
            fEntries = new ArrayList<>();
        }
        return this.fEntries;
    }

}
