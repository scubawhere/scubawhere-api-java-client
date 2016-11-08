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
import io.swagger.client.model.InlineResponse2005;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse2004;
import io.swagger.client.model.Boat;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BoatApi
 */
public class BoatApiTest {

    private final BoatApi api = new BoatApi();

    
    /**
     * Create a new boat
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBoatTest() throws ApiException {
        String name = null;
        Long capacity = null;
        String description = null;
        List<Long> boatrooms = null;
        // InlineResponse2005 response = api.createBoat(name, capacity, description, boatrooms);

        // TODO: test validations
    }
    
    /**
     * Delete a boat by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBoatTest() throws ApiException {
        Long id = null;
        // InlineResponse2003 response = api.deleteBoat(id);

        // TODO: test validations
    }
    
    /**
     * Update a boat by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editBoatTest() throws ApiException {
        String name = null;
        Long capacity = null;
        String description = null;
        List<Long> boatrooms = null;
        // InlineResponse2004 response = api.editBoat(name, capacity, description, boatrooms);

        // TODO: test validations
    }
    
    /**
     * Retrieve all boats
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllBoatsTest() throws ApiException {
        // List<Boat> response = api.getAllBoats();

        // TODO: test validations
    }
    
    /**
     * Retrieve all agents including any deleted models
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllWithTrashedBoatsTest() throws ApiException {
        // List<Boat> response = api.getAllWithTrashedBoats();

        // TODO: test validations
    }
    
    /**
     * Retrieve a boat by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBoatTest() throws ApiException {
        Long id = null;
        // InlineResponse2005 response = api.getBoat(id);

        // TODO: test validations
    }
    
}
