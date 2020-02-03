package com.cts.training.controller;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Actor;
import com.cts.training.model.Movie;

public class FilmActorController {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Movie movie = new Movie();
		movie.setName("Banglore Days");

		Actor actor = new Actor();
		actor.setActor_name("DQ");
		actor.setMovie(movie);

		Actor actor2 = new Actor();
		actor2.setActor_name("Fahad");
		actor2.setMovie(movie);
		Set<Actor> actors = new HashSet<>();
		actors.add(actor);
		actors.add(actor2);

		session.save(actor);
		session.save(actor2);

		session.save(movie);

		tx.commit();
		session.close();

	}
}
