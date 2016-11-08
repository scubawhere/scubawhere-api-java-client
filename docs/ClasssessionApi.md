# ClasssessionApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**classSessionGet**](ClasssessionApi.md#classSessionGet) | **GET** /class-session | Retrieve a class session by ID
[**createClassSession**](ClasssessionApi.md#createClassSession) | **POST** /class-session/add | Create a new class session
[**deleteClasssession**](ClasssessionApi.md#deleteClasssession) | **DELETE** /class-session/delete | Delete a class session by ID
[**editClassSession**](ClasssessionApi.md#editClassSession) | **POST** /class-session/edit | Update a class session by ID
[**filterClassSession**](ClasssessionApi.md#filterClassSession) | **GET** /class-session/filter | Retrieve all class sessions that match a filter
[**getAllClassSessions**](ClasssessionApi.md#getAllClassSessions) | **GET** /class-session/all | Retrieve all class sessions including any deleted models
[**getAllWithTrashedClassSessions**](ClasssessionApi.md#getAllWithTrashedClassSessions) | **GET** /class-session/all-with-trashed | Retrieve all class sessions including any deleted models
[**getClassSessionManifest**](ClasssessionApi.md#getClassSessionManifest) | **GET** /class-session/manifest | Retrieve the customer manifest for a class session
[**getTodaysClassSession**](ClasssessionApi.md#getTodaysClassSession) | **GET** /class-session/today | Retrieve all class sessions that start today
[**getTommorowsClassSession**](ClasssessionApi.md#getTommorowsClassSession) | **GET** /class-session/tommorow | Retrieve all class sessions that start tommorow


<a name="classSessionGet"></a>
# **classSessionGet**
> TrainingSession classSessionGet(id)

Retrieve a class session by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClasssessionApi;


ClasssessionApi apiInstance = new ClasssessionApi();
Long id = 789L; // Long | 
try {
    TrainingSession result = apiInstance.classSessionGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClasssessionApi#classSessionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**TrainingSession**](TrainingSession.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClassSession"></a>
# **createClassSession**
> InlineResponse20019 createClassSession(start, trainingId)

Create a new class session

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClasssessionApi;


ClasssessionApi apiInstance = new ClasssessionApi();
LocalDate start = new LocalDate(); // LocalDate | 
Long trainingId = 789L; // Long | 
try {
    InlineResponse20019 result = apiInstance.createClassSession(start, trainingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClasssessionApi#createClassSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **LocalDate**|  |
 **trainingId** | **Long**|  |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClasssession"></a>
# **deleteClasssession**
> InlineResponse2003 deleteClasssession(id)

Delete a class session by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClasssessionApi;


ClasssessionApi apiInstance = new ClasssessionApi();
Long id = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.deleteClasssession(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClasssessionApi#deleteClasssession");
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

<a name="editClassSession"></a>
# **editClassSession**
> InlineResponse20020 editClassSession(id, start)

Update a class session by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClasssessionApi;


ClasssessionApi apiInstance = new ClasssessionApi();
Integer id = 56; // Integer | 
LocalDate start = new LocalDate(); // LocalDate | 
try {
    InlineResponse20020 result = apiInstance.editClassSession(id, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClasssessionApi#editClassSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |
 **start** | **LocalDate**|  |

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filterClassSession"></a>
# **filterClassSession**
> List&lt;TrainingSession&gt; filterClassSession()

Retrieve all class sessions that match a filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClasssessionApi;


ClasssessionApi apiInstance = new ClasssessionApi();
try {
    List<TrainingSession> result = apiInstance.filterClassSession();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClasssessionApi#filterClassSession");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TrainingSession&gt;**](TrainingSession.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllClassSessions"></a>
# **getAllClassSessions**
> List&lt;TrainingSession&gt; getAllClassSessions()

Retrieve all class sessions including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClasssessionApi;


ClasssessionApi apiInstance = new ClasssessionApi();
try {
    List<TrainingSession> result = apiInstance.getAllClassSessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClasssessionApi#getAllClassSessions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TrainingSession&gt;**](TrainingSession.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedClassSessions"></a>
# **getAllWithTrashedClassSessions**
> List&lt;TrainingSession&gt; getAllWithTrashedClassSessions()

Retrieve all class sessions including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClasssessionApi;


ClasssessionApi apiInstance = new ClasssessionApi();
try {
    List<TrainingSession> result = apiInstance.getAllWithTrashedClassSessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClasssessionApi#getAllWithTrashedClassSessions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TrainingSession&gt;**](TrainingSession.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClassSessionManifest"></a>
# **getClassSessionManifest**
> TrainingSessionManifest getClassSessionManifest(id)

Retrieve the customer manifest for a class session

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClasssessionApi;


ClasssessionApi apiInstance = new ClasssessionApi();
Long id = 789L; // Long | 
try {
    TrainingSessionManifest result = apiInstance.getClassSessionManifest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClasssessionApi#getClassSessionManifest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**TrainingSessionManifest**](TrainingSessionManifest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTodaysClassSession"></a>
# **getTodaysClassSession**
> List&lt;TrainingSession&gt; getTodaysClassSession()

Retrieve all class sessions that start today

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClasssessionApi;


ClasssessionApi apiInstance = new ClasssessionApi();
try {
    List<TrainingSession> result = apiInstance.getTodaysClassSession();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClasssessionApi#getTodaysClassSession");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TrainingSession&gt;**](TrainingSession.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTommorowsClassSession"></a>
# **getTommorowsClassSession**
> List&lt;TrainingSession&gt; getTommorowsClassSession()

Retrieve all class sessions that start tommorow

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ClasssessionApi;


ClasssessionApi apiInstance = new ClasssessionApi();
try {
    List<TrainingSession> result = apiInstance.getTommorowsClassSession();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClasssessionApi#getTommorowsClassSession");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;TrainingSession&gt;**](TrainingSession.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

