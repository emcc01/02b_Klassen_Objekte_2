package com.cc.java;

public class Cat {

  private String name; 
  private String furColor;
  private int age; 
  private boolean isFemale; //für if Bedingung
  private int counter;



// mit Constructor erzeugen
  public Cat(String name, String furColor, int age, boolean isFemale) {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
    this.isFemale = isFemale;
  }

//kombinierter Getter:
public String getStringAttributes(String op) { //strings zusammengefasst
  switch (op) {
    case "#name": // Raute nicht unbedingt nötig
      return name;
    case "#color":
      return furColor;
    default:
      return "ERROR!";
  }
}

public String getAge() {
  if (isFemale) {
    return checkEscalationLevel();
  } else {
    return String.valueOf(age); //wie Integer.toString
  }
    
  }

  private String checkEscalationLevel() {

    counter++;
    
    switch (counter) {
      case 1:
      return "this in an inappropiate question!";
        
        case 2:
        return "I've told you once!";
        
        case 3:
        return "Talk to the hand!";
    
      default:
        return "&%$§/!!";
    }


  }


}
  
