# BoatroomApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBoatroom**](BoatroomApi.md#createBoatroom) | **POST** /boatroom/add | Create a new boatroom
[**deleteBoatroom**](BoatroomApi.md#deleteBoatroom) | **DELETE** /boatroom/delete | Delete a boatroom by ID
[**editBoatroom**](BoatroomApi.md#editBoatroom) | **POST** /boatroom/edit | Update a boatroom by ID
[**getAllBoatrooms**](BoatroomApi.md#getAllBoatrooms) | **GET** /boatroom/all | Retrieve all boatrooms
[**getAllWithTrashedBoatrooms**](BoatroomApi.md#getAllWithTrashedBoatrooms) | **GET** /boatroom/all-with-trashed | Retrieve all boatrooms including any deleted models
[**getBoatroom**](BoatroomApi.md#getBoatroom) | **GET** /boatroom | Retrieve a boatroom by ID


<a name="createBoatroom"></a>
# **createBoatroom**
> InlineResponse2006 createBoatroom(name, description)

Create a new boatroom

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoatroomApi;


BoatroomApi apiInstance = new BoatroomApi();
String name = "name_example"; // String | 
String description = "description_example"; // String | 
try {
    InlineResponse2006 result = apiInstance.createBoatroom(name, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoatroomApi#createBoatroom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **description** | **String**|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBoatroom"></a>
# **deleteBoatroom**
> InlineResponse2003 deleteBoatroom(id)

Delete a boatroom by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoatroomApi;


BoatroomApi apiInstance = new BoatroomApi();
Long id = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.deleteBoatroom(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoatroomApi#deleteBoatroom");
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

<a name="editBoatroom"></a>
# **editBoatroom**
> InlineResponse2006 editBoatroom(id, name, description)

Update a boatroom by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoatroomApi;


BoatroomApi apiInstance = new BoatroomApi();
Long id = 789L; // Long | 
String name = "name_example"; // String | 
String description = "description_example"; // String | 
try {
    InlineResponse2006 result = apiInstance.editBoatroom(id, name, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoatroomApi#editBoatroom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **name** | **String**|  |
 **description** | **String**|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllBoatrooms"></a>
# **getAllBoatrooms**
> List&lt;Boatroom&gt; getAllBoatrooms()

Retrieve all boatrooms

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoatroomApi;


BoatroomApi apiInstance = new BoatroomApi();
try {
    List<Boatroom> result = apiInstance.getAllBoatrooms();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoatroomApi#getAllBoatrooms");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Boatroom&gt;**](Boatroom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedBoatrooms"></a>
# **getAllWithTrashedBoatrooms**
> List&lt;Boatroom&gt; getAllWithTrashedBoatrooms()

Retrieve all boatrooms including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoatroomApi;


BoatroomApi apiInstance = new BoatroomApi();
try {
    List<Boatroom> result = apiInstance.getAllWithTrashedBoatrooms();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoatroomApi#getAllWithTrashedBoatrooms");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Boatroom&gt;**](Boatroom.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBoatroom"></a>
# **getBoatroom**
> InlineResponse2006 getBoatroom(id)

Retrieve a boatroom by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BoatroomApi;


BoatroomApi apiInstance = new BoatroomApi();
Long id = 789L; // Long | 
try {
    InlineResponse2006 result = apiInstance.getBoatroom(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BoatroomApi#getBoatroom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

