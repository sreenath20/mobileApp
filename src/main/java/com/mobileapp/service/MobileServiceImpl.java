package com.mobileapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileapp.entity.Category;
import com.mobileapp.entity.Mobile;
import com.mobileapp.entity.MobileDTO;
import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.repository.CategoryRepository;
import com.mobileapp.repository.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileRepository mobileRepo;
	@Autowired
	private CategoryRepository categoryRepo;

	@Override
	public Mobile addMobileByCid(Mobile mobile, Integer cid) {
		Optional<Category> categoryOpt = this.categoryRepo.findById(cid);

		// do the exception handling
		if (categoryOpt.isPresent()) {
			Category category = categoryOpt.get();
			mobile.setCategory(category); // set mobile to existing category
		}
		return this.mobileRepo.save(mobile);
	}

	@Override
	public Mobile getMobileById(Integer id) throws MobileNotFoundException {

		return null;
	}

	@Override
	public Mobile updateMobile(Mobile mobile) throws MobileNotFoundException {

		return null;
	}

	@Override
	public List<Mobile> getAllMobiles() {

		return this.mobileRepo.findAll();
	}

	@Override
	public Mobile addMobile(MobileDTO mobileDTO) {
		Optional<Category> categoryOpt = this.categoryRepo.findById(mobileDTO.getCategoryId());

		// do the exception handling

		Category category = categoryOpt.get();

		Mobile mobile = new Mobile(null, mobileDTO.getMobileName(), mobileDTO.getMobileCost(), mobileDTO.getMfd(),
				mobileDTO.getModelNumber(), mobileDTO.getCompanyName(), category);

		return this.mobileRepo.save(mobile);
	}

}
