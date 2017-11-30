package uk.ac.belfastmet.buildings.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.buildings.domain.FloorArea;
import uk.ac.belfastmet.buildings.domain.Footprint;

@Service
public class BuildingService {
	
	private ArrayList<FloorArea> buildingsByArea;
	private ArrayList<FloorArea> buildingsByFootprint;
	private ArrayList<FloorArea> buildingsByVolume;
	
	public BuildingService() {
		super();
	}
	
	public ArrayList<FloorArea> getBuildingsByArea(){
		//will return an array of buildings with the largest floor area
		ArrayList<FloorArea> buildings = new ArrayList<FloorArea>();
		//creates a new ArrayList called buildings, populated below
		FloorArea newCentury = new FloorArea("New Century Global Center", "China", "Chengdu", "1,760,000meters squared", "NewCenturyGlobalCenter.jpg");
		buildings.add(newCentury);
		FloorArea dubaiInternational = new FloorArea("Dubai International Airport", "United Arab Emirates", "Dubai", "1,713,000meters squared", "DubaiInternationalAirport.jpg");
		buildings.add(dubaiInternational);
		FloorArea abrajAlBait = new FloorArea("Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", "1,575,815meters squared", "AbrajalBaitTowers.JPG");
		buildings.add(abrajAlBait);
		FloorArea centralWorld = new FloorArea("CentralWorld", "Thailand", "Bangcock", "1,024,000meters squared", "CentralWorld.jpg");
		buildings.add(centralWorld);
		FloorArea aalsmeerAuction = new FloorArea("Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "990,000meters squared", "AalsmeerFlowerAuction.jpg");
		buildings.add(aalsmeerAuction);
		FloorArea beijingInternational = new FloorArea("Beijing Capital International Airport Terminal 3", "China", "Aalsmeer", "986,000meters squared", "BeijingCapitalInternationalAitportTerminal.jpg");
		buildings.add(beijingInternational);
		FloorArea venetianMacao = new FloorArea("The Venetian Macao", "Macau", "Macau", "980,000meters squared", "VenetianMacau.jpg");
		buildings.add(venetianMacao);
		FloorArea sandsCotai = new FloorArea("Sands Cotai Central", "Macau", "Macau", "890,000meters squared", "SandsCotaiCentral.jpg");
		buildings.add(sandsCotai);
		FloorArea ciputraWorld = new FloorArea("Ciputra World Surabaya", "Indonesia", "Surabaya", "750,000meters squared", "CiputraWorldSurabaya.jpg");
		buildings.add(ciputraWorld);
		FloorArea berjayaTimesSquare = new FloorArea("Berjaya Times Square", "Malaysia", "Kuala Lumpar", "700,000meters squared", "BerjayaTimesSquare.jpg");
		buildings.add(berjayaTimesSquare);
			return buildings;
			
	}
	
	public ArrayList<Footprint> getBuildingsByFootprint(){
		//will return an array of buildings with the largest floor area
		ArrayList<Footprint> buildings = new ArrayList<Footprint>();
		//creates a new ArrayList called buildings, populated below
		Footprint aalsmeerAuction = new Footprint("Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "518,000meters squared", "AalsmeerFlowerAuction.jpg");
		buildings.add(aalsmeerAuction);
		Footprint mallDubai = new Footprint("Mall of Dubai", "United Arab Emirates", "Dubai", "500,000meters squared", "MallOfDubai.jpg");
		buildings.add(mallDubai);
		Footprint teslaFactory = new Footprint("Tesla Factory", "United States of America", "Fremont, California", "427,354meters squared", "TeslaFactory.jpg");
		buildings.add(teslaFactory);
		Footprint boeingFactory = new Footprint("Boeing Everett Factory", "United States of America", "Everett, Washington", "398,000meters squared", "BoeingEverettFactory.jpg");
		buildings.add(boeingFactory);
		Footprint michelinCenter = new Footprint("Michelin Distribution Center", "United States of America", "Spartanburg, South Carolina", "371,612meters squared", "MichelinDistributionCenter.jpg");
		buildings.add(michelinCenter);
		Footprint greatMosque = new Footprint("Great Mosque of MEcca", "Saudi Arabia", "Hijaz-Saudi Arabia", "356,000meters squared", "GreatMosqueOfMecca.jpg");
		buildings.add(greatMosque);
		Footprint nikeLogistics = new Footprint("Nike North America Logistics Center", "United States of America", "Memphis, Tennessee", "260,000meters squared", "NikeAmericaDistributionCenter.jpg");
		buildings.add(nikeLogistics);
		Footprint johnDeereDistribution = new Footprint("John Deere North American Parts Distribution Center", "United States of America", "Milan, Illinois", "246,000meters squared", "JohnDeereNorthAmericanPartsDistributionCenter.jpg");
		buildings.add(johnDeereDistribution);
		Footprint mitsubishiAmerica = new Footprint("Mitsubishi Motors North America", "United States of America", "Normal, Illinois", "220,000meters squared", "MitsubishiMotorsNorthAmerica.jpg");
		buildings.add(mitsubishiAmerica);
		Footprint indonesiaConvention = new Footprint("Indonesia Convention Exhibition", "Indonesia", "Bumi Serpong Damai", "220,000meters squared", "IndonesiaConventionExhibition.jpg");
		buildings.add(indonesiaConvention);
		
		
			return buildings;
			
	}
	
	public ArrayList<Footprint> getBuildingsByFootprint(){
		//will return an array of buildings with the largest floor area
		ArrayList<Footprint> buildings = new ArrayList<Footprint>();
		//creates a new ArrayList called buildings, populated below
		Footprint aalsmeerAuction = new Footprint("Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", "518,000meters squared", "AalsmeerFlowerAuction.jpg");
		buildings.add(aalsmeerAuction);
		Footprint mallDubai = new Footprint("Mall of Dubai", "United Arab Emirates", "Dubai", "500,000meters squared", "MallOfDubai.jpg");
		buildings.add(mallDubai);
		Footprint teslaFactory = new Footprint("Tesla Factory", "United States of America", "Fremont, California", "427,354meters squared", "TeslaFactory.jpg");
		buildings.add(teslaFactory);
		Footprint boeingFactory = new Footprint("Boeing Everett Factory", "United States of America", "Everett, Washington", "398,000meters squared", "BoeingEverettFactory.jpg");
		buildings.add(boeingFactory);
		Footprint michelinCenter = new Footprint("Michelin Distribution Center", "United States of America", "Spartanburg, South Carolina", "371,612meters squared", "MichelinDistributionCenter.jpg");
		buildings.add(michelinCenter);
		Footprint greatMosque = new Footprint("Great Mosque of MEcca", "Saudi Arabia", "Hijaz-Saudi Arabia", "356,000meters squared", "GreatMosqueOfMecca.jpg");
		buildings.add(greatMosque);
		Footprint nikeLogistics = new Footprint("Nike North America Logistics Center", "United States of America", "Memphis, Tennessee", "260,000meters squared", "NikeAmericaDistributionCenter.jpg");
		buildings.add(nikeLogistics);
		Footprint johnDeereDistribution = new Footprint("John Deere North American Parts Distribution Center", "United States of America", "Milan, Illinois", "246,000meters squared", "JohnDeereNorthAmericanPartsDistributionCenter.jpg");
		buildings.add(johnDeereDistribution);
		Footprint mitsubishiAmerica = new Footprint("Mitsubishi Motors North America", "United States of America", "Normal, Illinois", "220,000meters squared", "MitsubishiMotorsNorthAmerica.jpg");
		buildings.add(mitsubishiAmerica);
		Footprint indonesiaConvention = new Footprint("Indonesia Convention Exhibition", "Indonesia", "Bumi Serpong Damai", "220,000meters squared", "IndonesiaConventionExhibition.jpg");
		buildings.add(indonesiaConvention);
		
		
			return buildings;
			
	}

}

