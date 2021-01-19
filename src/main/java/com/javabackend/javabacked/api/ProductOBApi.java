package com.javabackend.javabacked.api;

/*import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javabackend.javabacked.model.ProductOB;
import com.javabackend.javabacked.producer.Producer;
import com.javabackend.javabacked.service.IProductOBService;
import com.javabackend.javabacked.util.ProductHelper;

import io.swagger.annotations.Api;

@RestController
@Api(value = "ProductAPI", description = "ProductOB API demo")
public class ProductOBApi {
	@Autowired
	IProductOBService productOBService;

	@Autowired
	Producer producer;

	
	 * @Autowired RestHighLevelClient client;
	 
	
	@Autowired
	ProductHelper productHelper;

	@GetMapping(value = "/api/productOB")
	public List<ProductOB> getList() {
		return productOBService.findAll();
		
	}

	@PostMapping(value = "/api/productOB")
	public ProductOB createProductOB(@RequestBody ProductOB productOB) {
		
		//GỬI MESSAGE TO RABBITMQ
		producer.produce(productOB);
		System.out.println("===============================\nBạn đã đặt hàng thành công ! Đơn hàng có id: " +productOB.getId());
		return productOB;
	}
	
	@GetMapping(value="/api/searchAll")
	public List<ProductOB> searchAll() {
		return productHelper.getListFromElacstic(productHelper.searchAll(client, "java_fresher_product"));
	}

	@RequestMapping(value = "/api/searchElByName",method = RequestMethod.GET)
	public List<ProductOB> searchElByName(@RequestParam String keyvalue) {
		System.out.println(keyvalue);
		return productHelper.getListFromElacstic(productHelper.aggregation(client, keyvalue, 100, "index_backend_fresher","by_categoryid"));
	}
	@RequestMapping(value = "/api/searchElByCategoryid",method = RequestMethod.GET)
	public List<ProductOB> searchByCategoryid(@RequestParam int keyvalue) {
		System.out.println(keyvalue);
		return productHelper.getListFromElacstic(productHelper.searchProById(client, keyvalue));
	}

	@PutMapping(value = "/api/searchElByCategoryid")
	public List<ProductOB> updateField(@RequestParam(required = true, value = "id") int id,
			@RequestParam(required = false, value = "name") String name,
			@RequestParam(required = false, value = "price") Double price,
			@RequestParam(required = false, value = "categoryid") Integer categoryid) {
		List<ProductOB> productOld = productHelper.getListFromElacstic(productHelper.searchProById(client, id));
		ProductOB productNew = new ProductOB();
		productNew.setId(id);
		
		productOld.forEach(x->{
			if(!name.isEmpty()) {
				productNew.setName(name);
			}else {
				productNew.setName(x.getName());
			}
			if(price!=null) {
				productNew.setPrice(price);
			}else {
				productNew.setPrice(x.getPrice());
			}
			if(categoryid!=null) {
				productNew.setCategoryid(categoryid);
			}else {
				productNew.setCategoryid(x.getCategoryid());
			}
		});
		
		productHelper.updatefield(client, productNew,"java_fresher_product");
		
		
		
		return productHelper.getListFromElacstic(productHelper.searchProById(client, id));
	}
	
	
	
*/	
	

//}
