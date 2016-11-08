# SessionApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSession**](SessionApi.md#createSession) | **POST** /session/add | Create a new session
[**deleteSession**](SessionApi.md#deleteSession) | **DELETE** /session/delete | Delete a session by ID
[**editSession**](SessionApi.md#editSession) | **POST** /session/edit | Update a session by ID
[**filterSessions**](SessionApi.md#filterSessions) | **GET** /session/filter | Retrieve all of tsessions that match a filter
[**getAllSessions**](SessionApi.md#getAllSessions) | **GET** /session/all | Retrieve all sessions including any deleted models
[**getAllWithTrashedSessions**](SessionApi.md#getAllWithTrashedSessions) | **GET** /session/all-with-trashed | Retrieve all sessions including any deleted models
[**getManifest**](SessionApi.md#getManifest) | **GET** /session/manifest | Retrieve the customer manifest for this session
[**getSession**](SessionApi.md#getSession) | **GET** /session | Retrieve a session by ID
[**getTodaySessions**](SessionApi.md#getTodaySessions) | **GET** /session/today | Retrieve all of todays sessions
[**getTommorowSessions**](SessionApi.md#getTommorowSessions) | **GET** /session/tommorow | Retrieve all of tommorows sessions


<a name="createSession"></a>
# **createSession**
> InlineResponse20043 createSession(start, boatId, tripId)

Create a new session

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;


SessionApi apiInstance = new SessionApi();
LocalDate start = new LocalDate(); // LocalDate | 
Long boatId = 789L; // Long | 
Long tripId = 789L; // Long | 
try {
    InlineResponse20043 result = apiInstance.createSession(start, boatId, tripId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#createSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **LocalDate**|  |
 **boatId** | **Long**|  | [optional]
 **tripId** | **Long**|  | [optional]

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSession"></a>
# **deleteSession**
> InlineResponse2003 deleteSession(id)

Delete a session by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;


SessionApi apiInstance = new SessionApi();
Long id = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.deleteSession(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#deleteSession");
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

<a name="editSession"></a>
# **editSession**
> InlineResponse20044 editSession(id, start, boatId)

Update a session by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;


SessionApi apiInstance = new SessionApi();
Long id = 789L; // Long | 
LocalDate start = new LocalDate(); // LocalDate | 
Long boatId = 789L; // Long | 
try {
    InlineResponse20044 result = apiInstance.editSession(id, start, boatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#editSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **start** | **LocalDate**|  |
 **boatId** | **Long**|  | [optional]

### Return type

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filterSessions"></a>
# **filterSessions**
> InlineResponse20045 filterSessions(after, before, tripId, ticketId, packageId, courseId)

Retrieve all of tsessions that match a filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;


SessionApi apiInstance = new SessionApi();
LocalDate after = new LocalDate(); // LocalDate | 
LocalDate before = new LocalDate(); // LocalDate | 
Long tripId = 789L; // Long | 
Long ticketId = 789L; // Long | 
Long packageId = 789L; // Long | 
Long courseId = 789L; // Long | 
try {
    InlineResponse20045 result = apiInstance.filterSessions(after, before, tripId, ticketId, packageId, courseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#filterSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **LocalDate**|  | [optional]
 **before** | **LocalDate**|  | [optional]
 **tripId** | **Long**|  | [optional]
 **ticketId** | **Long**|  | [optional]
 **packageId** | **Long**|  | [optional]
 **courseId** | **Long**|  | [optional]

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllSessions"></a>
# **getAllSessions**
> List&lt;Session&gt; getAllSessions()

Retrieve all sessions including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;


SessionApi apiInstance = new SessionApi();
try {
    List<Session> result = apiInstance.getAllSessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#getAllSessions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Session&gt;**](Session.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedSessions"></a>
# **getAllWithTrashedSessions**
> List&lt;Session&gt; getAllWithTrashedSessions()

Retrieve all sessions including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;


SessionApi apiInstance = new SessionApi();
try {
    List<Session> result = apiInstance.getAllWithTrashedSessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#getAllWithTrashedSessions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Session&gt;**](Session.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getManifest"></a>
# **getManifest**
> InlineResponse20043 getManifest(id)

Retrieve the customer manifest for this session

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;


SessionApi apiInstance = new SessionApi();
Long id = 789L; // Long | 
try {
    InlineResponse20043 result = apiInstance.getManifest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#getManifest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSession"></a>
# **getSession**
> InlineResponse20043 getSession(id)

Retrieve a session by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;


SessionApi apiInstance = new SessionApi();
Long id = 789L; // Long | 
try {
    InlineResponse20043 result = apiInstance.getSession(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#getSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  | [optional]

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTodaySessions"></a>
# **getTodaySessions**
> InlineResponse20045 getTodaySessions()

Retrieve all of todays sessions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;


SessionApi apiInstance = new SessionApi();
try {
    InlineResponse20045 result = apiInstance.getTodaySessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#getTodaySessions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTommorowSessions"></a>
# **getTommorowSessions**
> InlineResponse20045 getTommorowSessions()

Retrieve all of tommorows sessions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SessionApi;


SessionApi apiInstance = new SessionApi();
try {
    InlineResponse20045 result = apiInstance.getTommorowSessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SessionApi#getTommorowSessions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

