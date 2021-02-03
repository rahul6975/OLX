package com.rahul.olx.MumbaiResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class SpellMumbaiClasses implements Serializable {

	@SerializedName("key")
	private String key;

	@SerializedName("version")
	private String version;

	@SerializedName("main")
	private boolean main;

	@SerializedName("facet_disabled")
	private boolean facetDisabled;

	@SerializedName("id")
	private int id;

	public String getKey(){
		return key;
	}

	public String getVersion(){
		return version;
	}

	public boolean isMain(){
		return main;
	}

	public boolean isFacetDisabled(){
		return facetDisabled;
	}

	public int getId(){
		return id;
	}
}