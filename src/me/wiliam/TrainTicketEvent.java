package me.wiliam;

import java.util.EventObject;
/**
 * ��Ʊ�¼�����
 * @author wiliam
 *
 */
public class TrainTicketEvent extends EventObject {

	
	private static final long serialVersionUID = 1L;

	public TrainTicketEvent(TrainTicket source) {
		super(source);
	}

}
