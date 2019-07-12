package com.adobe.prj.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adobe.prj.dao.BookingDao;
import com.adobe.prj.entity.Booking;

@Service
public class BookingService {

	@Autowired
	private BookingDao bookingDao;
	
	public Booking getBooking(int id) {
		//System.out.println(id);
		return bookingDao.getBooking(id);
	}

	public List<Booking> getBookings() {
		return bookingDao.getBookings();
	}
	
	@Transactional
	public void addBooking(Booking b) {
		bookingDao.addBooking(b);
	}
	
	@Transactional
	public void deleteBooking(Booking b) {
		bookingDao.deleteBooking(b);
	}

	@Transactional
	public void updateBooking(Booking b) {
		bookingDao.updateBooking(b);
	}
	
	public List<Integer> getAvailability(int roomId){
		return bookingDao.getAvailability(roomId);
	}
	
	public List<Booking> getBookRoom(int roomId){
		return bookingDao.getBookRoom(roomId);
	}
	
	public Booking getPrice(int id) {
		return bookingDao.getPrice(id);
	}
}
