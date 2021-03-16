package com.sist.goods.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsVo {
	private int no;
	private String name;
	private int qty, price;
	private String fname;
	
}//class
