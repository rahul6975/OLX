package com.rahul.olx.PropertiesResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ValuePropertyClasses implements Serializable {

	@SerializedName("raw")
	private Object raw;

	@SerializedName("currency")
	private CurrencyPropertyClasses currency;

	@SerializedName("display")
	private String display;

	public Object getRaw(){
		return raw;
	}

	public CurrencyPropertyClasses getCurrency(){
		return currency;
	}

	public String getDisplay(){
		return display;
	}
}