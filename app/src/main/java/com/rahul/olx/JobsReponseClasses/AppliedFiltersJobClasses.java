package com.rahul.olx.JobsReponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class AppliedFiltersJobClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("description")
	private String description;

	@SerializedName("display_order")
	private int displayOrder;

	@SerializedName("type")
	private String type;

	@SerializedName("render_as")
	private String renderAs;

	@SerializedName("values")
	private List<ValuesJobClasses> values;

	public String getId(){
		return id;
	}

	public String getDescription(){
		return description;
	}

	public int getDisplayOrder(){
		return displayOrder;
	}

	public String getType(){
		return type;
	}

	public String getRenderAs(){
		return renderAs;
	}

	public List<ValuesJobClasses> getValues(){
		return values;
	}
}