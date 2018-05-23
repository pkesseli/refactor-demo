package com.diffblue.refactor.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bulk {
  public static void f() {
    List<Integer> data=new ArrayList<>();
    List<Integer> copy=new ArrayList<>();
    for(Integer value : data)
      if(value>0)
        copy.add(value);
  }

  public String g(String s) {
    return s;
  }

  public String maxString(Collection<String> strings) {
    String result=null;
    for(String string : strings)
      if(result==null||result.length()<string.length())
        result=string;
    return result;
  }

  public String nullSafeF(String s) {
    return s==null ? "" : s;
  }

  public void useMaxString(Collection<String> strings) {
    String max=maxString(strings);
    System.out.println(max);
  }
}
