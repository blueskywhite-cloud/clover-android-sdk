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

package com.clover.sdk.v3.order;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getId id}</li>
 * <li>{@link #getCurrency currency}</li>
 * <li>{@link #getEmployee employee}</li>
 * <li>{@link #getSubtotal subtotal}</li>
 * <li>{@link #getTax tax}</li>
 * <li>{@link #getTotal total}</li>
 * <li>{@link #getTitle title}</li>
 * <li>{@link #getNote note}</li>
 * <li>{@link #getServiceChargeName serviceChargeName}</li>
 * <li>{@link #getServiceChargeAmount serviceChargeAmount}</li>
 * <li>{@link #getDiscounts discounts}</li>
 * <li>{@link #getLineItems lineItems}</li>
 * <li>{@link #getAmountRemaining amountRemaining}</li>
 * <li>{@link #getPayments payments}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class DisplayOrder extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Unique identifier
   */
  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }

  /**
   * Currency of this order
   */
  public java.lang.String getCurrency() {
    return genClient.cacheGet(CacheKey.currency);
  }

  /**
   * The employee associated with this order
   */
  public java.lang.String getEmployee() {
    return genClient.cacheGet(CacheKey.employee);
  }

  /**
   * Formatted subtotal of the order
   */
  public java.lang.String getSubtotal() {
    return genClient.cacheGet(CacheKey.subtotal);
  }

  /**
   * Formatted tax of the order
   */
  public java.lang.String getTax() {
    return genClient.cacheGet(CacheKey.tax);
  }

  /**
   * Formatted total of the order
   */
  public java.lang.String getTotal() {
    return genClient.cacheGet(CacheKey.total);
  }

  public java.lang.String getTitle() {
    return genClient.cacheGet(CacheKey.title);
  }

  public java.lang.String getNote() {
    return genClient.cacheGet(CacheKey.note);
  }

  /**
   * Optional service charge name (gratuity) applied to this order
   */
  public java.lang.String getServiceChargeName() {
    return genClient.cacheGet(CacheKey.serviceChargeName);
  }

  /**
   * Optional service charge amount (gratuity) applied to this order
   */
  public java.lang.String getServiceChargeAmount() {
    return genClient.cacheGet(CacheKey.serviceChargeAmount);
  }

  public java.util.List<com.clover.sdk.v3.order.DisplayDiscount> getDiscounts() {
    return genClient.cacheGet(CacheKey.discounts);
  }

  public java.util.List<com.clover.sdk.v3.order.DisplayLineItem> getLineItems() {
    return genClient.cacheGet(CacheKey.lineItems);
  }

  /**
   * Formatted amount remaining
   */
  public java.lang.String getAmountRemaining() {
    return genClient.cacheGet(CacheKey.amountRemaining);
  }

  /**
   * Payments that were made for this order
   */
  public java.util.List<com.clover.sdk.v3.order.DisplayPayment> getPayments() {
    return genClient.cacheGet(CacheKey.payments);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<DisplayOrder> {
    id {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    currency {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractOther("currency", java.lang.String.class);
      }
    },
    employee {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractOther("employee", java.lang.String.class);
      }
    },
    subtotal {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractOther("subtotal", java.lang.String.class);
      }
    },
    tax {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractOther("tax", java.lang.String.class);
      }
    },
    total {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractOther("total", java.lang.String.class);
      }
    },
    title {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractOther("title", java.lang.String.class);
      }
    },
    note {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractOther("note", java.lang.String.class);
      }
    },
    serviceChargeName {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractOther("serviceChargeName", java.lang.String.class);
      }
    },
    serviceChargeAmount {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractOther("serviceChargeAmount", java.lang.String.class);
      }
    },
    discounts {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractListRecord("discounts", com.clover.sdk.v3.order.DisplayDiscount.JSON_CREATOR);
      }
    },
    lineItems {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractListRecord("lineItems", com.clover.sdk.v3.order.DisplayLineItem.JSON_CREATOR);
      }
    },
    amountRemaining {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractOther("amountRemaining", java.lang.String.class);
      }
    },
    payments {
      @Override
      public Object extractValue(DisplayOrder instance) {
        return instance.genClient.extractListRecord("payments", com.clover.sdk.v3.order.DisplayPayment.JSON_CREATOR);
      }
    },
      ;
  }

  private GenericClient<DisplayOrder> genClient;

  /**
  * Constructs a new empty instance.
  */
  public DisplayOrder() {
    genClient = new GenericClient<DisplayOrder>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  public DisplayOrder(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public DisplayOrder(String json) throws IllegalArgumentException {
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
  public DisplayOrder(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public DisplayOrder(DisplayOrder src) {
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

    genClient.validateLength(getCurrency(), 3);

    genClient.validateLength(getSubtotal(), 127);

    genClient.validateLength(getTax(), 127);

    genClient.validateLength(getTotal(), 127);

    genClient.validateLength(getTitle(), 127);

    genClient.validateLength(getNote(), 2047);

    genClient.validateLength(getAmountRemaining(), 127);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'currency' field is set and is not null */
  public boolean isNotNullCurrency() {
    return genClient.cacheValueIsNotNull(CacheKey.currency);
  }

  /** Checks whether the 'employee' field is set and is not null */
  public boolean isNotNullEmployee() {
    return genClient.cacheValueIsNotNull(CacheKey.employee);
  }

  /** Checks whether the 'subtotal' field is set and is not null */
  public boolean isNotNullSubtotal() {
    return genClient.cacheValueIsNotNull(CacheKey.subtotal);
  }

  /** Checks whether the 'tax' field is set and is not null */
  public boolean isNotNullTax() {
    return genClient.cacheValueIsNotNull(CacheKey.tax);
  }

  /** Checks whether the 'total' field is set and is not null */
  public boolean isNotNullTotal() {
    return genClient.cacheValueIsNotNull(CacheKey.total);
  }

  /** Checks whether the 'title' field is set and is not null */
  public boolean isNotNullTitle() {
    return genClient.cacheValueIsNotNull(CacheKey.title);
  }

  /** Checks whether the 'note' field is set and is not null */
  public boolean isNotNullNote() {
    return genClient.cacheValueIsNotNull(CacheKey.note);
  }

  /** Checks whether the 'serviceChargeName' field is set and is not null */
  public boolean isNotNullServiceChargeName() {
    return genClient.cacheValueIsNotNull(CacheKey.serviceChargeName);
  }

  /** Checks whether the 'serviceChargeAmount' field is set and is not null */
  public boolean isNotNullServiceChargeAmount() {
    return genClient.cacheValueIsNotNull(CacheKey.serviceChargeAmount);
  }

  /** Checks whether the 'discounts' field is set and is not null */
  public boolean isNotNullDiscounts() {
    return genClient.cacheValueIsNotNull(CacheKey.discounts);
  }

  /** Checks whether the 'discounts' field is set and is not null and is not empty */
  public boolean isNotEmptyDiscounts() { return isNotNullDiscounts() && !getDiscounts().isEmpty(); }

  /** Checks whether the 'lineItems' field is set and is not null */
  public boolean isNotNullLineItems() {
    return genClient.cacheValueIsNotNull(CacheKey.lineItems);
  }

  /** Checks whether the 'lineItems' field is set and is not null and is not empty */
  public boolean isNotEmptyLineItems() { return isNotNullLineItems() && !getLineItems().isEmpty(); }

  /** Checks whether the 'amountRemaining' field is set and is not null */
  public boolean isNotNullAmountRemaining() {
    return genClient.cacheValueIsNotNull(CacheKey.amountRemaining);
  }

  /** Checks whether the 'payments' field is set and is not null */
  public boolean isNotNullPayments() {
    return genClient.cacheValueIsNotNull(CacheKey.payments);
  }

  /** Checks whether the 'payments' field is set and is not null and is not empty */
  public boolean isNotEmptyPayments() { return isNotNullPayments() && !getPayments().isEmpty(); }



  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'currency' field has been set, however the value could be null */
  public boolean hasCurrency() {
    return genClient.cacheHasKey(CacheKey.currency);
  }

  /** Checks whether the 'employee' field has been set, however the value could be null */
  public boolean hasEmployee() {
    return genClient.cacheHasKey(CacheKey.employee);
  }

  /** Checks whether the 'subtotal' field has been set, however the value could be null */
  public boolean hasSubtotal() {
    return genClient.cacheHasKey(CacheKey.subtotal);
  }

  /** Checks whether the 'tax' field has been set, however the value could be null */
  public boolean hasTax() {
    return genClient.cacheHasKey(CacheKey.tax);
  }

  /** Checks whether the 'total' field has been set, however the value could be null */
  public boolean hasTotal() {
    return genClient.cacheHasKey(CacheKey.total);
  }

  /** Checks whether the 'title' field has been set, however the value could be null */
  public boolean hasTitle() {
    return genClient.cacheHasKey(CacheKey.title);
  }

  /** Checks whether the 'note' field has been set, however the value could be null */
  public boolean hasNote() {
    return genClient.cacheHasKey(CacheKey.note);
  }

  /** Checks whether the 'serviceChargeName' field has been set, however the value could be null */
  public boolean hasServiceChargeName() {
    return genClient.cacheHasKey(CacheKey.serviceChargeName);
  }

  /** Checks whether the 'serviceChargeAmount' field has been set, however the value could be null */
  public boolean hasServiceChargeAmount() {
    return genClient.cacheHasKey(CacheKey.serviceChargeAmount);
  }

  /** Checks whether the 'discounts' field has been set, however the value could be null */
  public boolean hasDiscounts() {
    return genClient.cacheHasKey(CacheKey.discounts);
  }

  /** Checks whether the 'lineItems' field has been set, however the value could be null */
  public boolean hasLineItems() {
    return genClient.cacheHasKey(CacheKey.lineItems);
  }

  /** Checks whether the 'amountRemaining' field has been set, however the value could be null */
  public boolean hasAmountRemaining() {
    return genClient.cacheHasKey(CacheKey.amountRemaining);
  }

  /** Checks whether the 'payments' field has been set, however the value could be null */
  public boolean hasPayments() {
    return genClient.cacheHasKey(CacheKey.payments);
  }


  /**
   * Sets the field 'id'.
   */
  public DisplayOrder setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'currency'.
   */
  public DisplayOrder setCurrency(java.lang.String currency) {
    return genClient.setOther(currency, CacheKey.currency);
  }

  /**
   * Sets the field 'employee'.
   */
  public DisplayOrder setEmployee(java.lang.String employee) {
    return genClient.setOther(employee, CacheKey.employee);
  }

  /**
   * Sets the field 'subtotal'.
   */
  public DisplayOrder setSubtotal(java.lang.String subtotal) {
    return genClient.setOther(subtotal, CacheKey.subtotal);
  }

  /**
   * Sets the field 'tax'.
   */
  public DisplayOrder setTax(java.lang.String tax) {
    return genClient.setOther(tax, CacheKey.tax);
  }

  /**
   * Sets the field 'total'.
   */
  public DisplayOrder setTotal(java.lang.String total) {
    return genClient.setOther(total, CacheKey.total);
  }

  /**
   * Sets the field 'title'.
   */
  public DisplayOrder setTitle(java.lang.String title) {
    return genClient.setOther(title, CacheKey.title);
  }

  /**
   * Sets the field 'note'.
   */
  public DisplayOrder setNote(java.lang.String note) {
    return genClient.setOther(note, CacheKey.note);
  }

  /**
   * Sets the field 'serviceChargeName'.
   */
  public DisplayOrder setServiceChargeName(java.lang.String serviceChargeName) {
    return genClient.setOther(serviceChargeName, CacheKey.serviceChargeName);
  }

  /**
   * Sets the field 'serviceChargeAmount'.
   */
  public DisplayOrder setServiceChargeAmount(java.lang.String serviceChargeAmount) {
    return genClient.setOther(serviceChargeAmount, CacheKey.serviceChargeAmount);
  }

  /**
   * Sets the field 'discounts'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public DisplayOrder setDiscounts(java.util.List<com.clover.sdk.v3.order.DisplayDiscount> discounts) {
    return genClient.setArrayRecord(discounts, CacheKey.discounts);
  }

  /**
   * Sets the field 'lineItems'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public DisplayOrder setLineItems(java.util.List<com.clover.sdk.v3.order.DisplayLineItem> lineItems) {
    return genClient.setArrayRecord(lineItems, CacheKey.lineItems);
  }

  /**
   * Sets the field 'amountRemaining'.
   */
  public DisplayOrder setAmountRemaining(java.lang.String amountRemaining) {
    return genClient.setOther(amountRemaining, CacheKey.amountRemaining);
  }

  /**
   * Sets the field 'payments'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public DisplayOrder setPayments(java.util.List<com.clover.sdk.v3.order.DisplayPayment> payments) {
    return genClient.setArrayRecord(payments, CacheKey.payments);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'currency' field, the 'has' method for this field will now return false */
  public void clearCurrency() {
    genClient.clear(CacheKey.currency);
  }
  /** Clears the 'employee' field, the 'has' method for this field will now return false */
  public void clearEmployee() {
    genClient.clear(CacheKey.employee);
  }
  /** Clears the 'subtotal' field, the 'has' method for this field will now return false */
  public void clearSubtotal() {
    genClient.clear(CacheKey.subtotal);
  }
  /** Clears the 'tax' field, the 'has' method for this field will now return false */
  public void clearTax() {
    genClient.clear(CacheKey.tax);
  }
  /** Clears the 'total' field, the 'has' method for this field will now return false */
  public void clearTotal() {
    genClient.clear(CacheKey.total);
  }
  /** Clears the 'title' field, the 'has' method for this field will now return false */
  public void clearTitle() {
    genClient.clear(CacheKey.title);
  }
  /** Clears the 'note' field, the 'has' method for this field will now return false */
  public void clearNote() {
    genClient.clear(CacheKey.note);
  }
  /** Clears the 'serviceChargeName' field, the 'has' method for this field will now return false */
  public void clearServiceChargeName() {
    genClient.clear(CacheKey.serviceChargeName);
  }
  /** Clears the 'serviceChargeAmount' field, the 'has' method for this field will now return false */
  public void clearServiceChargeAmount() {
    genClient.clear(CacheKey.serviceChargeAmount);
  }
  /** Clears the 'discounts' field, the 'has' method for this field will now return false */
  public void clearDiscounts() {
    genClient.clear(CacheKey.discounts);
  }
  /** Clears the 'lineItems' field, the 'has' method for this field will now return false */
  public void clearLineItems() {
    genClient.clear(CacheKey.lineItems);
  }
  /** Clears the 'amountRemaining' field, the 'has' method for this field will now return false */
  public void clearAmountRemaining() {
    genClient.clear(CacheKey.amountRemaining);
  }
  /** Clears the 'payments' field, the 'has' method for this field will now return false */
  public void clearPayments() {
    genClient.clear(CacheKey.payments);
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
  public DisplayOrder copyChanges() {
    DisplayOrder copy = new DisplayOrder();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(DisplayOrder src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new DisplayOrder(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<DisplayOrder> CREATOR = new android.os.Parcelable.Creator<DisplayOrder>() {
    @Override
    public DisplayOrder createFromParcel(android.os.Parcel in) {
      DisplayOrder instance = new DisplayOrder(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public DisplayOrder[] newArray(int size) {
      return new DisplayOrder[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<DisplayOrder> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<DisplayOrder>() {
    @Override
    public DisplayOrder create(org.json.JSONObject jsonObject) {
      return new DisplayOrder(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;
    public static final boolean CURRENCY_IS_REQUIRED = false;
    public static final long CURRENCY_MAX_LEN = 3;
    public static final boolean EMPLOYEE_IS_REQUIRED = false;
    public static final boolean SUBTOTAL_IS_REQUIRED = false;
    public static final long SUBTOTAL_MAX_LEN = 127;
    public static final boolean TAX_IS_REQUIRED = false;
    public static final long TAX_MAX_LEN = 127;
    public static final boolean TOTAL_IS_REQUIRED = false;
    public static final long TOTAL_MAX_LEN = 127;
    public static final boolean TITLE_IS_REQUIRED = false;
    public static final long TITLE_MAX_LEN = 127;
    public static final boolean NOTE_IS_REQUIRED = false;
    public static final long NOTE_MAX_LEN = 2047;
    public static final boolean SERVICECHARGENAME_IS_REQUIRED = false;
    public static final boolean SERVICECHARGEAMOUNT_IS_REQUIRED = false;
    public static final boolean DISCOUNTS_IS_REQUIRED = false;
    public static final boolean LINEITEMS_IS_REQUIRED = false;
    public static final boolean AMOUNTREMAINING_IS_REQUIRED = false;
    public static final long AMOUNTREMAINING_MAX_LEN = 127;
    public static final boolean PAYMENTS_IS_REQUIRED = false;

  }

}
