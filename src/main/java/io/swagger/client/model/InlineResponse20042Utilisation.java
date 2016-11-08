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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;


/**
 * InlineResponse20042Utilisation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-08T09:39:43.225Z")
public class InlineResponse20042Utilisation   {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("name")
  private LocalDate name = null;

  @SerializedName("relations")
  private List<Integer> relations = new ArrayList<Integer>();

  @SerializedName("assigned")
  private Integer assigned = null;

  @SerializedName("unassigned")
  private Integer unassigned = null;

  @SerializedName("capacity")
  private Integer capacity = null;

  public InlineResponse20042Utilisation date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public InlineResponse20042Utilisation name(LocalDate name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getName() {
    return name;
  }

  public void setName(LocalDate name) {
    this.name = name;
  }

  public InlineResponse20042Utilisation relations(List<Integer> relations) {
    this.relations = relations;
    return this;
  }

  public InlineResponse20042Utilisation addRelationsItem(Integer relationsItem) {
    this.relations.add(relationsItem);
    return this;
  }

   /**
   * Get relations
   * @return relations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Integer> getRelations() {
    return relations;
  }

  public void setRelations(List<Integer> relations) {
    this.relations = relations;
  }

  public InlineResponse20042Utilisation assigned(Integer assigned) {
    this.assigned = assigned;
    return this;
  }

   /**
   * Get assigned
   * @return assigned
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAssigned() {
    return assigned;
  }

  public void setAssigned(Integer assigned) {
    this.assigned = assigned;
  }

  public InlineResponse20042Utilisation unassigned(Integer unassigned) {
    this.unassigned = unassigned;
    return this;
  }

   /**
   * Get unassigned
   * @return unassigned
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getUnassigned() {
    return unassigned;
  }

  public void setUnassigned(Integer unassigned) {
    this.unassigned = unassigned;
  }

  public InlineResponse20042Utilisation capacity(Integer capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20042Utilisation inlineResponse20042Utilisation = (InlineResponse20042Utilisation) o;
    return Objects.equals(this.date, inlineResponse20042Utilisation.date) &&
        Objects.equals(this.name, inlineResponse20042Utilisation.name) &&
        Objects.equals(this.relations, inlineResponse20042Utilisation.relations) &&
        Objects.equals(this.assigned, inlineResponse20042Utilisation.assigned) &&
        Objects.equals(this.unassigned, inlineResponse20042Utilisation.unassigned) &&
        Objects.equals(this.capacity, inlineResponse20042Utilisation.capacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, name, relations, assigned, unassigned, capacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20042Utilisation {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    unassigned: ").append(toIndentedString(unassigned)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
