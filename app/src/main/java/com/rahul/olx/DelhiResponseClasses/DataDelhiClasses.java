package com.rahul.olx.DelhiResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class DataDelhiClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("score")
	private Object score;

	@SerializedName("spell")
	private SpellDelhiClasses spell;

	@SerializedName("status")
	private StatusDelhiClasses status;

	@SerializedName("category_id")
	private String categoryId;

	@SerializedName("favorites")
	private FavoritesDelhiClasses favorites;

	@SerializedName("images")
	private List<ImagesDelhiClasses> images;

	@SerializedName("package")
	private JsonMemberPackageDelhiClasses jsonMemberPackage;

	@SerializedName("is_kyc_verified_user")
	private boolean isKycVerifiedUser;

	@SerializedName("has_phone_param")
	private boolean hasPhoneParam;

	@SerializedName("locations_resolved")
	private LocationsResolvedDelhiClasses locationsResolved;

	@SerializedName("description")
	private String description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("inspection_info")
	private Object inspectionInfo;

	@SerializedName("title")
	private String title;

	@SerializedName("car_body_type")
	private String carBodyType;

	@SerializedName("main_info")
	private String mainInfo;

	@SerializedName("user_type")
	private String userType;

	@SerializedName("display_date")
	private String displayDate;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("price")
	private PriceDelhiClasses price;

	@SerializedName("created_at_first")
	private String createdAtFirst;

	@SerializedName("locations")
	private List<LocationsDelhiClasses> locations;

	@SerializedName("parameters")
	private List<ParametersDelhiClasses> parameters;

	@SerializedName("monetizationInfo")
	private Object monetizationInfo;

	public String getId(){
		return id;
	}

	public Object getScore(){
		return score;
	}

	public SpellDelhiClasses getSpell(){
		return spell;
	}

	public StatusDelhiClasses getStatus(){
		return status;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public FavoritesDelhiClasses getFavorites(){
		return favorites;
	}

	public List<ImagesDelhiClasses> getImages(){
		return images;
	}

	public JsonMemberPackageDelhiClasses getJsonMemberPackage(){
		return jsonMemberPackage;
	}

	public boolean isIsKycVerifiedUser(){
		return isKycVerifiedUser;
	}

	public boolean isHasPhoneParam(){
		return hasPhoneParam;
	}

	public LocationsResolvedDelhiClasses getLocationsResolved(){
		return locationsResolved;
	}

	public String getDescription(){
		return description;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public Object getInspectionInfo(){
		return inspectionInfo;
	}

	public String getTitle(){
		return title;
	}

	public String getCarBodyType(){
		return carBodyType;
	}

	public String getMainInfo(){
		return mainInfo;
	}

	public String getUserType(){
		return userType;
	}

	public String getDisplayDate(){
		return displayDate;
	}

	public String getUserId(){
		return userId;
	}

	public PriceDelhiClasses getPrice(){
		return price;
	}

	public String getCreatedAtFirst(){
		return createdAtFirst;
	}

	public List<LocationsDelhiClasses> getLocations(){
		return locations;
	}

	public List<ParametersDelhiClasses> getParameters(){
		return parameters;
	}

	public Object getMonetizationInfo(){
		return monetizationInfo;
	}
}