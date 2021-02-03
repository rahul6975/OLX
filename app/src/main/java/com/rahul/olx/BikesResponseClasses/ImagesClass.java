package com.rahul.olx.BikesResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesClass implements Serializable {

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
	private FullClass full;

	@SerializedName("big")
	private BigClass big;

	@SerializedName("medium")
	private MediumClass medium;

	@SerializedName("small")
	private SmallClass small;

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

	public FullClass getFull(){
		return full;
	}

	public BigClass getBig(){
		return big;
	}

	public MediumClass getMedium(){
		return medium;
	}

	public SmallClass getSmall(){
		return small;
	}
}