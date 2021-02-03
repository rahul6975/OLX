package com.rahul.olx.MumbaiResponseClasses.MobilesInMumbai;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class DataMobileMumbaiClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("score")
	private Object score;

	@SerializedName("spell")
	private SpellMobileMumbaiClasses spell;

	@SerializedName("status")
	private StatusMobileMumbaiClasses status;

	@SerializedName("category_id")
	private String categoryId;

	@SerializedName("favorites")
	private FavoritesMobileMumbaiClasses favorites;

	@SerializedName("images")
	private List<ImagesMobileMumbaiClasses> images;

	@SerializedName("package")
	private JsonMemberPackageMobileMumbaiClasses jsonMemberPackage;

	@SerializedName("is_kyc_verified_user")
	private boolean isKycVerifiedUser;

	@SerializedName("has_phone_param")
	private boolean hasPhoneParam;

	@SerializedName("locations_resolved")
	private LocationsResolvedMobileMumbaiClasses locationsResolved;

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

	@SerializedName("user_type")
	private String userType;

	@SerializedName("display_date")
	private String displayDate;

	@SerializedName("user_id")
	private String userId;

	@SerializedName("price")
	private PriceMobileMumbaiClasses price;

	@SerializedName("created_at_first")
	private String createdAtFirst;

	@SerializedName("locations")
	private List<LocationsMobileMumbaiClasses> locations;

	@SerializedName("parameters")
	private List<ParametersMobileMumbaiClasses> parameters;

	@SerializedName("monetizationInfo")
	private Object monetizationInfo;

	public String getId(){
		return id;
	}

	public Object getScore(){
		return score;
	}

	public SpellMobileMumbaiClasses getSpell(){
		return spell;
	}

	public StatusMobileMumbaiClasses getStatus(){
		return status;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public FavoritesMobileMumbaiClasses getFavorites(){
		return favorites;
	}

	public List<ImagesMobileMumbaiClasses> getImages(){
		return images;
	}

	public JsonMemberPackageMobileMumbaiClasses getJsonMemberPackage(){
		return jsonMemberPackage;
	}

	public boolean isIsKycVerifiedUser(){
		return isKycVerifiedUser;
	}

	public boolean isHasPhoneParam(){
		return hasPhoneParam;
	}

	public LocationsResolvedMobileMumbaiClasses getLocationsResolved(){
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

	public String getUserType(){
		return userType;
	}

	public String getDisplayDate(){
		return displayDate;
	}

	public String getUserId(){
		return userId;
	}

	public PriceMobileMumbaiClasses getPrice(){
		return price;
	}

	public String getCreatedAtFirst(){
		return createdAtFirst;
	}

	public List<LocationsMobileMumbaiClasses> getLocations(){
		return locations;
	}

	public List<ParametersMobileMumbaiClasses> getParameters(){
		return parameters;
	}

	public Object getMonetizationInfo(){
		return monetizationInfo;
	}
}