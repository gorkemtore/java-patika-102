package criticalSectionsAndRaceCodition;

public class OrderMatic implements Runnable {
	private int orderNo;
//	private final Object LOCK = new Object(); // for synchronized
	public OrderMatic() {
		this.orderNo = 0;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		// thread buraya geldiğinde burayı kitliyor. başka thread bu kod bloğuna
		// giremiyor.
		/*
		 * synchronized (LOCK) { this.orderNo++;
		 * System.out.println(Thread.currentThread().getName()+
		 * " - OrderNo : "+this.orderNo); }
		 */
		increaseOrder();//synchronized method
	}

	public synchronized void increaseOrder() {
		this.orderNo++;
		System.out.println(Thread.currentThread().getName() + " - OrderNo : " + this.orderNo);
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

}
