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

package com.google.api.services.bigquery.model;

/**
 * Evaluation metrics for multi-class classification/classifier models.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MultiClassClassificationMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Aggregate classification metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AggregateClassificationMetrics aggregateClassificationMetrics;

  /**
   * Confusion matrix at different thresholds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConfusionMatrix> confusionMatrixList;

  static {
    // hack to force ProGuard to consider ConfusionMatrix used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ConfusionMatrix.class);
  }

  /**
   * Aggregate classification metrics.
   * @return value or {@code null} for none
   */
  public AggregateClassificationMetrics getAggregateClassificationMetrics() {
    return aggregateClassificationMetrics;
  }

  /**
   * Aggregate classification metrics.
   * @param aggregateClassificationMetrics aggregateClassificationMetrics or {@code null} for none
   */
  public MultiClassClassificationMetrics setAggregateClassificationMetrics(AggregateClassificationMetrics aggregateClassificationMetrics) {
    this.aggregateClassificationMetrics = aggregateClassificationMetrics;
    return this;
  }

  /**
   * Confusion matrix at different thresholds.
   * @return value or {@code null} for none
   */
  public java.util.List<ConfusionMatrix> getConfusionMatrixList() {
    return confusionMatrixList;
  }

  /**
   * Confusion matrix at different thresholds.
   * @param confusionMatrixList confusionMatrixList or {@code null} for none
   */
  public MultiClassClassificationMetrics setConfusionMatrixList(java.util.List<ConfusionMatrix> confusionMatrixList) {
    this.confusionMatrixList = confusionMatrixList;
    return this;
  }

  @Override
  public MultiClassClassificationMetrics set(String fieldName, Object value) {
    return (MultiClassClassificationMetrics) super.set(fieldName, value);
  }

  @Override
  public MultiClassClassificationMetrics clone() {
    return (MultiClassClassificationMetrics) super.clone();
  }

}
