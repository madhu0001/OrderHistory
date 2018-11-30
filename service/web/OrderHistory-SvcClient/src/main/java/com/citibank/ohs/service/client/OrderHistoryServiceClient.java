package com.citibank.ohs.service.client;

import com.citibank.ohs.service.client.beans.OrderHistoryWebSevReq;
import com.citibank.ohs.service.client.beans.OrderHistoryWebSevRes;

public interface OrderHistoryServiceClient {
	
	public OrderHistoryWebSevRes getOrderHistory(OrderHistoryWebSevReq svcReq);

}
