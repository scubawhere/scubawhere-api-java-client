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
import io.swagger.client.model.InlineResponse2015;
import org.joda.time.LocalDate;
import io.swagger.client.model.Timetable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimetableApi
 */
public class TimetableApiTest {

    private final TimetableApi api = new TimetableApi();

    
    /**
     * Create a new timetable for sessions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTimetableTest() throws ApiException {
        String schedule = null;
        Long sessionId = null;
        LocalDate until = null;
        // InlineResponse2015 response = api.addTimetable(schedule, sessionId, until);

        // TODO: test validations
    }
    
    /**
     * Retrieve all of the timetables for sessions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllTimetablesTest() throws ApiException {
        // List<Timetable> response = api.getAllTimetables();

        // TODO: test validations
    }
    
    /**
     * Retrieve a timetable by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTimetableTest() throws ApiException {
        Long id = null;
        // Timetable response = api.getTimetable(id);

        // TODO: test validations
    }
    
}
