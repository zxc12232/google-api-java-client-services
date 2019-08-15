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

package com.google.api.services.compute.model;

/**
 * gRPC call credentials to access the SDS server.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CallCredentials extends com.google.api.client.json.GenericJson {

  /**
   * The type of call credentials to use for GRPC requests to the SDS server. This field can be set
   * to one of the following: ACCESS_TOKEN: An access token is used as call credentials for the SDS
   * server. GCE_VM: The local GCE VM service account credentials are used to access the SDS server.
   * JWT_SERVICE_TOKEN: The user provisioned service account credentials are used to access the SDS
   * server. FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String callCredentialType;

  /**
   * Custom authenticator credentials.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetadataCredentialsFromPlugin fromPlugin;

  /**
   * The type of call credentials to use for GRPC requests to the SDS server. This field can be set
   * to one of the following: ACCESS_TOKEN: An access token is used as call credentials for the SDS
   * server. GCE_VM: The local GCE VM service account credentials are used to access the SDS server.
   * JWT_SERVICE_TOKEN: The user provisioned service account credentials are used to access the SDS
   * server. FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
   * @return value or {@code null} for none
   */
  public java.lang.String getCallCredentialType() {
    return callCredentialType;
  }

  /**
   * The type of call credentials to use for GRPC requests to the SDS server. This field can be set
   * to one of the following: ACCESS_TOKEN: An access token is used as call credentials for the SDS
   * server. GCE_VM: The local GCE VM service account credentials are used to access the SDS server.
   * JWT_SERVICE_TOKEN: The user provisioned service account credentials are used to access the SDS
   * server. FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
   * @param callCredentialType callCredentialType or {@code null} for none
   */
  public CallCredentials setCallCredentialType(java.lang.String callCredentialType) {
    this.callCredentialType = callCredentialType;
    return this;
  }

  /**
   * Custom authenticator credentials.
   * @return value or {@code null} for none
   */
  public MetadataCredentialsFromPlugin getFromPlugin() {
    return fromPlugin;
  }

  /**
   * Custom authenticator credentials.
   * @param fromPlugin fromPlugin or {@code null} for none
   */
  public CallCredentials setFromPlugin(MetadataCredentialsFromPlugin fromPlugin) {
    this.fromPlugin = fromPlugin;
    return this;
  }

  @Override
  public CallCredentials set(String fieldName, Object value) {
    return (CallCredentials) super.set(fieldName, value);
  }

  @Override
  public CallCredentials clone() {
    return (CallCredentials) super.clone();
  }

}