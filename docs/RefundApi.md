# RefundApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addRefund**](RefundApi.md#addRefund) | **POST** /refund/add | Create a new refund
[**filterRefunds**](RefundApi.md#filterRefunds) | **GET** /refund/filter | Retrieve all refunds that match a filter
[**getAllRefunds**](RefundApi.md#getAllRefunds) | **GET** /refund/all | Retrieve all refunds made
[**getRefund**](RefundApi.md#getRefund) | **GET** /refund | Retrieve a refund by ID


<a name="addRefund"></a>
# **addRefund**
> InlineResponse2012 addRefund(bookingId, paymentgatewayId, amount)

Create a new refund

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RefundApi;


RefundApi apiInstance = new RefundApi();
Long bookingId = 789L; // Long | 
Long paymentgatewayId = 789L; // Long | 
Float amount = 3.4F; // Float | 
try {
    InlineResponse2012 result = apiInstance.addRefund(bookingId, paymentgatewayId, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundApi#addRefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |
 **paymentgatewayId** | **Long**|  |
 **amount** | **Float**|  |

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filterRefunds"></a>
# **filterRefunds**
> InlineResponse20039 filterRefunds(after, before)

Retrieve all refunds that match a filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RefundApi;


RefundApi apiInstance = new RefundApi();
LocalDate after = new LocalDate(); // LocalDate | Date of the earliest payment
LocalDate before = new LocalDate(); // LocalDate | Date of the latest payment to be retrieved
try {
    InlineResponse20039 result = apiInstance.filterRefunds(after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundApi#filterRefunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **LocalDate**| Date of the earliest payment | [optional]
 **before** | **LocalDate**| Date of the latest payment to be retrieved | [optional]

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllRefunds"></a>
# **getAllRefunds**
> InlineResponse20038 getAllRefunds()

Retrieve all refunds made

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RefundApi;


RefundApi apiInstance = new RefundApi();
try {
    InlineResponse20038 result = apiInstance.getAllRefunds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundApi#getAllRefunds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20038**](InlineResponse20038.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRefund"></a>
# **getRefund**
> InlineResponse20037 getRefund(id)

Retrieve a refund by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.RefundApi;


RefundApi apiInstance = new RefundApi();
Long id = 789L; // Long | 
try {
    InlineResponse20037 result = apiInstance.getRefund(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefundApi#getRefund");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

