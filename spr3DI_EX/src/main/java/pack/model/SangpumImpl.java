package pack.model;

public class SangpumImpl implements SangpumInter {

	@Override
	public String[] calcMoney(String sang,int su, int dan) {
		//계산!
		String[] arr = {sang,Integer.toString(su*dan)};
		return arr;
	}

}
