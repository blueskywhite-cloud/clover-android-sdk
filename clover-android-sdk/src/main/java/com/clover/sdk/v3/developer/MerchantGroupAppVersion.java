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

package com.clover.sdk.v3.developer;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * Declares the target version of a given application for a given merchant group, optionally constrained by device type.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getMerchantGroup merchantGroup}</li>
 * <li>{@link #getApp app}</li>
 * <li>{@link #getVersion version}</li>
 * <li>{@link #getDeviceType deviceType}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class MerchantGroupAppVersion extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier.
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Identifies the merchant group of interest.
   */
  public com.clover.sdk.v3.base.Reference getMerchantGroup() {
    return genClient.cacheGet(CacheKey.merchantGroup);
  }

  /**
   * Identifies the application of interest.
   */
  public com.clover.sdk.v3.base.Reference getApp() {
    return genClient.cacheGet(CacheKey.app);
  }

  /**
   * The targeted app version.
   */
  public com.clover.sdk.v3.base.Reference getVersion() {
    return genClient.cacheGet(CacheKey.version);
  }

  /**
   * The targeted device type, if any.
   */
  public com.clover.sdk.v3.base.Reference getDeviceType() {
    return genClient.cacheGet(CacheKey.deviceType);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<MerchantGroupAppVersion> {
    id {
      @Override
      public Object extractValue(MerchantGroupAppVersion instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    merchantGroup {
      @Override
      public Object extractValue(MerchantGroupAppVersion instance) {
        return instance.genClient.extractRecord("merchantGroup", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    app {
      @Override
      public Object extractValue(MerchantGroupAppVersion instance) {
        return instance.genClient.extractRecord("app", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    version {
      @Override
      public Object extractValue(MerchantGroupAppVersion instance) {
        return instance.genClient.extractRecord("version", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    deviceType {
      @Override
      public Object extractValue(MerchantGroupAppVersion instance) {
        return instance.genClient.extractRecord("deviceType", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<MerchantGroupAppVersion> genClient;

  /**
  * Constructs a new empty instance.
  */
  public MerchantGroupAppVersion() {
    genClient = new GenericClient<MerchantGroupAppVersion>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected MerchantGroupAppVersion(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public MerchantGroupAppVersion(String json) throws IllegalArgumentException {
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
  public MerchantGroupAppVersion(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public MerchantGroupAppVersion(MerchantGroupAppVersion src) {
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

    genClient.validateNull(getApp(), "app");

    genClient.validateNull(getVersion(), "version");
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'merchantGroup' field is set and is not null */
  public boolean isNotNullMerchantGroup() {
    return genClient.cacheValueIsNotNull(CacheKey.merchantGroup);
  }

  /** Checks whether the 'app' field is set and is not null */
  public boolean isNotNullApp() {
    return genClient.cacheValueIsNotNull(CacheKey.app);
  }

  /** Checks whether the 'version' field is set and is not null */
  public boolean isNotNullVersion() {
    return genClient.cacheValueIsNotNull(CacheKey.version);
  }

  /** Checks whether the 'deviceType' field is set and is not null */
  public boolean isNotNullDeviceType() {
    return genClient.cacheValueIsNotNull(CacheKey.deviceType);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'merchantGroup' field has been set, however the value could be null */
  public boolean hasMerchantGroup() {
    return genClient.cacheHasKey(CacheKey.merchantGroup);
  }

  /** Checks whether the 'app' field has been set, however the value could be null */
  public boolean hasApp() {
    return genClient.cacheHasKey(CacheKey.app);
  }

  /** Checks whether the 'version' field has been set, however the value could be null */
  public boolean hasVersion() {
    return genClient.cacheHasKey(CacheKey.version);
  }

  /** Checks whether the 'deviceType' field has been set, however the value could be null */
  public boolean hasDeviceType() {
    return genClient.cacheHasKey(CacheKey.deviceType);
  }


  /**
   * Sets the field 'id'.
   */
  public MerchantGroupAppVersion setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'merchantGroup'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public MerchantGroupAppVersion setMerchantGroup(com.clover.sdk.v3.base.Reference merchantGroup) {
    return genClient.setRecord(merchantGroup, CacheKey.merchantGroup);
  }

  /**
   * Sets the field 'app'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public MerchantGroupAppVersion setApp(com.clover.sdk.v3.base.Reference app) {
    return genClient.setRecord(app, CacheKey.app);
  }

  /**
   * Sets the field 'version'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public MerchantGroupAppVersion setVersion(com.clover.sdk.v3.base.Reference version) {
    return genClient.setRecord(version, CacheKey.version);
  }

  /**
   * Sets the field 'deviceType'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public MerchantGroupAppVersion setDeviceType(com.clover.sdk.v3.base.Reference deviceType) {
    return genClient.setRecord(deviceType, CacheKey.deviceType);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'merchantGroup' field, the 'has' method for this field will now return false */
  public void clearMerchantGroup() {
    genClient.clear(CacheKey.merchantGroup);
  }
  /** Clears the 'app' field, the 'has' method for this field will now return false */
  public void clearApp() {
    genClient.clear(CacheKey.app);
  }
  /** Clears the 'version' field, the 'has' method for this field will now return false */
  public void clearVersion() {
    genClient.clear(CacheKey.version);
  }
  /** Clears the 'deviceType' field, the 'has' method for this field will now return false */
  public void clearDeviceType() {
    genClient.clear(CacheKey.deviceType);
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
  public MerchantGroupAppVersion copyChanges() {
    MerchantGroupAppVersion copy = new MerchantGroupAppVersion();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(MerchantGroupAppVersion src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new MerchantGroupAppVersion(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<MerchantGroupAppVersion> CREATOR = new android.os.Parcelable.Creator<MerchantGroupAppVersion>() {
    @Override
    public MerchantGroupAppVersion createFromParcel(android.os.Parcel in) {
      MerchantGroupAppVersion instance = new MerchantGroupAppVersion(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public MerchantGroupAppVersion[] newArray(int size) {
      return new MerchantGroupAppVersion[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<MerchantGroupAppVersion> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<MerchantGroupAppVersion>() {
    @Override
    public MerchantGroupAppVersion create(org.json.JSONObject jsonObject) {
      return new MerchantGroupAppVersion(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean MERCHANTGROUP_IS_REQUIRED = false;
    public static final boolean APP_IS_REQUIRED = true;
    public static final boolean VERSION_IS_REQUIRED = true;
    public static final boolean DEVICETYPE_IS_REQUIRED = false;

  }

}
