package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
	
	//메소드 일반
	//오버라이드
    public void execute(String str){
        
    	if("앱".equals(str)){
            app();
        }else if("음악".equals(str)){
        	playMusic();
        }else {
        	System.out.println("통화기능시작");
        }
        
    }

    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");//재정의
    }
    
    public void app() {
    	System.out.println("앱실행");
    }
 
}
