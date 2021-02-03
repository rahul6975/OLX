package com.rahul.olx.ElectronicsResponseClasses;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class DataElectronicClasses implements Serializable {

	@SerializedName("id")
	private String id;

	@SerializedName("score")
	private Object score;

	@SerializedName("spell")
	private SpellElectronicClasses spell;

	@SerializedName("status")
	private StatusElectronicClasses status;

	@SerializedName("category_id")
	private String categoryId;

	@SerializedName("favorites")
	private FavoritesElectronicClasses favorites;

	@SerializedName("images")
	private List<ImagesElectronicClasses> images;

	@SerializedName("package")
	private JsonMemberPackageElectronicClasses jsonMemberPackage;

	@SerializedName("is_kyc_verified_user")
	private boolean isKycVerifiedUser;

	@SerializedName("has_phone_param")
	private boolean hasPhoneParam;

	@SerializedName("locations_resolved")
	private LocationsResolvedElectronicClasses locationsResolved;

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
	private PriceElectronicClasses price;

	@SerializedName("created_at_first")
	private String createdAtFirst;

	@SerializedName("locations")
	private List<LocationsElectronicClasses> locations;

	@SerializedName("parameters")
	private List<Object> parameters;

	@SerializedName("monetizationInfo")
	private Object monetizationInfo;

	public String getId(){
		return id;
	}

	public Object getScore(){
		return score;
	}

	public SpellElectronicClasses getSpell(){
		return spell;
	}

	public StatusElectronicClasses getStatus(){
		return status;
	}

	public String getCategoryId(){
		return categoryId;
	}

	public FavoritesElectronicClasses getFavorites(){
		return favorites;
	}

	public List<ImagesElectronicClasses> getImages(){
		return images;
	}

	public JsonMemberPackageElectronicClasses getJsonMemberPackage(){
		return jsonMemberPackage;
	}

	public boolean isIsKycVerifiedUser(){
		return isKycVerifiedUser;
	}

	public boolean isHasPhoneParam(){
		return hasPhoneParam;
	}

	public LocationsResolvedElectronicClasses getLocationsResolved(){
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

	public PriceElectronicClasses getPrice(){
		return price;
	}

	public String getCreatedAtFirst(){
		return createdAtFirst;
	}

	public List<LocationsElectronicClasses> getLocations(){
		return locations;
	}

	public List<Object> getParameters(){
		return parameters;
	}

	public Object getMonetizationInfo(){
		return monetizationInfo;
	}
}