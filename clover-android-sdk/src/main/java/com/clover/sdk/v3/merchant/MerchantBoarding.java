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

package com.clover.sdk.v3.merchant;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getMerchantRef merchantRef}</li>
 * <li>{@link #getBillToName billToName}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class MerchantBoarding extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public com.clover.sdk.v3.base.Reference getMerchantRef() {
    return genClient.cacheGet(CacheKey.merchantRef);
  }

  /**
   * The name to bill the merchant to
   */
  public java.lang.String getBillToName() {
    return genClient.cacheGet(CacheKey.billToName);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<MerchantBoarding> {
    merchantRef {
      @Override
      public Object extractValue(MerchantBoarding instance) {
        return instance.genClient.extractRecord("merchantRef", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    billToName {
      @Override
      public Object extractValue(MerchantBoarding instance) {
        return instance.genClient.extractOther("billToName", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<MerchantBoarding> genClient;

  /**
  * Constructs a new empty instance.
  */
  public MerchantBoarding() {
    genClient = new GenericClient<MerchantBoarding>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected MerchantBoarding(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public MerchantBoarding(String json) throws IllegalArgumentException {
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
  public MerchantBoarding(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public MerchantBoarding(MerchantBoarding src) {
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

    genClient.validateLength(getBillToName(), 50);
  }

  /** Checks whether the 'merchantRef' field is set and is not null */
  public boolean isNotNullMerchantRef() {
    return genClient.cacheValueIsNotNull(CacheKey.merchantRef);
  }

  /** Checks whether the 'billToName' field is set and is not null */
  public boolean isNotNullBillToName() {
    return genClient.cacheValueIsNotNull(CacheKey.billToName);
  }



  /** Checks whether the 'merchantRef' field has been set, however the value could be null */
  public boolean hasMerchantRef() {
    return genClient.cacheHasKey(CacheKey.merchantRef);
  }

  /** Checks whether the 'billToName' field has been set, however the value could be null */
  public boolean hasBillToName() {
    return genClient.cacheHasKey(CacheKey.billToName);
  }


  /**
   * Sets the field 'merchantRef'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public MerchantBoarding setMerchantRef(com.clover.sdk.v3.base.Reference merchantRef) {
    return genClient.setRecord(merchantRef, CacheKey.merchantRef);
  }

  /**
   * Sets the field 'billToName'.
   */
  public MerchantBoarding setBillToName(java.lang.String billToName) {
    return genClient.setOther(billToName, CacheKey.billToName);
  }


  /** Clears the 'merchantRef' field, the 'has' method for this field will now return false */
  public void clearMerchantRef() {
    genClient.clear(CacheKey.merchantRef);
  }
  /** Clears the 'billToName' field, the 'has' method for this field will now return false */
  public void clearBillToName() {
    genClient.clear(CacheKey.billToName);
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
  public MerchantBoarding copyChanges() {
    MerchantBoarding copy = new MerchantBoarding();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(MerchantBoarding src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new MerchantBoarding(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<MerchantBoarding> CREATOR = new android.os.Parcelable.Creator<MerchantBoarding>() {
    @Override
    public MerchantBoarding createFromParcel(android.os.Parcel in) {
      MerchantBoarding instance = new MerchantBoarding(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public MerchantBoarding[] newArray(int size) {
      return new MerchantBoarding[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<MerchantBoarding> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<MerchantBoarding>() {
    @Override
    public MerchantBoarding create(org.json.JSONObject jsonObject) {
      return new MerchantBoarding(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean MERCHANTREF_IS_REQUIRED = false;
    public static final boolean BILLTONAME_IS_REQUIRED = false;
    public static final long BILLTONAME_MAX_LEN = 50;

  }

}
