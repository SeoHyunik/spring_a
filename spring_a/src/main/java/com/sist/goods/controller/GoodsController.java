package com.sist.goods.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sist.goods.dao.GoodsDao;


@Controller
public class GoodsController {
	@Autowired
	private GoodsDao dao;

	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping("/listGoods.do")
	public ModelAndView listGoods(String keyword, String orderField, 
												HttpSession session) {
		System.out.println("keyword : "+keyword);
		System.out.println("orderField : "+orderField);
		if ((keyword ==null || keyword.equals("")) //
				&& session.getAttribute("keyword") != null) {//키워드를 한번 저장했다면
			keyword = (String)session.getAttribute("keyword");
		}//end if
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("keyword", keyword);
		map.put("orderField", orderField);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",dao.findAll(map));
		
		session.setAttribute("keyword", keyword);//키워드를 세션에 상태유지
		return mav;
	}//listGoods
	
}//Controller
