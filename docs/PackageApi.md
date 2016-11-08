# PackageApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPackage**](PackageApi.md#createPackage) | **POST** /package/add | Create a new package
[**deletePackage**](PackageApi.md#deletePackage) | **DELETE** /package/delete | Delete a package by ID
[**editPackage**](PackageApi.md#editPackage) | **POST** /package/edit | Update a package by ID
[**getAllPackages**](PackageApi.md#getAllPackages) | **GET** /package/all | Retrieve all packages including any deleted models
[**getAllWithTrashedPackages**](PackageApi.md#getAllWithTrashedPackages) | **GET** /package/all-with-trashed | Retrieve all packages including any deleted models
[**getPackage**](PackageApi.md#getPackage) | **GET** /package | Retrieve a package by ID


<a name="createPackage"></a>
# **createPackage**
> InlineResponse20032 createPackage(name, description, availableFrom, availableUntil, tickets, courses, accommodations, addons, prices)

Create a new package

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PackageApi;


PackageApi apiInstance = new PackageApi();
String name = "name_example"; // String | 
String description = "description_example"; // String | 
LocalDate availableFrom = new LocalDate(); // LocalDate | 
LocalDate availableUntil = new LocalDate(); // LocalDate | 
List<Long> tickets = Arrays.asList(56L); // List<Long> | 
List<Long> courses = Arrays.asList(56L); // List<Long> | 
List<Long> accommodations = Arrays.asList(56L); // List<Long> | 
List<Long> addons = Arrays.asList(56L); // List<Long> | 
List<Long> prices = Arrays.asList(56L); // List<Long> | 
try {
    InlineResponse20032 result = apiInstance.createPackage(name, description, availableFrom, availableUntil, tickets, courses, accommodations, addons, prices);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackageApi#createPackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **description** | **String**|  | [optional]
 **availableFrom** | **LocalDate**|  | [optional]
 **availableUntil** | **LocalDate**|  | [optional]
 **tickets** | [**List&lt;Long&gt;**](Long.md)|  | [optional]
 **courses** | [**List&lt;Long&gt;**](Long.md)|  | [optional]
 **accommodations** | [**List&lt;Long&gt;**](Long.md)|  | [optional]
 **addons** | [**List&lt;Long&gt;**](Long.md)|  | [optional]
 **prices** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePackage"></a>
# **deletePackage**
> InlineResponse2003 deletePackage(id)

Delete a package by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PackageApi;


PackageApi apiInstance = new PackageApi();
Long id = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.deletePackage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackageApi#deletePackage");
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

<a name="editPackage"></a>
# **editPackage**
> InlineResponse20033 editPackage(id, name, description, availableFrom, availableUntil, tickets, courses, accommodations, addons, prices)

Update a package by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PackageApi;


PackageApi apiInstance = new PackageApi();
Long id = 789L; // Long | 
String name = "name_example"; // String | 
String description = "description_example"; // String | 
LocalDate availableFrom = new LocalDate(); // LocalDate | 
LocalDate availableUntil = new LocalDate(); // LocalDate | 
List<Long> tickets = Arrays.asList(56L); // List<Long> | 
List<Long> courses = Arrays.asList(56L); // List<Long> | 
List<Long> accommodations = Arrays.asList(56L); // List<Long> | 
List<Long> addons = Arrays.asList(56L); // List<Long> | 
List<Long> prices = Arrays.asList(56L); // List<Long> | 
try {
    InlineResponse20033 result = apiInstance.editPackage(id, name, description, availableFrom, availableUntil, tickets, courses, accommodations, addons, prices);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackageApi#editPackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **name** | **String**|  |
 **description** | **String**|  | [optional]
 **availableFrom** | **LocalDate**|  | [optional]
 **availableUntil** | **LocalDate**|  | [optional]
 **tickets** | [**List&lt;Long&gt;**](Long.md)|  | [optional]
 **courses** | [**List&lt;Long&gt;**](Long.md)|  | [optional]
 **accommodations** | [**List&lt;Long&gt;**](Long.md)|  | [optional]
 **addons** | [**List&lt;Long&gt;**](Long.md)|  | [optional]
 **prices** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

[**InlineResponse20033**](InlineResponse20033.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllPackages"></a>
# **getAllPackages**
> List&lt;ModelPackage&gt; getAllPackages()

Retrieve all packages including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PackageApi;


PackageApi apiInstance = new PackageApi();
try {
    List<ModelPackage> result = apiInstance.getAllPackages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackageApi#getAllPackages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ModelPackage&gt;**](ModelPackage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedPackages"></a>
# **getAllWithTrashedPackages**
> List&lt;ModelPackage&gt; getAllWithTrashedPackages()

Retrieve all packages including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PackageApi;


PackageApi apiInstance = new PackageApi();
try {
    List<ModelPackage> result = apiInstance.getAllWithTrashedPackages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackageApi#getAllWithTrashedPackages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ModelPackage&gt;**](ModelPackage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPackage"></a>
# **getPackage**
> InlineResponse20032 getPackage(id)

Retrieve a package by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PackageApi;


PackageApi apiInstance = new PackageApi();
Long id = 789L; // Long | 
try {
    InlineResponse20032 result = apiInstance.getPackage(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackageApi#getPackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  | [optional]

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

