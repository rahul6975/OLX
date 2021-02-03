package com.rahul.olx.BikesResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ValueClass implements Serializable {

	@SerializedName("raw")
	private Object raw;

	@SerializedName("currency")
	private CurrencyClass currency;

	@SerializedName("display")
	private String display;

	public Object getRaw(){
		return raw;
	}

	public CurrencyClass getCurrency(){
		return currency;
	}

	public String getDisplay(){
		return display;
	}
}