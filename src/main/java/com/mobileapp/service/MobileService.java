package com.mobileapp.service;

import java.util.List;

import com.mobileapp.entity.Mobile;
import com.mobileapp.entity.MobileDTO;
import com.mobileapp.exception.MobileNotFoundException;

public interface MobileService { // ctrl + shift + f

	Mobile addMobileByCid(Mobile mobile, Integer cid);

	Mobile addMobile(MobileDTO mobileDTO);

	Mobile getMobileById(Integer id) throws MobileNotFoundException;

	Mobile updateMobile(Mobile mobile) throws MobileNotFoundException;

	List<Mobile> getAllMobiles();

}
