package com.driver.model;

public class TestDriverDAO {
	
	public static void main(String[] args) {
		DriverJDBCDAO DAO = new DriverJDBCDAO();
//		----------------------------
		DriverVO driverdao= new DriverVO();
		driverdao.setMemID("M008");
		driverdao.setDriverID("DR003");
//		driverdao.setPlateNum();
//		driverdao.setLicence();
//		driverdao.setCriminal();
//		driverdao.setTrafficRecord();
//		driverdao.setIdNum();
//		driverdao.setPhoto();
//		driverdao.setVerified();
//		driverdao.setBanned();
//		driverdao.setDeadline();
//		driverdao.setOnlineCar();
//		driverdao.setScore();
//		driverdao.setCarType();
//		driverdao.setSharedCar();
//		driverdao.setPet();
//		driverdao.setSmoke();
//		driverdao.setBabySeat();
		DAO.insert(driverdao);
		System.out.println(driverdao);
		
		
	}

}
