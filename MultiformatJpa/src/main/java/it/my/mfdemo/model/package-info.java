/**
 * 
 */
/**
 * @author Carlo
 *
 */
@XmlJavaTypeAdapters({
    @XmlJavaTypeAdapter(value = UUIDXmlAdapter.class, type = UUID.class)
})
package it.my.mfdemo.model;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import com.eaio.uuid.UUID;

import it.my.mfdemo.util.UUIDXmlAdapter;
