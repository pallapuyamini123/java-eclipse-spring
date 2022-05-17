package ai.jobiak.source;

import java.util.*;

public class Garden {
	 ArrayList<String>fruits;//fruits is an instance variable
	 ArrayList<String>flowers; 
	 HashSet<String>trees; //in spring instances are known as dependencies
	 HashMap<String,String>cityFruit;
	 //ArrayList<Employee>empList;
		
	 public Garden() {
	  
	 }
	 public Garden(ArrayList<String>flowers) {
	  this.flowers=flowers;
	 }
	 public void setFruits(ArrayList<String>fruits) {
	  
	  System.out.println("printing garden..");
	  this.fruits=fruits;
	 }
		
	 public void setTrees(HashSet<String>trees) {
	  this.trees=trees;
	 }
	 public HashSet<String>trees(){
	  return this.trees;
	 }
	 public void setCityFruit(HashMap<String,String>cityFruit) {
	  this.cityFruit=cityFruit;
	 }
		
	 public HashMap<String,String> getcityFruit(){
	  return this.cityFruit;
		
	 }
		
		
	 @Override
	 public String toString() {
	  return "Garden [fruits=" + fruits + ", flowers=" + flowers + ", trees=" + trees + ", cityFruit=" + cityFruit
	    + "]";
	 }
		
	//if we use property use set method in cls,if we use constructor then it searchh for constructor in clss
    
}
