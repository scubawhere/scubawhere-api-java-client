# LocationsApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLocation**](LocationsApi.md#getLocation) | **GET** /location | Retrieve a location by its ID


<a name="getLocation"></a>
# **getLocation**
> InlineResponse20031 getLocation(id)

Retrieve a location by its ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
Long id = 789L; // Long | 
try {
    InlineResponse20031 result = apiInstance.getLocation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#getLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

