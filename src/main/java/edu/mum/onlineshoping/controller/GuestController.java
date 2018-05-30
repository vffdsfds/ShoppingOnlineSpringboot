package edu.mum.onlineshoping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.onlineshoping.model.Product;
import edu.mum.onlineshoping.service.ProductService;

@Controller
@RequestMapping("/guest")
public class GuestController {
	
	@Autowired
	private ProductService productService;
	
	/*@Autowired
	private GuestService guestService;
	*/
	@RequestMapping("/list/product")
	public String showProductList(Model model) {
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products",products);
		return "guestListProduct";
	}

	@RequestMapping("/list/product/search")
	public String searchProductList(String pname, Model model) {
		List<Product> products = productService.findByProductName(pname);
		model.addAttribute("products",products);
		model.addAttribute("pname", pname);
		return "guestListProduct";
	}
	
	@RequestMapping(value = "/product/detail/{productId}" , method =  RequestMethod.GET)
	public String viewProductDetail(@PathVariable Long productId , Model model) {
		Product product = productService.getProductById(productId);
		model.addAttribute("product", product);
		return "guestPrdtDetail";
	}
	
	
	/*@RequestMapping(value = "/addShoppingCart/{productId}", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void addCart(@PathVariable Long productId) {

		guestService.saveShoppingCart(productId);
		System.out.println("addCart");
	}*/
}
