# BookingApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBookingDetail**](BookingApi.md#addBookingDetail) | **POST** /booking/add-detail | Add a package / course / ticket with its session to the booking
[**attachAccommodation**](BookingApi.md#attachAccommodation) | **POST** /booking/add-accommodation | Attach an accommodation booking to a booking
[**attachAddon**](BookingApi.md#attachAddon) | **POST** /booking/add-addon | Attach an addon to a trip of a booking
[**attachPickup**](BookingApi.md#attachPickup) | **POST** /booking/add-pickup | Attach a pickup location for a booking
[**cancelBooking**](BookingApi.md#cancelBooking) | **POST** /booking/cancel | Cancel a booking
[**confirmBooking**](BookingApi.md#confirmBooking) | **POST** /booking/confirm | Confirm a booking and all of its sessions and notify the lead customer
[**deleteBooking**](BookingApi.md#deleteBooking) | **DELETE** /booking/delete | Delete a booking by ID
[**dettachAccommodation**](BookingApi.md#dettachAccommodation) | **POST** /booking/remove-accommodation | Dettach an accommodation booking to a booking
[**dettachAddon**](BookingApi.md#dettachAddon) | **POST** /booking/remove-addon | Dettach an addon to a trip of a booking
[**dettachPickup**](BookingApi.md#dettachPickup) | **POST** /booking/remove-pickup | Dettach a pickup location for a booking
[**editBookingInfo**](BookingApi.md#editBookingInfo) | **POST** /booking/edit-info | Edit the information related to a booking
[**filterBookings**](BookingApi.md#filterBookings) | **GET** /booking/filter | Get all bookings matching a filter
[**getAllBookings**](BookingApi.md#getAllBookings) | **GET** /booking/all | Retrieve all bookings
[**getAllWithTrashedBookings**](BookingApi.md#getAllWithTrashedBookings) | **GET** /booking/all-with-trashed | Retrieve all bookings including any deleted models
[**getBooking**](BookingApi.md#getBooking) | **GET** /booking | Retrieve a booking by ID
[**getCustomerBookings**](BookingApi.md#getCustomerBookings) | **GET** /booking/customer | Get all bookings for a customer
[**getPayments**](BookingApi.md#getPayments) | **GET** /booking/payments | Retrieve all payments made for a booking
[**getRefunds**](BookingApi.md#getRefunds) | **GET** /booking/refunds | Retrieve all refunds for a booking
[**getTodaysBookings**](BookingApi.md#getTodaysBookings) | **GET** /booking/today | Get all bookings made today
[**getTommorowsBookings**](BookingApi.md#getTommorowsBookings) | **GET** /booking/tommorow | Get all bookings made today
[**initBooking**](BookingApi.md#initBooking) | **POST** /booking/init | Create a new empty booking
[**removeBookingDetail**](BookingApi.md#removeBookingDetail) | **POST** /booking/remove-detail | Remove a detail from a booking
[**resendConfirmation**](BookingApi.md#resendConfirmation) | **POST** /booking/resend-confirmation | Resend the confirmation email to the lead customer
[**reserveBooking**](BookingApi.md#reserveBooking) | **POST** /booking/reserve | Reserve a booking and its sessions capcity until a set date
[**saveBooking**](BookingApi.md#saveBooking) | **POST** /booking/save | Save a booking as a quote and release all capacity of sessions
[**setLeadCustomer**](BookingApi.md#setLeadCustomer) | **POST** /booking/set-lead | Set the lead customer for a booking


<a name="addBookingDetail"></a>
# **addBookingDetail**
> InlineResponse20010 addBookingDetail(bookingId, customerId, ticketId, sessionId, boatroomId, trainingSessionId, temporary, packageId, packagefacadeId, courseId)

Add a package / course / ticket with its session to the booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
Long customerId = 789L; // Long | 
Long ticketId = 789L; // Long | 
Long sessionId = 789L; // Long | 
Long boatroomId = 789L; // Long | 
Long trainingSessionId = 789L; // Long | 
Boolean temporary = true; // Boolean | 
Long packageId = 789L; // Long | 
Long packagefacadeId = 789L; // Long | 
Long courseId = 789L; // Long | 
try {
    InlineResponse20010 result = apiInstance.addBookingDetail(bookingId, customerId, ticketId, sessionId, boatroomId, trainingSessionId, temporary, packageId, packagefacadeId, courseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#addBookingDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |
 **customerId** | **Long**|  |
 **ticketId** | **Long**|  | [optional]
 **sessionId** | **Long**|  | [optional]
 **boatroomId** | **Long**|  | [optional]
 **trainingSessionId** | **Long**|  | [optional]
 **temporary** | **Boolean**|  | [optional]
 **packageId** | **Long**|  | [optional]
 **packagefacadeId** | **Long**|  | [optional]
 **courseId** | **Long**|  | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachAccommodation"></a>
# **attachAccommodation**
> InlineResponse2008 attachAccommodation(bookingId, accommodationId, customerId, start, end)

Attach an accommodation booking to a booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
Long accommodationId = 789L; // Long | 
Long customerId = 789L; // Long | 
LocalDate start = new LocalDate(); // LocalDate | 
LocalDate end = new LocalDate(); // LocalDate | 
try {
    InlineResponse2008 result = apiInstance.attachAccommodation(bookingId, accommodationId, customerId, start, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#attachAccommodation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |
 **accommodationId** | **Long**|  |
 **customerId** | **Long**|  |
 **start** | **LocalDate**|  | [optional]
 **end** | **LocalDate**|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachAddon"></a>
# **attachAddon**
> InlineResponse2009 attachAddon(bookingId, bookingdetailId, addonId, quantity, packagefacadeId)

Attach an addon to a trip of a booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
Long bookingdetailId = 789L; // Long | 
Long addonId = 789L; // Long | 
Long quantity = 789L; // Long | 
Long packagefacadeId = 789L; // Long | 
try {
    InlineResponse2009 result = apiInstance.attachAddon(bookingId, bookingdetailId, addonId, quantity, packagefacadeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#attachAddon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |
 **bookingdetailId** | **Long**|  |
 **addonId** | **Long**|  |
 **quantity** | **Long**|  | [optional]
 **packagefacadeId** | **Long**|  | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="attachPickup"></a>
# **attachPickup**
> InlineResponse20011 attachPickup(bookingId, location, date, time)

Attach a pickup location for a booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
String location = "location_example"; // String | 
LocalDate date = new LocalDate(); // LocalDate | 
String time = "time_example"; // String | 
try {
    InlineResponse20011 result = apiInstance.attachPickup(bookingId, location, date, time);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#attachPickup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |
 **location** | **String**|  |
 **date** | **LocalDate**|  |
 **time** | **String**|  |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelBooking"></a>
# **cancelBooking**
> InlineResponse2003 cancelBooking(bookingId)

Cancel a booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.cancelBooking(bookingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#cancelBooking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="confirmBooking"></a>
# **confirmBooking**
> InlineResponse20012 confirmBooking(bookingId)

Confirm a booking and all of its sessions and notify the lead customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
try {
    InlineResponse20012 result = apiInstance.confirmBooking(bookingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#confirmBooking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBooking"></a>
# **deleteBooking**
> InlineResponse2003 deleteBooking(id)

Delete a booking by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long id = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.deleteBooking(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#deleteBooking");
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

<a name="dettachAccommodation"></a>
# **dettachAccommodation**
> InlineResponse20017 dettachAccommodation(bookingId, accommodationId, customerId, start)

Dettach an accommodation booking to a booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
Long accommodationId = 789L; // Long | 
Long customerId = 789L; // Long | 
LocalDate start = new LocalDate(); // LocalDate | 
try {
    InlineResponse20017 result = apiInstance.dettachAccommodation(bookingId, accommodationId, customerId, start);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#dettachAccommodation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |
 **accommodationId** | **Long**|  |
 **customerId** | **Long**|  |
 **start** | **LocalDate**|  | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dettachAddon"></a>
# **dettachAddon**
> InlineResponse20017 dettachAddon(bookingId, bookingdetailId, addonId, packagefacadeId)

Dettach an addon to a trip of a booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
Long bookingdetailId = 789L; // Long | 
Long addonId = 789L; // Long | 
Long packagefacadeId = 789L; // Long | 
try {
    InlineResponse20017 result = apiInstance.dettachAddon(bookingId, bookingdetailId, addonId, packagefacadeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#dettachAddon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |
 **bookingdetailId** | **Long**|  |
 **addonId** | **Long**|  |
 **packagefacadeId** | **Long**|  | [optional]

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dettachPickup"></a>
# **dettachPickup**
> InlineResponse2003 dettachPickup(bookingId, id)

Dettach a pickup location for a booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
Long id = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.dettachPickup(bookingId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#dettachPickup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |
 **id** | **Long**|  | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editBookingInfo"></a>
# **editBookingInfo**
> InlineResponse20014 editBookingInfo(bookingId, discount, comment)

Edit the information related to a booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
Double discount = 3.4D; // Double | 
String comment = "comment_example"; // String | 
try {
    InlineResponse20014 result = apiInstance.editBookingInfo(bookingId, discount, comment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#editBookingInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  | [optional]
 **discount** | **Double**|  | [optional]
 **comment** | **String**|  | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filterBookings"></a>
# **filterBookings**
> InlineResponse20013 filterBookings(reference, date, lastname)

Get all bookings matching a filter

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
String reference = "reference_example"; // String | 
LocalDate date = new LocalDate(); // LocalDate | 
String lastname = "lastname_example"; // String | 
try {
    InlineResponse20013 result = apiInstance.filterBookings(reference, date, lastname);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#filterBookings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reference** | **String**|  | [optional]
 **date** | **LocalDate**|  | [optional]
 **lastname** | **String**|  | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllBookings"></a>
# **getAllBookings**
> List&lt;Booking&gt; getAllBookings()

Retrieve all bookings

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
try {
    List<Booking> result = apiInstance.getAllBookings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#getAllBookings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Booking&gt;**](Booking.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedBookings"></a>
# **getAllWithTrashedBookings**
> List&lt;Booking&gt; getAllWithTrashedBookings()

Retrieve all bookings including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
try {
    List<Booking> result = apiInstance.getAllWithTrashedBookings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#getAllWithTrashedBookings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Booking&gt;**](Booking.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBooking"></a>
# **getBooking**
> InlineResponse2007 getBooking(id)

Retrieve a booking by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long id = 789L; // Long | 
try {
    InlineResponse2007 result = apiInstance.getBooking(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#getBooking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomerBookings"></a>
# **getCustomerBookings**
> InlineResponse20013 getCustomerBookings(customerId)

Get all bookings for a customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long customerId = 789L; // Long | 
try {
    InlineResponse20013 result = apiInstance.getCustomerBookings(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#getCustomerBookings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Long**|  |

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPayments"></a>
# **getPayments**
> InlineResponse20015 getPayments(bookingId)

Retrieve all payments made for a booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
try {
    InlineResponse20015 result = apiInstance.getPayments(bookingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#getPayments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRefunds"></a>
# **getRefunds**
> InlineResponse20016 getRefunds(bookingId)

Retrieve all refunds for a booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
try {
    InlineResponse20016 result = apiInstance.getRefunds(bookingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#getRefunds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  | [optional]

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTodaysBookings"></a>
# **getTodaysBookings**
> InlineResponse20013 getTodaysBookings()

Get all bookings made today

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
try {
    InlineResponse20013 result = apiInstance.getTodaysBookings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#getTodaysBookings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTommorowsBookings"></a>
# **getTommorowsBookings**
> InlineResponse20013 getTommorowsBookings()

Get all bookings made today

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
try {
    InlineResponse20013 result = apiInstance.getTommorowsBookings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#getTommorowsBookings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="initBooking"></a>
# **initBooking**
> InlineResponse201 initBooking(source, agentId, agentReference)

Create a new empty booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
String source = "source_example"; // String | 
Long agentId = 789L; // Long | 
String agentReference = "agentReference_example"; // String | 
try {
    InlineResponse201 result = apiInstance.initBooking(source, agentId, agentReference);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#initBooking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **source** | **String**|  |
 **agentId** | **Long**|  | [optional]
 **agentReference** | **String**|  | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeBookingDetail"></a>
# **removeBookingDetail**
> InlineResponse20017 removeBookingDetail(bookingId, bookingdetailId)

Remove a detail from a booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
Long bookingdetailId = 789L; // Long | 
try {
    InlineResponse20017 result = apiInstance.removeBookingDetail(bookingId, bookingdetailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#removeBookingDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |
 **bookingdetailId** | **Long**|  |

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resendConfirmation"></a>
# **resendConfirmation**
> InlineResponse2003 resendConfirmation(bookingId)

Resend the confirmation email to the lead customer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.resendConfirmation(bookingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#resendConfirmation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="reserveBooking"></a>
# **reserveBooking**
> InlineResponse20018 reserveBooking(bookingId, reservedUntil)

Reserve a booking and its sessions capcity until a set date

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
LocalDate reservedUntil = new LocalDate(); // LocalDate | 
try {
    InlineResponse20018 result = apiInstance.reserveBooking(bookingId, reservedUntil);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#reserveBooking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |
 **reservedUntil** | **LocalDate**|  | [optional]

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="saveBooking"></a>
# **saveBooking**
> InlineResponse2003 saveBooking(bookingId)

Save a booking as a quote and release all capacity of sessions

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.saveBooking(bookingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#saveBooking");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setLeadCustomer"></a>
# **setLeadCustomer**
> InlineResponse2003 setLeadCustomer(bookingId, customerId)

Set the lead customer for a booking

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BookingApi;


BookingApi apiInstance = new BookingApi();
Long bookingId = 789L; // Long | 
Long customerId = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.setLeadCustomer(bookingId, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BookingApi#setLeadCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **Long**|  |
 **customerId** | **Long**|  |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

