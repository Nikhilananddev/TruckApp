package com.example.truckapp;

import com.example.truckapp.repositories.LoadRepositories;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class TrcuckAppApplication implements CommandLineRunner {

	@Autowired
	LoadRepositories loadRepositories;
	public static void main(String[] args) {
		SpringApplication.run(TrcuckAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//
//		Date date = new Date();
////		System.out.println(date);
//////
//		LoadEntity loadEntity =new LoadEntity();
//		LoadEntity loadEntity2 =new LoadEntity();
//		List<LoadEntity> list;
//
//		try {
//			list=loadRepositories.findAll();
//			System.out.println("Size"+list.size());
//		}
//		catch (Exception e)
//		{
//			System.out.println(e.getMessage());
//		}

//
//		try{
//			list=loadRepositories.findAll();
////			for (LoadEntity load:list
////				 ) {
////				System.out.println(load.getId());
////			}
//			System.out.println(list.size());
//		}catch (Exception e)
//		{
//			System.out.println(e.getMessage());
//		}




//		/**
//		 * loadingPoint
//		 * ,unLoadingPoint,
//		 *                     productType,
//		 *                     truckType,
//		 *                     numberOfTruck,
//		 *                     weight,
//		 *                     comment,
//		 *                     shipperId,
//		 *                     date
//		 *
////		 * */
//		loadEntity.setLoadingPoint("delhi");
//		loadEntity.setUnLoadingPoint("mumbai");
//		loadEntity.setProductType(ProductType.GLASS);
//		loadEntity.setTruckType(TruckType.BIG);
//		loadEntity.setNumberOfTruck(100);
//		loadEntity.setWeight(200);
//		loadEntity.setComment("hello");
//		loadEntity.setShipperId("1");
//		loadEntity.setDate(date);
//		try {
//			loadEntity2 = loadRepositories.save(loadEntity);
//
//			System.out.println(loadEntity2);
//		}catch (Exception exception)
//		{
//			throw  new Exception(exception);
//		}
//		List<LoadEntity> list=loadRepositories.findAll();
//		for (LoadEntity load:list
//			 ) {
//			System.out.println(load.getId());
//
//		}
////
////		System.out.println("sizee"+loadEntity.getWeight() );
//
//		System.out.println();
	}

	/**
	 * Fetches a ModelMapper instance.
	 *
	 * @return ModelMapper
	 */
	@Bean // Want a new obj every time
	@Scope("prototype")
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
