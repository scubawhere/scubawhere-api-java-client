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
import io.swagger.client.model.InlineResponse2006;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.Boatroom;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BoatroomApi
 */
public class BoatroomApiTest {

    private final BoatroomApi api = new BoatroomApi();

    
    /**
     * Create a new boatroom
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBoatroomTest() throws ApiException {
        String name = null;
        String description = null;
        // InlineResponse2006 response = api.createBoatroom(name, description);

        // TODO: test validations
    }
    
    /**
     * Delete a boatroom by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBoatroomTest() throws ApiException {
        Long id = null;
        // InlineResponse2003 response = api.deleteBoatroom(id);

        // TODO: test validations
    }
    
    /**
     * Update a boatroom by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editBoatroomTest() throws ApiException {
        Long id = null;
        String name = null;
        String description = null;
        // InlineResponse2006 response = api.editBoatroom(id, name, description);

        // TODO: test validations
    }
    
    /**
     * Retrieve all boatrooms
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllBoatroomsTest() throws ApiException {
        // List<Boatroom> response = api.getAllBoatrooms();

        // TODO: test validations
    }
    
    /**
     * Retrieve all boatrooms including any deleted models
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllWithTrashedBoatroomsTest() throws ApiException {
        // List<Boatroom> response = api.getAllWithTrashedBoatrooms();

        // TODO: test validations
    }
    
    /**
     * Retrieve a boatroom by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBoatroomTest() throws ApiException {
        Long id = null;
        // InlineResponse2006 response = api.getBoatroom(id);

        // TODO: test validations
    }
    
}