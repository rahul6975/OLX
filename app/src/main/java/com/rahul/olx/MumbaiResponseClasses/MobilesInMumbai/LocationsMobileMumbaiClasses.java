package com.rahul.olx.MumbaiResponseClasses.MobilesInMumbai;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class LocationsMobileMumbaiClasses implements Serializable {

	@SerializedName("lat")
	private Object lat;

	@SerializedName("lon")
	private Object lon;

	@SerializedName("region_id")
	private String regionId;

	@SerializedName("district_id")
	private String districtId;

	@SerializedName("city_id")
	private String cityId;

	public Object getLat(){
		return lat;
	}

	public Object getLon(){
		return lon;
	}

	public String getRegionId(){
		return regionId;
	}

	public String getDistrictId(){
		return districtId;
	}

	public String getCityId(){
		return cityId;
	}
}