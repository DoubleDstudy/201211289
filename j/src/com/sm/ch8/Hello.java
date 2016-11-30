package com.sm.ch8;
public class Hello {

    private String name;
    public Hello(String name){
        this.name=name;
    }
    public void sayHello(){
        System.out.println("Hello "+name);
    }
	
	public static void main(String[] args) {
		
		Hello[] h = new Hello[5];
		h[0] = new Hello("js1");
		h[1] = new Hello("js2");
		h[2] = new Hello("js3");
		h[3] = new Hello("js4");
		h[4] = new Hello("js5");
		for(int i=0;i<5;i++){
			h[i].sayHello();
		}
		System.out.println();
		for(Hello e:h)
			e.sayHello();
		
	}

}