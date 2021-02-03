package com.rahul.olx.MobilesResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesMobileClasses implements Serializable {

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
	private FullMobileClasses full;

	@SerializedName("big")
	private BigMobileClasses big;

	@SerializedName("medium")
	private MediumMobileClasses medium;

	@SerializedName("small")
	private SmallMobileClasses small;

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

	public FullMobileClasses getFull(){
		return full;
	}

	public BigMobileClasses getBig(){
		return big;
	}

	public MediumMobileClasses getMedium(){
		return medium;
	}

	public SmallMobileClasses getSmall(){
		return small;
	}
}