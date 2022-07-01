package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "youtube_channel")
	private String youTubleChannel;

	@Column(name = "hobby")
	private String hobby;

	public InstructorDetail() {
		super();
	}

	public InstructorDetail(String youTubleChannel, String hobby) {
		super();
		this.youTubleChannel = youTubleChannel;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYouTubleChannel() {
		return youTubleChannel;
	}

	public void setYouTubleChannel(String youTubleChannel) {
		this.youTubleChannel = youTubleChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youTubleChannel=" + youTubleChannel + ", hobby=" + hobby + "]";
	}

}
