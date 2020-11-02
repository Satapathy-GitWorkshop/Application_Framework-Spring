package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class StudentDTO  implements Serializable{
	 private Integer no;
	  private String name;
	  private String address;
}
