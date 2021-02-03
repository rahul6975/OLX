package com.rahul.olx.MumbaiResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesMumbaiClasses implements Serializable {

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
	private FullMumbaiClasses full;

	@SerializedName("big")
	private BigMumbaiClasses big;

	@SerializedName("medium")
	private MediumMumbaiClasses medium;

	@SerializedName("small")
	private SmallMumbaiClasses small;

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

	public FullMumbaiClasses getFull(){
		return full;
	}

	public BigMumbaiClasses getBig(){
		return big;
	}

	public MediumMumbaiClasses getMedium(){
		return medium;
	}

	public SmallMumbaiClasses getSmall(){
		return small;
	}
}