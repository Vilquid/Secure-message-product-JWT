package ku.message.controller;

import ku.message.service.JwtAccessTokenService;
import ku.message.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController
{
	@Autowired
	private ProductService productService;

	@GetMapping
	public String getProductPage(Model model)
	{
		model.addAttribute("products", productService.getAllProducts());

		return "product";
	}
}
