package me.wiliam;
/**
 * ���Ͷ����¼�
 * @author huhailong
 *
 */
public class SendSMSEvent extends TrainTicketEvent {

	private static final long serialVersionUID = 1L;
	private TrainTicket trainTicket;
	
	public SendSMSEvent(TrainTicket source) {
		super(source);
		this.trainTicket = source;
	}
	
	public TrainTicket getTrainTicket(){
		return trainTicket;
	}
	
	public String getSMSData(){
		if(trainTicket != null){
			String data = "���Ͷ��ţ�"+trainTicket.getUserName() + "���ã����ѳɹ������Ʊ"+trainTicket.getTicketName();
			return data;
		}
		return "";
	}

}
