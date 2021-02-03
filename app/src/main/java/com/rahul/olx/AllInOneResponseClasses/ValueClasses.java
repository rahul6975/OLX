package com.rahul.olx.AllInOneResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ValueClasses implements Serializable {

	@SerializedName("raw")
	private Object raw;

	@SerializedName("currency")
	private CurrencyClasses currency;

	@SerializedName("display")
	private String display;

	public Object getRaw(){
		return raw;
	}

	public CurrencyClasses getCurrency(){
		return currency;
	}

	public String getDisplay(){
		return display;
	}
}