/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.firebase.v1beta1.model;

/**
 * A high-level summary of an App.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FirebaseAppInfo extends com.google.api.client.json.GenericJson {

  /**
   * Immutable. The globally unique, Firebase-assigned identifier of the App.
   *
   * This identifier should be treated as an opaque token, as the data format is not specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appId;

  /**
   * The user-assigned display name of the Firebase App.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The fully qualified resource name of the Firebase App, in the format:
   * projects/projectId/iosApps/appId or projects/projectId/androidApps/appId
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The platform of the Firebase App.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String platform;

  /**
   * Immutable. The globally unique, Firebase-assigned identifier of the App.
   *
   * This identifier should be treated as an opaque token, as the data format is not specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * Immutable. The globally unique, Firebase-assigned identifier of the App.
   *
   * This identifier should be treated as an opaque token, as the data format is not specified.
   * @param appId appId or {@code null} for none
   */
  public FirebaseAppInfo setAppId(java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * The user-assigned display name of the Firebase App.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The user-assigned display name of the Firebase App.
   * @param displayName displayName or {@code null} for none
   */
  public FirebaseAppInfo setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The fully qualified resource name of the Firebase App, in the format:
   * projects/projectId/iosApps/appId or projects/projectId/androidApps/appId
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The fully qualified resource name of the Firebase App, in the format:
   * projects/projectId/iosApps/appId or projects/projectId/androidApps/appId
   * @param name name or {@code null} for none
   */
  public FirebaseAppInfo setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The platform of the Firebase App.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlatform() {
    return platform;
  }

  /**
   * The platform of the Firebase App.
   * @param platform platform or {@code null} for none
   */
  public FirebaseAppInfo setPlatform(java.lang.String platform) {
    this.platform = platform;
    return this;
  }

  @Override
  public FirebaseAppInfo set(String fieldName, Object value) {
    return (FirebaseAppInfo) super.set(fieldName, value);
  }

  @Override
  public FirebaseAppInfo clone() {
    return (FirebaseAppInfo) super.clone();
  }

}