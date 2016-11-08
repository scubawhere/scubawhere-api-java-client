# CustomersApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllWithTrashedCustomers**](CustomersApi.md#getAllWithTrashedCustomers) | **GET** /customer/all-with-trashed | Retrieve all customer including any deleted models


<a name="getAllWithTrashedCustomers"></a>
# **getAllWithTrashedCustomers**
> List&lt;Customer&gt; getAllWithTrashedCustomers()

Retrieve all customer including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomersApi;


CustomersApi apiInstance = new CustomersApi();
try {
    List<Customer> result = apiInstance.getAllWithTrashedCustomers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomersApi#getAllWithTrashedCustomers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

