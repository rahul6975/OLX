package com.rahul.olx.JobsReponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class DataJobClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("score")
	private Object score;

	@SerializedName("spell")
	private SpellJobClasses spell;

	@SerializedName("status")
	private StatusJobClasses status;

	@SerializedName("category_id")
	private String categoryId;

	@SerializedName("favorites")
	private FavoritesJobClasses favorites;

	@SerializedName("images")
	private List<ImagesJobClasses> images;

	@SerializedName("package")
	private JsonMemberPackageJobClasses jsonMemberPackage;

	@SerializedName("is_kyc_verified_user")
	private boolean isKycVerifiedUser;

	@SerializedName("has_phone_param")
	private boolean hasPhoneParam;

	@SerializedName("locations_resolved")
	private LocationsResolvedJobClasses locationsResolved;

	@SerializedName("description")
	private String description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("inspection_info")
	private Object inspectionInfo;

	@SerializedName("title")
	private String title;

	@SerializedName("main_info")
	private String mainInfo;

	@SerializedName("display_date")
	private String displayDate;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("price")
	private Object price;

	@SerializedName("created_at_first")
	private String createdAtFirst;

	@SerializedName("locations")
	private List<LocationsJobClasses> locations;

	@SerializedName("parameters")
	private List<ParametersJobClasses> parameters;

	@SerializedName("monetizationInfo")
	private Object monetizationInfo;

	public String getId(){
		return id;
	}

	public Object getScore(){
		return score;
	}

	public SpellJobClasses getSpell(){
		return spell;
	}

	public StatusJobClasses getStatus(){
		return status;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public FavoritesJobClasses getFavorites(){
		return favorites;
	}

	public List<ImagesJobClasses> getImages(){
		return images;
	}

	public JsonMemberPackageJobClasses getJsonMemberPackage(){
		return jsonMemberPackage;
	}

	public boolean isIsKycVerifiedUser(){
		return isKycVerifiedUser;
	}

	public boolean isHasPhoneParam(){
		return hasPhoneParam;
	}

	public LocationsResolvedJobClasses getLocationsResolved(){
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

	public String getMainInfo(){
		return mainInfo;
	}

	public String getDisplayDate(){
		return displayDate;
	}

	public String getUserId(){
		return userId;
	}

	public Object getPrice(){
		return price;
	}

	public String getCreatedAtFirst(){
		return createdAtFirst;
	}

	public List<LocationsJobClasses> getLocations(){
		return locations;
	}

	public List<ParametersJobClasses> getParameters(){
		return parameters;
	}

	public Object getMonetizationInfo(){
		return monetizationInfo;
	}
}