package com.rahul.olx.JobsReponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesJobClasses implements Serializable {

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
	private FullJobClasses full;

	@SerializedName("big")
	private BigJobClasses big;

	@SerializedName("medium")
	private MediumJobClasses medium;

	@SerializedName("small")
	private SmallJobClasses small;

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

	public FullJobClasses getFull(){
		return full;
	}

	public BigJobClasses getBig(){
		return big;
	}

	public MediumJobClasses getMedium(){
		return medium;
	}

	public SmallJobClasses getSmall(){
		return small;
	}
}