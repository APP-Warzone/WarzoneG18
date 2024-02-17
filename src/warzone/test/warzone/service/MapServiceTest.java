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

    /**
     * continentMap1 is a connected subgraph
     */
    @Test
    public void validateContinentMap1() {
        // set map into d_gamecontext
        d_gameContext.getContinents().put(1, new Continent(1, "North_America", 3, Color.RED));
        d_gameContext.getContinents().put(2, new Continent(2, "South_America", 5, Color.BLUE));

        CountryController _countryCtrl = new CountryController(d_gameContext);
        Country canada = new Country(1, "Canada", 343, 435, d_gameContext.getContinents().get(1));
        _countryCtrl.addCountry(1, 1);

        Country us = new Country(2, "US", 343, 435, d_gameContext.getContinents().get(1));
        _countryCtrl.addCountry(2, 1);

        Country mexico = new Country(3, "mexico", 343, 435, d_gameContext.getContinents().get(1));
        _countryCtrl.addCountry(3, 1);

        NeighborController _nbCtrl = new NeighborController(d_gameContext);
        _nbCtrl.addNeighbor(1, 2);
        _nbCtrl.addNeighbor(2, 1);
        _nbCtrl.addNeighbor(2, 3);
        _nbCtrl.addNeighbor(3, 2);

        MapService d_mapService = new MapService(d_gameContext);
        Continent continent = d_gameContext.getContinents().get(1);
        assertTrue(d_mapService.validateSubGraph(continent));
    }

    /**
     * continentMap2 is not a connected subgraph
     */
    @Test
    public void validateContinentMap2() {
        // set map into d_gamecontext
        d_gameContext.getContinents().put(1, new Continent(1, "North_America", 3, Color.RED));
        d_gameContext.getContinents().put(2, new Continent(2, "South_America", 5, Color.BLUE));

        CountryController _countryCtrl = new CountryController(d_gameContext);
        Country canada = new Country(1, "Canada", 343, 435, d_gameContext.getContinents().get(1));
        _countryCtrl.addCountry(1, 1);

        Country us = new Country(2, "US", 343, 435, d_gameContext.getContinents().get(1));
        _countryCtrl.addCountry(2, 1);

        Country mexico = new Country(3, "mexico", 343, 435, d_gameContext.getContinents().get(1));
        _countryCtrl.addCountry(3, 1);

        NeighborController _nbCtrl = new NeighborController(d_gameContext);
        _nbCtrl.addNeighbor(1, 2);
        _nbCtrl.addNeighbor(2, 1);
        _nbCtrl.addNeighbor(2, 3);

        MapService d_mapService = new MapService(d_gameContext);
        Continent continent = d_gameContext.getContinents().get(1);
        assertFalse(d_mapService.validateSubGraph(continent));
    }
}