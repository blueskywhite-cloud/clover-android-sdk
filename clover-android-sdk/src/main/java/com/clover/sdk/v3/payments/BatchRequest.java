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
 * <li>{@link #getDevices devices}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class BatchRequest extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.util.List<java.lang.String> getDevices() {
    return genClient.cacheGet(CacheKey.devices);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<BatchRequest> {
    devices {
      @Override
      public Object extractValue(BatchRequest instance) {
        return instance.genClient.extractListOther("devices", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<BatchRequest> genClient;

  /**
  * Constructs a new empty instance.
  */
  public BatchRequest() {
    genClient = new GenericClient<BatchRequest>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected BatchRequest(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public BatchRequest(String json) throws IllegalArgumentException {
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
  public BatchRequest(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public BatchRequest(BatchRequest src) {
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
  }

  /** Checks whether the 'devices' field is set and is not null */
  public boolean isNotNullDevices() {
    return genClient.cacheValueIsNotNull(CacheKey.devices);
  }

  /** Checks whether the 'devices' field is set and is not null and is not empty */
  public boolean isNotEmptyDevices() { return isNotNullDevices() && !getDevices().isEmpty(); }



  /** Checks whether the 'devices' field has been set, however the value could be null */
  public boolean hasDevices() {
    return genClient.cacheHasKey(CacheKey.devices);
  }


  /**
   * Sets the field 'devices'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public BatchRequest setDevices(java.util.List<java.lang.String> devices) {
    return genClient.setArrayOther(devices, CacheKey.devices);
  }


  /** Clears the 'devices' field, the 'has' method for this field will now return false */
  public void clearDevices() {
    genClient.clear(CacheKey.devices);
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
  public BatchRequest copyChanges() {
    BatchRequest copy = new BatchRequest();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(BatchRequest src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new BatchRequest(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<BatchRequest> CREATOR = new android.os.Parcelable.Creator<BatchRequest>() {
    @Override
    public BatchRequest createFromParcel(android.os.Parcel in) {
      BatchRequest instance = new BatchRequest(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public BatchRequest[] newArray(int size) {
      return new BatchRequest[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<BatchRequest> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<BatchRequest>() {
    @Override
    public BatchRequest create(org.json.JSONObject jsonObject) {
      return new BatchRequest(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean DEVICES_IS_REQUIRED = false;

  }

}
