# LocationApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachLocation**](LocationApi.md#attachLocation) | **POST** /location/attach | Attach a location to a company
[**createLocation**](LocationApi.md#createLocation) | **POST** /location/add | Create a location
[**dettachLocation**](LocationApi.md#dettachLocation) | **POST** /location/dettach | Dettach a location to a company
[**getAllLocations**](LocationApi.md#getAllLocations) | **GET** /location/all | Retrieve all locations associated with the company
[**getLocationTags**](LocationApi.md#getLocationTags) | **GET** /location/tags | Retrieve all tags associated to all locations
[**updateLocation**](LocationApi.md#updateLocation) | **PUT** /location/edit | Update a location


<a name="attachLocation"></a>
# **attachLocation**
> InlineResponse2003 attachLocation(locationId)

Attach a location to a company

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationApi;


LocationApi apiInstance = new LocationApi();
Long locationId = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.attachLocation(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#attachLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Long**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLocation"></a>
# **createLocation**
> InlineResponse2003 createLocation(name, description, latitude, longitude, tags)

Create a location

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationApi;


LocationApi apiInstance = new LocationApi();
String name = "name_example"; // String | 
String description = "description_example"; // String | 
Float latitude = 3.4F; // Float | 
Float longitude = 3.4F; // Float | 
List<Long> tags = Arrays.asList(56L); // List<Long> | 
try {
    InlineResponse2003 result = apiInstance.createLocation(name, description, latitude, longitude, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#createLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **description** | **String**|  | [optional]
 **latitude** | **Float**|  | [optional]
 **longitude** | **Float**|  | [optional]
 **tags** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dettachLocation"></a>
# **dettachLocation**
> InlineResponse2003 dettachLocation(locationId)

Dettach a location to a company

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationApi;


LocationApi apiInstance = new LocationApi();
Long locationId = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.dettachLocation(locationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#dettachLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Long**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllLocations"></a>
# **getAllLocations**
> InlineResponse2003 getAllLocations()

Retrieve all locations associated with the company

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationApi;


LocationApi apiInstance = new LocationApi();
try {
    InlineResponse2003 result = apiInstance.getAllLocations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#getAllLocations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLocationTags"></a>
# **getLocationTags**
> InlineResponse2003 getLocationTags()

Retrieve all tags associated to all locations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationApi;


LocationApi apiInstance = new LocationApi();
try {
    InlineResponse2003 result = apiInstance.getLocationTags();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#getLocationTags");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLocation"></a>
# **updateLocation**
> InlineResponse2003 updateLocation(locationId, description)

Update a location

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LocationApi;


LocationApi apiInstance = new LocationApi();
Long locationId = 789L; // Long | 
Long description = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.updateLocation(locationId, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationApi#updateLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **locationId** | **Long**|  |
 **description** | **Long**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

