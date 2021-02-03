package com.rahul.olx.KolKataResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ValueKolkataClasses implements Serializable {

	@SerializedName("raw")
	private Object raw;

	@SerializedName("currency")
	private CurrencyKolkataClasses currency;

	@SerializedName("display")
	private String display;

	public Object getRaw(){
		return raw;
	}

	public CurrencyKolkataClasses getCurrency(){
		return currency;
	}

	public String getDisplay(){
		return display;
	}
}