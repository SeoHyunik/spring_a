package com.sist.goods.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookVo {
	private String no;
	private String name;
	private int price;
	private String publisher;
}
