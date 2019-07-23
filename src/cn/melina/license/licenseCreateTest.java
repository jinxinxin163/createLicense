package cn.melina.license;

import cn.melina.license.CreateLicense;

public class licenseCreateTest {
	public static void main(String[] args){
		boolean ret = false;
		CreateLicense cLicense = new CreateLicense();
		cLicense.setParam("./param.properties");
		ret = cLicense.create();
		if(ret == true) {
			System.out.println("create license success!");
		} else {
			System.out.println("create license fail!");
		}
	}
}
