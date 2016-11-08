# TripApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTrip**](TripApi.md#createTrip) | **POST** /trip/add | Create a new trip
[**deleteTrip**](TripApi.md#deleteTrip) | **DELETE** /trip/delete | Delete a trip by ID
[**editTrip**](TripApi.md#editTrip) | **POST** /trip/edit | Update a trip by ID
[**getAllTrips**](TripApi.md#getAllTrips) | **GET** /trip/all | Retrieve all trips including any deleted models
[**getAllWithTrashedTrips**](TripApi.md#getAllWithTrashedTrips) | **GET** /trip/all-with-trashed | Retrieve all trips including any deleted models
[**tripGet**](TripApi.md#tripGet) | **GET** /trip | Retrieve a trip by ID


<a name="createTrip"></a>
# **createTrip**
> InlineResponse20046 createTrip(name, duration, locations, tags, description, boatRequired)

Create a new trip

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TripApi;


TripApi apiInstance = new TripApi();
String name = "name_example"; // String | 
Float duration = 3.4F; // Float | 
List<Long> locations = Arrays.asList(56L); // List<Long> | 
List<Long> tags = Arrays.asList(56L); // List<Long> | 
String description = "description_example"; // String | 
Boolean boatRequired = true; // Boolean | 
try {
    InlineResponse20046 result = apiInstance.createTrip(name, duration, locations, tags, description, boatRequired);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripApi#createTrip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **duration** | **Float**|  |
 **locations** | [**List&lt;Long&gt;**](Long.md)|  |
 **tags** | [**List&lt;Long&gt;**](Long.md)|  |
 **description** | **String**|  | [optional]
 **boatRequired** | **Boolean**|  | [optional]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTrip"></a>
# **deleteTrip**
> InlineResponse2003 deleteTrip(id)

Delete a trip by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TripApi;


TripApi apiInstance = new TripApi();
Long id = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.deleteTrip(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripApi#deleteTrip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editTrip"></a>
# **editTrip**
> InlineResponse20047 editTrip(id, name, duration, locations, tags, description, boatRequired)

Update a trip by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TripApi;


TripApi apiInstance = new TripApi();
Long id = 789L; // Long | 
String name = "name_example"; // String | 
Float duration = 3.4F; // Float | 
List<Long> locations = Arrays.asList(56L); // List<Long> | 
List<Long> tags = Arrays.asList(56L); // List<Long> | 
String description = "description_example"; // String | 
Boolean boatRequired = true; // Boolean | 
try {
    InlineResponse20047 result = apiInstance.editTrip(id, name, duration, locations, tags, description, boatRequired);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripApi#editTrip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **name** | **String**|  |
 **duration** | **Float**|  |
 **locations** | [**List&lt;Long&gt;**](Long.md)|  |
 **tags** | [**List&lt;Long&gt;**](Long.md)|  |
 **description** | **String**|  | [optional]
 **boatRequired** | **Boolean**|  | [optional]

### Return type

[**InlineResponse20047**](InlineResponse20047.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllTrips"></a>
# **getAllTrips**
> List&lt;Trip&gt; getAllTrips()

Retrieve all trips including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TripApi;


TripApi apiInstance = new TripApi();
try {
    List<Trip> result = apiInstance.getAllTrips();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripApi#getAllTrips");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Trip&gt;**](Trip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedTrips"></a>
# **getAllWithTrashedTrips**
> List&lt;Trip&gt; getAllWithTrashedTrips()

Retrieve all trips including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TripApi;


TripApi apiInstance = new TripApi();
try {
    List<Trip> result = apiInstance.getAllWithTrashedTrips();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripApi#getAllWithTrashedTrips");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Trip&gt;**](Trip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="tripGet"></a>
# **tripGet**
> Trip tripGet(id)

Retrieve a trip by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TripApi;


TripApi apiInstance = new TripApi();
Long id = 789L; // Long | 
try {
    Trip result = apiInstance.tripGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TripApi#tripGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Trip**](Trip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

