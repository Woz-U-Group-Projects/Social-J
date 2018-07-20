package com.socialj.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.*;

@Entity(name="comment")
@Table(name="comment")
public class Comment implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String comment;
	
	@ManyToOne(fetch = FetchType.LAZY, optional=false)
	@JoinColumn(name="topic_id", nullable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
    @JsonIdentityReference(alwaysAsId=true)
    @JsonProperty("topic_id")
	private Topic topic;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id=id;
	}
	private Comment(String comment) {
		super();
		this.comment=comment;
		
	}
	
	public void setComment(String comment) {
		this.comment=comment;
	}
	
	public String getComment() {
		return comment;
	}
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic=topic;
	}
}
