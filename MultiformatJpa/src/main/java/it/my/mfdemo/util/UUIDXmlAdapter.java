package it.my.mfdemo.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.eaio.uuid.UUID;

public class UUIDXmlAdapter extends XmlAdapter<String, UUID> {

	@Override
	public UUID unmarshal(String v) throws Exception {
		return new UUID(v);
	}

	@Override
	public String marshal(UUID v) throws Exception {
		return v.toString();
	}



}
