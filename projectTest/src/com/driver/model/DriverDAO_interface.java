package com.driver.model;

import java.util.List;

public interface DriverDAO_interface {
	
	
	
    public void insert(DriverVO driverVO);
    public void update(DriverVO driverVO);
    /*delete建構子argument是放欲刪除資料的PK*/
    public void delete(Integer driver_id);
    public DriverVO findByPrimaryKey(Integer driver_id);
    public List<DriverVO> getAll(); 



}
