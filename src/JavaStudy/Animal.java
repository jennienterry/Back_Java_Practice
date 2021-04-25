package JavaStudy;

import java.awt.font.TextHitInfo;

public class Animal {
	private String aName;
    private String aType;
    private String aColor;
    private String aCharacter;
    private String aHobby;
    float aFat = 0;

    
    Animal (String aName, String aType, String aColor, String aCharacter, String aHobby){
    	this.aName = aName;
    	this.aType = aType;
    	this.aColor = aColor;
    	this.aCharacter = aCharacter;
    	this.aHobby = aHobby;
    	
    }


	public String getaName() {
		return aName;
	}


	public String getaType() {
		return aType;
	}


	public String getaColor() {
		return aColor;
	}


	public String getaCharacter() {
		return aCharacter;
	}


	public String getaHobby() {
		return aHobby;
	}


	public float getaFat() {
		return aFat;
	}


	@Override
	public String toString() {
		return String.format(" ♡ %s ♡ | 동물은 : %s | 색깔 : %s | 습관 : %s | 취미 : %s", aName, aType, aColor,aCharacter, aHobby);
	};
    
	String eating(){
		aFat++;
		if(aFat>0) {
			aFat=0;
		}
		return String.format("%s : 냠냠냠~ 맛있땅! ^^ %s", this.getaName(),this.getaCharacter());
	}
    
	String sleeping() {
		aFat -= 0.5;
		if(aFat>0) {
			aFat=0;
		}
		return String.format("%s : 쿨쿨~zZ  %s", this.getaName(),this.getaCharacter());
	}
	
	String pooping() {
		aFat -= 0.5;
		if(aFat>0) {
			aFat=0;
		}
		return String.format("%s : 끄읍... ><;;; 아이~ 시원해~^ㅇ^~ ☆ %s", this.getaName(),this.getaCharacter());
		
	}
	
	String doHobby() {
		return ("\n\n!!!! 취미활동할래 !!!! \n !!!삐질꼬야!!!\n !!!나뽀 나뽀 나뽀!!!\n !!!얼릉 얼릉 취미활동 시켜죠!!!\n");
		
	}
	
	String hobbing() {
		return "";
	}
	
	 String hobby() {
		aFat--;
		if(aFat<0) {
		aFat =0;}
		return String.format(Animal.hobbing());
	}
	
	 
}