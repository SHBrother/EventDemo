package me.wiliam;

/**
 * ͬʱ�������ʼ��¼��Ͷ����¼�
 * @author wiliam
 *
 */
public class EmailAndSMSListener implements TrainTicketListener {

	@Override
	public void handEvent(TrainTicketEvent tte) {

		if(tte instanceof SendEmailEvent){
			SendEmailEvent see = (SendEmailEvent)tte;
			System.out.println(see.getEmailData());
		}else if(tte instanceof SendSMSEvent){
			SendSMSEvent sse = (SendSMSEvent)tte;
			System.out.println(sse.getSMSData());
		}else{
			System.out.println("����δ֪�¼����޷�����");
		}
	}

}
