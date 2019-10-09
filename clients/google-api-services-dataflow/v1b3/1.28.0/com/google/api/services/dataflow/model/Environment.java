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

package com.google.api.services.dataflow.model;

/**
 * Describes the environment in which a Dataflow Job runs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Environment extends com.google.api.client.json.GenericJson {

  /**
   * The type of cluster manager API to use.  If unknown or unspecified, the service will attempt to
   * choose a reasonable default.  This should be in the form of the API service name, e.g.
   * "compute.googleapis.com".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterManagerApiService;

  /**
   * The dataset for the current project where various workflow related tables are stored.
   *
   * The supported resource type is:
   *
   * Google BigQuery:   bigquery.googleapis.com/{dataset}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataset;

  /**
   * The list of experiments to enable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> experiments;

  /**
   * Which Flexible Resource Scheduling mode to run in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String flexResourceSchedulingGoal;

  /**
   * Experimental settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> internalExperiments;

  /**
   * The Cloud Dataflow SDK pipeline options specified by the user. These options are passed through
   * the service and are used to recreate the SDK pipeline options on the worker in a language
   * agnostic and platform independent way.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> sdkPipelineOptions;

  /**
   * Identity to run virtual machines as. Defaults to the default account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountEmail;

  /**
   * If set, contains the Cloud KMS key identifier used to encrypt data at rest, AKA a Customer
   * Managed Encryption Key (CMEK).
   *
   * Format:   projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceKmsKeyName;

  /**
   * The prefix of the resources the system should use for temporary storage.  The system will
   * append the suffix "/temp-{JOBNAME} to this resource prefix, where {JOBNAME} is the value of the
   * job_name field.  The resulting bucket and object prefix is used as the prefix of the resources
   * used to store temporary data needed during the job execution.  NOTE: This will override the
   * value in taskrunner_settings. The supported resource type is:
   *
   * Google Cloud Storage:
   *
   *   storage.googleapis.com/{bucket}/{object}   bucket.storage.googleapis.com/{object}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tempStoragePrefix;

  /**
   * A description of the process that generated the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> userAgent;

  /**
   * A structure describing which components and their versions of the service are required in order
   * to run the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> version;

  /**
   * The worker pools. At least one "harness" worker pool must be specified in order for the job to
   * have workers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WorkerPool> workerPools;

  /**
   * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones)
   * in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone.
   * If neither worker_region nor worker_zone is specified, default to the control plane's region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workerRegion;

  /**
   * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in
   * which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region.
   * If neither worker_region nor worker_zone is specified, a zone in the control plane's region is
   * chosen based on available capacity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workerZone;

  /**
   * The type of cluster manager API to use.  If unknown or unspecified, the service will attempt to
   * choose a reasonable default.  This should be in the form of the API service name, e.g.
   * "compute.googleapis.com".
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterManagerApiService() {
    return clusterManagerApiService;
  }

  /**
   * The type of cluster manager API to use.  If unknown or unspecified, the service will attempt to
   * choose a reasonable default.  This should be in the form of the API service name, e.g.
   * "compute.googleapis.com".
   * @param clusterManagerApiService clusterManagerApiService or {@code null} for none
   */
  public Environment setClusterManagerApiService(java.lang.String clusterManagerApiService) {
    this.clusterManagerApiService = clusterManagerApiService;
    return this;
  }

  /**
   * The dataset for the current project where various workflow related tables are stored.
   *
   * The supported resource type is:
   *
   * Google BigQuery:   bigquery.googleapis.com/{dataset}
   * @return value or {@code null} for none
   */
  public java.lang.String getDataset() {
    return dataset;
  }

  /**
   * The dataset for the current project where various workflow related tables are stored.
   *
   * The supported resource type is:
   *
   * Google BigQuery:   bigquery.googleapis.com/{dataset}
   * @param dataset dataset or {@code null} for none
   */
  public Environment setDataset(java.lang.String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * The list of experiments to enable.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExperiments() {
    return experiments;
  }

  /**
   * The list of experiments to enable.
   * @param experiments experiments or {@code null} for none
   */
  public Environment setExperiments(java.util.List<java.lang.String> experiments) {
    this.experiments = experiments;
    return this;
  }

  /**
   * Which Flexible Resource Scheduling mode to run in.
   * @return value or {@code null} for none
   */
  public java.lang.String getFlexResourceSchedulingGoal() {
    return flexResourceSchedulingGoal;
  }

  /**
   * Which Flexible Resource Scheduling mode to run in.
   * @param flexResourceSchedulingGoal flexResourceSchedulingGoal or {@code null} for none
   */
  public Environment setFlexResourceSchedulingGoal(java.lang.String flexResourceSchedulingGoal) {
    this.flexResourceSchedulingGoal = flexResourceSchedulingGoal;
    return this;
  }

  /**
   * Experimental settings.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getInternalExperiments() {
    return internalExperiments;
  }

  /**
   * Experimental settings.
   * @param internalExperiments internalExperiments or {@code null} for none
   */
  public Environment setInternalExperiments(java.util.Map<String, java.lang.Object> internalExperiments) {
    this.internalExperiments = internalExperiments;
    return this;
  }

  /**
   * The Cloud Dataflow SDK pipeline options specified by the user. These options are passed through
   * the service and are used to recreate the SDK pipeline options on the worker in a language
   * agnostic and platform independent way.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getSdkPipelineOptions() {
    return sdkPipelineOptions;
  }

  /**
   * The Cloud Dataflow SDK pipeline options specified by the user. These options are passed through
   * the service and are used to recreate the SDK pipeline options on the worker in a language
   * agnostic and platform independent way.
   * @param sdkPipelineOptions sdkPipelineOptions or {@code null} for none
   */
  public Environment setSdkPipelineOptions(java.util.Map<String, java.lang.Object> sdkPipelineOptions) {
    this.sdkPipelineOptions = sdkPipelineOptions;
    return this;
  }

  /**
   * Identity to run virtual machines as. Defaults to the default account.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountEmail() {
    return serviceAccountEmail;
  }

  /**
   * Identity to run virtual machines as. Defaults to the default account.
   * @param serviceAccountEmail serviceAccountEmail or {@code null} for none
   */
  public Environment setServiceAccountEmail(java.lang.String serviceAccountEmail) {
    this.serviceAccountEmail = serviceAccountEmail;
    return this;
  }

  /**
   * If set, contains the Cloud KMS key identifier used to encrypt data at rest, AKA a Customer
   * Managed Encryption Key (CMEK).
   *
   * Format:   projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceKmsKeyName() {
    return serviceKmsKeyName;
  }

  /**
   * If set, contains the Cloud KMS key identifier used to encrypt data at rest, AKA a Customer
   * Managed Encryption Key (CMEK).
   *
   * Format:   projects/PROJECT_ID/locations/LOCATION/keyRings/KEY_RING/cryptoKeys/KEY
   * @param serviceKmsKeyName serviceKmsKeyName or {@code null} for none
   */
  public Environment setServiceKmsKeyName(java.lang.String serviceKmsKeyName) {
    this.serviceKmsKeyName = serviceKmsKeyName;
    return this;
  }

  /**
   * The prefix of the resources the system should use for temporary storage.  The system will
   * append the suffix "/temp-{JOBNAME} to this resource prefix, where {JOBNAME} is the value of the
   * job_name field.  The resulting bucket and object prefix is used as the prefix of the resources
   * used to store temporary data needed during the job execution.  NOTE: This will override the
   * value in taskrunner_settings. The supported resource type is:
   *
   * Google Cloud Storage:
   *
   *   storage.googleapis.com/{bucket}/{object}   bucket.storage.googleapis.com/{object}
   * @return value or {@code null} for none
   */
  public java.lang.String getTempStoragePrefix() {
    return tempStoragePrefix;
  }

  /**
   * The prefix of the resources the system should use for temporary storage.  The system will
   * append the suffix "/temp-{JOBNAME} to this resource prefix, where {JOBNAME} is the value of the
   * job_name field.  The resulting bucket and object prefix is used as the prefix of the resources
   * used to store temporary data needed during the job execution.  NOTE: This will override the
   * value in taskrunner_settings. The supported resource type is:
   *
   * Google Cloud Storage:
   *
   *   storage.googleapis.com/{bucket}/{object}   bucket.storage.googleapis.com/{object}
   * @param tempStoragePrefix tempStoragePrefix or {@code null} for none
   */
  public Environment setTempStoragePrefix(java.lang.String tempStoragePrefix) {
    this.tempStoragePrefix = tempStoragePrefix;
    return this;
  }

  /**
   * A description of the process that generated the request.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getUserAgent() {
    return userAgent;
  }

  /**
   * A description of the process that generated the request.
   * @param userAgent userAgent or {@code null} for none
   */
  public Environment setUserAgent(java.util.Map<String, java.lang.Object> userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * A structure describing which components and their versions of the service are required in order
   * to run the job.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getVersion() {
    return version;
  }

  /**
   * A structure describing which components and their versions of the service are required in order
   * to run the job.
   * @param version version or {@code null} for none
   */
  public Environment setVersion(java.util.Map<String, java.lang.Object> version) {
    this.version = version;
    return this;
  }

  /**
   * The worker pools. At least one "harness" worker pool must be specified in order for the job to
   * have workers.
   * @return value or {@code null} for none
   */
  public java.util.List<WorkerPool> getWorkerPools() {
    return workerPools;
  }

  /**
   * The worker pools. At least one "harness" worker pool must be specified in order for the job to
   * have workers.
   * @param workerPools workerPools or {@code null} for none
   */
  public Environment setWorkerPools(java.util.List<WorkerPool> workerPools) {
    this.workerPools = workerPools;
    return this;
  }

  /**
   * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones)
   * in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone.
   * If neither worker_region nor worker_zone is specified, default to the control plane's region.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkerRegion() {
    return workerRegion;
  }

  /**
   * The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones)
   * in which worker processing should occur, e.g. "us-west1". Mutually exclusive with worker_zone.
   * If neither worker_region nor worker_zone is specified, default to the control plane's region.
   * @param workerRegion workerRegion or {@code null} for none
   */
  public Environment setWorkerRegion(java.lang.String workerRegion) {
    this.workerRegion = workerRegion;
    return this;
  }

  /**
   * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in
   * which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region.
   * If neither worker_region nor worker_zone is specified, a zone in the control plane's region is
   * chosen based on available capacity.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkerZone() {
    return workerZone;
  }

  /**
   * The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in
   * which worker processing should occur, e.g. "us-west1-a". Mutually exclusive with worker_region.
   * If neither worker_region nor worker_zone is specified, a zone in the control plane's region is
   * chosen based on available capacity.
   * @param workerZone workerZone or {@code null} for none
   */
  public Environment setWorkerZone(java.lang.String workerZone) {
    this.workerZone = workerZone;
    return this;
  }

  @Override
  public Environment set(String fieldName, Object value) {
    return (Environment) super.set(fieldName, value);
  }

  @Override
  public Environment clone() {
    return (Environment) super.clone();
  }

}
