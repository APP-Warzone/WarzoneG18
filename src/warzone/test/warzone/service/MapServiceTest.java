package warzone.service;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import warzone.controller.CountryController;
import warzone.controller.MapController;
import warzone.controller.NeighborController;
import warzone.model.*;

/**
 * test cases for map service
 */
public class MapServiceTest {

    GameContext d_gameContext;

    /**
     * clear the gamecontext before each test
     */
    @Before
    public void beforeEachTetCase() {
        GameContext.clear();
        d_gameContext = GameContext.getGameContext();
    }

    /**
     * clear the gamecontext after this class run
     */
    @AfterClass
    public static void afterClass() {
        GameContext.clear();
    }

    /**
     * test if successfully load map to edit
     */
    @Test
    public void testEditMap() {

        GameContext gameContext = GameContext.getGameContext();
        MapController mapController = new MapController(gameContext);

        assertTrue(mapController.editMap("europe.map"));

        System.out.println("Map File Name: " + gameContext.getMapFileName());
        System.out.println("Map File Pic: " + gameContext.getMapFilePic());
        System.out.println("Map File Map: " + gameContext.getMapFileMap());
        System.out.println("Map File Name: " + gameContext.getMapFileCards());

        System.out.println();

        System.out.println("Number of Continents: " + gameContext.getContinents().size());
        System.out.println("Number of Countries: " + gameContext.getCountries().size());
    }
}