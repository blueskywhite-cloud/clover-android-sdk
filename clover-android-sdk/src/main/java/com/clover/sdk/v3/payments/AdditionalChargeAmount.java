/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.payments;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getAmount amount}</li>
 * <li>{@link #getType type}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class AdditionalChargeAmount extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Additional charge id
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Amount of the additional charge
   */
  public java.lang.Long getAmount() {
    return genClient.cacheGet(CacheKey.amount);
  }

  /**
   * The type of additional charge
   */
  public com.clover.sdk.v3.payments.AdditionalChargeType getType() {
    return genClient.cacheGet(CacheKey.type);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AdditionalChargeAmount> {
    id {
      @Override
      public Object extractValue(AdditionalChargeAmount instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    amount {
      @Override
      public Object extractValue(AdditionalChargeAmount instance) {
        return instance.genClient.extractOther("amount", java.lang.Long.class);
      }
    },
    type {
      @Override
      public Object extractValue(AdditionalChargeAmount instance) {
        return instance.genClient.extractEnum("type", com.clover.sdk.v3.payments.AdditionalChargeType.class);
      }
    },
      ;
  }

  private GenericClient<AdditionalChargeAmount> genClient;

  /**
  * Constructs a new empty instance.
  */
  public AdditionalChargeAmount() {
    genClient = new GenericClient<AdditionalChargeAmount>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected AdditionalChargeAmount(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AdditionalChargeAmount(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public AdditionalChargeAmount(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AdditionalChargeAmount(AdditionalChargeAmount src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
    genClient.validateLength(getId(), 13);

    if (getAmount() != null && ( getAmount() < 0)) throw new IllegalArgumentException("Invalid value for 'getAmount()'");
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'amount' field is set and is not null */
  public boolean isNotNullAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.amount);
  }

  /** Checks whether the 'type' field is set and is not null */
  public boolean isNotNullType() {
    return genClient.cacheValueIsNotNull(CacheKey.type);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'amount' field has been set, however the value could be null */
  public boolean hasAmount() {
    return genClient.cacheHasKey(CacheKey.amount);
  }

  /** Checks whether the 'type' field has been set, however the value could be null */
  public boolean hasType() {
    return genClient.cacheHasKey(CacheKey.type);
  }


  /**
   * Sets the field 'id'.
   */
  public AdditionalChargeAmount setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'amount'.
   */
  public AdditionalChargeAmount setAmount(java.lang.Long amount) {
    return genClient.setOther(amount, CacheKey.amount);
  }

  /**
   * Sets the field 'type'.
   */
  public AdditionalChargeAmount setType(com.clover.sdk.v3.payments.AdditionalChargeType type) {
    return genClient.setOther(type, CacheKey.type);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'amount' field, the 'has' method for this field will now return false */
  public void clearAmount() {
    genClient.clear(CacheKey.amount);
  }
  /** Clears the 'type' field, the 'has' method for this field will now return false */
  public void clearType() {
    genClient.clear(CacheKey.type);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public AdditionalChargeAmount copyChanges() {
    AdditionalChargeAmount copy = new AdditionalChargeAmount();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AdditionalChargeAmount src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AdditionalChargeAmount(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<AdditionalChargeAmount> CREATOR = new android.os.Parcelable.Creator<AdditionalChargeAmount>() {
    @Override
    public AdditionalChargeAmount createFromParcel(android.os.Parcel in) {
      AdditionalChargeAmount instance = new AdditionalChargeAmount(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AdditionalChargeAmount[] newArray(int size) {
      return new AdditionalChargeAmount[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AdditionalChargeAmount> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AdditionalChargeAmount>() {
    @Override
    public AdditionalChargeAmount create(org.json.JSONObject jsonObject) {
      return new AdditionalChargeAmount(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean AMOUNT_IS_REQUIRED = false;
    public static final long AMOUNT_MIN = 0;
    public static final boolean TYPE_IS_REQUIRED = false;

  }

}