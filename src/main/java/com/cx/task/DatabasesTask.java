package com.cx.task;

import com.cx.AbstractTask;

/**
 * ��ʱִ�����ݿ�Ų�����
 * @author Administrator
 *
 */
public class DatabasesTask extends AbstractTask{

	@Override
	public void excutorTask() {
		// TODO Auto-generated method stub
		System.out.println("start ... ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end ... ");
	}

	@Override
	public boolean isTimeOver() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
}
