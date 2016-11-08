# AddonApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAddon**](AddonApi.md#addAddon) | **POST** /addon/add | Create a new addon
[**deleteAddon**](AddonApi.md#deleteAddon) | **DELETE** /addon/delete | Delete an addon by ID
[**getAddon**](AddonApi.md#getAddon) | **GET** /addon | Retrieve an addon by ID
[**getAllAddons**](AddonApi.md#getAllAddons) | **GET** /addon/all | Retrieve all addons
[**getAllWithTrashedAddons**](AddonApi.md#getAllWithTrashedAddons) | **GET** /addon/all-with-trashed | Retrieve all addons including any deleted models
[**updateAddon**](AddonApi.md#updateAddon) | **PUT** /addon/edit | Update an Addon


<a name="addAddon"></a>
# **addAddon**
> InlineResponse2002 addAddon(name, basePrices, description)

Create a new addon

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddonApi;


AddonApi apiInstance = new AddonApi();
String name = "name_example"; // String | Name of the type of addon
Long basePrices = 789L; // Long | Prices for addon
String description = "description_example"; // String | Description of the addon
try {
    InlineResponse2002 result = apiInstance.addAddon(name, basePrices, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#addAddon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the type of addon |
 **basePrices** | **Long**| Prices for addon |
 **description** | **String**| Description of the addon | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAddon"></a>
# **deleteAddon**
> InlineResponse2003 deleteAddon(body)

Delete an addon by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddonApi;


AddonApi apiInstance = new AddonApi();
Long body = 789L; // Long | ID of the Addon
try {
    InlineResponse2003 result = apiInstance.deleteAddon(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#deleteAddon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Long**| ID of the Addon | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAddon"></a>
# **getAddon**
> InlineResponse2001 getAddon(id)

Retrieve an addon by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddonApi;


AddonApi apiInstance = new AddonApi();
Long id = 789L; // Long | ID of the addon to be retrieved
try {
    InlineResponse2001 result = apiInstance.getAddon(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#getAddon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the addon to be retrieved |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllAddons"></a>
# **getAllAddons**
> List&lt;Addon&gt; getAllAddons()

Retrieve all addons

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddonApi;


AddonApi apiInstance = new AddonApi();
try {
    List<Addon> result = apiInstance.getAllAddons();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#getAllAddons");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Addon&gt;**](Addon.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedAddons"></a>
# **getAllWithTrashedAddons**
> List&lt;Addon&gt; getAllWithTrashedAddons()

Retrieve all addons including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddonApi;


AddonApi apiInstance = new AddonApi();
try {
    List<Addon> result = apiInstance.getAllWithTrashedAddons();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#getAllWithTrashedAddons");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Addon&gt;**](Addon.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAddon"></a>
# **updateAddon**
> InlineResponse2002 updateAddon(id, name, description)

Update an Addon

Updates the addon by id using the specified fields

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AddonApi;


AddonApi apiInstance = new AddonApi();
Long id = 789L; // Long | ID of the Addon to be updated
String name = "name_example"; // String | Name of the Addon
String description = "description_example"; // String | Description of the Addon
try {
    InlineResponse2002 result = apiInstance.updateAddon(id, name, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AddonApi#updateAddon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the Addon to be updated |
 **name** | **String**| Name of the Addon | [optional]
 **description** | **String**| Description of the Addon | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

