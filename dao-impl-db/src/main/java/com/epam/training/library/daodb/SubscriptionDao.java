package com.epam.training.library.daodb;

import java.util.List;

import com.epam.training.library.datamodel.Subscription;

public interface SubscriptionDao {
	 Subscription get(Long id);

	    void save(Subscription entity);

	    void delete(Long id);

	    List<Subscription> getAll();
}
