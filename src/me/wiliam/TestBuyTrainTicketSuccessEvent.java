package me.wiliam;

/**
 * �¼�������
 * @author wiliam
 *
 */
public class TestBuyTrainTicketSuccessEvent {

	public static void main(String[] args) {
		TestBuyTrainTicketSuccessEvent  tbtts = new TestBuyTrainTicketSuccessEvent();
		tbtts.buySuccessTicket();
	}
	
	private void buySuccessTicket(){
		TrainTicket tt = new TrainTicket();
		tt.setTicketName("������---���ϡ�");
		tt.setUserName("С��");
		System.out.println("��Ʊ�ɹ�");
		TrainTicketPublisher.instance().publishEvent(new SendEmailEvent(tt));
		TrainTicketPublisher.instance().publishEvent(new SendSMSEvent(tt));
	}

}
