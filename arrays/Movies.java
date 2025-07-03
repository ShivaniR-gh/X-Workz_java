class Movies {
    public static void main(String[] args) {

        String[] kannada = {"KGF", "Kantara", "James", "Lucia", "U Turn", "Mufti", "Ulidavaru Kandanthe", "Charlie 777", "Tagaru", "RangiTaranga",
                            "Avane Srimannarayana", "Bell Bottom", "Yajamana", "Kavaludaari", "Roberrt", "Love Mocktail", "Bhajarangi", "Sanju Weds Geetha", "Birbal", "Hero",
                            "Dia", "Vikrant Rona", "Bharate", "Mungaru Male", "Sarkari Hi. Pra. Shaale"};
        
        String[] hindi = {"3 Idiots", "Dangal", "PK", "Shershaah", "Zindagi Na Milegi Dobara", "Lagaan", "Tanhaji", "Chak De India", "Kabir Singh", "Bajrangi Bhaijaan",
                          "Andhadhun", "Queen", "Gully Boy", "Barfi", "Drishyam", "Raazi", "Article 15", "Taare Zameen Par", "Rang De Basanti", "MS Dhoni",
                          "Bhool Bhulaiyaa", "A Wednesday", "Black", "Swades", "Kahaani"};

        String[] telugu = {"RRR", "Pushpa", "Baahubali", "Magadheera", "Arjun Reddy", "Ala Vaikunthapurramuloo", "Eega", "Sye", "Temper", "DJ",
                           "Jersey", "Sarileru Neekevvaru", "Pokiri", "Bharat Ane Nenu", "Nannaku Prematho", "Uppena", "Rangasthalam", "Geetha Govindam", "Maharshi", "Race Gurram",
                           "Ghajini", "Attarintiki Daredi", "Bimbisara", "Brahmastra (Tel)", "Khaidi"};

        String[] tamil = {"Vikram", "Master", "Bigil", "Asuran", "Soorarai Pottru", "Kaithi", "Mersal", "Visaranai", "Jai Bhim", "Theri",
                          "Anniyan", "Ghajini", "Enthiran", "Thuppakki", "Sivaji", "Vaaranam Aayiram", "Vada Chennai", "Maari", "Petta", "Darbar",
                          "Karnan", "Don", "Thunivu", "Varisu", "Love Today"};

        String[] malayalam = {"Drishyam", "Premam", "Charlie", "Ustad Hotel", "Kumbalangi Nights", "Bangalore Days", "Trance", "Take Off", "Kurup", "Joji",
                              "The Great Indian Kitchen", "Nayattu", "Minnal Murali", "Helen", "Android Kunjappan", "C U Soon", "Forensic", "Lucifer", "Ayyappanum Koshiyum", "Jana Gana Mana",
                              "Malik", "2018", "Jallikattu", "Ee. Ma. Yau", "Sudani from Nigeria"};

        String[] english = {"Inception", "Interstellar", "Titanic", "Avatar", "The Dark Knight", "Avengers", "Iron Man", "Joker", "Gladiator", "Forrest Gump",
                            "Shawshank Redemption", "The Godfather", "Fight Club", "Pulp Fiction", "The Matrix", "Harry Potter", "The Hobbit", "The Lion King", "Frozen", "The Avengers",
                            "No Time to Die", "Tenet", "Oppenheimer", "Mission: Impossible", "The Social Network"};

        System.out.println("Kannada Movies: " + kannada[0] + ", " + kannada[1] + ", " + kannada[2] + ", " + kannada[3] + ", " + kannada[4] + ", " +
                           kannada[5] + ", " + kannada[6] + ", " + kannada[7] + ", " + kannada[8] + ", " + kannada[9] + ", " +
                           kannada[10] + ", " + kannada[11] + ", " + kannada[12] + ", " + kannada[13] + ", " + kannada[14] + ", " +
                           kannada[15] + ", " + kannada[16] + ", " + kannada[17] + ", " + kannada[18] + ", " + kannada[19] + ", " +
                           kannada[20] + ", " + kannada[21] + ", " + kannada[22] + ", " + kannada[23] + ", " + kannada[24]);

        System.out.println("Hindi Movies: " + hindi[0] + ", " + hindi[1] + ", " + hindi[2] + ", " + hindi[3] + ", " + hindi[4] + ", " +
                           hindi[5] + ", " + hindi[6] + ", " + hindi[7] + ", " + hindi[8] + ", " + hindi[9] + ", " +
                           hindi[10] + ", " + hindi[11] + ", " + hindi[12] + ", " + hindi[13] + ", " + hindi[14] + ", " +
                           hindi[15] + ", " + hindi[16] + ", " + hindi[17] + ", " + hindi[18] + ", " + hindi[19] + ", " +
                           hindi[20] + ", " + hindi[21] + ", " + hindi[22] + ", " + hindi[23] + ", " + hindi[24]);

        System.out.println("Telugu Movies: " + telugu[0] + ", " + telugu[1] + ", " + telugu[2] + ", " + telugu[3] + ", " + telugu[4] + ", " +
                           telugu[5] + ", " + telugu[6] + ", " + telugu[7] + ", " + telugu[8] + ", " + telugu[9] + ", " +
                           telugu[10] + ", " + telugu[11] + ", " + telugu[12] + ", " + telugu[13] + ", " + telugu[14] + ", " +
                           telugu[15] + ", " + telugu[16] + ", " + telugu[17] + ", " + telugu[18] + ", " + telugu[19] + ", " +
                           telugu[20] + ", " + telugu[21] + ", " + telugu[22] + ", " + telugu[23] + ", " + telugu[24]);

        System.out.println("Tamil Movies: " + tamil[0] + ", " + tamil[1] + ", " + tamil[2] + ", " + tamil[3] + ", " + tamil[4] + ", " +
                           tamil[5] + ", " + tamil[6] + ", " + tamil[7] + ", " + tamil[8] + ", " + tamil[9] + ", " +
                           tamil[10] + ", " + tamil[11] + ", " + tamil[12] + ", " + tamil[13] + ", " + tamil[14] + ", " +
                           tamil[15] + ", " + tamil[16] + ", " + tamil[17] + ", " + tamil[18] + ", " + tamil[19] + ", " +
                           tamil[20] + ", " + tamil[21] + ", " + tamil[22] + ", " + tamil[23] + ", " + tamil[24]);

        System.out.println("Malayalam Movies: " + malayalam[0] + ", " + malayalam[1] + ", " + malayalam[2] + ", " + malayalam[3] + ", " + malayalam[4] + ", " +
                           malayalam[5] + ", " + malayalam[6] + ", " + malayalam[7] + ", " + malayalam[8] + ", " + malayalam[9] + ", " +
                           malayalam[10] + ", " + malayalam[11] + ", " + malayalam[12] + ", " + malayalam[13] + ", " + malayalam[14] + ", " +
                           malayalam[15] + ", " + malayalam[16] + ", " + malayalam[17] + ", " + malayalam[18] + ", " + malayalam[19] + ", " +
                           malayalam[20] + ", " + malayalam[21] + ", " + malayalam[22] + ", " + malayalam[23] + ", " + malayalam[24]);

        System.out.println("English Movies: " + english[0] + ", " + english[1] + ", " + english[2] + ", " + english[3] + ", " + english[4] + ", " +
                           english[5] + ", " + english[6] + ", " + english[7] + ", " + english[8] + ", " + english[9] + ", " +
                           english[10] + ", " + english[11] + ", " + english[12] + ", " + english[13] + ", " + english[14] + ", " +
                           english[15] + ", " + english[16] + ", " + english[17] + ", " + english[18] + ", " + english[19] + ", " +
                           english[20] + ", " + english[21] + ", " + english[22] + ", " + english[23] + ", " + english[24]);
    }
}
