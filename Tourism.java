class Tourism {
public static void main(String[] args) {
String karnataka[] = {"Coorg", "Mysore", "Bangalore", "Hampi", "Gokarna", "Jog Falls", "Badami", "Chikmagalur", "Belur", "Halebidu",
"Dandeli", "Murudeshwar", "Kabini", "Sakleshpur", "Nandi Hills", "Shivamogga", "Udupi", "Karwar", "Davangere", "Bidar",
"Bellary", "Hospet", "Kudremukh", "Kukke", "Sringeri"};

String tamilNadu[] = {Chennai", "Madurai", "Coimbatore", "Ooty", "Kodaikanal", "Rameswaram", "Kanyakumari", "Thanjavur", "Tiruchirappalli", "Mahabalipuram",
"Yercaud", "Hogenakkal", "Coonoor", "Chidambaram", "Velankanni", "Tiruvannamalai", "Dhanushkodi", "Sivaganga", "Vellore", "Salem",
"Nagapattinam", "Erode", "Kanchipuram", "Namakkal", "Tuticorin"};

String[] kerala = {"Munnar", "Alleppey", "Kochi", "Thekkady", "Wayanad", "Kovalam", "Varkala", "Thrissur", "Kumarakom", "Bekal",
"Palakkad", "Idukki", "Kollam", "Pathanamthitta", "Kannur", "Malappuram", "Kasargod", "Guruvayur", "Ponmudi", "Silent Valley",
"Thalassery", "Nilambur", "Cherai", "Athirappilly", "Vagamon"};

String[] northIndia = {"Delhi", "Agra", "Varanasi", "Amritsar", "Jaipur", "Udaipur", "Jodhpur", "Ranthambore", "Manali", "Shimla",
"Dharamshala", "Kullu", "Leh", "Ladakh", "Nainital", "Mussoorie", "Rishikesh", "Haridwar", "Chandigarh", "Ajmer",
"Pushkar", "Gulmarg", "Sonmarg", "Patnitop", "Dehradun"};

String[] westIndia = {"Mumbai", "Pune", "Goa", "Aurangabad", "Shirdi", "Nashik", "Kolhapur", "Lonavala", "Mahabaleshwar", "Alibaug",
"Mount Abu", "Kutch", "Ahmedabad", "Surat", "Vadodara", "Dwarka", "Saputara", "Daman", "Diu", "Junagadh",
"Rajkot", "Porbandar", "Gir National Park", "Bhandardara", "Tarkarli"};

System.out.println("Karnataka: " + karnataka[0] + ", " + karnataka[1] + ", " + karnataka[2] + ", " + karnataka[3] + ", " + karnataka[4] + ", " +
karnataka[5] + ", " + karnataka[6] + ", " + karnataka[7] + ", " + karnataka[8] + ", " + karnataka[9] + ", " +
karnataka[10] + ", " + karnataka[11] + ", " + karnataka[12] + ", " + karnataka[13] + ", " + karnataka[14] + ", " +
karnataka[15] + ", " + karnataka[16] + ", " + karnataka[17] + ", " + karnataka[18] + ", " + karnataka[19] + ", " +
karnataka[20] + ", " + karnataka[21] + ", " + karnataka[22] + ", " + karnataka[23] + ", " + karnataka[24]);

System.out.println("Tamil Nadu: " + tamilNadu[0] + ", " + tamilNadu[1] + ", " + tamilNadu[2] + ", " + tamilNadu[3] + ", " + tamilNadu[4] + ", " +
tamilNadu[5] + ", " + tamilNadu[6] + ", " + tamilNadu[7] + ", " + tamilNadu[8] + ", " + tamilNadu[9] + ", " +
tamilNadu[10] + ", " + tamilNadu[11] + ", " + tamilNadu[12] + ", " + tamilNadu[13] + ", " + tamilNadu[14] + ", " +
tamilNadu[15] + ", " + tamilNadu[16] + ", " + tamilNadu[17] + ", " + tamilNadu[18] + ", " + tamilNadu[19] + ", " +
tamilNadu[20] + ", " + tamilNadu[21] + ", " + tamilNadu[22] + ", " + tamilNadu[23] + ", " + tamilNadu[24]);

System.out.println("Kerala: " + kerala[0] + ", " + kerala[1] + ", " + kerala[2] + ", " + kerala[3] + ", " + kerala[4] + ", " +
kerala[5] + ", " + kerala[6] + ", " + kerala[7] + ", " + kerala[8] + ", " + kerala[9] + ", " +
kerala[10] + ", " + kerala[11] + ", " + kerala[12] + ", " + kerala[13] + ", " + kerala[14] + ", " +
kerala[15] + ", " + kerala[16] + ", " + kerala[17] + ", " + kerala[18] + ", " + kerala[19] + ", " +
kerala[20] + ", " + kerala[21] + ", " + kerala[22] + ", " + kerala[23] + ", " + kerala[24]);

System.out.println("North India: " + northIndia[0] + ", " + northIndia[1] + ", " + northIndia[2] + ", " + northIndia[3] + ", " + northIndia[4] + ", " +
northIndia[5] + ", " + northIndia[6] + ", " + northIndia[7] + ", " + northIndia[8] + ", " + northIndia[9] + ", " +
northIndia[10] + ", " + northIndia[11] + ", " + northIndia[12] + ", " + northIndia[13] + ", " + northIndia[14] + ", " + northIndia[15] + ", " + northIndia[16] + ", " + northIndia[17] + ", " + northIndia[18] + ", " + northIndia[19] + ", " +
northIndia[20] + ", " + northIndia[21] + ", " + northIndia[22] + ", " + northIndia[23] + ", " + northIndia[24]);

System.out.println("West India: " + westIndia[0] + ", " + westIndia[1] + ", " + westIndia[2] + ", " + westIndia[3] + ", " + westIndia[4] + ", " +
westIndia[5] + ", " + westIndia[6] + ", " + westIndia[7] + ", " + westIndia[8] + ", " + westIndia[9] + ", " +
westIndia[10] + ", " + westIndia[11] + ", " + westIndia[12] + ", " + westIndia[13] + ", " + westIndia[14] + ", " +
westIndia[15] + ", " + westIndia[16] + ", " + westIndia[17] + ", " + westIndia[18] + ", " + westIndia[19] + ", " +
westIndia[20] + ", " + westIndia[21] + ", " + westIndia[22] + ", " + westIndia[23] + ", " + westIndia[24]);
    }
}
