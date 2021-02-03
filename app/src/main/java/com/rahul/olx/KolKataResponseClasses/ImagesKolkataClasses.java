package com.rahul.olx.KolKataResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ImagesKolkataClasses implements Serializable {

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
	private FullKolkataClasses full;

	@SerializedName("big")
	private BigKolkataClasses big;

	@SerializedName("medium")
	private MediumKolkataClasses medium;

	@SerializedName("small")
	private SmallKolkataClasses small;

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

	public FullKolkataClasses getFull(){
		return full;
	}

	public BigKolkataClasses getBig(){
		return big;
	}

	public MediumKolkataClasses getMedium(){
		return medium;
	}

	public SmallKolkataClasses getSmall(){
		return small;
	}
}