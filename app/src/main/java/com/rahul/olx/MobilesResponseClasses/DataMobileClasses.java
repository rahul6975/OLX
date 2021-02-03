package com.rahul.olx.MobilesResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class DataMobileClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("score")
	private Object score;

	@SerializedName("spell")
	private SpellMobileClasses spell;

	@SerializedName("status")
	private StatusMobileClasses status;

	@SerializedName("category_id")
	private String categoryId;

	@SerializedName("favorites")
	private FavoritesMobileClasses favorites;

	@SerializedName("images")
	private List<ImagesMobileClasses> images;

	@SerializedName("package")
	private JsonMemberPackageMobileClasses jsonMemberPackage;

	@SerializedName("is_kyc_verified_user")
	private boolean isKycVerifiedUser;

	@SerializedName("has_phone_param")
	private boolean hasPhoneParam;

	@SerializedName("locations_resolved")
	private LocationsResolvedMobileClasses locationsResolved;

	@SerializedName("description")
	private String description;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("inspection_info")
	private Object inspectionInfo;

	@SerializedName("title")
	private String title;

	@SerializedName("main_info")
	private Object mainInfo;

	@SerializedName("display_date")
	private String displayDate;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("price")
	private PriceMobileClasses price;

	@SerializedName("created_at_first")
	private String createdAtFirst;

	@SerializedName("locations")
	private List<LocationsMobileClasses> locations;

	@SerializedName("parameters")
	private List<ParametersMobileClasses> parameters;

	@SerializedName("monetizationInfo")
	private Object monetizationInfo;

	public String getId(){
		return id;
	}

	public Object getScore(){
		return score;
	}

	public SpellMobileClasses getSpell(){
		return spell;
	}

	public StatusMobileClasses getStatus(){
		return status;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public FavoritesMobileClasses getFavorites(){
		return favorites;
	}

	public List<ImagesMobileClasses> getImages(){
		return images;
	}

	public JsonMemberPackageMobileClasses getJsonMemberPackage(){
		return jsonMemberPackage;
	}

	public boolean isIsKycVerifiedUser(){
		return isKycVerifiedUser;
	}

	public boolean isHasPhoneParam(){
		return hasPhoneParam;
	}

	public LocationsResolvedMobileClasses getLocationsResolved(){
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

	public Object getMainInfo(){
		return mainInfo;
	}

	public String getDisplayDate(){
		return displayDate;
	}

	public String getUserId(){
		return userId;
	}

	public PriceMobileClasses getPrice(){
		return price;
	}

	public String getCreatedAtFirst(){
		return createdAtFirst;
	}

	public List<LocationsMobileClasses> getLocations(){
		return locations;
	}

	public List<ParametersMobileClasses> getParameters(){
		return parameters;
	}

	public Object getMonetizationInfo(){
		return monetizationInfo;
	}
}