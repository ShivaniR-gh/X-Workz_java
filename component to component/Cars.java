class Cars {
	
	static String[] cars ;
    public static void getCars(String car1,String car2,String car3, String car4, String car5) {
		 String[]cars ={car1, car2, car3, car4, car5};
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
