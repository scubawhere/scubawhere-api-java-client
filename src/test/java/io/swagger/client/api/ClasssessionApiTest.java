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
import io.swagger.client.model.TrainingSession;
import io.swagger.client.model.InlineResponse20019;
import org.joda.time.LocalDate;
import io.swagger.client.model.InlineResponse2003;
import io.swagger.client.model.InlineResponse20020;
import io.swagger.client.model.TrainingSessionManifest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClasssessionApi
 */
public class ClasssessionApiTest {

    private final ClasssessionApi api = new ClasssessionApi();

    
    /**
     * Retrieve a class session by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void classSessionGetTest() throws ApiException {
        Long id = null;
        // TrainingSession response = api.classSessionGet(id);

        // TODO: test validations
    }
    
    /**
     * Create a new class session
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createClassSessionTest() throws ApiException {
        LocalDate start = null;
        Long trainingId = null;
        // InlineResponse20019 response = api.createClassSession(start, trainingId);

        // TODO: test validations
    }
    
    /**
     * Delete a class session by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClasssessionTest() throws ApiException {
        Long id = null;
        // InlineResponse2003 response = api.deleteClasssession(id);

        // TODO: test validations
    }
    
    /**
     * Update a class session by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editClassSessionTest() throws ApiException {
        Integer id = null;
        LocalDate start = null;
        // InlineResponse20020 response = api.editClassSession(id, start);

        // TODO: test validations
    }
    
    /**
     * Retrieve all class sessions that match a filter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterClassSessionTest() throws ApiException {
        // List<TrainingSession> response = api.filterClassSession();

        // TODO: test validations
    }
    
    /**
     * Retrieve all class sessions including any deleted models
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllClassSessionsTest() throws ApiException {
        // List<TrainingSession> response = api.getAllClassSessions();

        // TODO: test validations
    }
    
    /**
     * Retrieve all class sessions including any deleted models
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllWithTrashedClassSessionsTest() throws ApiException {
        // List<TrainingSession> response = api.getAllWithTrashedClassSessions();

        // TODO: test validations
    }
    
    /**
     * Retrieve the customer manifest for a class session
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClassSessionManifestTest() throws ApiException {
        Long id = null;
        // TrainingSessionManifest response = api.getClassSessionManifest(id);

        // TODO: test validations
    }
    
    /**
     * Retrieve all class sessions that start today
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTodaysClassSessionTest() throws ApiException {
        // List<TrainingSession> response = api.getTodaysClassSession();

        // TODO: test validations
    }
    
    /**
     * Retrieve all class sessions that start tommorow
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTommorowsClassSessionTest() throws ApiException {
        // List<TrainingSession> response = api.getTommorowsClassSession();

        // TODO: test validations
    }
    
}
