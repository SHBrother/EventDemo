package me.wiliam;
/**
 * �����ʼ��¼�
 * @author wiliam
 *
 */
public class SendEmailEvent extends TrainTicketEvent {

	private static final long serialVersionUID = 1L;

	private TrainTicket trainTicket;
	
	public SendEmailEvent(TrainTicket source) {
		super(source);
		this.trainTicket = source;
	}
	
	public TrainTicket getTrainTicket(){
		return trainTicket;
	}
	
	public String getEmailData(){
		if(trainTicket != null){
			String data = "�����ʼ���"+trainTicket.getUserName() + "���ã����ѳɹ������Ʊ"+trainTicket.getTicketName();
			return data;
		}
		return "";
	}

}
