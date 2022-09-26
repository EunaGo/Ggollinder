package com.ggollinder.web.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "TB_USER")
@ToString
public class User {
	
	@Id
	@Column(name = "USER_IDX")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String userIdx;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "USER_PASSWORD")
	private String userPassword;
	
	@Column(name = "USER_NAME")
	private String userName;
	
}
