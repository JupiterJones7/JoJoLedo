package com.example.JoJoLedo.logic;

import com.example.JoJoLedo.model.Crime;
import com.example.JoJoLedo.logic.GameLogic;
import com.example.JoJoLedo.model.DataService;

/**
 * GameLogic
 *
 * @author Peter Rutschmann
 * @version 18.09.2022
 */
public class GameLogic {

   /**
    * Setup randomly the secret of the game.
    * @param service Contains the list for actors, weapons and scenes.
    * @param secret  Randomly generate the secret for actor, weapon and scene.
    */
   public void setupNewGame(DataService service, Crime secret){
      //To be done
   }

   /**
    * Evaluates the suggestion to find the solution of the game.
    * @param suggestion The suggestion from the player
    * @param secret The game secret.
    * @param numberOfSuggestion Current number of suggestion
    * @param maxNumberOfSuggestions Max number of possible suggestions
    * @return true if games ends, false if another suggestion is allowed
    */
   public boolean evaluateSuggestion(Crime suggestion, Crime secret, int numberOfSuggestion, int maxNumberOfSuggestions){
      if(suggestion.getActor() == secret.getActor()){
         secret.getHistory().add("1");
      }
      if(suggestion.getWeapon() == secret.getWeapon()){
         secret.getHistory().add("1");
      }
      if(suggestion.getScene() == secret.getScene()){
         secret.getHistory().add("1");
      }

      if(suggestion.getActor() != secret.getActor()){
         secret.getHistory().add("0");
      }
      if(suggestion.getWeapon() != secret.getWeapon()){
         secret.getHistory().add("0");
      }
      if(suggestion.getScene() != secret.getScene()){
         secret.getHistory().add("0");
      }
      return secret.getHistory().contains("3");
   }
}
