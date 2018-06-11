package com.cx;

/**
 * 
 * @author Administrator
 *
 */
public class XCSchedule  implements Runnable{

	
	AbstractTask [] atTaskArr ;
	
	public XCSchedule(AbstractTask [] atTaskArr){
		this.atTaskArr = atTaskArr;
	}
	
	public void run() {
		
		for(AbstractTask at : atTaskArr){
		//����
			Thread th = new Thread(at);
			th.start();
		}
		while(true){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for (AbstractTask at : atTaskArr) {
				//��ȡִ������ı�ʶ
				if(at.isTimeOver()){
					at.setIsvalid(true);
				}else{
					at.setIsvalid(false);
				}
			}
			
		}
		
		
	}
	
}
