package com.rahul.olx.PropertiesResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class FiltersPropertyClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("values")
	private List<ValuesPropertyClasses> values;

	@SerializedName("display_order")
	private int displayOrder;

	@SerializedName("description")
	private String description;

	@SerializedName("type")
	private String type;

	@SerializedName("render_as")
	private String renderAs;

	public String getId(){
		return id;
	}

	public List<ValuesPropertyClasses> getValues(){
		return values;
	}

	public int getDisplayOrder(){
		return displayOrder;
	}

	public String getDescription(){
		return description;
	}

	public String getType(){
		return type;
	}

	public String getRenderAs(){
		return renderAs;
	}
}