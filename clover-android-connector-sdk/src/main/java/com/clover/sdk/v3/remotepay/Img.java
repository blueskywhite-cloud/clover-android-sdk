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

package com.clover.sdk.v3.remotepay;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getSrc src}</li>
 * <li>{@link #getWidth width}</li>
 * <li>{@link #getHeight height}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class Img extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * The url to the image if available
   */
  public java.lang.String getSrc() {
    return genClient.cacheGet(CacheKey.src);
  }

  /**
   * The width of the image if available
   */
  public java.lang.Long getWidth() {
    return genClient.cacheGet(CacheKey.width);
  }

  /**
   * The height of the image if available
   */
  public java.lang.Long getHeight() {
    return genClient.cacheGet(CacheKey.height);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<Img> {
    src {
      @Override
      public Object extractValue(Img instance) {
        return instance.genClient.extractOther("src", java.lang.String.class);
      }
    },
    width {
      @Override
      public Object extractValue(Img instance) {
        return instance.genClient.extractOther("width", java.lang.Long.class);
      }
    },
    height {
      @Override
      public Object extractValue(Img instance) {
        return instance.genClient.extractOther("height", java.lang.Long.class);
      }
    },
      ;
  }

  private GenericClient<Img> genClient;

  /**
  * Constructs a new empty instance.
  */
  public Img() {
    genClient = new GenericClient<Img>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected Img(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public Img(String json) throws IllegalArgumentException {
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
  public Img(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public Img(Img src) {
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

  /** Checks whether the 'src' field is set and is not null */
  public boolean isNotNullSrc() {
    return genClient.cacheValueIsNotNull(CacheKey.src);
  }

  /** Checks whether the 'width' field is set and is not null */
  public boolean isNotNullWidth() {
    return genClient.cacheValueIsNotNull(CacheKey.width);
  }

  /** Checks whether the 'height' field is set and is not null */
  public boolean isNotNullHeight() {
    return genClient.cacheValueIsNotNull(CacheKey.height);
  }



  /** Checks whether the 'src' field has been set, however the value could be null */
  public boolean hasSrc() {
    return genClient.cacheHasKey(CacheKey.src);
  }

  /** Checks whether the 'width' field has been set, however the value could be null */
  public boolean hasWidth() {
    return genClient.cacheHasKey(CacheKey.width);
  }

  /** Checks whether the 'height' field has been set, however the value could be null */
  public boolean hasHeight() {
    return genClient.cacheHasKey(CacheKey.height);
  }


  /**
   * Sets the field 'src'.
   */
  public Img setSrc(java.lang.String src) {
    return genClient.setOther(src, CacheKey.src);
  }

  /**
   * Sets the field 'width'.
   */
  public Img setWidth(java.lang.Long width) {
    return genClient.setOther(width, CacheKey.width);
  }

  /**
   * Sets the field 'height'.
   */
  public Img setHeight(java.lang.Long height) {
    return genClient.setOther(height, CacheKey.height);
  }


  /** Clears the 'src' field, the 'has' method for this field will now return false */
  public void clearSrc() {
    genClient.clear(CacheKey.src);
  }
  /** Clears the 'width' field, the 'has' method for this field will now return false */
  public void clearWidth() {
    genClient.clear(CacheKey.width);
  }
  /** Clears the 'height' field, the 'has' method for this field will now return false */
  public void clearHeight() {
    genClient.clear(CacheKey.height);
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
  public Img copyChanges() {
    Img copy = new Img();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(Img src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new Img(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<Img> CREATOR = new android.os.Parcelable.Creator<Img>() {
    @Override
    public Img createFromParcel(android.os.Parcel in) {
      Img instance = new Img(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public Img[] newArray(int size) {
      return new Img[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<Img> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<Img>() {
    @Override
    public Img create(org.json.JSONObject jsonObject) {
      return new Img(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean SRC_IS_REQUIRED = false;
    public static final boolean WIDTH_IS_REQUIRED = false;
    public static final boolean HEIGHT_IS_REQUIRED = false;

  }

}
