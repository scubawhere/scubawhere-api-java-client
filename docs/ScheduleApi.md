# ScheduleApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSchedule**](ScheduleApi.md#addSchedule) | **GET** /schedule/add | Create a new schedule for classes
[**getAllSchedules**](ScheduleApi.md#getAllSchedules) | **GET** /schedule/all | Retrieve all of the schedules for classes
[**getSchedule**](ScheduleApi.md#getSchedule) | **GET** /schedule | Retrieve a schedule by ID


<a name="addSchedule"></a>
# **addSchedule**
> InlineResponse2013 addSchedule(schedule, trainingSessionId, until)

Create a new schedule for classes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
String schedule = "schedule_example"; // String | 
Long trainingSessionId = 789L; // Long | 
LocalDate until = new LocalDate(); // LocalDate | 
try {
    InlineResponse2013 result = apiInstance.addSchedule(schedule, trainingSessionId, until);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#addSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedule** | **String**|  |
 **trainingSessionId** | **Long**|  |
 **until** | **LocalDate**|  | [optional]

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllSchedules"></a>
# **getAllSchedules**
> List&lt;Schedule&gt; getAllSchedules()

Retrieve all of the schedules for classes

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
try {
    List<Schedule> result = apiInstance.getAllSchedules();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#getAllSchedules");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Schedule&gt;**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSchedule"></a>
# **getSchedule**
> Schedule getSchedule(id)

Retrieve a schedule by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ScheduleApi;


ScheduleApi apiInstance = new ScheduleApi();
Long id = 789L; // Long | 
try {
    Schedule result = apiInstance.getSchedule(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScheduleApi#getSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

