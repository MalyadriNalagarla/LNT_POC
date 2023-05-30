package com.lnt.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.lnt.book.ticket.app.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
