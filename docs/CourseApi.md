# CourseApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCourse**](CourseApi.md#createCourse) | **POST** /course/add | Create a new course
[**deleteCourse**](CourseApi.md#deleteCourse) | **DELETE** /course/delete | Delete a course by ID
[**editCourse**](CourseApi.md#editCourse) | **POST** /course/edit | Update a course by ID
[**getAllCourses**](CourseApi.md#getAllCourses) | **GET** /course/all | Retrieve all courses including any deleted models
[**getAllWithTrashedCourses**](CourseApi.md#getAllWithTrashedCourses) | **GET** /course/all-with-trashed | Retrieve all courses including any deleted models
[**getCourse**](CourseApi.md#getCourse) | **GET** /course | Retrieve a course by ID


<a name="createCourse"></a>
# **createCourse**
> InlineResponse20027 createCourse(name, description, capacity, prices, certificateId, tickets, trainings)

Create a new course

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
String name = "name_example"; // String | 
String description = "description_example"; // String | 
Integer capacity = 56; // Integer | 
List<Double> prices = Arrays.asList(3.4D); // List<Double> | 
Integer certificateId = 56; // Integer | 
List<Long> tickets = Arrays.asList(56L); // List<Long> | 
List<Long> trainings = Arrays.asList(56L); // List<Long> | 
try {
    InlineResponse20027 result = apiInstance.createCourse(name, description, capacity, prices, certificateId, tickets, trainings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#createCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **description** | **String**|  |
 **capacity** | **Integer**|  |
 **prices** | [**List&lt;Double&gt;**](Double.md)|  |
 **certificateId** | **Integer**|  | [optional]
 **tickets** | [**List&lt;Long&gt;**](Long.md)|  | [optional]
 **trainings** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCourse"></a>
# **deleteCourse**
> InlineResponse2003 deleteCourse(id)

Delete a course by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
Long id = 789L; // Long | 
try {
    InlineResponse2003 result = apiInstance.deleteCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#deleteCourse");
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

<a name="editCourse"></a>
# **editCourse**
> InlineResponse20028 editCourse(id, name, description, capacity, certificateId, tickets, trainings)

Update a course by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
Long id = 789L; // Long | 
String name = "name_example"; // String | 
String description = "description_example"; // String | 
Integer capacity = 56; // Integer | 
Integer certificateId = 56; // Integer | 
List<Long> tickets = Arrays.asList(56L); // List<Long> | 
List<Long> trainings = Arrays.asList(56L); // List<Long> | 
try {
    InlineResponse20028 result = apiInstance.editCourse(id, name, description, capacity, certificateId, tickets, trainings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#editCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **name** | **String**|  |
 **description** | **String**|  |
 **capacity** | **Integer**|  |
 **certificateId** | **Integer**|  | [optional]
 **tickets** | [**List&lt;Long&gt;**](Long.md)|  | [optional]
 **trainings** | [**List&lt;Long&gt;**](Long.md)|  | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllCourses"></a>
# **getAllCourses**
> List&lt;Course&gt; getAllCourses()

Retrieve all courses including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
try {
    List<Course> result = apiInstance.getAllCourses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getAllCourses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedCourses"></a>
# **getAllWithTrashedCourses**
> List&lt;Course&gt; getAllWithTrashedCourses()

Retrieve all courses including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
try {
    List<Course> result = apiInstance.getAllWithTrashedCourses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getAllWithTrashedCourses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCourse"></a>
# **getCourse**
> InlineResponse20027 getCourse(id)

Retrieve a course by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CourseApi;


CourseApi apiInstance = new CourseApi();
Long id = 789L; // Long | 
try {
    InlineResponse20027 result = apiInstance.getCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CourseApi#getCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  | [optional]

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

