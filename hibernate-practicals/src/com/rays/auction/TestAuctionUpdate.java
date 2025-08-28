package com.rays.auction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAuctionUpdate {
	
	public static void main(String[] args) {
		
		AuctionItem item = new AuctionItem();
		
		item.setId(1);
		item.setDescription("class phobia");
    		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.update(item);
		
		tx.commit();
		
		session.close();
	}

}
