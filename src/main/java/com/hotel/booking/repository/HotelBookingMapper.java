package com.hotel.booking.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hotel.booking.entity.Room;
import com.hotel.booking.entity.User;

@Mapper
public interface HotelBookingMapper {

//
//	// Get user list
//	public List<User> getUser();
//	
	// Get room
	public List<Room> getRoom();
}
