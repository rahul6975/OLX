package com.rahul.olx.MobilesResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ValuesMobileClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("name")
	private String name;

	@SerializedName("level")
	private int level;

	@SerializedName("count")
	private int count;

	@SerializedName("children")
	private List<Object> children;

	@SerializedName("display_order")
	private int displayOrder;

	public String getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public int getLevel(){
		return level;
	}

	public int getCount(){
		return count;
	}

	public List<Object> getChildren(){
		return children;
	}

	public int getDisplayOrder(){
		return displayOrder;
	}
}