package me.wiliam;

import java.util.EventListener;
/**
 * ��Ʊ�¼��������ӿ�
 * @author wiliam
 *
 */
public interface TrainTicketListener extends EventListener {

	void handEvent(TrainTicketEvent tte);
}
