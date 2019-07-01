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

package com.google.api.services.replicapool.model;

/**
 * A Compute Engine NetworkInterface resource. Identical to the NetworkInterface on the
 * corresponding Compute Engine resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Replica Pool API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkInterface extends com.google.api.client.json.GenericJson {

  /**
   * An array of configurations for this interface. This specifies how this interface is configured
   * to interact with other network services.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AccessConfig> accessConfigs;

  static {
    // hack to force ProGuard to consider AccessConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AccessConfig.class);
  }

  /**
   * Name the Network resource to which this interface applies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * An optional IPV4 internal network address to assign to the instance for this network interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkIp;

  /**
   * An array of configurations for this interface. This specifies how this interface is configured
   * to interact with other network services.
   * @return value or {@code null} for none
   */
  public java.util.List<AccessConfig> getAccessConfigs() {
    return accessConfigs;
  }

  /**
   * An array of configurations for this interface. This specifies how this interface is configured
   * to interact with other network services.
   * @param accessConfigs accessConfigs or {@code null} for none
   */
  public NetworkInterface setAccessConfigs(java.util.List<AccessConfig> accessConfigs) {
    this.accessConfigs = accessConfigs;
    return this;
  }

  /**
   * Name the Network resource to which this interface applies.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Name the Network resource to which this interface applies.
   * @param network network or {@code null} for none
   */
  public NetworkInterface setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * An optional IPV4 internal network address to assign to the instance for this network interface.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkIp() {
    return networkIp;
  }

  /**
   * An optional IPV4 internal network address to assign to the instance for this network interface.
   * @param networkIp networkIp or {@code null} for none
   */
  public NetworkInterface setNetworkIp(java.lang.String networkIp) {
    this.networkIp = networkIp;
    return this;
  }

  @Override
  public NetworkInterface set(String fieldName, Object value) {
    return (NetworkInterface) super.set(fieldName, value);
  }

  @Override
  public NetworkInterface clone() {
    return (NetworkInterface) super.clone();
  }

}