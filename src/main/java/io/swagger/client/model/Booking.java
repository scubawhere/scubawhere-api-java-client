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
import io.swagger.client.model.Customer;
import io.swagger.client.model.Payment;
import io.swagger.client.model.Refund;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;


/**
 * Booking
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-08T09:39:43.225Z")
public class Booking   {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("reference")
  private String reference = null;

  @SerializedName("lead_customer_id")
  private Long leadCustomerId = null;

  @SerializedName("agent_id")
  private Long agentId = null;

  @SerializedName("agent_reference")
  private String agentReference = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("price")
  private Long price = null;

  @SerializedName("discount")
  private Integer discount = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("reserved_until")
  private LocalDate reservedUntil = null;

  @SerializedName("cancellation_fee")
  private Long cancellationFee = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("parent_id")
  private Long parentId = null;

  @SerializedName("decimal_price")
  private String decimalPrice = null;

  @SerializedName("real_decimal_price")
  private String realDecimalPrice = null;

  @SerializedName("arrival_date")
  private LocalDate arrivalDate = null;

  @SerializedName("created_at_local")
  private LocalDate createdAtLocal = null;

  @SerializedName("lead_customer")
  private Customer leadCustomer = null;

  @SerializedName("payments")
  private List<Payment> payments = new ArrayList<Payment>();

  @SerializedName("refunds")
  private List<Refund> refunds = new ArrayList<Refund>();

  public Booking id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Booking reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public Booking leadCustomerId(Long leadCustomerId) {
    this.leadCustomerId = leadCustomerId;
    return this;
  }

   /**
   * Get leadCustomerId
   * @return leadCustomerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLeadCustomerId() {
    return leadCustomerId;
  }

  public void setLeadCustomerId(Long leadCustomerId) {
    this.leadCustomerId = leadCustomerId;
  }

  public Booking agentId(Long agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Get agentId
   * @return agentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getAgentId() {
    return agentId;
  }

  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }

  public Booking agentReference(String agentReference) {
    this.agentReference = agentReference;
    return this;
  }

   /**
   * Get agentReference
   * @return agentReference
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAgentReference() {
    return agentReference;
  }

  public void setAgentReference(String agentReference) {
    this.agentReference = agentReference;
  }

  public Booking source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Booking price(Long price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public Booking discount(Integer discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDiscount() {
    return discount;
  }

  public void setDiscount(Integer discount) {
    this.discount = discount;
  }

  public Booking status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Booking reservedUntil(LocalDate reservedUntil) {
    this.reservedUntil = reservedUntil;
    return this;
  }

   /**
   * Get reservedUntil
   * @return reservedUntil
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getReservedUntil() {
    return reservedUntil;
  }

  public void setReservedUntil(LocalDate reservedUntil) {
    this.reservedUntil = reservedUntil;
  }

  public Booking cancellationFee(Long cancellationFee) {
    this.cancellationFee = cancellationFee;
    return this;
  }

   /**
   * Get cancellationFee
   * @return cancellationFee
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCancellationFee() {
    return cancellationFee;
  }

  public void setCancellationFee(Long cancellationFee) {
    this.cancellationFee = cancellationFee;
  }

  public Booking comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Booking parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public Booking decimalPrice(String decimalPrice) {
    this.decimalPrice = decimalPrice;
    return this;
  }

   /**
   * Get decimalPrice
   * @return decimalPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDecimalPrice() {
    return decimalPrice;
  }

  public void setDecimalPrice(String decimalPrice) {
    this.decimalPrice = decimalPrice;
  }

  public Booking realDecimalPrice(String realDecimalPrice) {
    this.realDecimalPrice = realDecimalPrice;
    return this;
  }

   /**
   * Get realDecimalPrice
   * @return realDecimalPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRealDecimalPrice() {
    return realDecimalPrice;
  }

  public void setRealDecimalPrice(String realDecimalPrice) {
    this.realDecimalPrice = realDecimalPrice;
  }

  public Booking arrivalDate(LocalDate arrivalDate) {
    this.arrivalDate = arrivalDate;
    return this;
  }

   /**
   * Get arrivalDate
   * @return arrivalDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getArrivalDate() {
    return arrivalDate;
  }

  public void setArrivalDate(LocalDate arrivalDate) {
    this.arrivalDate = arrivalDate;
  }

  public Booking createdAtLocal(LocalDate createdAtLocal) {
    this.createdAtLocal = createdAtLocal;
    return this;
  }

   /**
   * Get createdAtLocal
   * @return createdAtLocal
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getCreatedAtLocal() {
    return createdAtLocal;
  }

  public void setCreatedAtLocal(LocalDate createdAtLocal) {
    this.createdAtLocal = createdAtLocal;
  }

  public Booking leadCustomer(Customer leadCustomer) {
    this.leadCustomer = leadCustomer;
    return this;
  }

   /**
   * Get leadCustomer
   * @return leadCustomer
  **/
  @ApiModelProperty(example = "null", value = "")
  public Customer getLeadCustomer() {
    return leadCustomer;
  }

  public void setLeadCustomer(Customer leadCustomer) {
    this.leadCustomer = leadCustomer;
  }

  public Booking payments(List<Payment> payments) {
    this.payments = payments;
    return this;
  }

  public Booking addPaymentsItem(Payment paymentsItem) {
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
  }

  public Booking refunds(List<Refund> refunds) {
    this.refunds = refunds;
    return this;
  }

  public Booking addRefundsItem(Refund refundsItem) {
    this.refunds.add(refundsItem);
    return this;
  }

   /**
   * Get refunds
   * @return refunds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Refund> getRefunds() {
    return refunds;
  }

  public void setRefunds(List<Refund> refunds) {
    this.refunds = refunds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Booking booking = (Booking) o;
    return Objects.equals(this.id, booking.id) &&
        Objects.equals(this.reference, booking.reference) &&
        Objects.equals(this.leadCustomerId, booking.leadCustomerId) &&
        Objects.equals(this.agentId, booking.agentId) &&
        Objects.equals(this.agentReference, booking.agentReference) &&
        Objects.equals(this.source, booking.source) &&
        Objects.equals(this.price, booking.price) &&
        Objects.equals(this.discount, booking.discount) &&
        Objects.equals(this.status, booking.status) &&
        Objects.equals(this.reservedUntil, booking.reservedUntil) &&
        Objects.equals(this.cancellationFee, booking.cancellationFee) &&
        Objects.equals(this.comment, booking.comment) &&
        Objects.equals(this.parentId, booking.parentId) &&
        Objects.equals(this.decimalPrice, booking.decimalPrice) &&
        Objects.equals(this.realDecimalPrice, booking.realDecimalPrice) &&
        Objects.equals(this.arrivalDate, booking.arrivalDate) &&
        Objects.equals(this.createdAtLocal, booking.createdAtLocal) &&
        Objects.equals(this.leadCustomer, booking.leadCustomer) &&
        Objects.equals(this.payments, booking.payments) &&
        Objects.equals(this.refunds, booking.refunds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reference, leadCustomerId, agentId, agentReference, source, price, discount, status, reservedUntil, cancellationFee, comment, parentId, decimalPrice, realDecimalPrice, arrivalDate, createdAtLocal, leadCustomer, payments, refunds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Booking {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    leadCustomerId: ").append(toIndentedString(leadCustomerId)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentReference: ").append(toIndentedString(agentReference)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reservedUntil: ").append(toIndentedString(reservedUntil)).append("\n");
    sb.append("    cancellationFee: ").append(toIndentedString(cancellationFee)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    decimalPrice: ").append(toIndentedString(decimalPrice)).append("\n");
    sb.append("    realDecimalPrice: ").append(toIndentedString(realDecimalPrice)).append("\n");
    sb.append("    arrivalDate: ").append(toIndentedString(arrivalDate)).append("\n");
    sb.append("    createdAtLocal: ").append(toIndentedString(createdAtLocal)).append("\n");
    sb.append("    leadCustomer: ").append(toIndentedString(leadCustomer)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
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

