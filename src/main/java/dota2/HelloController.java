package dota2;

import org.springframework.web.bind.annotation.RestController;

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

    
    public static void main(String args[]){
    	List<String> names = Arrays.asList("e","c","b","d");
    	
//    	Collections.sort(names, new Comparator<String>(){
//    			@Override
//    			public int compare(String a,String b){
//    				return a.compareTo(b);
//    			}
//    		}
//    	);
    	
    	Collections.sort(names,(a,b)-> a.compareTo(b));
    	
    	for(String s:names){
    		System.out.println(s);
    	}
    }
    
    
    
}