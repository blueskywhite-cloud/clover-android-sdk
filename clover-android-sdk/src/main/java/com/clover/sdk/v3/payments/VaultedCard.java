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
 * <li>{@link #getFirst6 first6}</li>
 * <li>{@link #getLast4 last4}</li>
 * <li>{@link #getCardholderName cardholderName}</li>
 * <li>{@link #getExpirationDate expirationDate}</li>
 * <li>{@link #getToken token}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class VaultedCard extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getFirst6() {
    return genClient.cacheGet(CacheKey.first6);
  }

  public java.lang.String getLast4() {
    return genClient.cacheGet(CacheKey.last4);
  }

  public java.lang.String getCardholderName() {
    return genClient.cacheGet(CacheKey.cardholderName);
  }

  public java.lang.String getExpirationDate() {
    return genClient.cacheGet(CacheKey.expirationDate);
  }

  public java.lang.String getToken() {
    return genClient.cacheGet(CacheKey.token);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<VaultedCard> {
    first6 {
      @Override
      public Object extractValue(VaultedCard instance) {
        return instance.genClient.extractOther("first6", java.lang.String.class);
      }
    },
    last4 {
      @Override
      public Object extractValue(VaultedCard instance) {
        return instance.genClient.extractOther("last4", java.lang.String.class);
      }
    },
    cardholderName {
      @Override
      public Object extractValue(VaultedCard instance) {
        return instance.genClient.extractOther("cardholderName", java.lang.String.class);
      }
    },
    expirationDate {
      @Override
      public Object extractValue(VaultedCard instance) {
        return instance.genClient.extractOther("expirationDate", java.lang.String.class);
      }
    },
    token {
      @Override
      public Object extractValue(VaultedCard instance) {
        return instance.genClient.extractOther("token", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<VaultedCard> genClient;

  /**
  * Constructs a new empty instance.
  */
  public VaultedCard() {
    genClient = new GenericClient<VaultedCard>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected VaultedCard(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public VaultedCard(String json) throws IllegalArgumentException {
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
  public VaultedCard(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public VaultedCard(VaultedCard src) {
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
    genClient.validateNull(getFirst6(), "first6");
    genClient.validateLength(getFirst6(), 6);

    genClient.validateNull(getLast4(), "last4");
    genClient.validateLength(getLast4(), 4);

    genClient.validateLength(getCardholderName(), 26);

    genClient.validateLength(getExpirationDate(), 4);

    genClient.validateLength(getToken(), 72);
  }

  /** Checks whether the 'first6' field is set and is not null */
  public boolean isNotNullFirst6() {
    return genClient.cacheValueIsNotNull(CacheKey.first6);
  }

  /** Checks whether the 'last4' field is set and is not null */
  public boolean isNotNullLast4() {
    return genClient.cacheValueIsNotNull(CacheKey.last4);
  }

  /** Checks whether the 'cardholderName' field is set and is not null */
  public boolean isNotNullCardholderName() {
    return genClient.cacheValueIsNotNull(CacheKey.cardholderName);
  }

  /** Checks whether the 'expirationDate' field is set and is not null */
  public boolean isNotNullExpirationDate() {
    return genClient.cacheValueIsNotNull(CacheKey.expirationDate);
  }

  /** Checks whether the 'token' field is set and is not null */
  public boolean isNotNullToken() {
    return genClient.cacheValueIsNotNull(CacheKey.token);
  }



  /** Checks whether the 'first6' field has been set, however the value could be null */
  public boolean hasFirst6() {
    return genClient.cacheHasKey(CacheKey.first6);
  }

  /** Checks whether the 'last4' field has been set, however the value could be null */
  public boolean hasLast4() {
    return genClient.cacheHasKey(CacheKey.last4);
  }

  /** Checks whether the 'cardholderName' field has been set, however the value could be null */
  public boolean hasCardholderName() {
    return genClient.cacheHasKey(CacheKey.cardholderName);
  }

  /** Checks whether the 'expirationDate' field has been set, however the value could be null */
  public boolean hasExpirationDate() {
    return genClient.cacheHasKey(CacheKey.expirationDate);
  }

  /** Checks whether the 'token' field has been set, however the value could be null */
  public boolean hasToken() {
    return genClient.cacheHasKey(CacheKey.token);
  }


  /**
   * Sets the field 'first6'.
   */
  public VaultedCard setFirst6(java.lang.String first6) {
    return genClient.setOther(first6, CacheKey.first6);
  }

  /**
   * Sets the field 'last4'.
   */
  public VaultedCard setLast4(java.lang.String last4) {
    return genClient.setOther(last4, CacheKey.last4);
  }

  /**
   * Sets the field 'cardholderName'.
   */
  public VaultedCard setCardholderName(java.lang.String cardholderName) {
    return genClient.setOther(cardholderName, CacheKey.cardholderName);
  }

  /**
   * Sets the field 'expirationDate'.
   */
  public VaultedCard setExpirationDate(java.lang.String expirationDate) {
    return genClient.setOther(expirationDate, CacheKey.expirationDate);
  }

  /**
   * Sets the field 'token'.
   */
  public VaultedCard setToken(java.lang.String token) {
    return genClient.setOther(token, CacheKey.token);
  }


  /** Clears the 'first6' field, the 'has' method for this field will now return false */
  public void clearFirst6() {
    genClient.clear(CacheKey.first6);
  }
  /** Clears the 'last4' field, the 'has' method for this field will now return false */
  public void clearLast4() {
    genClient.clear(CacheKey.last4);
  }
  /** Clears the 'cardholderName' field, the 'has' method for this field will now return false */
  public void clearCardholderName() {
    genClient.clear(CacheKey.cardholderName);
  }
  /** Clears the 'expirationDate' field, the 'has' method for this field will now return false */
  public void clearExpirationDate() {
    genClient.clear(CacheKey.expirationDate);
  }
  /** Clears the 'token' field, the 'has' method for this field will now return false */
  public void clearToken() {
    genClient.clear(CacheKey.token);
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
  public VaultedCard copyChanges() {
    VaultedCard copy = new VaultedCard();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(VaultedCard src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new VaultedCard(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<VaultedCard> CREATOR = new android.os.Parcelable.Creator<VaultedCard>() {
    @Override
    public VaultedCard createFromParcel(android.os.Parcel in) {
      VaultedCard instance = new VaultedCard(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public VaultedCard[] newArray(int size) {
      return new VaultedCard[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<VaultedCard> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<VaultedCard>() {
    @Override
    public VaultedCard create(org.json.JSONObject jsonObject) {
      return new VaultedCard(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean FIRST6_IS_REQUIRED = true;
    public static final long FIRST6_MAX_LEN = 6;
    public static final boolean LAST4_IS_REQUIRED = true;
    public static final long LAST4_MAX_LEN = 4;
    public static final boolean CARDHOLDERNAME_IS_REQUIRED = false;
    public static final long CARDHOLDERNAME_MAX_LEN = 26;
    public static final boolean EXPIRATIONDATE_IS_REQUIRED = false;
    public static final long EXPIRATIONDATE_MAX_LEN = 4;
    public static final boolean TOKEN_IS_REQUIRED = false;
    public static final long TOKEN_MAX_LEN = 72;

  }

}
