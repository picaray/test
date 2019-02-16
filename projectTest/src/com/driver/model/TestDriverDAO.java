package com.driver.model;

public class TestDriverDAO {
	
	public static void main(String[] args) {
		DriverJDBCDAO DAO = new DriverJDBCDAO();
//		----------------------------
		DriverVO driverdao= new DriverVO();
		driverdao.setMemID("M008");
		driverdao.setDriverID("DR003");
		driverdao.setPlateNum("PCI-0001");
		driverdao.setLicence(null);
		driverdao.setCriminal(null);
		driverdao.setTrafficRecord(null);
		driverdao.setIdNum(null);
		driverdao.setPhoto(null);
		driverdao.setVerified(1);
		driverdao.setBanned(1);
		driverdao.setDeadline(TestDriverDAO.getSQLDate(2019,3,29,08,10));
		driverdao.setOnlineCar(1);
		driverdao.setScore(80);
		driverdao.setCarType("AA");
		driverdao.setSharedCar(1);
		driverdao.setPet(1);
		driverdao.setSmoke(1);
		driverdao.setBabySeat(1);
		DAO.insert(driverdao);
		System.out.println(driverdao);
		
		
	}

}
