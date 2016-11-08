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

import io.swagger.client.model.InlineResponse20032;
import io.swagger.client.model.ErrorModel;
import org.joda.time.LocalDate;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse20033;
import io.swagger.client.model.ModelPackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PackageApi {
    private ApiClient apiClient;

    public PackageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PackageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createPackage */
    private com.squareup.okhttp.Call createPackageCall(String name, String description, LocalDate availableFrom, LocalDate availableUntil, List<Long> tickets, List<Long> courses, List<Long> accommodations, List<Long> addons, List<Long> prices, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling createPackage(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/package/add".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (description != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
        if (availableFrom != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "available_from", availableFrom));
        if (availableUntil != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "available_until", availableUntil));
        if (tickets != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tickets", tickets));
        if (courses != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "courses", courses));
        if (accommodations != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "accommodations", accommodations));
        if (addons != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "addons", addons));
        if (prices != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "prices", prices));

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
     * Create a new package
     * 
     * @param name  (required)
     * @param description  (optional)
     * @param availableFrom  (optional)
     * @param availableUntil  (optional)
     * @param tickets  (optional)
     * @param courses  (optional)
     * @param accommodations  (optional)
     * @param addons  (optional)
     * @param prices  (optional)
     * @return InlineResponse20032
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20032 createPackage(String name, String description, LocalDate availableFrom, LocalDate availableUntil, List<Long> tickets, List<Long> courses, List<Long> accommodations, List<Long> addons, List<Long> prices) throws ApiException {
        ApiResponse<InlineResponse20032> resp = createPackageWithHttpInfo(name, description, availableFrom, availableUntil, tickets, courses, accommodations, addons, prices);
        return resp.getData();
    }

    /**
     * Create a new package
     * 
     * @param name  (required)
     * @param description  (optional)
     * @param availableFrom  (optional)
     * @param availableUntil  (optional)
     * @param tickets  (optional)
     * @param courses  (optional)
     * @param accommodations  (optional)
     * @param addons  (optional)
     * @param prices  (optional)
     * @return ApiResponse&lt;InlineResponse20032&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20032> createPackageWithHttpInfo(String name, String description, LocalDate availableFrom, LocalDate availableUntil, List<Long> tickets, List<Long> courses, List<Long> accommodations, List<Long> addons, List<Long> prices) throws ApiException {
        com.squareup.okhttp.Call call = createPackageCall(name, description, availableFrom, availableUntil, tickets, courses, accommodations, addons, prices, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20032>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a new package (asynchronously)
     * 
     * @param name  (required)
     * @param description  (optional)
     * @param availableFrom  (optional)
     * @param availableUntil  (optional)
     * @param tickets  (optional)
     * @param courses  (optional)
     * @param accommodations  (optional)
     * @param addons  (optional)
     * @param prices  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createPackageAsync(String name, String description, LocalDate availableFrom, LocalDate availableUntil, List<Long> tickets, List<Long> courses, List<Long> accommodations, List<Long> addons, List<Long> prices, final ApiCallback<InlineResponse20032> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createPackageCall(name, description, availableFrom, availableUntil, tickets, courses, accommodations, addons, prices, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20032>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deletePackage */
    private com.squareup.okhttp.Call deletePackageCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deletePackage(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/package/delete".replaceAll("\\{format\\}","json");

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
     * Delete a package by ID
     * 
     * @param id  (required)
     * @return InlineResponse2003
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2003 deletePackage(Long id) throws ApiException {
        ApiResponse<InlineResponse2003> resp = deletePackageWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Delete a package by ID
     * 
     * @param id  (required)
     * @return ApiResponse&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2003> deletePackageWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deletePackageCall(id, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a package by ID (asynchronously)
     * 
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePackageAsync(Long id, final ApiCallback<InlineResponse2003> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deletePackageCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for editPackage */
    private com.squareup.okhttp.Call editPackageCall(Long id, String name, String description, LocalDate availableFrom, LocalDate availableUntil, List<Long> tickets, List<Long> courses, List<Long> accommodations, List<Long> addons, List<Long> prices, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling editPackage(Async)");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling editPackage(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/package/edit".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (description != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
        if (availableFrom != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "available_from", availableFrom));
        if (availableUntil != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "available_until", availableUntil));
        if (tickets != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "tickets", tickets));
        if (courses != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "courses", courses));
        if (accommodations != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "accommodations", accommodations));
        if (addons != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "addons", addons));
        if (prices != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "prices", prices));

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
     * Update a package by ID
     * 
     * @param id  (required)
     * @param name  (required)
     * @param description  (optional)
     * @param availableFrom  (optional)
     * @param availableUntil  (optional)
     * @param tickets  (optional)
     * @param courses  (optional)
     * @param accommodations  (optional)
     * @param addons  (optional)
     * @param prices  (optional)
     * @return InlineResponse20033
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20033 editPackage(Long id, String name, String description, LocalDate availableFrom, LocalDate availableUntil, List<Long> tickets, List<Long> courses, List<Long> accommodations, List<Long> addons, List<Long> prices) throws ApiException {
        ApiResponse<InlineResponse20033> resp = editPackageWithHttpInfo(id, name, description, availableFrom, availableUntil, tickets, courses, accommodations, addons, prices);
        return resp.getData();
    }

    /**
     * Update a package by ID
     * 
     * @param id  (required)
     * @param name  (required)
     * @param description  (optional)
     * @param availableFrom  (optional)
     * @param availableUntil  (optional)
     * @param tickets  (optional)
     * @param courses  (optional)
     * @param accommodations  (optional)
     * @param addons  (optional)
     * @param prices  (optional)
     * @return ApiResponse&lt;InlineResponse20033&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20033> editPackageWithHttpInfo(Long id, String name, String description, LocalDate availableFrom, LocalDate availableUntil, List<Long> tickets, List<Long> courses, List<Long> accommodations, List<Long> addons, List<Long> prices) throws ApiException {
        com.squareup.okhttp.Call call = editPackageCall(id, name, description, availableFrom, availableUntil, tickets, courses, accommodations, addons, prices, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20033>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a package by ID (asynchronously)
     * 
     * @param id  (required)
     * @param name  (required)
     * @param description  (optional)
     * @param availableFrom  (optional)
     * @param availableUntil  (optional)
     * @param tickets  (optional)
     * @param courses  (optional)
     * @param accommodations  (optional)
     * @param addons  (optional)
     * @param prices  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call editPackageAsync(Long id, String name, String description, LocalDate availableFrom, LocalDate availableUntil, List<Long> tickets, List<Long> courses, List<Long> accommodations, List<Long> addons, List<Long> prices, final ApiCallback<InlineResponse20033> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = editPackageCall(id, name, description, availableFrom, availableUntil, tickets, courses, accommodations, addons, prices, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20033>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAllPackages */
    private com.squareup.okhttp.Call getAllPackagesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/package/all".replaceAll("\\{format\\}","json");

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
     * Retrieve all packages including any deleted models
     * 
     * @return List&lt;ModelPackage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ModelPackage> getAllPackages() throws ApiException {
        ApiResponse<List<ModelPackage>> resp = getAllPackagesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Retrieve all packages including any deleted models
     * 
     * @return ApiResponse&lt;List&lt;ModelPackage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ModelPackage>> getAllPackagesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAllPackagesCall(null, null);
        Type localVarReturnType = new TypeToken<List<ModelPackage>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve all packages including any deleted models (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllPackagesAsync(final ApiCallback<List<ModelPackage>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllPackagesCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ModelPackage>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAllWithTrashedPackages */
    private com.squareup.okhttp.Call getAllWithTrashedPackagesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/package/all-with-trashed".replaceAll("\\{format\\}","json");

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
     * Retrieve all packages including any deleted models
     * 
     * @return List&lt;ModelPackage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ModelPackage> getAllWithTrashedPackages() throws ApiException {
        ApiResponse<List<ModelPackage>> resp = getAllWithTrashedPackagesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Retrieve all packages including any deleted models
     * 
     * @return ApiResponse&lt;List&lt;ModelPackage&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ModelPackage>> getAllWithTrashedPackagesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAllWithTrashedPackagesCall(null, null);
        Type localVarReturnType = new TypeToken<List<ModelPackage>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve all packages including any deleted models (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllWithTrashedPackagesAsync(final ApiCallback<List<ModelPackage>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllWithTrashedPackagesCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ModelPackage>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getPackage */
    private com.squareup.okhttp.Call getPackageCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/package".replaceAll("\\{format\\}","json");

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
     * Retrieve a package by ID
     * 
     * @param id  (optional)
     * @return InlineResponse20032
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20032 getPackage(Long id) throws ApiException {
        ApiResponse<InlineResponse20032> resp = getPackageWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Retrieve a package by ID
     * 
     * @param id  (optional)
     * @return ApiResponse&lt;InlineResponse20032&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20032> getPackageWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getPackageCall(id, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20032>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a package by ID (asynchronously)
     * 
     * @param id  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPackageAsync(Long id, final ApiCallback<InlineResponse20032> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPackageCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20032>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
