package bsu.vadim.task6;

import bsu.vadim.task6.Exceptions.AnchorStatementException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws AnchorStatementException {
        List<String> armament = new ArrayList<>();
        armament.add("ПРО: RIM-116 RAM ");
        armament.add("ПВО: RIM-162 ESSM ");
        armament.add("20 Самолетов");
        armament.add("10 БПЛА");
        AircraftCarrier carrier = new AircraftCarrier("Джеральд Р. Форд",armament,5000);
        carrier.retrieveArmamentInformation();
        carrier.move();
        carrier.dropAnchor();
        carrier.attack();
        carrier.weighAnchor();
        carrier.move();
    }
}