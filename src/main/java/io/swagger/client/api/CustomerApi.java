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
import org.joda.time.LocalDate;
import io.swagger.client.model.InlineResponse20029;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse20030;
import io.swagger.client.model.Customer;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerApi {
    private ApiClient apiClient;

    public CustomerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createCustomer */
    private com.squareup.okhttp.Call createCustomerCall(String email, String firstname, String lastname, LocalDate birthday, Integer gender, String address1, String address2, String city, String county, String postcode, Long countryId, String phone, LocalDate lastDive, Integer numberOfDives, String chestSize, String showSize, String height, List<Long> certificates, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new ApiException("Missing the required parameter 'email' when calling createCustomer(Async)");
        }
        
        // verify the required parameter 'firstname' is set
        if (firstname == null) {
            throw new ApiException("Missing the required parameter 'firstname' when calling createCustomer(Async)");
        }
        
        // verify the required parameter 'lastname' is set
        if (lastname == null) {
            throw new ApiException("Missing the required parameter 'lastname' when calling createCustomer(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/customer/add".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
        if (firstname != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstname", firstname));
        if (lastname != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastname", lastname));
        if (birthday != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "birthday", birthday));
        if (gender != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "gender", gender));
        if (address1 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address_1", address1));
        if (address2 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address_2", address2));
        if (city != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "city", city));
        if (county != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "county", county));
        if (postcode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "postcode", postcode));
        if (countryId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country_id", countryId));
        if (phone != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "phone", phone));
        if (lastDive != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_dive", lastDive));
        if (numberOfDives != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "number_of_dives", numberOfDives));
        if (chestSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "chest_size", chestSize));
        if (showSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_size", showSize));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", height));
        if (certificates != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "certificates", certificates));

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
     * Create a new customer
     * 
     * @param email  (required)
     * @param firstname  (required)
     * @param lastname  (required)
     * @param birthday  (optional)
     * @param gender  (optional)
     * @param address1  (optional)
     * @param address2  (optional)
     * @param city  (optional)
     * @param county  (optional)
     * @param postcode  (optional)
     * @param countryId  (optional)
     * @param phone  (optional)
     * @param lastDive  (optional)
     * @param numberOfDives  (optional)
     * @param chestSize  (optional)
     * @param showSize  (optional)
     * @param height  (optional)
     * @param certificates  (optional)
     * @return InlineResponse20029
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20029 createCustomer(String email, String firstname, String lastname, LocalDate birthday, Integer gender, String address1, String address2, String city, String county, String postcode, Long countryId, String phone, LocalDate lastDive, Integer numberOfDives, String chestSize, String showSize, String height, List<Long> certificates) throws ApiException {
        ApiResponse<InlineResponse20029> resp = createCustomerWithHttpInfo(email, firstname, lastname, birthday, gender, address1, address2, city, county, postcode, countryId, phone, lastDive, numberOfDives, chestSize, showSize, height, certificates);
        return resp.getData();
    }

    /**
     * Create a new customer
     * 
     * @param email  (required)
     * @param firstname  (required)
     * @param lastname  (required)
     * @param birthday  (optional)
     * @param gender  (optional)
     * @param address1  (optional)
     * @param address2  (optional)
     * @param city  (optional)
     * @param county  (optional)
     * @param postcode  (optional)
     * @param countryId  (optional)
     * @param phone  (optional)
     * @param lastDive  (optional)
     * @param numberOfDives  (optional)
     * @param chestSize  (optional)
     * @param showSize  (optional)
     * @param height  (optional)
     * @param certificates  (optional)
     * @return ApiResponse&lt;InlineResponse20029&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20029> createCustomerWithHttpInfo(String email, String firstname, String lastname, LocalDate birthday, Integer gender, String address1, String address2, String city, String county, String postcode, Long countryId, String phone, LocalDate lastDive, Integer numberOfDives, String chestSize, String showSize, String height, List<Long> certificates) throws ApiException {
        com.squareup.okhttp.Call call = createCustomerCall(email, firstname, lastname, birthday, gender, address1, address2, city, county, postcode, countryId, phone, lastDive, numberOfDives, chestSize, showSize, height, certificates, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20029>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a new customer (asynchronously)
     * 
     * @param email  (required)
     * @param firstname  (required)
     * @param lastname  (required)
     * @param birthday  (optional)
     * @param gender  (optional)
     * @param address1  (optional)
     * @param address2  (optional)
     * @param city  (optional)
     * @param county  (optional)
     * @param postcode  (optional)
     * @param countryId  (optional)
     * @param phone  (optional)
     * @param lastDive  (optional)
     * @param numberOfDives  (optional)
     * @param chestSize  (optional)
     * @param showSize  (optional)
     * @param height  (optional)
     * @param certificates  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCustomerAsync(String email, String firstname, String lastname, LocalDate birthday, Integer gender, String address1, String address2, String city, String county, String postcode, Long countryId, String phone, LocalDate lastDive, Integer numberOfDives, String chestSize, String showSize, String height, List<Long> certificates, final ApiCallback<InlineResponse20029> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createCustomerCall(email, firstname, lastname, birthday, gender, address1, address2, city, county, postcode, countryId, phone, lastDive, numberOfDives, chestSize, showSize, height, certificates, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20029>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteCustomer */
    private com.squareup.okhttp.Call deleteCustomerCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteCustomer(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/customer/delete".replaceAll("\\{format\\}","json");

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
     * Delete a customer by ID
     * 
     * @param id  (required)
     * @return InlineResponse2003
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2003 deleteCustomer(Long id) throws ApiException {
        ApiResponse<InlineResponse2003> resp = deleteCustomerWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Delete a customer by ID
     * 
     * @param id  (required)
     * @return ApiResponse&lt;InlineResponse2003&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2003> deleteCustomerWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteCustomerCall(id, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete a customer by ID (asynchronously)
     * 
     * @param id  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCustomerAsync(Long id, final ApiCallback<InlineResponse2003> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCustomerCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2003>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for editCustomer */
    private com.squareup.okhttp.Call editCustomerCall(Long id, String email, String firstname, String lastname, LocalDate birthday, Integer gender, String address1, String address2, String city, String county, String postcode, Long countryId, String phone, LocalDate lastDive, Integer numberOfDives, String chestSize, String showSize, String height, List<Long> certificates, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling editCustomer(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/customer/edit".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
        if (firstname != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstname", firstname));
        if (lastname != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastname", lastname));
        if (birthday != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "birthday", birthday));
        if (gender != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "gender", gender));
        if (address1 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address_1", address1));
        if (address2 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "address_2", address2));
        if (city != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "city", city));
        if (county != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "county", county));
        if (postcode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "postcode", postcode));
        if (countryId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country_id", countryId));
        if (phone != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "phone", phone));
        if (lastDive != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_dive", lastDive));
        if (numberOfDives != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "number_of_dives", numberOfDives));
        if (chestSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "chest_size", chestSize));
        if (showSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "show_size", showSize));
        if (height != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", height));
        if (certificates != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "certificates", certificates));

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
     * Update a customer by ID
     * 
     * @param id  (required)
     * @param email  (optional)
     * @param firstname  (optional)
     * @param lastname  (optional)
     * @param birthday  (optional)
     * @param gender  (optional)
     * @param address1  (optional)
     * @param address2  (optional)
     * @param city  (optional)
     * @param county  (optional)
     * @param postcode  (optional)
     * @param countryId  (optional)
     * @param phone  (optional)
     * @param lastDive  (optional)
     * @param numberOfDives  (optional)
     * @param chestSize  (optional)
     * @param showSize  (optional)
     * @param height  (optional)
     * @param certificates  (optional)
     * @return InlineResponse20030
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20030 editCustomer(Long id, String email, String firstname, String lastname, LocalDate birthday, Integer gender, String address1, String address2, String city, String county, String postcode, Long countryId, String phone, LocalDate lastDive, Integer numberOfDives, String chestSize, String showSize, String height, List<Long> certificates) throws ApiException {
        ApiResponse<InlineResponse20030> resp = editCustomerWithHttpInfo(id, email, firstname, lastname, birthday, gender, address1, address2, city, county, postcode, countryId, phone, lastDive, numberOfDives, chestSize, showSize, height, certificates);
        return resp.getData();
    }

    /**
     * Update a customer by ID
     * 
     * @param id  (required)
     * @param email  (optional)
     * @param firstname  (optional)
     * @param lastname  (optional)
     * @param birthday  (optional)
     * @param gender  (optional)
     * @param address1  (optional)
     * @param address2  (optional)
     * @param city  (optional)
     * @param county  (optional)
     * @param postcode  (optional)
     * @param countryId  (optional)
     * @param phone  (optional)
     * @param lastDive  (optional)
     * @param numberOfDives  (optional)
     * @param chestSize  (optional)
     * @param showSize  (optional)
     * @param height  (optional)
     * @param certificates  (optional)
     * @return ApiResponse&lt;InlineResponse20030&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20030> editCustomerWithHttpInfo(Long id, String email, String firstname, String lastname, LocalDate birthday, Integer gender, String address1, String address2, String city, String county, String postcode, Long countryId, String phone, LocalDate lastDive, Integer numberOfDives, String chestSize, String showSize, String height, List<Long> certificates) throws ApiException {
        com.squareup.okhttp.Call call = editCustomerCall(id, email, firstname, lastname, birthday, gender, address1, address2, city, county, postcode, countryId, phone, lastDive, numberOfDives, chestSize, showSize, height, certificates, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20030>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a customer by ID (asynchronously)
     * 
     * @param id  (required)
     * @param email  (optional)
     * @param firstname  (optional)
     * @param lastname  (optional)
     * @param birthday  (optional)
     * @param gender  (optional)
     * @param address1  (optional)
     * @param address2  (optional)
     * @param city  (optional)
     * @param county  (optional)
     * @param postcode  (optional)
     * @param countryId  (optional)
     * @param phone  (optional)
     * @param lastDive  (optional)
     * @param numberOfDives  (optional)
     * @param chestSize  (optional)
     * @param showSize  (optional)
     * @param height  (optional)
     * @param certificates  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call editCustomerAsync(Long id, String email, String firstname, String lastname, LocalDate birthday, Integer gender, String address1, String address2, String city, String county, String postcode, Long countryId, String phone, LocalDate lastDive, Integer numberOfDives, String chestSize, String showSize, String height, List<Long> certificates, final ApiCallback<InlineResponse20030> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = editCustomerCall(id, email, firstname, lastname, birthday, gender, address1, address2, city, county, postcode, countryId, phone, lastDive, numberOfDives, chestSize, showSize, height, certificates, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20030>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAllCustomers */
    private com.squareup.okhttp.Call getAllCustomersCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/customer/all".replaceAll("\\{format\\}","json");

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
     * Retrieve all customers
     * 
     * @return List&lt;Customer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Customer> getAllCustomers() throws ApiException {
        ApiResponse<List<Customer>> resp = getAllCustomersWithHttpInfo();
        return resp.getData();
    }

    /**
     * Retrieve all customers
     * 
     * @return ApiResponse&lt;List&lt;Customer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Customer>> getAllCustomersWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getAllCustomersCall(null, null);
        Type localVarReturnType = new TypeToken<List<Customer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve all customers (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllCustomersAsync(final ApiCallback<List<Customer>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllCustomersCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Customer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCustomer */
    private com.squareup.okhttp.Call getCustomerCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/customer".replaceAll("\\{format\\}","json");

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
     * Retrieve a customer by ID
     * 
     * @param id  (optional)
     * @return InlineResponse20029
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20029 getCustomer(Long id) throws ApiException {
        ApiResponse<InlineResponse20029> resp = getCustomerWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Retrieve a customer by ID
     * 
     * @param id  (optional)
     * @return ApiResponse&lt;InlineResponse20029&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20029> getCustomerWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getCustomerCall(id, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20029>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a customer by ID (asynchronously)
     * 
     * @param id  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCustomerAsync(Long id, final ApiCallback<InlineResponse20029> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCustomerCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20029>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
