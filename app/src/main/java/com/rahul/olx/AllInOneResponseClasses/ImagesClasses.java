package com.rahul.olx.AllInOneResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesClasses implements Serializable {

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
	private FullClasses full;

	@SerializedName("big")
	private BigClasses big;

	@SerializedName("medium")
	private MediumClasses medium;

	@SerializedName("small")
	private SmallClasses small;

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

	public FullClasses getFull(){
		return full;
	}

	public BigClasses getBig(){
		return big;
	}

	public MediumClasses getMedium(){
		return medium;
	}

	public SmallClasses getSmall(){
		return small;
	}
}