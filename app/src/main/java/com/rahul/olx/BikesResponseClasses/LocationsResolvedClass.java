package com.rahul.olx.BikesResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class LocationsResolvedClass implements Serializable {

	@SerializedName("COUNTRY_id")
	private String cOUNTRYId;

	@SerializedName("COUNTRY_name")
	private String cOUNTRYName;

	@SerializedName("ADMIN_LEVEL_1_id")
	private String aDMINLEVEL1Id;

	@SerializedName("ADMIN_LEVEL_1_name")
	private String aDMINLEVEL1Name;

	@SerializedName("ADMIN_LEVEL_3_id")
	private String aDMINLEVEL3Id;

	@SerializedName("ADMIN_LEVEL_3_name")
	private String aDMINLEVEL3Name;

	public String getCOUNTRYId(){
		return cOUNTRYId;
	}

	public String getCOUNTRYName(){
		return cOUNTRYName;
	}

	public String getADMINLEVEL1Id(){
		return aDMINLEVEL1Id;
	}

	public String getADMINLEVEL1Name(){
		return aDMINLEVEL1Name;
	}

	public String getADMINLEVEL3Id(){
		return aDMINLEVEL3Id;
	}

	public String getADMINLEVEL3Name(){
		return aDMINLEVEL3Name;
	}
}