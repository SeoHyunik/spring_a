package com.sist.goods.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookVo {
	private int no;
	private String name;
	private int price;
	private String publisher;
}
