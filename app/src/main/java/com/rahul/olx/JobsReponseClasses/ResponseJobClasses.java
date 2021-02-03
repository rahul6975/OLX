package com.rahul.olx.JobsReponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ResponseJobClasses implements Serializable {

	@SerializedName("version")
	private String version;

	@SerializedName("data")
	private List<DataJobClasses> data;

	@SerializedName("metadata")
	private MetadataJobClasses metadata;

	@SerializedName("empty")
	private boolean empty;

	@SerializedName("not_empty")
	private boolean notEmpty;

	@SerializedName("suggested_data")
	private List<Object> suggestedData;

	public String getVersion(){
		return version;
	}

	public List<DataJobClasses> getData(){
		return data;
	}

	public MetadataJobClasses getMetadata(){
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