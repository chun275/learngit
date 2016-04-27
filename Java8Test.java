package com.abc.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 
 * @author Administrator
 *测试
 */
public class Java8Test { 

public static void main(String[] args) {
new Thread(()->{System.out.println("hello");}).start();

int num=3;
Converter<String,Integer> converter=(from)->String.valueOf(from+num);
//过滤规则
System.out.println(converter.convert(3));
List list=Arrays.asList("aaa","bbb","haha","ccc");
testPredicate(list,(arg)->arg.length()==3);
//排序
List<Integer> mylist=Arrays.asList(1,3,2,4);
Collections.sort(mylist,(x,y)->y-x);

Collections.sort(mylist);
System.out.println(mylist);

}
private static void testPredicate(List<String> list,Predicate<String> p){
	list.stream().filter(p).forEach(arg->System.out.println(arg));
	
}

}
