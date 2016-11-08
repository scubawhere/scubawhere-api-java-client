# TimetableApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTimetable**](TimetableApi.md#addTimetable) | **GET** /timetable/add | Create a new timetable for sessions
[**getAllTimetables**](TimetableApi.md#getAllTimetables) | **GET** /timetable/all | Retrieve all of the timetables for sessions
[**getTimetable**](TimetableApi.md#getTimetable) | **GET** /timetable | Retrieve a timetable by ID


<a name="addTimetable"></a>
# **addTimetable**
> InlineResponse2015 addTimetable(schedule, sessionId, until)

Create a new timetable for sessions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimetableApi;


TimetableApi apiInstance = new TimetableApi();
String schedule = "schedule_example"; // String | 
Long sessionId = 789L; // Long | 
LocalDate until = new LocalDate(); // LocalDate | 
try {
    InlineResponse2015 result = apiInstance.addTimetable(schedule, sessionId, until);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimetableApi#addTimetable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule** | **String**|  |
 **sessionId** | **Long**|  |
 **until** | **LocalDate**|  | [optional]

### Return type

[**InlineResponse2015**](InlineResponse2015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllTimetables"></a>
# **getAllTimetables**
> List&lt;Timetable&gt; getAllTimetables()

Retrieve all of the timetables for sessions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimetableApi;


TimetableApi apiInstance = new TimetableApi();
try {
    List<Timetable> result = apiInstance.getAllTimetables();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimetableApi#getAllTimetables");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Timetable&gt;**](Timetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTimetable"></a>
# **getTimetable**
> Timetable getTimetable(id)

Retrieve a timetable by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TimetableApi;


TimetableApi apiInstance = new TimetableApi();
Long id = 789L; // Long | 
try {
    Timetable result = apiInstance.getTimetable(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TimetableApi#getTimetable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Timetable**](Timetable.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

