package com.cx;

import com.cx.task.DatabasesTask;

public class XCMain {

	public static void main(String[] args) {
		
		AbstractTask [] atTaskArr = {new DatabasesTask()}; 
		XCSchedule xc = new XCSchedule(atTaskArr);
		new Thread(xc).start();
		
	}
	
}
