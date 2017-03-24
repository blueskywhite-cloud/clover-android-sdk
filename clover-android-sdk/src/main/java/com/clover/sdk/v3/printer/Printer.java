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

package com.clover.sdk.v3.printer;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getMac mac}</li>
 * <li>{@link #getModel model}</li>
 * <li>{@link #getName name}</li>
 * <li>{@link #getIpAddress ipAddress}</li>
 * <li>{@link #getType type}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class Printer extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * MAC address of a network printer
   */
  public java.lang.String getMac() {
    return genClient.cacheGet(CacheKey.mac);
  }

  public java.lang.String getModel() {
    return genClient.cacheGet(CacheKey.model);
  }

  public java.lang.String getName() {
    return genClient.cacheGet(CacheKey.name);
  }

  /**
   * IP address of a network printer
   */
  public java.lang.String getIpAddress() {
    return genClient.cacheGet(CacheKey.ipAddress);
  }

  /**
   * NETWORK is a printer that's directly connected to the network.  MY_LOCAL represents the printer that's connected to the device that's making the request.
   */
  public com.clover.sdk.v3.printer.PrinterType getType() {
    return genClient.cacheGet(CacheKey.type);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Printer> {
    id {
      @Override
      public Object extractValue(Printer instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    mac {
      @Override
      public Object extractValue(Printer instance) {
        return instance.genClient.extractOther("mac", java.lang.String.class);
      }
    },
    model {
      @Override
      public Object extractValue(Printer instance) {
        return instance.genClient.extractOther("model", java.lang.String.class);
      }
    },
    name {
      @Override
      public Object extractValue(Printer instance) {
        return instance.genClient.extractOther("name", java.lang.String.class);
      }
    },
    ipAddress {
      @Override
      public Object extractValue(Printer instance) {
        return instance.genClient.extractOther("ipAddress", java.lang.String.class);
      }
    },
    type {
      @Override
      public Object extractValue(Printer instance) {
        return instance.genClient.extractEnum("type", com.clover.sdk.v3.printer.PrinterType.class);
      }
    },
      ;
  }

  private GenericClient<Printer> genClient;

  /**
  * Constructs a new empty instance.
  */
  public Printer() {
    genClient = new GenericClient<Printer>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected Printer(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Printer(String json) throws IllegalArgumentException {
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
  public Printer(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Printer(Printer src) {
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

    genClient.validateLength(getMac(), 30);

    genClient.validateLength(getModel(), 20);

    genClient.validateLength(getName(), 30);

    genClient.validateLength(getIpAddress(), 30);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'mac' field is set and is not null */
  public boolean isNotNullMac() {
    return genClient.cacheValueIsNotNull(CacheKey.mac);
  }

  /** Checks whether the 'model' field is set and is not null */
  public boolean isNotNullModel() {
    return genClient.cacheValueIsNotNull(CacheKey.model);
  }

  /** Checks whether the 'name' field is set and is not null */
  public boolean isNotNullName() {
    return genClient.cacheValueIsNotNull(CacheKey.name);
  }

  /** Checks whether the 'ipAddress' field is set and is not null */
  public boolean isNotNullIpAddress() {
    return genClient.cacheValueIsNotNull(CacheKey.ipAddress);
  }

  /** Checks whether the 'type' field is set and is not null */
  public boolean isNotNullType() {
    return genClient.cacheValueIsNotNull(CacheKey.type);
  }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'mac' field has been set, however the value could be null */
  public boolean hasMac() {
    return genClient.cacheHasKey(CacheKey.mac);
  }

  /** Checks whether the 'model' field has been set, however the value could be null */
  public boolean hasModel() {
    return genClient.cacheHasKey(CacheKey.model);
  }

  /** Checks whether the 'name' field has been set, however the value could be null */
  public boolean hasName() {
    return genClient.cacheHasKey(CacheKey.name);
  }

  /** Checks whether the 'ipAddress' field has been set, however the value could be null */
  public boolean hasIpAddress() {
    return genClient.cacheHasKey(CacheKey.ipAddress);
  }

  /** Checks whether the 'type' field has been set, however the value could be null */
  public boolean hasType() {
    return genClient.cacheHasKey(CacheKey.type);
  }


  /**
   * Sets the field 'id'.
   */
  public Printer setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'mac'.
   */
  public Printer setMac(java.lang.String mac) {
    return genClient.setOther(mac, CacheKey.mac);
  }

  /**
   * Sets the field 'model'.
   */
  public Printer setModel(java.lang.String model) {
    return genClient.setOther(model, CacheKey.model);
  }

  /**
   * Sets the field 'name'.
   */
  public Printer setName(java.lang.String name) {
    return genClient.setOther(name, CacheKey.name);
  }

  /**
   * Sets the field 'ipAddress'.
   */
  public Printer setIpAddress(java.lang.String ipAddress) {
    return genClient.setOther(ipAddress, CacheKey.ipAddress);
  }

  /**
   * Sets the field 'type'.
   */
  public Printer setType(com.clover.sdk.v3.printer.PrinterType type) {
    return genClient.setOther(type, CacheKey.type);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'mac' field, the 'has' method for this field will now return false */
  public void clearMac() {
    genClient.clear(CacheKey.mac);
  }
  /** Clears the 'model' field, the 'has' method for this field will now return false */
  public void clearModel() {
    genClient.clear(CacheKey.model);
  }
  /** Clears the 'name' field, the 'has' method for this field will now return false */
  public void clearName() {
    genClient.clear(CacheKey.name);
  }
  /** Clears the 'ipAddress' field, the 'has' method for this field will now return false */
  public void clearIpAddress() {
    genClient.clear(CacheKey.ipAddress);
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
  public Printer copyChanges() {
    Printer copy = new Printer();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Printer src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Printer(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<Printer> CREATOR = new android.os.Parcelable.Creator<Printer>() {
    @Override
    public Printer createFromParcel(android.os.Parcel in) {
      Printer instance = new Printer(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Printer[] newArray(int size) {
      return new Printer[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Printer> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Printer>() {
    @Override
    public Printer create(org.json.JSONObject jsonObject) {
      return new Printer(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean MAC_IS_REQUIRED = false;
    public static final long MAC_MAX_LEN = 30;
    public static final boolean MODEL_IS_REQUIRED = false;
    public static final long MODEL_MAX_LEN = 20;
    public static final boolean NAME_IS_REQUIRED = false;
    public static final long NAME_MAX_LEN = 30;
    public static final boolean IPADDRESS_IS_REQUIRED = false;
    public static final long IPADDRESS_MAX_LEN = 30;
    public static final boolean TYPE_IS_REQUIRED = false;

  }

}
