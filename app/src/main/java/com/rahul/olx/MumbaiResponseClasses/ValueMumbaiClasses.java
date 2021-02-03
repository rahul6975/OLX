package com.rahul.olx.MumbaiResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ValueMumbaiClasses implements Serializable {

	@SerializedName("raw")
	private Object raw;

	@SerializedName("currency")
	private CurrencyMumbaiClasses currency;

	@SerializedName("display")
	private String display;

	public Object getRaw(){
		return raw;
	}

	public CurrencyMumbaiClasses getCurrency(){
		return currency;
	}

	public String getDisplay(){
		return display;
	}
}