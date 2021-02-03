package com.rahul.olx.MumbaiResponseClasses.MobilesInMumbai;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesMobileMumbaiClasses implements Serializable {

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
	private FullMobileMumbaiClasses full;

	@SerializedName("big")
	private BigMobileMumbaiClasses big;

	@SerializedName("medium")
	private MediumMobileMumbaiClasses medium;

	@SerializedName("small")
	private SmallMobileMumbaiClasses small;

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

	public FullMobileMumbaiClasses getFull(){
		return full;
	}

	public BigMobileMumbaiClasses getBig(){
		return big;
	}

	public MediumMobileMumbaiClasses getMedium(){
		return medium;
	}

	public SmallMobileMumbaiClasses getSmall(){
		return small;
	}
}