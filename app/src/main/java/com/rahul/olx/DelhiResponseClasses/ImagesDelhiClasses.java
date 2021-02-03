package com.rahul.olx.DelhiResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesDelhiClasses implements Serializable {

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
	private FullDelhiClasses full;

	@SerializedName("big")
	private BigDelhiClasses big;

	@SerializedName("medium")
	private MediumDelhiClasses medium;

	@SerializedName("small")
	private SmallDelhiClasses small;

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

	public FullDelhiClasses getFull(){
		return full;
	}

	public BigDelhiClasses getBig(){
		return big;
	}

	public MediumDelhiClasses getMedium(){
		return medium;
	}

	public SmallDelhiClasses getSmall(){
		return small;
	}
}