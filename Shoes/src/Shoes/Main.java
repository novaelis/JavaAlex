package Shoes;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		RunningShoe rs = new RunningShoe("Nike", 43, 250);
		WalkingShoe ws = new WalkingShoe("Hanwag", 43.5, true);
		WalkingShoe ws2 = new WalkingShoe("Merrell", 42, false);

		ArrayList<Shoe> shoes = new ArrayList<Shoe>();
		shoes.add(rs);
		shoes.add(ws);
		shoes.add(ws2);

		for (Shoe s : shoes) {
			if (s instanceof RunningShoe) {
				System.out.println(s.brand+ " size: " + s.size +  " "+((RunningShoe) s).weight+"grams /shoe");
			}else if(s instanceof WalkingShoe) {
				String goreTex = ((WalkingShoe)s).goreTex ?"Gore-Tex" : "No Gore-Tex";
				System.out.println(s.brand+ " size: "+ s.size + " "+ goreTex );
			}
			
			System.out.println(s.toString());

		}

	}

}
