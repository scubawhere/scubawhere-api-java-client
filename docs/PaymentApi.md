# PaymentApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPayment**](PaymentApi.md#addPayment) | **POST** /payment/add | Create a new payment
[**filterPayments**](PaymentApi.md#filterPayments) | **GET** /payment/filter | Retrieve all payments that match a filter
[**getAllPayments**](PaymentApi.md#getAllPayments) | **GET** /payment/all | Retrieve all payments made
[**getPayment**](PaymentApi.md#getPayment) | **GET** /payment | Retrieve a payment by ID
[**getPaymentGateways**](PaymentApi.md#getPaymentGateways) | **GET** /payment/paymentgateways | Retrieve all the payment gateways


<a name="addPayment"></a>
# **addPayment**
> InlineResponse2011 addPayment(bookingId, paymentgatewayId, amount)

Create a new payment

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
Long bookingId = 789L; // Long | 
Long paymentgatewayId = 789L; // Long | 
Float amount = 3.4F; // Float | 
try {
    InlineResponse2011 result = apiInstance.addPayment(bookingId, paymentgatewayId, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#addPayment");
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

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filterPayments"></a>
# **filterPayments**
> InlineResponse20035 filterPayments(after, before)

Retrieve all payments that match a filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
LocalDate after = new LocalDate(); // LocalDate | Date of the earliest payment
LocalDate before = new LocalDate(); // LocalDate | Date of the latest payment to be retrieved
try {
    InlineResponse20035 result = apiInstance.filterPayments(after, before);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#filterPayments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **LocalDate**| Date of the earliest payment | [optional]
 **before** | **LocalDate**| Date of the latest payment to be retrieved | [optional]

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllPayments"></a>
# **getAllPayments**
> List&lt;Payment&gt; getAllPayments()

Retrieve all payments made

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
try {
    List<Payment> result = apiInstance.getAllPayments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#getAllPayments");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Payment&gt;**](Payment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPayment"></a>
# **getPayment**
> InlineResponse20034 getPayment(id)

Retrieve a payment by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
Long id = 789L; // Long | 
try {
    InlineResponse20034 result = apiInstance.getPayment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#getPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**InlineResponse20034**](InlineResponse20034.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPaymentGateways"></a>
# **getPaymentGateways**
> InlineResponse20036 getPaymentGateways()

Retrieve all the payment gateways

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentApi;


PaymentApi apiInstance = new PaymentApi();
try {
    InlineResponse20036 result = apiInstance.getPaymentGateways();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentApi#getPaymentGateways");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

