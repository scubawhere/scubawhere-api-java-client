# CompanyApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachLocations**](CompanyApi.md#attachLocations) | **POST** /company/add-location | Attach a location to a company
[**getLocations**](CompanyApi.md#getLocations) | **GET** /company/locations | Retrieve the locations this Dive Centre uses
[**getPickupSchedule**](CompanyApi.md#getPickupSchedule) | **GET** /company/pick-up-schedule | Retrieve the pick up schedule for a date
[**updateCompany**](CompanyApi.md#updateCompany) | **POST** /company/update | Update the companies information


<a name="attachLocations"></a>
# **attachLocations**
> InlineResponse20023 attachLocations(name, description, latitude, longitude)

Attach a location to a company

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String name = "name_example"; // String | 
String description = "description_example"; // String | 
Float latitude = 3.4F; // Float | 
Float longitude = 3.4F; // Float | 
try {
    InlineResponse20023 result = apiInstance.attachLocations(name, description, latitude, longitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#attachLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  | [optional]
 **description** | **String**|  | [optional]
 **latitude** | **Float**|  | [optional]
 **longitude** | **Float**|  | [optional]

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLocations"></a>
# **getLocations**
> InlineResponse20024 getLocations(latitude, longitude, limit)

Retrieve the locations this Dive Centre uses

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String latitude = "latitude_example"; // String | 
String longitude = "longitude_example"; // String | 
Integer limit = 56; // Integer | 
try {
    InlineResponse20024 result = apiInstance.getLocations(latitude, longitude, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **String**|  |
 **longitude** | **String**|  |
 **limit** | **Integer**|  | [optional]

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPickupSchedule"></a>
# **getPickupSchedule**
> InlineResponse20025 getPickupSchedule(date)

Retrieve the pick up schedule for a date

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
String date = "date_example"; // String | 
try {
    InlineResponse20025 result = apiInstance.getPickupSchedule(date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#getPickupSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**|  |

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCompany"></a>
# **updateCompany**
> InlineResponse20026 updateCompany(id, contact, description, name, address1, address2, city, county, postcode, countryId, currencyId, businessPhone, businessEmail, vatNumber, registrationNumber, website)

Update the companies information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CompanyApi;


CompanyApi apiInstance = new CompanyApi();
Long id = 789L; // Long | 
String contact = "contact_example"; // String | 
String description = "description_example"; // String | 
String name = "name_example"; // String | 
String address1 = "address1_example"; // String | 
String address2 = "address2_example"; // String | 
String city = "city_example"; // String | 
String county = "county_example"; // String | 
String postcode = "postcode_example"; // String | 
Long countryId = 789L; // Long | 
Long currencyId = 789L; // Long | 
String businessPhone = "businessPhone_example"; // String | 
String businessEmail = "businessEmail_example"; // String | 
String vatNumber = "vatNumber_example"; // String | 
String registrationNumber = "registrationNumber_example"; // String | 
String website = "website_example"; // String | 
try {
    InlineResponse20026 result = apiInstance.updateCompany(id, contact, description, name, address1, address2, city, county, postcode, countryId, currencyId, businessPhone, businessEmail, vatNumber, registrationNumber, website);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CompanyApi#updateCompany");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **contact** | **String**|  | [optional]
 **description** | **String**|  | [optional]
 **name** | **String**|  | [optional]
 **address1** | **String**|  | [optional]
 **address2** | **String**|  | [optional]
 **city** | **String**|  | [optional]
 **county** | **String**|  | [optional]
 **postcode** | **String**|  | [optional]
 **countryId** | **Long**|  | [optional]
 **currencyId** | **Long**|  | [optional]
 **businessPhone** | **String**|  | [optional]
 **businessEmail** | **String**|  | [optional]
 **vatNumber** | **String**|  | [optional]
 **registrationNumber** | **String**|  | [optional]
 **website** | **String**|  | [optional]

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

