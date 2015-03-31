/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


package com.clover.sdk.v3.payments;

import android.os.Parcelable;
import android.os.Parcel;

@SuppressWarnings("all")
public enum BatchType implements Parcelable {
  MANUAL_CLOSE, AUTO_CLOSE;

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(final Parcel dest, final int flags) {
    dest.writeString(name());
  }

  public static final Creator<BatchType> CREATOR = new Creator<BatchType>() {
    @Override
    public BatchType createFromParcel(final Parcel source) {
      return BatchType.valueOf(source.readString());
    }

    @Override
    public BatchType[] newArray(final int size) {
      return new BatchType[size];
    }
  };
}
