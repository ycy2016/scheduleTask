package com.cx;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 
 * @author Administrator
 *
 */
public abstract class AbstractTask implements Runnable {

	/**
	 * ���б�ʶ
	 */
	protected AtomicBoolean isvalid = new AtomicBoolean(false);

	/**
	 * ���б�ʶ
	 */
	protected AtomicBoolean isWait = new AtomicBoolean(true);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void run() {
		while (true) {
			System.out.println("run");
			System.out.println(getIsvalid());
			
			while (!getIsvalid()) {

			}
			if (getToken()) {
				// ����ֻ��һ��,ͬһʱ��ֻ����һ������ִ��
				try {
					excutorTask();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					// �ͷ�����
					realeseToken();
				}
			}
		}
	}

	public abstract void excutorTask();

	public boolean getIsvalid() {
		return isvalid.get();
	}

	public void setIsvalid(boolean isvalid) {
		this.isvalid.set(isvalid);
	}

	public boolean getToken() {
		return isWait.getAndSet(false);
	}

	public void realeseToken() {
		isWait.set(true);
	}
	
	public  abstract boolean isTimeOver();
	
}
