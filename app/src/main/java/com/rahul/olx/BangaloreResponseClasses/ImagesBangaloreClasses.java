package com.rahul.olx.BangaloreResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesBangaloreClasses implements Serializable {

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
	private FullBangaloreClasses full;

	@SerializedName("big")
	private BigBangaloreClasses big;

	@SerializedName("medium")
	private MediumBangaloreClasses medium;

	@SerializedName("small")
	private SmallBangaloreClasses small;

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

	public FullBangaloreClasses getFull(){
		return full;
	}

	public BigBangaloreClasses getBig(){
		return big;
	}

	public MediumBangaloreClasses getMedium(){
		return medium;
	}

	public SmallBangaloreClasses getSmall(){
		return small;
	}
}