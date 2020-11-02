package com.nt.bo;

import java.io.Serializable;

import lombok.Data;
@Data
public class StudentBo implements Serializable {
  private Integer no;
  private String name;
  private String address;
}
