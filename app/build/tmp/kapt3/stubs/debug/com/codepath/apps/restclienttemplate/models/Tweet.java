package com.codepath.apps.restclienttemplate.models;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/codepath/apps/restclienttemplate/models/Tweet;", "Landroid/os/Parcelable;", "body", "", "createdAt", "user", "Lcom/codepath/apps/restclienttemplate/models/User;", "(Ljava/lang/String;Ljava/lang/String;Lcom/codepath/apps/restclienttemplate/models/User;)V", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "getCreatedAt", "setCreatedAt", "getUser", "()Lcom/codepath/apps/restclienttemplate/models/User;", "setUser", "(Lcom/codepath/apps/restclienttemplate/models/User;)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class Tweet implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String body;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String createdAt;
    @org.jetbrains.annotations.Nullable()
    private com.codepath.apps.restclienttemplate.models.User user;
    @org.jetbrains.annotations.NotNull()
    public static final com.codepath.apps.restclienttemplate.models.Tweet.Companion Companion = null;
    public static final android.os.Parcelable.Creator<com.codepath.apps.restclienttemplate.models.Tweet> CREATOR = null;
    
    public Tweet() {
        super();
    }
    
    public Tweet(@org.jetbrains.annotations.NotNull()
    java.lang.String body, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.Nullable()
    com.codepath.apps.restclienttemplate.models.User user) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codepath.apps.restclienttemplate.models.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    com.codepath.apps.restclienttemplate.models.User p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.codepath.apps.restclienttemplate.models.Tweet> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.codepath.apps.restclienttemplate.models.Tweet createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.codepath.apps.restclienttemplate.models.Tweet[] newArray(int size) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/codepath/apps/restclienttemplate/models/Tweet$Companion;", "", "()V", "fromJson", "Lcom/codepath/apps/restclienttemplate/models/Tweet;", "jsonObject", "Lorg/json/JSONObject;", "fromJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codepath.apps.restclienttemplate.models.Tweet fromJson(@org.jetbrains.annotations.NotNull()
        org.json.JSONObject jsonObject) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.codepath.apps.restclienttemplate.models.Tweet> fromJsonArray(@org.jetbrains.annotations.NotNull()
        org.json.JSONArray jsonArray) {
            return null;
        }
    }
}