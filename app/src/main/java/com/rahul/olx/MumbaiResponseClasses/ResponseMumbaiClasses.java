package com.rahul.olx.MumbaiResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ResponseMumbaiClasses implements Serializable {

	@SerializedName("version")
	private String version;

	@SerializedName("data")
	private List<DataMumbaiClasses> data;

	@SerializedName("metadata")
	private MetadataMumbaiClasses metadata;

	@SerializedName("empty")
	private boolean empty;

	@SerializedName("not_empty")
	private boolean notEmpty;

	@SerializedName("suggested_data")
	private List<Object> suggestedData;

	public String getVersion(){
		return version;
	}

	public List<DataMumbaiClasses> getData(){
		return data;
	}

	public MetadataMumbaiClasses getMetadata(){
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