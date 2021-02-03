package com.rahul.olx.KolKataResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class MonetizationInfoKolkataClasses implements Serializable {

	@SerializedName("adId")
	private String adId;

	@SerializedName("currentProduct")
	private CurrentProductKolkataClasses currentProduct;

	@SerializedName("lastBoosted")
	private String lastBoosted;

	public String getAdId(){
		return adId;
	}

	public CurrentProductKolkataClasses getCurrentProduct(){
		return currentProduct;
	}

	public String getLastBoosted(){
		return lastBoosted;
	}
}