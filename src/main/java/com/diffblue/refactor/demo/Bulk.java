package com.diffblue.refactor.demo;

import java.util.ArrayList;
import java.util.List;

public class Bulk {
  public static void f() {
    List<Integer> data=new ArrayList<>();
    List<Integer> copy=new ArrayList<>();
    for(Integer value : data)
      if(value>0)
        copy.add(value);
  }
}
