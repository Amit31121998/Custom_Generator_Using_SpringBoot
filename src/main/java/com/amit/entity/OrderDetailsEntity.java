package com.amit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name="ORDER_DTLS")
public class OrderDetailsEntity {

	 @Id
	 @Column(name="ORDER_ID")
	 @GenericGenerator(name="order_id_gen",strategy = "com.amit.generator.OrderIdGenerator")
	 @GeneratedValue(generator="order_id_gen")
	 private String orderId;
	 
	 @Column(name="ORDER_BY")
	 private String orderBy;
	 
	 @Column(name="ORDER_placed_DT")
	 @Temporal(TemporalType.DATE)
	 private Date orderPlacedDate;
}
