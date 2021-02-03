package com.rahul.olx.ElectronicsResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesElectronicClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("external_id")
	private String externalId;

	@SerializedName("width")
	private int width;

	@SerializedName("height")
	private int height;

	@SerializedName("url")
	private String url;

	@SerializedName("full")
	private FullElectronicClasses full;

	@SerializedName("big")
	private BigElectronicClasses big;

	@SerializedName("medium")
	private MediumElectronicClasses medium;

	@SerializedName("small")
	private SmallElectronicClasses small;

	public String getId(){
		return id;
	}

	public String getExternalId(){
		return externalId;
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public String getUrl(){
		return url;
	}

	public FullElectronicClasses getFull(){
		return full;
	}

	public BigElectronicClasses getBig(){
		return big;
	}

	public MediumElectronicClasses getMedium(){
		return medium;
	}

	public SmallElectronicClasses getSmall(){
		return small;
	}
}