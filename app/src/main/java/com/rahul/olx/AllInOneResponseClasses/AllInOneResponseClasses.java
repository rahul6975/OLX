package com.rahul.olx.AllInOneResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class AllInOneResponseClasses implements Serializable {

	@SerializedName("version")
	private String version;

	@SerializedName("data")
	private List<DataClasses> data;

	@SerializedName("metadata")
	private MetadataClasses metadata;

	@SerializedName("empty")
	private boolean empty;

	@SerializedName("not_empty")
	private boolean notEmpty;

	@SerializedName("suggested_data")
	private List<Object> suggestedData;

	public String getVersion(){
		return version;
	}

	public List<DataClasses> getData(){
		return data;
	}

	public MetadataClasses getMetadata(){
		return metadata;
	}

	public boolean isEmpty(){
		return empty;
	}

	public boolean isNotEmpty(){
		return notEmpty;
	}

	public List<Object> getSuggestedData(){
		return suggestedData;
	}
}