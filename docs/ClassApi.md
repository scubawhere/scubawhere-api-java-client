# ClassApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**classGet**](ClassApi.md#classGet) | **GET** /class | Retrieve a class by ID
[**createClass**](ClassApi.md#createClass) | **POST** /class/add | Create a new class
[**deleteClass**](ClassApi.md#deleteClass) | **DELETE** /class/delete | Delete a class by ID
[**editClass**](ClassApi.md#editClass) | **POST** /class/edit | Update a class by ID
[**getAllClass**](ClassApi.md#getAllClass) | **GET** /class/all | Retrieve all classes including any deleted models
[**getAllWithTrashedClass**](ClassApi.md#getAllWithTrashedClass) | **GET** /class/all-with-trashed | Retrieve all classes including any deleted models


<a name="classGet"></a>
# **classGet**
> Training classGet(id)

Retrieve a class by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClassApi;


ClassApi apiInstance = new ClassApi();
Long id = 789L; // Long | 
try {
    Training result = apiInstance.classGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassApi#classGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Training**](Training.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClass"></a>
# **createClass**
> InlineResponse20021 createClass(name, duration, description)

Create a new class

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClassApi;


ClassApi apiInstance = new ClassApi();
String name = "name_example"; // String | 
Float duration = 3.4F; // Float | 
String description = "description_example"; // String | 
try {
    InlineResponse20021 result = apiInstance.createClass(name, duration, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassApi#createClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **duration** | **Float**|  |
 **description** | **String**|  | [optional]

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClass"></a>
# **deleteClass**
> InlineResponse2003 deleteClass(id)

Delete a class by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClassApi;


ClassApi apiInstance = new ClassApi();
Long id = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.deleteClass(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassApi#deleteClass");
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

<a name="editClass"></a>
# **editClass**
> InlineResponse20022 editClass(id, name, duration, description)

Update a class by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClassApi;


ClassApi apiInstance = new ClassApi();
Integer id = 56; // Integer | 
String name = "name_example"; // String | 
Float duration = 3.4F; // Float | 
String description = "description_example"; // String | 
try {
    InlineResponse20022 result = apiInstance.editClass(id, name, duration, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassApi#editClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **name** | **String**|  |
 **duration** | **Float**|  |
 **description** | **String**|  | [optional]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllClass"></a>
# **getAllClass**
> List&lt;Training&gt; getAllClass()

Retrieve all classes including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClassApi;


ClassApi apiInstance = new ClassApi();
try {
    List<Training> result = apiInstance.getAllClass();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassApi#getAllClass");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Training&gt;**](Training.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedClass"></a>
# **getAllWithTrashedClass**
> List&lt;Training&gt; getAllWithTrashedClass()

Retrieve all classes including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClassApi;


ClassApi apiInstance = new ClassApi();
try {
    List<Training> result = apiInstance.getAllWithTrashedClass();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClassApi#getAllWithTrashedClass");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Training&gt;**](Training.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

