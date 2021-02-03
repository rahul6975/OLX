package com.rahul.olx.PropertiesResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesPropertyClasses implements Serializable {

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
	private FullPropertyClasses full;

	@SerializedName("big")
	private BigPropertyClasses big;

	@SerializedName("medium")
	private MediumPropertyClasses medium;

	@SerializedName("small")
	private SmallPropertyClasses small;

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

	public FullPropertyClasses getFull(){
		return full;
	}

	public BigPropertyClasses getBig(){
		return big;
	}

	public MediumPropertyClasses getMedium(){
		return medium;
	}

	public SmallPropertyClasses getSmall(){
		return small;
	}
}