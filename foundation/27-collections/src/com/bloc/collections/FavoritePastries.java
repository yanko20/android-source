package com.bloc.collections;

import java.util.*;

/*
 * FavoritePastries
 *
 * This class maintains a record of Pastry objects and their
 * relation to a 1 to 5 rating scale.
 *
 * For example:
 * 5 Star Pastries: Cronut, Cherry Pie
 * 4 Star Pastries: Strudel, Apple Pie
 * 3 Star Pastries: Bear Claw
 * 2 Star Pastries: Pop-Tart
 * 1 Star Pastries: Pot Pie
 *
 * A pastry may not have duplicate entries
 */
public class FavoritePastries {

	/************************************************
 	 *	ASSIGNMENT:
	 *	Use a HashMap to store the relationship
	 *	between rating and pastry: HashMap<Integer, List<Pastry>>
	/************************************************/
  HashMap<Integer, List<Pastry>> ratingsMap;

	public FavoritePastries() {
		/************************************************
 	 	 *	WORK HERE
		************************************************/
    ratingsMap = new HashMap<Integer, List<Pastry>>();
	}

	/*
	 * addPastry
	 *
	 * Add a Pastry to the FavoritePastries class.
	 *
	 * This method stores this Pastry and its
	 * associated rating in some sort of data structure.
	 *
	 * If this Pastry already exists in FavoritePastries,
	 * its old rating should be updated.
	 *
	 * @param pastry The Pastry to store
	 * @param rating The rating to associate with it
	 * @return nothing
	 */
	public void addPastry(Pastry pastry, int rating) {
		/************************************************
 	 	 *	WORK HERE
		/************************************************/

    int currRating = getRatingForPastry(pastry);
    ArrayList<Pastry> pastries = (ArrayList<Pastry>)getPastriesForRating(rating);
    if(currRating == -1){
      pastries.add(pastry);
      ratingsMap.put(rating, pastries);
    }else if(currRating != rating){
      removePastry(pastry);
      pastries.add(pastry);
      ratingsMap.put(rating, pastries);
    }
	}

	/*
	 * removePastry
	 *
	 * Remove a Pastry from FavoritePastries
	 *
	 * This method removes any reference to this exact
	 * Pastry object and its associated rating
	 *
	 * @param pastry The Pastry to remove
	 * @return true if the Pastry was found and removed,
	 *		   false otherwise
	 */
	public boolean removePastry(Pastry pastry) {
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
    for(List<Pastry> pastries : ratingsMap.values()){
      if(pastries.contains(pastry)){
        pastries.remove(pastry);
        return true;
      }
    }
		return false;
	}

	/*
	 * getRatingForPastry
	 *
	 * Return the associated rating for a given Pastry
	 *
	 * This method will find the associated rating for
	 * this Pastry inside of FavoritePastries and return
	 * it to its caller.
	 *
	 * @param  pastry The Pastry for which a rating must
	 * 		   be recovered
	 * @return the rating associated with this Pastry or
	 *		   -1 if not found among FavoritePastries
	 */
	public int getRatingForPastry(Pastry pastry) {
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
    for(Map.Entry<Integer, List<Pastry>> entry : ratingsMap.entrySet()){
      List<Pastry> pastries = entry.getValue();
      if(pastries.contains(pastry)){
        Integer rating = entry.getKey();
        return rating;
      }
    }
		return -1;
	}

	/*
	 * getPastriesForRating
	 *
	 * Return a Set of all the Pastries with a given
	 * rating.
	 *
	 * This method returns a Set<Pastry> object containing
	 * references to all of the Pastries associated with
	 * a particular rating.
	 *
	 * @param  rating The rating of the Pastry objects the
	 *		   caller wishes to recover
	 * @return A Set of all the Pastry objects with a rating
	 * 		   of `rating`. Returns an empty set if none are
	 *         found
	 */
	public Collection<Pastry> getPastriesForRating(int rating) {
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
    Collection<Pastry> pastries = ratingsMap.get(rating);
    return pastries == null ? new ArrayList<Pastry>() : pastries;
	}

}
