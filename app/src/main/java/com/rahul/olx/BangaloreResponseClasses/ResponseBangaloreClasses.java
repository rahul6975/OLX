package com.rahul.olx.BangaloreResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ResponseBangaloreClasses implements Serializable {

	@SerializedName("version")
	private String version;

	@SerializedName("data")
	private List<DataBangaloreClasses> data;

	@SerializedName("metadata")
	private MetadataBangaloreClasses metadata;

	@SerializedName("not_empty")
	private boolean notEmpty;

	@SerializedName("empty")
	private boolean empty;

	@SerializedName("suggested_data")
	private List<Object> suggestedData;

	public String getVersion(){
		return version;
	}

	public List<DataBangaloreClasses> getData(){
		return data;
	}

	public MetadataBangaloreClasses getMetadata(){
		return metadata;
	}

	public boolean isNotEmpty(){
		return notEmpty;
	}

	public boolean isEmpty(){
		return empty;
	}

	public List<Object> getSuggestedData(){
		return suggestedData;
	}
}