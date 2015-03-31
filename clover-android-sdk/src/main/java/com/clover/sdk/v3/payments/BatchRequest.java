/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2015 Clover Network, Inc.
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

@SuppressWarnings("all")
public final class BatchRequest implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.util.List<java.lang.String> getDevices() {
    return cacheGet(CacheKey.devices);
  }


  private enum CacheKey {
    devices {
      @Override
      public Object extractValue(BatchRequest instance) {
        return instance.extractDevices();
      }
    },
    ;

    public abstract Object extractValue(BatchRequest instance);
  }

  private org.json.JSONObject jsonObject = null;
  private android.os.Bundle bundle = null;
  private android.os.Bundle changeLog = null;
  private Object[] cache = null;
  private byte[] cacheState = null;

  private static final byte STATE_NOT_CACHED = 0;
  private static final byte STATE_CACHED_NO_VALUE = 1;
  private static final byte STATE_CACHED_VALUE = 2;

  /**
   * Constructs a new empty instance.
   */
  public BatchRequest() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public BatchRequest(String json) throws java.lang.IllegalArgumentException {
    try {
      this.jsonObject = new org.json.JSONObject(json);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public BatchRequest(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public BatchRequest(BatchRequest src) {
    if (src.jsonObject != null) {
      this.jsonObject = com.clover.sdk.v3.JsonHelper.deepCopy(src.getJSONObject());
    }
  }

  private <T> T cacheGet(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return (T) cache[index];
  }

  private boolean cacheValueIsNotNull(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cache[index] != null;
  }

  private boolean cacheHasKey(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cacheState[index] == STATE_CACHED_VALUE;
  }

  private void cacheRemoveValue(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    cache[index] = null;
    cacheState[index] = STATE_CACHED_NO_VALUE;
  }

  private void cacheMarkDirty(CacheKey key) {
    if (cache != null) {
      int index = key.ordinal();
      cache[index] = null;
      cacheState[index] = STATE_NOT_CACHED;
    }
  }

  private void populateCache(int index) {
    if (cache == null) {
      int size = CacheKey.values().length;
      cache = new Object[size];
      cacheState = new byte[size];
    }

    if (cacheState[index] == STATE_NOT_CACHED) {
      CacheKey key = CacheKey.values()[index];

      if (getJSONObject().has(key.name())) {
        cache[index] = key.extractValue(this);
        cacheState[index] = STATE_CACHED_VALUE;
      } else {
        cacheState[index] = STATE_CACHED_NO_VALUE;
      }
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    if (jsonObject == null) {
      jsonObject = new org.json.JSONObject();
    }
    return jsonObject;
  }


  @Override
  public void validate() {
  }



  private java.util.List<java.lang.String> extractDevices() {
    if (getJSONObject().isNull("devices")) {
      return null;
    }

    org.json.JSONObject elementsContainer = getJSONObject().optJSONObject("devices");
    org.json.JSONArray itemArray = elementsContainer.optJSONArray("elements");
    java.util.List<java.lang.String> itemList =
        new java.util.ArrayList<java.lang.String>(itemArray.length());
    for (int i = 0; i < itemArray.length(); i++) {
      java.lang.String item = itemArray.optString(i);
      if (item == null) {
        continue;
      }
      itemList.add(item);
    }

    return java.util.Collections.unmodifiableList(itemList);
  }


  /** Checks whether the 'devices' field is set and is not null */
  public boolean isNotNullDevices() {
    return cacheValueIsNotNull(CacheKey.devices);
  }

  /** Checks whether the 'devices' field is set and is not null and is not empty */
  public boolean isNotEmptyDevices() {
    return isNotNullDevices() && !getDevices().isEmpty();
  }


  /** Checks whether the 'devices' field has been set, however the value could be null */
  public boolean hasDevices() {
    return cacheHasKey(CacheKey.devices);
  }


  /**
   * Sets the field 'devices'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public BatchRequest setDevices(java.util.List<java.lang.String> devices) {
    logChange("devices");

    try {
      if (devices == null) {
        getJSONObject().put("devices", org.json.JSONObject.NULL);
        cacheMarkDirty(CacheKey.devices);
        return this;
      }

      org.json.JSONArray array = new org.json.JSONArray();
      for (java.lang.String obj : devices) {
        if (obj == null) {
          continue;
        }
        array.put(obj);
      }

      org.json.JSONObject elementsContainer = new org.json.JSONObject();
      elementsContainer.put("elements", array);
      getJSONObject().put("devices", elementsContainer);
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.devices);
    return this;
  }


  /** Clears the 'devices' field, the 'has' method for this field will now return false */
  public void clearDevices() {
    unlogChange("devices");
    getJSONObject().remove("devices");
    cacheRemoveValue(CacheKey.devices);
  }


  private void logChange(java.lang.String field) {
    if (changeLog == null) {
      changeLog = new android.os.Bundle();
    }
    changeLog.putString(field, null);
  }

  private void unlogChange(java.lang.String field) {
    if (changeLog != null) {
      changeLog.remove(field);
    }
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return changeLog != null;
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    changeLog = null;
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
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new BatchRequest(src).getJSONObject();
        org.json.JSONObject dstObj = getJSONObject();
        for (java.lang.String field : src.changeLog.keySet()) {
          dstObj.put(field, srcObj.get(field));
          logChange(field);
        }
      } catch (org.json.JSONException e) {
        throw new java.lang.IllegalArgumentException(e);
      }
    }
  }


  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    if (bundle == null) {
      bundle = new android.os.Bundle();
    }
    return bundle;
  }

  @Override
  public String toString() {
    String json = getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "BatchRequest{" +
        "json='" + json + "'" +
        ", bundle=" + bundle +
        ", changeLog=" + changeLog +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
	  com.clover.sdk.v3.JsonParcelHelper.wrap(getJSONObject()).writeToParcel(dest, 0);
    dest.writeBundle(bundle);
    dest.writeBundle(changeLog);
  }

  public static final android.os.Parcelable.Creator<BatchRequest> CREATOR = new android.os.Parcelable.Creator<BatchRequest>() {
    @Override
    public BatchRequest createFromParcel(android.os.Parcel in) {
      BatchRequest instance = new BatchRequest(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle(getClass().getClassLoader());
      instance.changeLog = in.readBundle();
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
