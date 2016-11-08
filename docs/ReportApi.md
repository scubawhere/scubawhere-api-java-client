# ReportApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRevenueStreamReport**](ReportApi.md#getRevenueStreamReport) | **GET** /report/revenue-streams | Get a report containing the distribution of revenue made from all the tickets, packages, courses, addons, accommodations
[**getSourcesReport**](ReportApi.md#getSourcesReport) | **GET** /report/sources | Get a report about the distribution of revenue between the diffrent source of bookings
[**getTrainingUtilisationReport**](ReportApi.md#getTrainingUtilisationReport) | **GET** /report/training-utilisation | Get a report containing the utilisation of all classes between the specified dates
[**getUtilisationReport**](ReportApi.md#getUtilisationReport) | **GET** /report/utilisation | Get a report containing the utilisation of all trips between the specified dates


<a name="getRevenueStreamReport"></a>
# **getRevenueStreamReport**
> InlineResponse20040 getRevenueStreamReport(after, before)

Get a report containing the distribution of revenue made from all the tickets, packages, courses, addons, accommodations

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
LocalDate after = new LocalDate(); // LocalDate | 
LocalDate before = new LocalDate(); // LocalDate | 
try {
    InlineResponse20040 result = apiInstance.getRevenueStreamReport(after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getRevenueStreamReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **LocalDate**|  |
 **before** | **LocalDate**|  |

### Return type

[**InlineResponse20040**](InlineResponse20040.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSourcesReport"></a>
# **getSourcesReport**
> InlineResponse20041 getSourcesReport(after, before)

Get a report about the distribution of revenue between the diffrent source of bookings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
LocalDate after = new LocalDate(); // LocalDate | 
LocalDate before = new LocalDate(); // LocalDate | 
try {
    InlineResponse20041 result = apiInstance.getSourcesReport(after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getSourcesReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **LocalDate**|  |
 **before** | **LocalDate**|  |

### Return type

[**InlineResponse20041**](InlineResponse20041.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTrainingUtilisationReport"></a>
# **getTrainingUtilisationReport**
> InlineResponse20042 getTrainingUtilisationReport(after, before)

Get a report containing the utilisation of all classes between the specified dates

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
LocalDate after = new LocalDate(); // LocalDate | 
LocalDate before = new LocalDate(); // LocalDate | 
try {
    InlineResponse20042 result = apiInstance.getTrainingUtilisationReport(after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getTrainingUtilisationReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **LocalDate**|  |
 **before** | **LocalDate**|  |

### Return type

[**InlineResponse20042**](InlineResponse20042.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUtilisationReport"></a>
# **getUtilisationReport**
> InlineResponse20042 getUtilisationReport(after, before)

Get a report containing the utilisation of all trips between the specified dates

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ReportApi;


ReportApi apiInstance = new ReportApi();
LocalDate after = new LocalDate(); // LocalDate | 
LocalDate before = new LocalDate(); // LocalDate | 
try {
    InlineResponse20042 result = apiInstance.getUtilisationReport(after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportApi#getUtilisationReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **LocalDate**|  |
 **before** | **LocalDate**|  |

### Return type

[**InlineResponse20042**](InlineResponse20042.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

