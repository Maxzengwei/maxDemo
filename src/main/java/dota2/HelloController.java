package dota2;

import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello Dota2 player!";
    }
    
    public static void main(String args[]) {
    	List<Integer> li = Arrays.asList(1,2,3,4,5);
    	li.forEach(a->System.out.println(Math.pow(a,2)));
    	
    	Converter<String, Integer> converter = (from) -> Integer.valueOf(from);  
        Integer converted = converter.convert("123");  
        System.out.println(converted);    // 123 
    }

    
     
}

interface Converter<F, T> {  
    T convert(F d);  
}  