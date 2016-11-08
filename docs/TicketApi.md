# TicketApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTicket**](TicketApi.md#addTicket) | **POST** /ticket/add | Create a new ticket
[**deleteTicket**](TicketApi.md#deleteTicket) | **DELETE** /ticket/delete | Delete a ticket
[**editTicket**](TicketApi.md#editTicket) | **PUT** /ticket/edit | Update an existing ticket
[**getAllAvailableTickets**](TicketApi.md#getAllAvailableTickets) | **GET** /ticket/only-available | Retrieve all tickets that are available to booked today
[**getAllTickets**](TicketApi.md#getAllTickets) | **GET** /ticket/all | Retrieve all tickets
[**getAllWithTrashedTickets**](TicketApi.md#getAllWithTrashedTickets) | **GET** /ticket/all-with-trashed | Retrieve all tickets
[**getTicket**](TicketApi.md#getTicket) | **GET** /ticket | Retrieve a ticket by ID


<a name="addTicket"></a>
# **addTicket**
> InlineResponse2014 addTicket(name, trips, prices, description, availableFrom, availableUntil, onlyPackaged, boats, boatrooms)

Create a new ticket

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketApi;


TicketApi apiInstance = new TicketApi();
String name = "name_example"; // String | 
List<Long> trips = Arrays.asList(56L); // List<Long> | 
BasePrice prices = new BasePrice(); // BasePrice | 
String description = "description_example"; // String | 
LocalDate availableFrom = new LocalDate(); // LocalDate | 
LocalDate availableUntil = new LocalDate(); // LocalDate | 
Boolean onlyPackaged = true; // Boolean | 
List<Long> boats = Arrays.asList(56L); // List<Long> | 
List<Long> boatrooms = Arrays.asList(56L); // List<Long> | 
try {
    InlineResponse2014 result = apiInstance.addTicket(name, trips, prices, description, availableFrom, availableUntil, onlyPackaged, boats, boatrooms);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketApi#addTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **trips** | [**List&lt;Long&gt;**](Long.md)|  |
 **prices** | [**BasePrice**](BasePrice.md)|  |
 **description** | **String**|  | [optional]
 **availableFrom** | **LocalDate**|  | [optional]
 **availableUntil** | **LocalDate**|  | [optional]
 **onlyPackaged** | **Boolean**|  | [optional]
 **boats** | [**List&lt;Long&gt;**](Long.md)|  | [optional]
 **boatrooms** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

[**InlineResponse2014**](InlineResponse2014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTicket"></a>
# **deleteTicket**
> InlineResponse2014 deleteTicket(name)

Delete a ticket

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketApi;


TicketApi apiInstance = new TicketApi();
String name = "name_example"; // String | 
try {
    InlineResponse2014 result = apiInstance.deleteTicket(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketApi#deleteTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |

### Return type

[**InlineResponse2014**](InlineResponse2014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editTicket"></a>
# **editTicket**
> InlineResponse2014 editTicket(id, name, trips, prices, description, availableFrom, availableUntil, onlyPackaged, boats, boatrooms)

Update an existing ticket

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketApi;


TicketApi apiInstance = new TicketApi();
Long id = 789L; // Long | 
String name = "name_example"; // String | 
List<Long> trips = Arrays.asList(56L); // List<Long> | 
BasePrice prices = new BasePrice(); // BasePrice | 
String description = "description_example"; // String | 
LocalDate availableFrom = new LocalDate(); // LocalDate | 
LocalDate availableUntil = new LocalDate(); // LocalDate | 
Boolean onlyPackaged = true; // Boolean | 
List<Long> boats = Arrays.asList(56L); // List<Long> | 
List<Long> boatrooms = Arrays.asList(56L); // List<Long> | 
try {
    InlineResponse2014 result = apiInstance.editTicket(id, name, trips, prices, description, availableFrom, availableUntil, onlyPackaged, boats, boatrooms);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketApi#editTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **name** | **String**|  |
 **trips** | [**List&lt;Long&gt;**](Long.md)|  |
 **prices** | [**BasePrice**](BasePrice.md)|  |
 **description** | **String**|  | [optional]
 **availableFrom** | **LocalDate**|  | [optional]
 **availableUntil** | **LocalDate**|  | [optional]
 **onlyPackaged** | **Boolean**|  | [optional]
 **boats** | [**List&lt;Long&gt;**](Long.md)|  | [optional]
 **boatrooms** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

[**InlineResponse2014**](InlineResponse2014.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllAvailableTickets"></a>
# **getAllAvailableTickets**
> List&lt;Ticket&gt; getAllAvailableTickets()

Retrieve all tickets that are available to booked today

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketApi;


TicketApi apiInstance = new TicketApi();
try {
    List<Ticket> result = apiInstance.getAllAvailableTickets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketApi#getAllAvailableTickets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Ticket&gt;**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllTickets"></a>
# **getAllTickets**
> List&lt;Ticket&gt; getAllTickets()

Retrieve all tickets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketApi;


TicketApi apiInstance = new TicketApi();
try {
    List<Ticket> result = apiInstance.getAllTickets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketApi#getAllTickets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Ticket&gt;**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedTickets"></a>
# **getAllWithTrashedTickets**
> List&lt;Ticket&gt; getAllWithTrashedTickets()

Retrieve all tickets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketApi;


TicketApi apiInstance = new TicketApi();
try {
    List<Ticket> result = apiInstance.getAllWithTrashedTickets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketApi#getAllWithTrashedTickets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Ticket&gt;**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTicket"></a>
# **getTicket**
> Ticket getTicket(id)

Retrieve a ticket by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TicketApi;


TicketApi apiInstance = new TicketApi();
Long id = 789L; // Long | 
try {
    Ticket result = apiInstance.getTicket(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TicketApi#getTicket");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**Ticket**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

