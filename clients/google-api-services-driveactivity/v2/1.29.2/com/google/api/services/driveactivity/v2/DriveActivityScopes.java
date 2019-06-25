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

package com.google.api.services.driveactivity.v2;

/**
 * Available OAuth 2.0 scopes for use with the Drive Activity API.
 *
 * @since 1.4
 */
public class DriveActivityScopes {

  /** View and add to the activity record of files in your Google Drive. */
  public static final String DRIVE_ACTIVITY = "https://www.googleapis.com/auth/drive.activity";

  /** View the activity record of files in your Google Drive. */
  public static final String DRIVE_ACTIVITY_READONLY = "https://www.googleapis.com/auth/drive.activity.readonly";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(DRIVE_ACTIVITY);
    set.add(DRIVE_ACTIVITY_READONLY);
    return java.util.Collections.unmodifiableSet(set);
  }

  private DriveActivityScopes() {
  }
}