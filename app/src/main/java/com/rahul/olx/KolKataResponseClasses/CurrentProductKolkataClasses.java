package com.rahul.olx.KolKataResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class CurrentProductKolkataClasses implements Serializable {

	@SerializedName("packageId")
	private int packageId;

	public int getPackageId(){
		return packageId;
	}
}