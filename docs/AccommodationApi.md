# AccommodationApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAccommodation**](AccommodationApi.md#addAccommodation) | **POST** /accommodation/add | 
[**deleteAccommodation**](AccommodationApi.md#deleteAccommodation) | **DELETE** /accommodation/delete | Delete an accommodation by ID
[**editAgent**](AccommodationApi.md#editAgent) | **POST** /agent/edit | Create a new agent
[**filterAccommodation**](AccommodationApi.md#filterAccommodation) | **GET** /accommodation/filter | Get all the accommodations matching a filter
[**findAccommodation**](AccommodationApi.md#findAccommodation) | **GET** /accommodation | 
[**getAllAccommodations**](AccommodationApi.md#getAllAccommodations) | **GET** /accommodations/all | 
[**getAllWithTrashedAccommodations**](AccommodationApi.md#getAllWithTrashedAccommodations) | **GET** /accommodations/all-with-trashed | Retrieve all accommodation including any deleted models
[**updateAccommodation**](AccommodationApi.md#updateAccommodation) | **PUT** /accommodation/edit | Update an Accommodation


<a name="addAccommodation"></a>
# **addAccommodation**
> InlineResponse200 addAccommodation(name, capacity, basePrices, description)



Create an accommodation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
String name = "name_example"; // String | Name of the type of accommodation
Long capacity = 789L; // Long | Number of beds in the accommodation
Integer basePrices = 56; // Integer | Price of the accommodation and the dates of when the price is applicable
String description = "description_example"; // String | Description of the accommodation
try {
    InlineResponse200 result = apiInstance.addAccommodation(name, capacity, basePrices, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#addAccommodation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the type of accommodation |
 **capacity** | **Long**| Number of beds in the accommodation |
 **basePrices** | **Integer**| Price of the accommodation and the dates of when the price is applicable |
 **description** | **String**| Description of the accommodation | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccommodation"></a>
# **deleteAccommodation**
> InlineResponse200 deleteAccommodation(body)

Delete an accommodation by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
Long body = 789L; // Long | ID of the accommodation
try {
    InlineResponse200 result = apiInstance.deleteAccommodation(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#deleteAccommodation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **Long**| ID of the accommodation |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editAgent"></a>
# **editAgent**
> InlineResponse2004 editAgent(id, name, branchName, branchAddress, branchPhone, branchEmail, commission, terms, website, billingAddress, billingPhone, billingEmail)

Create a new agent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
Long id = 789L; // Long | 
Long name = 789L; // Long | 
String branchName = "branchName_example"; // String | 
String branchAddress = "branchAddress_example"; // String | 
String branchPhone = "branchPhone_example"; // String | 
String branchEmail = "branchEmail_example"; // String | 
Float commission = 3.4F; // Float | 
String terms = "terms_example"; // String | 
String website = "website_example"; // String | 
String billingAddress = "billingAddress_example"; // String | 
String billingPhone = "billingPhone_example"; // String | 
String billingEmail = "billingEmail_example"; // String | 
try {
    InlineResponse2004 result = apiInstance.editAgent(id, name, branchName, branchAddress, branchPhone, branchEmail, commission, terms, website, billingAddress, billingPhone, billingEmail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#editAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **name** | **Long**|  |
 **branchName** | **String**|  |
 **branchAddress** | **String**|  |
 **branchPhone** | **String**|  |
 **branchEmail** | **String**|  |
 **commission** | **Float**|  |
 **terms** | **String**|  |
 **website** | **String**|  | [optional]
 **billingAddress** | **String**|  | [optional]
 **billingPhone** | **String**|  | [optional]
 **billingEmail** | **String**|  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filterAccommodation"></a>
# **filterAccommodation**
> InlineResponse200 filterAccommodation(before, after, accommodationId)

Get all the accommodations matching a filter

Get all the accommodations and their bookings between certain dates and / or an accommodation id

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
LocalDate before = new LocalDate(); // LocalDate | The date for the upper boundary of the dates
LocalDate after = new LocalDate(); // LocalDate | The date for the lower boundary of the dates
Long accommodationId = 789L; // Long | ID Accommodation to filter by
try {
    InlineResponse200 result = apiInstance.filterAccommodation(before, after, accommodationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#filterAccommodation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **before** | **LocalDate**| The date for the upper boundary of the dates | [optional]
 **after** | **LocalDate**| The date for the lower boundary of the dates | [optional]
 **accommodationId** | **Long**| ID Accommodation to filter by | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findAccommodation"></a>
# **findAccommodation**
> InlineResponse200 findAccommodation(id)



Retrieve an accommodation by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
List<Long> id = Arrays.asList(56L); // List<Long> | ID of the accommodation to be retrieved
try {
    InlineResponse200 result = apiInstance.findAccommodation(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#findAccommodation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List&lt;Long&gt;**](Long.md)| ID of the accommodation to be retrieved |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllAccommodations"></a>
# **getAllAccommodations**
> List&lt;Accommodation&gt; getAllAccommodations()



Retrieve all accommodation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
try {
    List<Accommodation> result = apiInstance.getAllAccommodations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#getAllAccommodations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Accommodation&gt;**](Accommodation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedAccommodations"></a>
# **getAllWithTrashedAccommodations**
> List&lt;Accommodation&gt; getAllWithTrashedAccommodations()

Retrieve all accommodation including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
try {
    List<Accommodation> result = apiInstance.getAllWithTrashedAccommodations();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#getAllWithTrashedAccommodations");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Accommodation&gt;**](Accommodation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccommodation"></a>
# **updateAccommodation**
> InlineResponse200 updateAccommodation(id, name, capacity)

Update an Accommodation

Updates the accommodation by id using the specified fields

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccommodationApi;


AccommodationApi apiInstance = new AccommodationApi();
Long id = 789L; // Long | ID of the Accommodation to be updated
String name = "name_example"; // String | Name of the Accommodation
Long capacity = 789L; // Long | Number of rooms the accommodation holds
try {
    InlineResponse200 result = apiInstance.updateAccommodation(id, name, capacity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccommodationApi#updateAccommodation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the Accommodation to be updated |
 **name** | **String**| Name of the Accommodation | [optional]
 **capacity** | **Long**| Number of rooms the accommodation holds | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

