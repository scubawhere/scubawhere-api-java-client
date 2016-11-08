/**
 * Scubawhere API Documentation
 * This is the documentation for scubawhere's RMS API. This API is only to be used by authorized parties with valid auth tokens.  [Learn about scubawhere](http://www.scubawhere.com) to become an authorized consumer of our API 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: bryan@scubawhere.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorModel;
import org.joda.time.LocalDate;
import io.swagger.client.model.InlineResponse20029;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse20030;
import io.swagger.client.model.Customer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerApi
 */
public class CustomerApiTest {

    private final CustomerApi api = new CustomerApi();

    
    /**
     * Create a new customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomerTest() throws ApiException {
        String email = null;
        String firstname = null;
        String lastname = null;
        LocalDate birthday = null;
        Integer gender = null;
        String address1 = null;
        String address2 = null;
        String city = null;
        String county = null;
        String postcode = null;
        Long countryId = null;
        String phone = null;
        LocalDate lastDive = null;
        Integer numberOfDives = null;
        String chestSize = null;
        String showSize = null;
        String height = null;
        List<Long> certificates = null;
        // InlineResponse20029 response = api.createCustomer(email, firstname, lastname, birthday, gender, address1, address2, city, county, postcode, countryId, phone, lastDive, numberOfDives, chestSize, showSize, height, certificates);

        // TODO: test validations
    }
    
    /**
     * Delete a customer by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCustomerTest() throws ApiException {
        Long id = null;
        // InlineResponse2003 response = api.deleteCustomer(id);

        // TODO: test validations
    }
    
    /**
     * Update a customer by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editCustomerTest() throws ApiException {
        Long id = null;
        String email = null;
        String firstname = null;
        String lastname = null;
        LocalDate birthday = null;
        Integer gender = null;
        String address1 = null;
        String address2 = null;
        String city = null;
        String county = null;
        String postcode = null;
        Long countryId = null;
        String phone = null;
        LocalDate lastDive = null;
        Integer numberOfDives = null;
        String chestSize = null;
        String showSize = null;
        String height = null;
        List<Long> certificates = null;
        // InlineResponse20030 response = api.editCustomer(id, email, firstname, lastname, birthday, gender, address1, address2, city, county, postcode, countryId, phone, lastDive, numberOfDives, chestSize, showSize, height, certificates);

        // TODO: test validations
    }
    
    /**
     * Retrieve all customers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCustomersTest() throws ApiException {
        // List<Customer> response = api.getAllCustomers();

        // TODO: test validations
    }
    
    /**
     * Retrieve a customer by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomerTest() throws ApiException {
        Long id = null;
        // InlineResponse20029 response = api.getCustomer(id);

        // TODO: test validations
    }
    
}
