package com.example.JoJoLedo;

import com.example.JoJoLedo.logic.GameLogic;
import com.example.JoJoLedo.model.Crime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameLogicTest {

    private GameLogic gameLogic;

    private Crime suggestion;

    private Crime secret;

    private int numberOfsuggestion;

    private int maxNumberOfSuggestion;

    @BeforeEach
    private void setup() {
        gameLogic = new GameLogic();
        suggestion = new Crime();
        secret = new Crime();
    }

    @Test
    void actorSuggestionNotEqualToSecret() {
        numberOfsuggestion = 0;
        maxNumberOfSuggestion = 8;

        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        assertEquals(true, gameLogic.evaluateSuggestion(suggestion, secret, numberOfsuggestion, maxNumberOfSuggestion));
    }

    @Test
    void actorWeaponSceneNotEqualThenReturnFalseAndHistory0() {
        numberOfsuggestion = 0;
        maxNumberOfSuggestion = 8;

        secret.setActor(1);
        secret.setWeapon(1);
        secret.setScene(1);

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfsuggestion, maxNumberOfSuggestion));
        assertEquals("0", secret.getHistory().get(secret.getHistory().size() - 1));
    }

    @Test
    void ActorEqualWeaponSceneNotEqualThenReturnFalseAndHistory1() {
        numberOfsuggestion = 0;
        maxNumberOfSuggestion = 8;

        secret.setActor(1);
        secret.setWeapon(1);
        secret.setScene(1);

        suggestion.setActor(1);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfsuggestion, maxNumberOfSuggestion));
        assertEquals("1", secret.getHistory().get(secret.getHistory().size() -1 ));
    }

    @Test
    void WeaponEqualActorSceneNotEqualThenReturnFalseAndHistory1() {
        numberOfsuggestion = 0;
        maxNumberOfSuggestion = 8;

        secret.setActor(1);
        secret.setWeapon(1);
        secret.setScene(1);

        suggestion.setActor(0);
        suggestion.setWeapon(1);
        suggestion.setScene(0);

        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfsuggestion, maxNumberOfSuggestion));
        assertEquals("1", secret.getHistory().get(secret.getHistory().size() -1 ));
    }

    @Test
    void SceneEqualWeaponSceneNotEqualThenReturnFalseAndHistory1() {
        numberOfsuggestion = 0;
        maxNumberOfSuggestion = 8;

        secret.setActor(1);
        secret.setWeapon(1);
        secret.setScene(1);

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(1);

        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfsuggestion, maxNumberOfSuggestion));
        assertEquals("1", secret.getHistory().get(secret.getHistory().size() -1 ));
    }

    @Test
    void ActorWeaponEqualSceneNotEqualThenReturnFalseAndHistory2() {
        numberOfsuggestion = 0;
        maxNumberOfSuggestion = 8;

        secret.setActor(1);
        secret.setWeapon(1);
        secret.setScene(1);

        suggestion.setActor(1);
        suggestion.setWeapon(1);
        suggestion.setScene(0);

        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfsuggestion, maxNumberOfSuggestion));
        assertEquals("2", secret.getHistory().get(secret.getHistory().size() -1 ));
    }

    @Test
    void WeaponSceneEqualActorNotEqualThenReturnFalseAndHistory2() {
        numberOfsuggestion = 0;
        maxNumberOfSuggestion = 8;

        secret.setActor(1);
        secret.setWeapon(1);
        secret.setScene(1);

        suggestion.setActor(0);
        suggestion.setWeapon(1);
        suggestion.setScene(1);

        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfsuggestion, maxNumberOfSuggestion));
        assertEquals("2", secret.getHistory().get(secret.getHistory().size() -1 ));
    }

    @Test
    void SceneActorEqualWeaponNotEqualThenReturnFalseAndHistory2() {
        numberOfsuggestion = 0;
        maxNumberOfSuggestion = 8;

        secret.setActor(1);
        secret.setWeapon(1);
        secret.setScene(1);

        suggestion.setActor(1);
        suggestion.setWeapon(0);
        suggestion.setScene(1);

        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfsuggestion, maxNumberOfSuggestion));
        assertEquals("2", secret.getHistory().get(secret.getHistory().size() -1 ));
    }

    @Test
    void ActorWeaponSceneEqualThenReturnTrueAndHistoryWin() {
        numberOfsuggestion = 0;
        maxNumberOfSuggestion = 8;

        secret.setActor(1);
        secret.setWeapon(1);
        secret.setScene(1);

        suggestion.setActor(1);
        suggestion.setWeapon(1);
        suggestion.setScene(1);

        assertTrue(gameLogic.evaluateSuggestion(suggestion, secret, numberOfsuggestion, maxNumberOfSuggestion));
        assertEquals("3", secret.getHistory().get(secret.getHistory().size() - 1));
    }

    @Test
    void MaxNumberOfSuggestionReachedAndNotWinThenReturnFalseAndHistoryNoneLeft(){
        numberOfsuggestion = 8;
        maxNumberOfSuggestion = 8;

        secret.setActor(1);
        secret.setWeapon(1);
        secret.setScene(1);

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfsuggestion, maxNumberOfSuggestion));
        assertEquals("0", secret.getHistory().get(secret.getHistory().size() - 1));
    }
}
