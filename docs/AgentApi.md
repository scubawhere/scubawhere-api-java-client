# AgentApi

All URIs are relative to *https://dev.scubawhere.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAgent**](AgentApi.md#createAgent) | **POST** /agent/add | Create a new agent
[**deleteAgent**](AgentApi.md#deleteAgent) | **DELETE** /agent/delete | Delete an agent by ID
[**getAgent**](AgentApi.md#getAgent) | **GET** /agent | Retrieve an agent by ID
[**getAllAgents**](AgentApi.md#getAllAgents) | **GET** /agent/all | Retrieve all agents
[**getAllWithTrashedAgents**](AgentApi.md#getAllWithTrashedAgents) | **GET** /agent/all-with-trashed | Retrieve all agents including any deleted models


<a name="createAgent"></a>
# **createAgent**
> InlineResponse2004 createAgent(name, branchName, branchAddress, branchPhone, branchEmail, commission, terms, website, billingAddress, billingPhone, billingEmail)

Create a new agent

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
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
    InlineResponse2004 result = apiInstance.createAgent(name, branchName, branchAddress, branchPhone, branchEmail, commission, terms, website, billingAddress, billingPhone, billingEmail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#createAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

<a name="deleteAgent"></a>
# **deleteAgent**
> InlineResponse2003 deleteAgent(id)

Delete an agent by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
Long id = 789L; // Long | ID of the Agent
try {
    InlineResponse2003 result = apiInstance.deleteAgent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#deleteAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the Agent |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgent"></a>
# **getAgent**
> InlineResponse2004 getAgent(id)

Retrieve an agent by ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
Long id = 789L; // Long | ID of the agent to be retrieved
try {
    InlineResponse2004 result = apiInstance.getAgent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of the agent to be retrieved |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllAgents"></a>
# **getAllAgents**
> List&lt;Agent&gt; getAllAgents()

Retrieve all agents

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
try {
    List<Agent> result = apiInstance.getAllAgents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getAllAgents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Agent&gt;**](Agent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllWithTrashedAgents"></a>
# **getAllWithTrashedAgents**
> List&lt;Agent&gt; getAllWithTrashedAgents()

Retrieve all agents including any deleted models

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AgentApi;


AgentApi apiInstance = new AgentApi();
try {
    List<Agent> result = apiInstance.getAllWithTrashedAgents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AgentApi#getAllWithTrashedAgents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Agent&gt;**](Agent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

