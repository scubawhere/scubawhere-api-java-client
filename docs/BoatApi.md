# BoatApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBoat**](BoatApi.md#createBoat) | **POST** /boat/add | Create a new boat
[**deleteBoat**](BoatApi.md#deleteBoat) | **DELETE** /boat/delete | Delete a boat by ID
[**editBoat**](BoatApi.md#editBoat) | **POST** /boat/edit | Update a boat by ID
[**getAllBoats**](BoatApi.md#getAllBoats) | **GET** /boat/all | Retrieve all boats
[**getAllWithTrashedBoats**](BoatApi.md#getAllWithTrashedBoats) | **GET** /boat/all-with-trashed | Retrieve all agents including any deleted models
[**getBoat**](BoatApi.md#getBoat) | **GET** /boat | Retrieve a boat by ID


<a name="createBoat"></a>
# **createBoat**
> InlineResponse2005 createBoat(name, capacity, description, boatrooms)

Create a new boat

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoatApi;


BoatApi apiInstance = new BoatApi();
String name = "name_example"; // String | 
Long capacity = 789L; // Long | 
String description = "description_example"; // String | 
List<Long> boatrooms = Arrays.asList(56L); // List<Long> | 
try {
    InlineResponse2005 result = apiInstance.createBoat(name, capacity, description, boatrooms);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoatApi#createBoat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **capacity** | **Long**|  |
 **description** | **String**|  | [optional]
 **boatrooms** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBoat"></a>
# **deleteBoat**
> InlineResponse2003 deleteBoat(id)

Delete a boat by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoatApi;


BoatApi apiInstance = new BoatApi();
Long id = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.deleteBoat(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoatApi#deleteBoat");
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

<a name="editBoat"></a>
# **editBoat**
> InlineResponse2004 editBoat(name, capacity, description, boatrooms)

Update a boat by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoatApi;


BoatApi apiInstance = new BoatApi();
String name = "name_example"; // String | 
Long capacity = 789L; // Long | 
String description = "description_example"; // String | 
List<Long> boatrooms = Arrays.asList(56L); // List<Long> | 
try {
    InlineResponse2004 result = apiInstance.editBoat(name, capacity, description, boatrooms);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoatApi#editBoat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **capacity** | **Long**|  |
 **description** | **String**|  | [optional]
 **boatrooms** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllBoats"></a>
# **getAllBoats**
> List&lt;Boat&gt; getAllBoats()

Retrieve all boats

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoatApi;


BoatApi apiInstance = new BoatApi();
try {
    List<Boat> result = apiInstance.getAllBoats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoatApi#getAllBoats");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Boat&gt;**](Boat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedBoats"></a>
# **getAllWithTrashedBoats**
> List&lt;Boat&gt; getAllWithTrashedBoats()

Retrieve all agents including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoatApi;


BoatApi apiInstance = new BoatApi();
try {
    List<Boat> result = apiInstance.getAllWithTrashedBoats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoatApi#getAllWithTrashedBoats");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Boat&gt;**](Boat.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBoat"></a>
# **getBoat**
> InlineResponse2005 getBoat(id)

Retrieve a boat by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoatApi;


BoatApi apiInstance = new BoatApi();
Long id = 789L; // Long | ID of the boat to be retrieved
try {
    InlineResponse2005 result = apiInstance.getBoat(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoatApi#getBoat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the boat to be retrieved |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

