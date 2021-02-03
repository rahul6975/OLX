package com.rahul.olx.CarResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesCarClasses implements Serializable {

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
	private FullCarClasses full;

	@SerializedName("big")
	private BigCarClasses big;

	@SerializedName("medium")
	private MediumCarClasses medium;

	@SerializedName("small")
	private SmallCarClasses small;

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

	public FullCarClasses getFull(){
		return full;
	}

	public BigCarClasses getBig(){
		return big;
	}

	public MediumCarClasses getMedium(){
		return medium;
	}

	public SmallCarClasses getSmall(){
		return small;
	}
}