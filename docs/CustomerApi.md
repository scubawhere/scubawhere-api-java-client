# CustomerApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomer**](CustomerApi.md#createCustomer) | **POST** /customer/add | Create a new customer
[**deleteCustomer**](CustomerApi.md#deleteCustomer) | **DELETE** /customer/delete | Delete a customer by ID
[**editCustomer**](CustomerApi.md#editCustomer) | **POST** /customer/edit | Update a customer by ID
[**getAllCustomers**](CustomerApi.md#getAllCustomers) | **GET** /customer/all | Retrieve all customers
[**getCustomer**](CustomerApi.md#getCustomer) | **GET** /customer | Retrieve a customer by ID


<a name="createCustomer"></a>
# **createCustomer**
> InlineResponse20029 createCustomer(email, firstname, lastname, birthday, gender, address1, address2, city, county, postcode, countryId, phone, lastDive, numberOfDives, chestSize, showSize, height, certificates)

Create a new customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
String email = "email_example"; // String | 
String firstname = "firstname_example"; // String | 
String lastname = "lastname_example"; // String | 
LocalDate birthday = new LocalDate(); // LocalDate | 
Integer gender = 56; // Integer | 
String address1 = "address1_example"; // String | 
String address2 = "address2_example"; // String | 
String city = "city_example"; // String | 
String county = "county_example"; // String | 
String postcode = "postcode_example"; // String | 
Long countryId = 789L; // Long | 
String phone = "phone_example"; // String | 
LocalDate lastDive = new LocalDate(); // LocalDate | 
Integer numberOfDives = 56; // Integer | 
String chestSize = "chestSize_example"; // String | 
String showSize = "showSize_example"; // String | 
String height = "height_example"; // String | 
List<Long> certificates = Arrays.asList(56L); // List<Long> | 
try {
    InlineResponse20029 result = apiInstance.createCustomer(email, firstname, lastname, birthday, gender, address1, address2, city, county, postcode, countryId, phone, lastDive, numberOfDives, chestSize, showSize, height, certificates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#createCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |
 **firstname** | **String**|  |
 **lastname** | **String**|  |
 **birthday** | **LocalDate**|  | [optional]
 **gender** | **Integer**|  | [optional]
 **address1** | **String**|  | [optional]
 **address2** | **String**|  | [optional]
 **city** | **String**|  | [optional]
 **county** | **String**|  | [optional]
 **postcode** | **String**|  | [optional]
 **countryId** | **Long**|  | [optional]
 **phone** | **String**|  | [optional]
 **lastDive** | **LocalDate**|  | [optional]
 **numberOfDives** | **Integer**|  | [optional]
 **chestSize** | **String**|  | [optional]
 **showSize** | **String**|  | [optional]
 **height** | **String**|  | [optional]
 **certificates** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomer"></a>
# **deleteCustomer**
> InlineResponse2003 deleteCustomer(id)

Delete a customer by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
Long id = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.deleteCustomer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#deleteCustomer");
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

<a name="editCustomer"></a>
# **editCustomer**
> InlineResponse20030 editCustomer(id, email, firstname, lastname, birthday, gender, address1, address2, city, county, postcode, countryId, phone, lastDive, numberOfDives, chestSize, showSize, height, certificates)

Update a customer by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
Long id = 789L; // Long | 
String email = "email_example"; // String | 
String firstname = "firstname_example"; // String | 
String lastname = "lastname_example"; // String | 
LocalDate birthday = new LocalDate(); // LocalDate | 
Integer gender = 56; // Integer | 
String address1 = "address1_example"; // String | 
String address2 = "address2_example"; // String | 
String city = "city_example"; // String | 
String county = "county_example"; // String | 
String postcode = "postcode_example"; // String | 
Long countryId = 789L; // Long | 
String phone = "phone_example"; // String | 
LocalDate lastDive = new LocalDate(); // LocalDate | 
Integer numberOfDives = 56; // Integer | 
String chestSize = "chestSize_example"; // String | 
String showSize = "showSize_example"; // String | 
String height = "height_example"; // String | 
List<Long> certificates = Arrays.asList(56L); // List<Long> | 
try {
    InlineResponse20030 result = apiInstance.editCustomer(id, email, firstname, lastname, birthday, gender, address1, address2, city, county, postcode, countryId, phone, lastDive, numberOfDives, chestSize, showSize, height, certificates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#editCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **email** | **String**|  | [optional]
 **firstname** | **String**|  | [optional]
 **lastname** | **String**|  | [optional]
 **birthday** | **LocalDate**|  | [optional]
 **gender** | **Integer**|  | [optional]
 **address1** | **String**|  | [optional]
 **address2** | **String**|  | [optional]
 **city** | **String**|  | [optional]
 **county** | **String**|  | [optional]
 **postcode** | **String**|  | [optional]
 **countryId** | **Long**|  | [optional]
 **phone** | **String**|  | [optional]
 **lastDive** | **LocalDate**|  | [optional]
 **numberOfDives** | **Integer**|  | [optional]
 **chestSize** | **String**|  | [optional]
 **showSize** | **String**|  | [optional]
 **height** | **String**|  | [optional]
 **certificates** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllCustomers"></a>
# **getAllCustomers**
> List&lt;Customer&gt; getAllCustomers()

Retrieve all customers

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
try {
    List<Customer> result = apiInstance.getAllCustomers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getAllCustomers");
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

<a name="getCustomer"></a>
# **getCustomer**
> InlineResponse20029 getCustomer(id)

Retrieve a customer by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CustomerApi;


CustomerApi apiInstance = new CustomerApi();
Long id = 789L; // Long | 
try {
    InlineResponse20029 result = apiInstance.getCustomer(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  | [optional]

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

