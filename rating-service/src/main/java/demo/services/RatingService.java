package demo.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.domains.Rating;
import demo.repositories.RatingRepository;

@Service
public class RatingService {

	@Autowired
	RatingRepository repository;

	public List<Rating> findAllRatings() {
		return this.repository.findAll();
	}

	public Rating findRatingById(Long ratingId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Rating createRating(Rating rating) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteRating(Long ratingId) {
		// TODO Auto-generated method stub

	}

	public Rating updateRating(Rating Rating, Long ratingId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Rating updateRating(Map<String, String> updates, Long ratingId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Rating> findRatingsByBookId(Long bookId) {
		// TODO Auto-generated method stub
		return this.repository.findByBookId(bookId);
	}
}
