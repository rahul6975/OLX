package com.rahul.olx.AllInOneResponseClasses;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class FlagsClasses implements Serializable {

	@SerializedName("new")
	private boolean jsonMemberNew;

	@SerializedName("hot")
	private boolean hot;

	public boolean isJsonMemberNew(){
		return jsonMemberNew;
	}

	public boolean isHot(){
		return hot;
	}
}