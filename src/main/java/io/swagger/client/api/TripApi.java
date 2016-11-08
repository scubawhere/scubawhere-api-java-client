/**
 * Scubawhere API Documentation
 * This is the documentation for scubawhere's RMS API. This API is only to be used by authorized parties with valid auth tokens.  [Learn about scubawhere](http://www.scubawhere.com) to become an authorized consumer of our API 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: bryan@scubawhere.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.ErrorModel;
import io.swagger.client.model.InlineResponse20046;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse20047;
import io.swagger.client.model.Trip;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripApi {
    private ApiClient apiClient;

    public TripApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TripApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createTrip */
    private com.squareup.okhttp.Call createTripCall(String name, Float duration, List<Long> locations, List<Long> tags, String description, Boolean boatRequired, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling createTrip(Async)");
        }
        
        // verify the required parameter 'duration' is set
        if (duration == null) {
            throw new ApiException("Missing the required parameter 'duration' when calling createTrip(Async)");
        }
        
        // verify the required parameter 'locations' is set
        if (locations == null) {
            throw new ApiException("Missing the required parameter 'locations' when calling createTrip(Async)");
        }
        
        // verify the required parameter 'tags' is set
        if (tags == null) {
            throw new ApiException("Missing the required parameter 'tags' when calling createTrip(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/trip/add".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (description != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
        if (duration != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
        if (boatRequired != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "boat_required", boatRequired));
        if (locations != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "locations", locations));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Create a new trip
     * 
     * @param name  (required)
     * @param duration  (required)
     * @param locations  (required)
     * @param tags  (required)
     * @param description  (optional)
     * @param boatRequired  (optional)
     * @return InlineResponse20046
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20046 createTrip(String name, Float duration, List<Long> locations, List<Long> tags, String description, Boolean boatRequired) throws ApiException {
        ApiResponse<InlineResponse20046> resp = createTripWithHttpInfo(name, duration, locations, tags, description, boatRequired);
        return resp.getData();
    }

    /**
     * Create a new trip
     * 
     * @param name  (required)
     * @param duration  (required)
     * @param locations  (required)
     * @param tags  (required)
     * @param description  (optional)
     * @param boatRequired  (optional)
     * @return ApiResponse&lt;InlineResponse20046&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20046> createTripWithHttpInfo(String name, Float duration, List<Long> locations, List<Long> tags, String description, Boolean boatRequired) throws ApiException {
        com.squareup.okhttp.Call call = createTripCall(name, duration, locations, tags, description, boatRequired, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20046>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a new trip (asynchronously)
     * 
     * @param name  (required)
     * @param duration  (required)
     * @param locations  (required)
     * @param tags  (required)
     * @param description  (optional)
     * @param boatRequired  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createTripAsync(String name, Float duration, List<Long> locations, List<Long> tags, String description, Boolean boatRequired, final ApiCallback<InlineResponse20046> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createTripCall(name, duration, locations, tags, description, boatRequired, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20046>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteTrip */
    private com.squareup.okhttp.Call deleteTripCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteTrip(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/trip/delete".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Delete a trip by ID
     * 
     * @param id  (required)
     * @return InlineResponse2003
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2003 deleteTrip(Long id) throws ApiException {
        ApiResponse<InlineResponse2003> resp = deleteTripWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Delete a trip by ID
     * 
     * @param id  (required)
     * @return ApiResponse&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2003> deleteTripWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteTripCall(id, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a trip by ID (asynchronously)
     * 
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTripAsync(Long id, final ApiCallback<InlineResponse2003> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteTripCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for editTrip */
    private com.squareup.okhttp.Call editTripCall(Long id, String name, Float duration, List<Long> locations, List<Long> tags, String description, Boolean boatRequired, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling editTrip(Async)");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling editTrip(Async)");
        }
        
        // verify the required parameter 'duration' is set
        if (duration == null) {
            throw new ApiException("Missing the required parameter 'duration' when calling editTrip(Async)");
        }
        
        // verify the required parameter 'locations' is set
        if (locations == null) {
            throw new ApiException("Missing the required parameter 'locations' when calling editTrip(Async)");
        }
        
        // verify the required parameter 'tags' is set
        if (tags == null) {
            throw new ApiException("Missing the required parameter 'tags' when calling editTrip(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/trip/edit".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (description != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
        if (duration != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
        if (boatRequired != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "boat_required", boatRequired));
        if (locations != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "locations", locations));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tags", tags));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Update a trip by ID
     * 
     * @param id  (required)
     * @param name  (required)
     * @param duration  (required)
     * @param locations  (required)
     * @param tags  (required)
     * @param description  (optional)
     * @param boatRequired  (optional)
     * @return InlineResponse20047
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20047 editTrip(Long id, String name, Float duration, List<Long> locations, List<Long> tags, String description, Boolean boatRequired) throws ApiException {
        ApiResponse<InlineResponse20047> resp = editTripWithHttpInfo(id, name, duration, locations, tags, description, boatRequired);
        return resp.getData();
    }

    /**
     * Update a trip by ID
     * 
     * @param id  (required)
     * @param name  (required)
     * @param duration  (required)
     * @param locations  (required)
     * @param tags  (required)
     * @param description  (optional)
     * @param boatRequired  (optional)
     * @return ApiResponse&lt;InlineResponse20047&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20047> editTripWithHttpInfo(Long id, String name, Float duration, List<Long> locations, List<Long> tags, String description, Boolean boatRequired) throws ApiException {
        com.squareup.okhttp.Call call = editTripCall(id, name, duration, locations, tags, description, boatRequired, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20047>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a trip by ID (asynchronously)
     * 
     * @param id  (required)
     * @param name  (required)
     * @param duration  (required)
     * @param locations  (required)
     * @param tags  (required)
     * @param description  (optional)
     * @param boatRequired  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call editTripAsync(Long id, String name, Float duration, List<Long> locations, List<Long> tags, String description, Boolean boatRequired, final ApiCallback<InlineResponse20047> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = editTripCall(id, name, duration, locations, tags, description, boatRequired, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20047>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAllTrips */
    private com.squareup.okhttp.Call getAllTripsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/trip/all".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Retrieve all trips including any deleted models
     * 
     * @return List&lt;Trip&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Trip> getAllTrips() throws ApiException {
        ApiResponse<List<Trip>> resp = getAllTripsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Retrieve all trips including any deleted models
     * 
     * @return ApiResponse&lt;List&lt;Trip&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Trip>> getAllTripsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAllTripsCall(null, null);
        Type localVarReturnType = new TypeToken<List<Trip>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve all trips including any deleted models (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllTripsAsync(final ApiCallback<List<Trip>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllTripsCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Trip>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAllWithTrashedTrips */
    private com.squareup.okhttp.Call getAllWithTrashedTripsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/trip/all-with-trashed".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Retrieve all trips including any deleted models
     * 
     * @return List&lt;Trip&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Trip> getAllWithTrashedTrips() throws ApiException {
        ApiResponse<List<Trip>> resp = getAllWithTrashedTripsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Retrieve all trips including any deleted models
     * 
     * @return ApiResponse&lt;List&lt;Trip&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Trip>> getAllWithTrashedTripsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAllWithTrashedTripsCall(null, null);
        Type localVarReturnType = new TypeToken<List<Trip>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve all trips including any deleted models (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllWithTrashedTripsAsync(final ApiCallback<List<Trip>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllWithTrashedTripsCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Trip>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for tripGet */
    private com.squareup.okhttp.Call tripGetCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling tripGet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/trip".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Retrieve a trip by ID
     * 
     * @param id  (required)
     * @return Trip
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Trip tripGet(Long id) throws ApiException {
        ApiResponse<Trip> resp = tripGetWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Retrieve a trip by ID
     * 
     * @param id  (required)
     * @return ApiResponse&lt;Trip&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Trip> tripGetWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = tripGetCall(id, null, null);
        Type localVarReturnType = new TypeToken<Trip>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a trip by ID (asynchronously)
     * 
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call tripGetAsync(Long id, final ApiCallback<Trip> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = tripGetCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Trip>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}